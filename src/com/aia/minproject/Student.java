package com.aia.minproject;

public class Student {
	private int studentID;
	private IRule rules;

	public Student(int studentID, IRule rules) {
		this.studentID = studentID;
		this.rules = rules;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setRules(IRule rules) {
		this.rules = rules;
	}

	public IRule getRules() {
		return rules;
	}
	@Override
	public String toString() {
		return rules.sayRule(studentID);
	}
}
