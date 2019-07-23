package com.everis.model;


public class Students {

	private int student_id;
	private String gender;
	private String first_name;
	private String last_name;
	private String date_of_birth;
	private String other_student_details;
	
	
//	getters and setters
	
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getOther_student_details() {
		return other_student_details;
	}
	public void setOther_student_details(String other_student_details) {
		this.other_student_details = other_student_details;
	}
	
}
