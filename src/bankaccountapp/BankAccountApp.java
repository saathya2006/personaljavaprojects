package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp  {
	
	public static void main (String[] args){
		LinkedList<Accounts>accounts = new LinkedList<Accounts>();;
		LinkedList<String[]> dataentries=	utilities.readCSVFile.read("/Users/svenkataramani/Desktop/NewBankAccounts.csv");
		for(String[] datainfo:dataentries){
			String name = datainfo[0];
			String sinNum = datainfo[1] ;
			double depositMoney = Double.parseDouble(datainfo[3]) ;
		//	System.out.println("name= " +name + " SIN=" + sinNum + "account= " + datainfo[2] +"Money= "+ depositMoney);
			if(datainfo[2].equals("Savings"))
			{
				//System.out.println("Opening a Savings account for "+ datainfo[0]);
				accounts.add(new Savings(name,sinNum,depositMoney));
			}
			else if(datainfo[2].equals("Checking"))
			{
			//	System.out.println("Opening a Checking account " + datainfo[0]);
				accounts.add(new Chequing(name,sinNum,depositMoney));
			}
			else{
				System.out.println("There is a error");
			}
		}
		for(Accounts accountinfo:accounts){
			accountinfo.showInfo();
		}
	/*	Chequing ch1 = new Chequing("Tom Hardy", "81276128", 2000);
		Savings sv1 = new Savings("Brad Pitt", "32693278", 4000);
		
		ch1.showInfo();
		sv1.showInfo();
		sv1.compoundInterest();
		sv1.deposit(4000);
		sv1.withdraw(2000);
		sv1.transfer("Stocks",4000);
		ch1.deposit(4000);
		ch1.withdraw(2000);
		ch1.transfer("Stocks",4000);*/
		
	}

}
