package day2Homework;

public class Main {
	
	public static void main(String[] args) {
		
		Course course1 = new Course(1, "Java-React Software Developer Training Course", "A course which continues two months.");
		Course course2 = new Course();
		Course[] courses = {course1, course2};
		
		Lecturer lecturer = new Lecturer(1, "Engin", "Demiroğ");
		
		CourseManager courseManager = new CourseManager();
		for(Course course: courses) {
			courseManager.enrollTo(course);
		}
		courseManager.add(lecturer, course1);
		
	}

}
