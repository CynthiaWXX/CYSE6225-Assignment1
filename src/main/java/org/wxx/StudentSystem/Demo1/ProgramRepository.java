package org.wxx.StudentSystem.Demo1;

import java.util.*;
public class ProgramRepository {
	private Map<String, Program> Programs;
	
	ProgramRepository(){
		Programs = new HashMap<String, Program>();
		
		Program program1 = new Program();
		program1.setProgramName("Information_System");
		
		Program program2 = new Program();
		program2.setProgramName("Computer_Science");
		
		Programs.put(program1.getProgramName(), program1);
		Programs.put(program2.getProgramName(), program2);
	}
	
	public Collection<Program> getPrograms(){
		return Programs.values();
	}
	public Program getProgram(String programName) {
		for(Program program : Programs.values()) {
			if(program.getProgramName() == programName) {
				return program;
			}	
		}
		return new Program();
	}
}
