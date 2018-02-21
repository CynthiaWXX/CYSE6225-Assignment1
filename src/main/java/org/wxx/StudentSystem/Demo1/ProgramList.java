package org.wxx.StudentSystem.Demo1;

import java.util.Collection;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("ProgramList")
public class ProgramList {
	private static ProgramRepository programRepo = new ProgramRepository();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Collection<Program> get(){	
		return programRepo.getPrograms();
	}
	
	@GET
	@Path("program")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Program getP(@QueryParam("ProgramName") String programName ){	
		return programRepo.getProgram(programName);
	}

	
	@Path("Information_System/CourseList")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public CourseList getCourseList() {
		 return new CourseList();
	}

	@Path("AllStudentList")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public AllStudentLists getAllStudentList() {
		return new AllStudentLists();
	}

}
