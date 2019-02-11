package bankaccountapp;

public class Savings extends Accounts {

	
	private	int safetyBoxNumber;
	private	int accessCode;
	private	double IRate;
	//list properties unique for savings account 
	
		//initialize constructor for savings account properties
	public Savings(String name, String ssn, double initialdeposit){
		super (name, ssn, initialdeposit);
		accountNumber = 1 +accountNumber;
		this.accessCode = accesscodegen();
		this.safetyBoxNumber = safetyBoxNumbergen();
		//System.out.println("The account name is " + name + " Your social insurance number is " +ssn + " Your balance is " +balance + " Your Acc Number is " +accountNumber + " Your Access Code is " +accessCode + "\n and Your Safety Box Num is " +safetyBoxNumber);
		//System.out.println("");
		//System.out.println("Your Savings account name is" + name);
	}
	
		public void showInfo(){
			super.showInfo();
			System.out.println("This is your new savings account");
			System.out.println("******Your savings account features*******");
			System.out.println("Your Safety Box Number " + safetyBoxNumber);
			System.out.println("Your Safety Box Access Code " + accessCode );
			}
		private int accesscodegen(){
			
			accessCode =	 (int) (Math.random() * Math.pow(10, 4));
			return accessCode;
			
		}
		//methods unique for savings account
		private int safetyBoxNumbergen(){
			
			safetyBoxNumber =	 (int) (Math.random() * Math.pow(10, 3));
			return safetyBoxNumber;
			
		}

		@Override
		public double setIRate() {
			// TODO Auto-generated method stub
			IRate = getIRate() - 0.25;
			return IRate;
		}
		
}
