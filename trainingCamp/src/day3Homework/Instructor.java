package day3Homework;

public class Instructor extends User{
	
	private String lectureGiven;
	private int retirementYear;
	
	public Instructor() {
		
	}
	
	public Instructor(int id, String firstName, String lastName, String lectureGiven) {
		super.setId(id);
		super.setFirstName(firstName);
		super.setLastName(lastName);
		this.lectureGiven = lectureGiven;
	}
	
	public String getLectureGiven() {
		return lectureGiven;
	}
	
	public void setLectureGiven(String lectureGiven) {
		this.lectureGiven = lectureGiven;
	}
	
	public int getRetirementYear() {
		return retirementYear;
	}
	
	public void setRetirementYear(int retirementYear) {
		this.retirementYear = retirementYear;
	}
	
}
