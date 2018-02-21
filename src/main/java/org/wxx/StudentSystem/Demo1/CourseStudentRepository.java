package org.wxx.StudentSystem.Demo1;
import java.util.*;

public class CourseStudentRepository {
	private Map<Integer, Student> students;
	private HashSet<String > courses;
	
	CourseStudentRepository() {
		students = new HashMap<>();
		
		Student s1 = new Student();
		s1.setName("xixi");
		s1.setStudentId(01);
		s1.setStudentImage("https://images.pexels.com/photos/266642/pexels-photo-266642.jpeg?h=350&dpr=2&auto=compress&cs=tinysrgb");
		s1.setProgramName("Information_System");
		courses = new HashSet<String>();
		courses.add("Could_Computing");
		courses.add("Web_Development");
		s1.setCourses(courses);
		
		Student s2 = new Student();
		s2.setName("Cici");
		s2.setStudentId(02);
		s2.setStudentImage("https://images.pexels.com/photos/266642/pexels-photo-266642.jpeg?h=350&dpr=2&auto=compress&cs=tinysrgb");
		s2.setProgramName("Information_System");
		courses = new HashSet<String>();
		courses.add("Could_Computing");
		courses.add("Data_Science");
		s2.setCourses(courses);
		
		students.put(s1.getStudentId(), s1);
		students.put(s2.getStudentId(), s2);
	}
	
	public Collection<Student> getStudents(){
		return students.values();
	}
	
	
	public Student getStudent(int studentId) {
		return students.get(studentId);
	}
	
	public void addStudent(Student student) {
		students.put(student.getStudentId(), student);
	}
	public void updateStudent(Student student) {
		if(students.containsKey(student.getStudentId())) {
			students.put(student.getStudentId(), student);
			System.out.println("Students data updated");
		}
		students.put(student.getStudentId(), student);
		System.out.println("Students data created");		
	}
	
	public void removeStudent(Student student) {
		System.out.println(students.remove(student.getStudentId()));
	}	
	
}
