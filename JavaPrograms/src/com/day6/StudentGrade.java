package com.day6;
import java.util.Scanner;
public class StudentGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks of Maths Subject");
		int math = sc.nextInt();
		System.out.println("Enter Marks of Science Subject");
		int sci = sc.nextInt();
		System.out.println("Enter Marks of Socail Subject");
		int soc = sc.nextInt();
		System.out.println("Enter Marks of English Subject");
		int eng = sc.nextInt();
		System.out.println("Enter Marks of Hindi Subject");
		int hindi = sc.nextInt();
		int total =math+sci+soc+eng+hindi;
		int average = total/5;
		System.out.println("Total Marks : "+total);
		System.out.println("Average Percentage : "+average);
		grade(average);
		sc.close();
		
	}
	public static void grade(int average) {
		if(average >= 90) {
			System.out.println("Grade A"); 
		} else if(average >=75 && average <= 89) {
			System.out.println("Grade B");
		} else if( average >=60 && average <=74) {
			System.out.println("Grade C");
		} else {
			System.out.println("Grade D");
		}
		
	}

	
}
