package day2Homework;

public class CourseManager {
	
	public void enrollTo(Course course) {
		System.out.println("Congratulations! You have enrolled to " + course.name + " successfully.");
	}
	
	public void add(Lecturer lecturer, Course course) {
		System.out.println("Lecturer " + lecturer.firstName + " " + lecturer.lastName 
				+ " is assigned to " + course.name + ".");
	}
	
}
