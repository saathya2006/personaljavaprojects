package bankaccountapp;

public class Chequing extends Accounts {
	//int debitCardNumber;
private	int pin;
private	String debitCardNumber;
private	double IRate;
	//list properties unique for chequing account
	
	//initialize constructor for chequing account properties
	public Chequing(String name, String ssn, double initialdeposit){
		super(name, ssn, initialdeposit);
		accountNumber = 2 +accountNumber;
		this.pin = chequingPin();
		this.debitCardNumber = debitCardNumbergen();
		//System.out.println("The account name is " + name + " Your social insurance number is " +ssn + " and your balance is " +balance + " and your Acc Number is " +accountNumber );
	//	System.out.println("Your new chequing account");
	//	System.out.println("Name of the chequing account is"+name);
	}
	public void showInfo(){
		super.showInfo();
		System.out.println("This is your new chequing account");
		System.out.println("******Your chequing account features*******");
		System.out.println("Your Debit Card Number is " + debitCardNumber);
		System.out.println("Your Debit Card Pin is " + pin );
	}
	//methods unique for chequing account
	
	private int chequingPin(){
		
		pin =	 (int) (Math.random() * Math.pow(10, 4));
		return pin;
		
	}
	private String debitCardNumbergen(){
		
	//	debitCardNumber =	 (int) (Math.random() * Math.pow(10, 12));
	//int	debitCardNumberFinal= (int) (Math.random() * Math.pow(10, 2));
	 debitCardNumber = String.valueOf( (int) (Math.random() * Math.pow(10, 12))) + String.valueOf((int) (Math.random() * Math.pow(10, 2)));
		return debitCardNumber;
		
	}
	@Override
	public double setIRate() {
		// TODO Auto-generated method stub
		IRate = getIRate() *0.15;
		return IRate;
	}
}
