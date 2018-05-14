package io.javabrains.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.dto.Topic;
import io.javabrains.service.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics/hi")
	public List<Topic> getAllTopics(){
		
		return topicService.getAllTopics();
		
		
		
	}
	
}
