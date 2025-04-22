package day6;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 0, b = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of terms for the series: ");
		int terms = scanner.nextInt();
		for(int i=1;i<=terms;i++)
		{
			System.out.print(a +" ");
			int next = a + b;
			a = b;
			b = next;
			
		}
		scanner.close();
	}

}
