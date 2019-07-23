package com.everis.model;

import java.util.Date;

public class MSStudents {
	private Students students;
	private Date date;

// constructor

	public MSStudents() {
	}

	public MSStudents(Students students, Date date) {
		this.students = students;
		this.date = date;
	}

//	getters and setters
	public Students getStudents() {
		return students;
	}

	public void setStudents(Students students) {
		this.students = students;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
