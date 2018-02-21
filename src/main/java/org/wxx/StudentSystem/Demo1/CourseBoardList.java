package org.wxx.StudentSystem.Demo1;

import java.util.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})

public class CourseBoardList {
	private static CourseBoardRepository boardRepo = new CourseBoardRepository();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Collection<Board> getBoardLists(){	
		return boardRepo.getBoards();
	}
	
	@GET
	@Path("announcement")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Board geBoardList(@QueryParam("AnnouncementId") int announcementId ){	
		return  boardRepo.getBoard(announcementId);
	}
	
	@POST
	@Path("announcement")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Board postBoard(Board board) {
		boardRepo.addBoard(board);
		return board;
	}
	
	@PUT
	@Path("announcement")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Board putBoard(Board board) {
		boardRepo.updateBoard(board);
		return board;
	}
	
	@DELETE
	@Path("announcement")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Board deleteBoard(Board board) {
		boardRepo.addBoard(board);
		return board;
	}



}
