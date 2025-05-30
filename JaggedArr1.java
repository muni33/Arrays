package sample;
import java.util.Scanner;
public class JaggedArr1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number of Compaines");
		int n = sc.nextInt();
		
		String arr[][] = new String [n][];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the number of Employess in Company"+(i+1));
			arr[i] = new String [sc.nextInt()];
		}
		
		for (int i = 0; i < n ; i++) {
			System.out.print("Enter the name of Employess in Company"+(i+1));
			for(int j = 0; j < arr[i].length; j++) {
			
			arr[i][j] = sc.next();
		}
		}
		
		for (int i = 0; i < n ; i++) {
			for(int j = 0; j < arr[i].length ; j++) {
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();

		}
	}

}
