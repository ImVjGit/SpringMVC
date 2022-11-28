package com.Entity;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Studnet {

	private String name;
	private long Id;
	@DateTimeFormat(pattern ="dd/mm/yyyy")
	private Date date;
	private List<String> course;
	private String Gender;
	private String type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<String> getCourse() {
		return course;
	}

	public void setCourse(List<String> course) {
		this.course = course;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "\nStudnet \nname=" + name + ", \nId=" + Id + ",\ndate=" + date + ",\ncourse=" + course + ", \nGender=" + Gender
				+ ", \ntype=" + type;
	}

}
