package emailapp;

import java.util.Scanner;

public class Email {
private String firstname;
private String lastname;
private String department;
private String password;
private int defaultPasswordLength =10;
private int mailboxcapacity =500;
private String alternateEmail;
private String email;
private String companysuffix = "google.com";


//constructor to receive firstname and lastname

//generate random password

//ask for department

//set methods to change password

// set method for alternate email

//set mailbox capacity

public Email(String firstname, String lastname){
	this.firstname = firstname;
	this.lastname = lastname;
//	System.out.println("Full name is "+this.firstname+" "+this.lastname);
	this.department = setDepartment();
//	System.out.println("The department you chose is " + this.department);
	this.password = randomPassword(defaultPasswordLength);
	this.email=this.firstname.toLowerCase() + "." + this.lastname.toLowerCase() +"@" + this.department.toLowerCase()+"."+companysuffix;
	System.out.println("Your Email ID is " + this.email);
	System.out.println("Your Random Password is " + this.password);
	showinfo();
}
private String setDepartment (){
	System.out.println("The department codes are 1. Sales 2. Development and 3. Accounting. Enter your department code: ");
	Scanner in = new Scanner(System.in);
	int i = in.nextInt();
	if (i==1){
		return("Sales");
	}
	else if (i==2){
		return("Development");
	}
	else if (i==3){
		return("Accounting");
	}
	else
	return "";
}
private String randomPassword(int length){
	String passwordSet ="abcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
	char password[] =new char[length];
	for(int i=0;i<length;i++)
	{
		int rand= (int) (Math.random() * passwordSet.length());
		//System.out.println(rand);
		
		password[i]= passwordSet.charAt(rand);
	}
	return new String (password);
}
public void setMailBoxCapacity (int capacity){
	this.mailboxcapacity = capacity;
}
public void changePassword (String password){
	this.password = password;
}
public void setAlternateEmail (String alternateEmail){
	this.alternateEmail = alternateEmail;
}
public int getMailBoxCapacity (){ return mailboxcapacity; }

public String getchangePassword (){ return password; }

public String getAlternateEmail (){ return alternateEmail; }

public String showinfo(){
return firstname + lastname + "\n"+ email +"\n"+mailboxcapacity + "mb";

}
}