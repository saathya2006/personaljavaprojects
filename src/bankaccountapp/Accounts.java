package bankaccountapp;

public abstract class Accounts implements IBaseRate{
private String name;
private String ssn;
private double balance;
protected double rate;
protected String accountNumber;
private static int index =10000;
	
	//list common account properties
	
	//initalize constructor for common account properties
	public Accounts (String name, String ssn, double initialdeposit) {
		this.name = name;
		this.ssn = ssn;
		this.balance = initialdeposit;
		
		this.accountNumber = accountNumber();	
	//	System.out.println("The account name is " + name + " Your social insurance number is " +ssn + " and your balance is " +balance + " and your Acc Number is " +accountNumber );
		index++;
		this.rate =setIRate(); 
		//System.out.println("this creates new account");
		//System.out.println("this is your new account name"+name);
	}

	private String accountNumber() {
		// TODO Auto-generated method stub
		String finSsn = ssn.substring(ssn.length()-2, ssn.length());
		int randNum = (int) (Math.random() * Math.pow(10, 3));
		return finSsn + index + randNum;
	}
	public abstract double setIRate();
	
	public void deposit(double depositMoney){
		balance = balance + depositMoney ;
		System.out.println("The amount that you wanna deposit is" +depositMoney);
		printBalance();
	}
	public void withdraw (double withdrawMoney){
		balance = balance - withdrawMoney ;
		System.out.println("The amount that you wanna withdraw is" +withdrawMoney);
		printBalance();
	}
	
	public void transfer (String transferTo, double transferMoney){
		balance = balance - transferMoney ;
		System.out.println("The amount that you wanna transfer is" +transferMoney);
		printBalance();
	}
	public void printBalance(){
		System.out.println("Your balance is" + balance);
		
	}
	public void compoundInterest(){
		double accruedInterest = balance * (rate/100);
		balance= balance + accruedInterest;
		printBalance();
		
	}
	public void showInfo(){
		System.out.println("The account name is " + name + " Your social insurance number is " +ssn + " and your balance is " +balance + " and your Acc Number is " +accountNumber + " and your Interest rate is " +rate);
		
	}
	//common methods to deposit, withdraw, transfer and display info
}
