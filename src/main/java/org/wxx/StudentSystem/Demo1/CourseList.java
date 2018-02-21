package org.wxx.StudentSystem.Demo1;


import java.util.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class CourseList {
	private static CourseRepository courseRepo = new CourseRepository();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Collection<Course> get(){
		return courseRepo.getCourses();
	}
	
	@GET
	@Path("course")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Course get(@QueryParam("CourseId") String courseId){
		return courseRepo.getCourse(courseId);
	}
	
	@Path("CSYE6225/StudentList")
	public CourseStudentList getStudentList() {
		return new CourseStudentList();
	}
	@Path("CSYE6225/LectureList")
	public CourseLectureList getlectureList() {
		return new CourseLectureList();
	}
	@Path("CSYE6225/BoardList")
	public CourseBoardList getboardList() {
		return new CourseBoardList();
	}
	
}
