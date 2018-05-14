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
		
		return topics;
	}			
	
}
