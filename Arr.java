package sample;
import java.util.Scanner;

public class Arr {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no.of Employees:");
		int n = sc.nextInt();
		String Emp[] = new String[n];
		
		for (int i = 0; i< n; i++) {
		System.out.print("Enter the employee "+ (i+1)+ "name");
		Emp[i] = sc.next();
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(Emp[i]);
		}
	}

}
