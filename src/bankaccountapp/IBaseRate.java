package bankaccountapp;

public interface IBaseRate {
	
	//methods that gives base interest rate
	default double getIRate(){
		return 2.5;
	}

}
