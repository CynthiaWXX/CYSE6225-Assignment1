package org.wxx.StudentSystem.Demo1;

import java.util.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class AllStudentLists {
	private static AllStudentRepository AllstudRepo = new AllStudentRepository();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Collection<Student> getAllStuLists(){
		return AllstudRepo.getAllStudents();
	}
	
	@GET
	@Path("student")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Student getAllStuList(@QueryParam("StudentId") int studentId){	
		return AllstudRepo.getAllStudent(studentId);
	}
	
	@POST
	@Path("student")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Student createStudent(Student student) {
		AllstudRepo.addAllStudent(student);
		return student;
	}
	
	@PUT
	@Path("student")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Student putStudent(Student student) {
		AllstudRepo.updateAllStudent(student);
		return student;
	}
	
	@DELETE
	@Path("student")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Student deleteStudent(Student student) {
		AllstudRepo.addAllStudent(student);
		return student;
	}
}
