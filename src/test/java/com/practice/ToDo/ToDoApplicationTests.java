package com.practice.ToDo;

import com.practice.ToDo.Controller.LoginController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@AutoConfigureMockMvc
class ToDoApplicationTests {

	@Autowired
	LoginController loginCntl;
	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
		assertThat(loginCntl).isNotNull();
	}

	@Test
	void userLoginTest() throws Exception {

		mockMvc.perform(get("/login"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.view().name("login"))
				.andDo(MockMvcResultHandlers.print());
	}

}
