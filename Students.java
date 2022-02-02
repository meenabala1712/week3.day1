package week3.day1;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Id of the Student is : " + id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Id and Name of the Student is : " + id + " , " + name);
	}

	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("Email and Phone Number of the Student is : " + email + " , " + phoneNumber);
	}

	public static void main(String[] args) {
		Students stud = new Students();
		stud.getStudentInfo(18);
		stud.getStudentInfo(18, "Meena");
		stud.getStudentInfo("meenabala1712@.com", 8939631938L);
	}

}
