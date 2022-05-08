package demo;

import java.util.Scanner;

public class addTwoNum {
	public static void main(String[] args) {
		int x,y,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Nub:-");
		x = sc.nextInt();
		System.out.println("Enter 2nd Nub:-");
		y = sc.nextInt();
		sc.close();
		sum=x+y;
		System.out.println("Sum"+sum);
	}

}
