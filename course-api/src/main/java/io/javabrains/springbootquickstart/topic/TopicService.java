package io.javabrains.springbootquickstart.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(
		new Topic("name1", "Spring Framework1", "Description"),
		new Topic("name2", "Spring Framework2", "Description"),
		new Topic("name3", "Spring Framework3", "Description")
	);
	
	public List<Topic> getAllTopics(){
		return topics;
	}
}
