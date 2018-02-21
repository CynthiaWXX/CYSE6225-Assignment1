package org.wxx.StudentSystem.Demo1;

import java.util.*;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Lecture {
	private String LectureId;
	private HashSet<Integer> LectureNotes;
	private int AssignmentId;
	
	public String getLectureId() {
		return LectureId;
	}
	public void setLectureId(String lectureId) {
		LectureId = lectureId;
	}
	public HashSet<Integer> getLectureNotes() {
		return LectureNotes;
	}
	public void setLectureNotes(HashSet<Integer> lectureNotes) {
		LectureNotes = lectureNotes;
	}
	public int getAssignmentId() {
		return AssignmentId;
	}
	public void setAssignmentId(int assignmentId) {
		AssignmentId = assignmentId;
	}
		
}
