package week3.day1.assignment3;

public class AxisBank extends BankInfo
{
	public void deposit()
	{
		System.out.println("deposit");
		
	}
	
	public static void main (String arg[])
	{
		BankInfo b=new BankInfo();
		b.saving();
		b.deposit();
		b.fixed();
		BankInfo b2=new BankInfo();
		b2.deposit();
	}
	
	

}
