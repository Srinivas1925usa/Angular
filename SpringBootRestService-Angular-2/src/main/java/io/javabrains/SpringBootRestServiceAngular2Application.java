package io.javabrains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@ComponentScan
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class SpringBootRestServiceAngular2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestServiceAngular2Application.class, args);
	}
}
