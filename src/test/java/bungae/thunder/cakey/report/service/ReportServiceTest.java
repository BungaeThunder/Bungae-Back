package bungae.thunder.cakey.report.service;

import bungae.thunder.cakey.message.domain.Message;
import bungae.thunder.cakey.report.domain.Report;
import bungae.thunder.cakey.report.repository.MemoryReportRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class ReportServiceTest {
    ReportService reportService;
    MemoryReportRepository reportRepository;

    @BeforeEach
    void beforeEach(){
        reportRepository = new MemoryReportRepository();
        reportService = new ReportService(reportRepository);
    }

    @AfterEach
    void afterEach(){
        reportRepository.clearStore();
    }

    @Test
    void createReport() {
        //given
        Report report = Report.builder().build();
        Message message = Message.builder().id(123L).build();
        String content = "hello dear";

        //when
        reportService.createReport(report, message, content);

        //then
        Report result = reportService.getReport(report.getId()).get();
        assertThat(result.getMessageId()).isEqualTo(message.getId());


    }

    @Test
    void getAllReportsByMessage(){
        // given
        Message message = Message.builder().id(123L).build();

        Report report1 = Report.builder().messageId(message.getId()).build();
        reportService.createReport(report1, message, "hellooooo");
        Report report2 = Report.builder().messageId(message.getId()).build();
        reportService.createReport(report2, message, "hiiiiii");

        // when
        List<Report> result =  reportService.getAllReportsByMessage(message);

        // then
        assertThat(result.size()).isEqualTo(2);


    }
}
