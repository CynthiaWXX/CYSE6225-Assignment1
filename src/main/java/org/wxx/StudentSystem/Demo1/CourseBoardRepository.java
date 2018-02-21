package org.wxx.StudentSystem.Demo1;

import java.util.*;

public class CourseBoardRepository {
	private Map<Integer,	Board> boards;
	
	CourseBoardRepository() {
		boards = new HashMap<Integer,Board>();
		
		Board Announcement1 = new Board();
		Announcement1.setAnnouncementId(1);
		Announcement1.setAnnouncementContent("Assignment of this week has been uploaded!");
		
		Board Announcement2 = new Board();
		Announcement2.setAnnouncementId(2);
		Announcement2.setAnnouncementContent("Next week no class!");
		
		boards.put(Announcement1.getAnnouncementId(), Announcement1);
		boards.put(Announcement2.getAnnouncementId(), Announcement2);	
	}
	
	public Collection<Board> getBoards(){
		return boards.values();
	}
	
	
	public Board getBoard(int announcementId) {
		for(Board board : boards.values()) {
			if(board.getAnnouncementId() == announcementId) {
				return board;
			}	
		}
		return new Board();
	}
	
	public void addBoard(Board board) {
		boards.put(board.getAnnouncementId(), board);
	}
	
	public void updateBoard(Board board) {
		if(boards.containsKey(board.getAnnouncementId())) {
			boards.put(board.getAnnouncementId(), board);
			System.out.println("Board data updated");
		}
		boards.put(board.getAnnouncementId(), board);
		System.out.println("Board data created");		
	}
	
	public void removeBoard(Board board) {
		System.out.println(boards.remove(board.getAnnouncementId()));
	}
}
