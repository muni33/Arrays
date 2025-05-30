package sample;
import java.util.Scanner;

public class Twodimensionarr {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no.of Compaines:");
		int n = sc.nextInt();
		System.out.print("Enter the no.of Employees:");
		int m = sc.nextInt();
		
		String Com [][] = new String [n][m];
		
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++){
				System.out.println("Enter Name of the employe " + (j+1)+"for company "+ (i+1));
				Com[i][j] = sc.next();
			}
		}
		
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(Com[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		
		
	}

}

