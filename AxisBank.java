package week3.day1.assignments;

public class AxisBank extends BankInfo {

	public void deposit()
	{
		System.out.println("Overridden deposit from AxisBank Class");
	}
	
	public static void main(String[] args) {
		
		AxisBank bnk = new AxisBank();
		
		bnk.deposit();
		
	
	}

}
