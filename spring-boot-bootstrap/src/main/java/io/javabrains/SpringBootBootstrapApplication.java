package io.javabrains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("io.javabrains.repo")
@EntityScan("io.javabrains.model")
@SpringBootApplication
public class SpringBootBootstrapApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBootstrapApplication.class, args);
	}
}
