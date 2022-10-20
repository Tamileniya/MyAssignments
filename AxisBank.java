package week3.day1;

public class AxisBank extends BankInfo{

	public void Deposit() {
		System.out.println("The Deposit is");
		super.Deposit();
	}
	public static void main(String[] args) {
		AxisBank b = new AxisBank();
		b.Deposit();
		b.Fixed();
		b.Savings();
		
	}
}

