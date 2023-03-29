package bungae.thunder.cakey.cake.controller;

import bungae.thunder.cakey.cake.service.CakeService;
import bungae.thunder.cakey.user.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(controllers = CakeController.class)
public class CakeControllerTest {

    @Autowired private MockMvc mvc;

    @Autowired private ObjectMapper objectMapper;

    @MockBean CakeService cakeService;

    @MockBean UserService userService;

//    @Test
//    @DisplayName("케이크 생성 테스트")
//    public void createCake() throws Exception {
//        given(userService.getUser(getDbUser1().getId())).willReturn(getDbUser1());
//        given(cakeService.createCake(getDbUser1())).willReturn(getDbCake1());
////
//        mvc.perform(get("/cakes/create/{userId}", getDbUser1().getId()))
//                .andExpect(status().isOk())
//                .andDo(print());
//    }
//
//    @Test
//    @DisplayName("케이크Id로 조회 테스트")
//    public void getCake() throws Exception {
//        given(cakeService.getCake(getDbCake1().getId())).willReturn(getDbCake1());
//
//        mvc.perform(get("/cakes/{cakeId}", getDbCake1().getId()))
//                .andExpect(status().isOk())
//                .andDo(print());
//    }
//
//    @Test
//    @DisplayName("유저Id로 조회 테스트")
//    public void getAllCakes() throws Exception {
//        given(userService.getUser(getDbUser1().getId())).willReturn(getDbUser1());
//        given(cakeService.getAllCakes(getDbUser1().getId())).willReturn(getDbAllCakesByUser1());
//
//        mvc.perform(get("/cakes").param("userId", "1")).andExpect(status().isOk()).andDo(print());
//    }
//
//    private User getDbUser1() {
//        return User.builder().name("RM").birthday(LocalDate.parse("1994-09-12")).build();
//    }
//
//    private Cake getDbCake1() {
//        return Cake.builder().id(1L).year(2022).user(getDbUser1()).build();
//    }
//
//    private Cake getDbCake2() {
//        return Cake.builder().id(4L).year(2021).user(getDbUser1()).build();
//    }
//
//    private List<Cake> getDbAllCakesByUser1() {
//        List<Cake> cakes = new ArrayList<>();
//        cakes.add(getDbCake1());
//        cakes.add(getDbCake2());
//        return cakes;
//    }
}
