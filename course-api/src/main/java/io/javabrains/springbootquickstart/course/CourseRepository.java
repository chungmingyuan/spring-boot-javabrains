package io.javabrains.springbootquickstart.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,String>{

	// looking courses by an ID of Topic 
	public List<Course> findByTopicId(String topicId);
	
	// looking courses by name
	public List<Course> findByName(String name);

	// looking courses by description
	public List<Course> findByDescription(String name);
	
}
