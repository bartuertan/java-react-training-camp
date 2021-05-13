package day3Homework;

public class InstructorManager extends UserManager{
	
	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() 
		   				   + ", ogretmen olarak derse atandiniz.");
	}
	
	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() 
		   				   + ", ogretmen olarak dersten alindiniz, baska derste gorusmek uzere.");
	}
	
}
