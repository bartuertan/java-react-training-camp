package day3Homework;

public class Main {

	public static void main(String[] args) {
		
		Instructor engin = new Instructor(1, "Engin", "Demirog", "Java-React Yazilim Gelistirici Yetistirme Kampi");
		
		Student bartu = new Student(2, "Bartu", "Ertan", "Java-React Yazilim Gelistirici Yetistirme Kampi");
		
		User[] users = {engin, bartu};
		
		UserManager userManager = new UserManager();
		userManager.multipleAdd(users);
		
		System.out.println("\n");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(engin);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(bartu);
		
		System.out.println("\n");
		
		instructorManager.delete(engin);
		studentManager.delete(bartu);
		
	}

}
