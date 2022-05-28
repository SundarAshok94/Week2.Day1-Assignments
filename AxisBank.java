package Week3.Day1;

public class AxisBank extends Bankinfo{
	public double deposit(double deposit_amt) {
		return deposit_amt;
	}

	public static void main(String[] args) {
		AxisBank AB = new AxisBank();
		System.out.println("The deposit is" +" "+ AB.deposit(100000));
		System.out.println("The AB Deposit is " +" " +AB.deposit(500000));
		System.out.println("The fixed Amt is"+" " +AB.fixed(10500.20));
		System.out.println("The Savings amt is"+" " +AB.savings(1000000));
		
		
		
	}

}
