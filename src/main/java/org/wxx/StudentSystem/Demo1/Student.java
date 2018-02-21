package org.wxx.StudentSystem.Demo1;

import java.util.*;
import java.io.IOException;
import java.net.URL;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class Student {
	private String StudentName;
	private int StudentId;
	private URL StudentImage; 
	private String ProgramName;
	private HashSet<String> Courses;
	
	public String getProgramName() {
		return ProgramName;
	}
	
	public void setProgramName(String programName) {
		ProgramName = programName;
	}
	
	public HashSet<String> getCourses() {
		return Courses;
	}
	
	public void setCourses(HashSet<String> courses) {
		Courses = courses;
	}
	
	public String getStudentImage() {
		return StudentImage.toString();
	}
	
	public void setStudentImage(String url) {
		try {
			StudentImage = new URL(url);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getName() {
		return StudentName;
	}
	
	public void setName(String name) {
		StudentName = name;
	}
	
	public int getStudentId() {
		return StudentId;
	}
	
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	
}
