package io.javabrains.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@SuppressWarnings("deprecation")
public class MvcConfig extends WebMvcConfigurerAdapter {
	
	public MvcConfig() {
	
		super();
	
	}
	
	public void configureDefaultServletHandling(
			
			DefaultServletHandlerConfigurer configurer) {
		
			configurer.enable();
	}
	
}
