package org.wxx.StudentSystem.Demo1;
import java.util.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})

public class CourseStudentList {
	
	private static CourseStudentRepository studentRepo = new CourseStudentRepository();
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Collection<Student> getStuLists(){	
		return studentRepo.getStudents();
	}
	
	@GET
	@Path("student")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Student getStuList(@QueryParam("StudentId") int studentId){	
		return studentRepo.getStudent(studentId);
	}
	
	@POST
	@Path("student")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Student createStudent(Student student) {
		studentRepo.addStudent(student);
		return student;
	}
	
	@PUT
	@Path("student")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Student putStudent(Student student) {
		studentRepo.updateStudent(student);
		return student;
	}
	
	
	@DELETE
	@Path("student")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Student deleteStudent(Student student) {
		studentRepo.removeStudent(student);
		return student;
	}

}
