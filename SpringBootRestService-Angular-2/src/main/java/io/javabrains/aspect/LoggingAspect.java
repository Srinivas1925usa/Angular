package io.javabrains.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import io.javabrains.dto.Topic;


@Aspect
@Component
public class LoggingAspect {

	@Before("execution(* io.javabrains.service.TopicService.getTopic(..))")
	public void LoggingAdvice() {
		
		System.out.println("listed All topics for Sree hi");
	}
}
