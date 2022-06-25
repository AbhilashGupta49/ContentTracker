package com.hollowambitionproject.contenttracker.user.crud;

import com.hollowambitionproject.contenttracker.user.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(UserCrudController.class)
public class UserCrudControllerTest {

    /**
     * User CRUD Controller.
     */
    private final UserCrudController userCrudController =
            new UserCrudController();
    /**
     * MockMvc.
     */
    @Autowired
    private MockMvc mockMvc;
    /**
     * User CRUD Service Mock.
     */
    @MockBean
    private UserCrudService userCrudService;

    /**
     * Test User Not Found.
     */
    @Test
    public void getUserNotFound() throws Exception {
        when(userCrudService.getUser("abcd")).thenReturn(null);
        mockMvc.perform(get("/user/abcd")).andExpect(status().isBadRequest());
    }

    /**
     * Test User Found.
     */
    @Test
    public void getUserFound() throws Exception {
        when(userCrudService.getUser("abcde")).thenReturn(
                new User("a", "b", "c"));
        MvcResult result = mockMvc.perform(get("/user/abcde"))
                .andExpect(status().is2xxSuccessful()).andReturn();
        String content = result.getResponse().getContentAsString();
        Assert.assertEquals(content,
                "{\"username\":\"a\",\"password\":\"b\",\"name\":\"c\"}");
    }
}
