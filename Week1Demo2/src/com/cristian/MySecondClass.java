package com.cristian;

import java.util.Scanner;

public class MySecondClass {

	public static void main(String[] args) {
		Scanner Cristian = new Scanner(System.in);
		System.out.print("Please enter your name");
		String c=Cristian.nextLine();
		//System.out.println("Your name is: " + c);
		System.out.println("Please enter your age:");
		int age = Cristian.nextInt();
		System.out.println("Your name is " + c+ " and your are " + age +" year's old ");
	}

}
