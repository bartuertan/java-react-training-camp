package day3Homework;

public class StudentManager extends UserManager{
	
	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() 
		   				   + ", ogrenci olarak derse kaydoldunuz.");
	}
	
	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() 
		   				   + ", ogrenci olarak dersten kaydiniz silindi, basarilar.");
	}
	
}
