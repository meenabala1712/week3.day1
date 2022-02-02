package week3.day1;

public class AxisBank extends BankInfo{

	@Override
	public void deposit() {
		
		// super.deposit();
		System.out.println("Deposit Account of Axis Bank");
	}

	public static void main(String[] args) {
		
		AxisBank axis = new AxisBank();
//		BankInfo bank = new BankInfo();
		axis.saving();
		axis.fixed();
		axis.deposit();
//	    bank.deposit();
	}
}
