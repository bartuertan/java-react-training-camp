package day3Homework;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() 
						   + ", ortak konfigurasyon ile derse eklendiniz.");
	}
	
	public void multipleAdd(User[] users) {
		for(User user: users) {
			System.out.println(user.getFirstName() + " " + user.getLastName() 
			   				   + ", ortak konfigurasyon ile derse eklendiniz.");
		}
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() 
		   				   + ", ortak konfigurasyon ile dersten cikarildiniz.");
	}
	
}
