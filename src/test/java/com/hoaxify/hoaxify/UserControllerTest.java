package com.hoaxify.hoaxify;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.hoaxify.user.User;

//this is an integration test
@RunWith(SpringRunner.class)

//For run this IT we need to run the application
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class UserControllerTest {

	@Autowired
	TestRestTemplate testRestTemplate;

	@Test
	public void postUser_whenUserIsValid_receiveOk() {
		User user = new User();
		user.setUsername("test-user");
		user.setDisplayName("test-display");
		user.setPassword("P4ssword");
		
		ResponseEntity<Object> response = testRestTemplate.postForEntity("/api/1.0/users", user, Object.class);
		
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}
}
