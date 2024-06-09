package com.practice.ToDo;

import com.practice.ToDo.Controller.LoginController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class ToDoApplicationTests {

	@Autowired
	LoginController loginCntl;

	@Test
	void contextLoads() {
		assertThat(loginCntl).isNotNull();
	}

	@Test
	void userLoginTest() {
		assertThat(loginCntl.userLogin()).isEqualTo("In Login Page");
	}

}
