package com.day7;
import java.util.Scanner;
public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number");
		int accno = sc.nextInt();
		System.out.println("Enter Holder Name");
		String accName = sc.next();
		System.out.println("Enter Balance Amount");
		int balance = sc.nextInt();
		System.out.println("Enter Amount");
		int amount = sc.nextInt();
		
		withdraw(amount,balance);
		deposit(amount,balance);
		display();
		
		
		
		sc.close();
		

	}
	public static void withdraw(int amount , int balance ) {
		if(balance>=amount) {
			balance -= amount;
			System.out.println("Amount withdraw sucessfully");
		} else {
			System.out.println("Invalid Amount");
		}
	}
	
	public static void deposit(int amount , int balance) {
		if(amount<=0) {
			balance += amount;
			System.out.println("Amount deposit sucessfully");
		}
	}
	public static void display() {
		
		System.out.println("Final Amount" + balance);
	}
	

}
