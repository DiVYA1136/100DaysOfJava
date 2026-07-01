package com.day1;
import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		boolean isPrime = true;
		if(n<=1) {
			isPrime = false;
		} else {
			for(int i=2;i<n;i++) {
				if(n % i ==0) {
					isPrime = false;
					break;
				}
			}
		}
		
		if(isPrime) {
			System.out.println(n +" is a prime number");
		}else {
			System.out.println(n + " is not a prime number");
		}
		
	}

}
