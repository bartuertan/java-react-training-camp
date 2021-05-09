package day2Homework;

public class Course {
	
	int id;
	String name;
	String description;
	
	public Course() {
		this.name = "Bilinmeyen Kurs";
	}
	
	public Course(int id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
}
