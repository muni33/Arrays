package sample;

import java.util.Scanner;

public class ThreeDim {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print();
		System.out.print("Enter the no.of Compaines:");
		int n = sc.nextInt();
		System.out.print("Enter the no.of Employees:");
		int m = sc.nextInt();
		System.out.print();
		
		String Com [][] = new String [n][m];
		
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++){
				System.out.println("Enter Name of the employe " + (j+1)+"for company "+ (i+1));
				Com[i][j] = sc.next();
			}
		}

}
