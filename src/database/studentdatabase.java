package database;

import java.util.Scanner;

public class studentdatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the number of students that you want to register");
		int numofstudents = in.nextInt();
		student[] st = new student [numofstudents];
		for(int n=0;n<numofstudents;n++){
		st[n] = new student ();
		st[n].courseEnrollment();
		st[n].payTuition();
		st[n].showInfo();
		//in.close();
		}
	}

}
