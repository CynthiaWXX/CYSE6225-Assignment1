package org.wxx.StudentSystem.Demo1;

import java.util.*;

public class CourseLectureRepository {
	private Map<String, Lecture> lectures;
	private HashSet<Integer> notesId;
	
	
	CourseLectureRepository() {
		lectures = new HashMap<>();
		
		Lecture week1 = new Lecture();
		week1.setLectureId("Week1");
		week1.setAssignmentId(1);
		notesId = new HashSet<Integer>();
		notesId.add(1);
		week1.setLectureNotes(notesId);
		
		Lecture week2 = new Lecture();
		week2.setLectureId("Week2");
		notesId = new HashSet<Integer>();
		notesId.add(1);
		notesId.add(2);
		week2.setLectureNotes(notesId);
		
		Lecture week3 = new Lecture();
		week3.setLectureId("Week3");
		week3.setAssignmentId(2);
		notesId = new HashSet<Integer>();
		week3.setLectureNotes(notesId);
		
		
		lectures.put(week1.getLectureId(), week1);
		lectures.put(week2.getLectureId(), week2);
		lectures.put(week3.getLectureId(), week3);

	}
	
	public Collection<Lecture> getLectures(){
		return lectures.values();
	}
	
	
	public Lecture getLecture(String lectureId) {
		return lectures.get(lectureId);
	}
	
	public void addLecture(Lecture lecture) {
		lectures.put(lecture.getLectureId(), lecture);
		System.out.println("Lectures data added");	
	}
	
	public void updateLecture(Lecture lecture) {
		if(lectures.containsKey(lecture.getLectureId())) {
			lectures.put(lecture.getLectureId(), lecture);
			System.out.println("Lectures data updated");
		}
		lectures.put(lecture.getLectureId(), lecture);
		System.out.println("Lectures data created");		
	}
	
	public void removeLecture(Lecture lecture) {
		System.out.println("Data deleted was: "+lectures.remove(lecture.getLectureId()));

	}	
	
}
