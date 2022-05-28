package Week3.Day1;

public class Students {
	
	public void getstudentInfo(int SID, String Sname,float Phno) {
		System.out.println("The Student details" + SID+ " " + Sname + " "+Phno);
	}
	public void getstudentInfo(int SID,String Sname) {
		System.out.println("The Student details are" +SID+ " " +Sname);

	}
	public void getstudentInfo(float Phno) {
		System.out.println("The Student Ph no is" + Phno);

	}
	public void getstudentInfo(String Emailid) {
		System.out.println("The Student Emailid" + Emailid);

	}
	

	
	


	public static void main(String[] args) {
		Students S1=new Students();
		S1.getstudentInfo(101, "sundar", 9947974784949F);
		S1.getstudentInfo(102,"Ajay");
		S1.getstudentInfo(87469494009F);
		S1.getstudentInfo("sundarashok1994@gmail.com");

		
	}

}
