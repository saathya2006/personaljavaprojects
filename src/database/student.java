package database;

import java.util.Scanner;

public class student {
//private int numofstudents;
private String firstName;
private String lastName;
private int studentYear;
private String studentId;
private int tuitionBalance =0;
private int courseCost=600;
private String courses;
private static int id=1000;

public student (){
	Scanner in = new Scanner (System.in);
	System.out.println("Enter you first name");
	this.firstName = in.nextLine();
	System.out.println("Enter you last name");
	this.lastName = in.nextLine();;
	System.out.println("Enter the student year: 1. for freshman \n2. For Sophomore \n3. For Junior \n4. For Senior ");
	this.studentYear = in.nextInt();
	this.studentId = uniqueStudentId();
//	in.close();
 // System.out.println("Your Full Name is" + firstName + lastName + "And Your Grade Year is" + studentYear + "And Your Student ID is" + studentId);
}

private String uniqueStudentId(){
	id++;
	return studentYear + ""+ id;
}
public void courseEnrollment(){
	Scanner in = new Scanner (System.in);
	System.out.println("Enter the number of courses you wanna get enrolled");
	int l = in.nextInt();
	for (int i=0; i<l;i++){
		System.out.println("Enter the course you wanna get enrolled. If you wanna quit, enter Q");
		//System.out.println("hey");
		in = new Scanner (System.in);
		String course = in.nextLine();
		//System.out.println("hey2");
		if (!course.equals("Q")){
			//System.out.println(courses);
			//System.out.println(course);
			//courses = course ;
			if (courses==null){
				courses = course;
			}
			else
			{
				courses = courses + " " +course;
			}
			tuitionBalance = tuitionBalance + courseCost;
		}	
		else{
			break;
		}
		//in.close();
	}
	
//	System.out.println("The course you got enrolled are \n" +  courses);
	//System.out.println("Your total balance is" + tuitionBalance);
	viewBalance();
}
public void viewBalance (){
	System.out.println("Your total balance is" + tuitionBalance);
}

public void payTuition(){
	Scanner in = new Scanner (System.in);
	System.out.println("Enter the amount that you wanna pay");
	int payment = in.nextInt();
	tuitionBalance = tuitionBalance - payment;
	//viewBalance();
	//in.close();
	
}
public void showInfo(){
	System.out.println("Your Full Name is " + firstName + " "+ lastName + " "+ "And Your Student ID is " + studentId);
	System.out.println("The course you got enrolled are \n" +  courses);
	viewBalance();
}
}
