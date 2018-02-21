package org.wxx.StudentSystem.Demo1;

import java.util.Collection;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})

public class CourseLectureList {
	private static CourseLectureRepository lectureRepo = new CourseLectureRepository();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Collection<Lecture> getLecLists(){	
		return lectureRepo.getLectures();
	}
	
	@GET
	@Path("lecture")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Lecture getLecList(@QueryParam("LectureId") String lectureId){
		return lectureRepo.getLecture(lectureId);
	}
	
	@POST
	@Path("lecture")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Lecture postLecture(Lecture lecture) {
		return lecture;
	}
	
	@PUT
	@Path("lecture")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Lecture putLecture(Lecture lecture) {
		return lecture;
	}
	
	@DELETE
	@Path("lecture")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Lecture deleteLecture(Lecture lecture) {
		return lecture;
	}


}
