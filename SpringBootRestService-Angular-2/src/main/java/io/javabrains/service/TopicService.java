package io.javabrains.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.springframework.stereotype.Service;

import io.javabrains.dto.Topic;

@Service
public class TopicService {
		
	List<Topic> topics = new ArrayList<>( Arrays.asList(
			new Topic("spring", "SpringFrameowrk", "SpringFrameowrkDescription"),
			new Topic("java", "J2EE", "J2EEDescription"),
			new Topic("Hibernate", "Hibernate", "HibernateDescription"),
			new Topic("HibernateUpdate", "Hibernateupdate", "HibernateDescription")
			));

	public List<Topic> getAllTopics() {
		// TODO Auto-generated method stub
		System.out.println("getAllTopics printed");
		return topics;
	}

	public Topic getTopic(String id) {
		// TODO Auto-generated method stub
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		
	}			
	
}
