package bungae.thunder.cakey.report.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class ReportRequestDto {
    private String contents;
    private long messageId;
}