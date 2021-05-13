package day3Homework;

public class Student extends User{
	
	private String lectureTaken;
	private int graduateYear;
	
	public Student() {
		
	}
	
	public Student(int id, String firstName, String lastName, String lectureTaken) {
		super.setId(id);
		super.setFirstName(firstName);
		super.setLastName(lastName);
		this.lectureTaken = lectureTaken;
	}
	
	public String getLectureTaken() {
		return lectureTaken;
	}
	
	public void setLectureTaken(String lectureTaken) {
		this.lectureTaken = lectureTaken;
	}
	
	public int getGraduateYear() {
		return graduateYear;
	}
	
	public void setGraduateYear(int graduateYear) {
		this.graduateYear = graduateYear;
	}
	
}
