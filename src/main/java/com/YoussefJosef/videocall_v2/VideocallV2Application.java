package com.YoussefJosef.videocall_v2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.YoussefJosef.videocall_v2.user.User;
import com.YoussefJosef.videocall_v2.user.UserService;

@SpringBootApplication
public class VideocallV2Application {

	public static void main(String[] args) {
		SpringApplication.run(VideocallV2Application.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(
			UserService service
	) {
		return args -> {
			service.register(User.builder()
							.username("Youssef")
							.email("youssef@gmail.com")
							.password("aaa")
					.build());

			service.register(User.builder()
					.username("Amine")
					.email("amine@gmail.com")
					.password("aaa")
					.build());

			service.register(User.builder()
					.username("Farouk")
					.email("farouk@gmail.com")
					.password("aaa")
					.build());
		};
	}
}
