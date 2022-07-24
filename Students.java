package week3.day1.Bank;

public class Students {
	
	public static void main(String[] args) {
	int id=90;
	String name="Keerthi";
	long phoneNumber=989767656;
	String email="testmail@gmail.com";
	
	Students st= new Students();
	st.getStudentInfo(id);
	st.getStudentInfo(id, name);
	st.getStudentInfo(email, phoneNumber);
					
	}
	public  void getStudentInfo(int id) {
		System.out.println("ID :" + id);
	}
	
	public  void getStudentInfo(int id,String name) {
		System.out.println("ID :" id+""+"StName :"+name);

	}
	
	public  void getStudentInfo(String email, long phone) {
		System.out.println("MailID :" email + ""+ "Phone :"+phone);
	}
}
