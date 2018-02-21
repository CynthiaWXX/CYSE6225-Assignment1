package org.wxx.StudentSystem.Demo1;

import java.util.*;

public class CourseRepository {
	private Map<String, Course> courses;
	
	CourseRepository() {
		courses = new HashMap<String, Course>();
		
		Course course1 = new Course();
		course1.setCourseId("CSYE6225");
		course1.setCourseName("Could_Computing");
		course1.setSemester("Spring 2018");
		
		Course course2 = new Course();
		course2.setCourseId("INFO6350");
		course2.setCourseName("Smartphones_Development");
		course2.setSemester("Spring 2018");
		
		courses.put(course1.getCourseId(), course1);
		courses.put(course2.getCourseId(), course2);
	}
	
	public Collection<Course> getCourses(){
		return courses.values();
	}
	
	
	public Course getCourse(String courseId) {
		for(Course course : courses.values()) {
			if(course.getCourseId() == courseId) {
				return course;
			}	
		}
		return new Course();
	}
	
	public void addCourse(Course course) {
		courses.put(course.getCourseId(), course);
		System.out.println("Courses data added");	
	}
	
	public void updateCourse(Course course) {
		if(courses.containsKey(course.getCourseId())) {
			courses.put(course.getCourseId(), course);
			System.out.println("Courses data updated");
		}
		courses.put(course.getCourseId(), course);
		System.out.println("Courses data created");		
	}
	
	public void removeCourse(Course course) {
		System.out.println("Data deleted was: "+courses.remove(course.getCourseId()));

	}
	

}
