package sample;
import java.util.Scanner;
public class Swaparrayback11 {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Size of an array:");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter  Elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();		
		}
		
		System.out.println("Enter The Number of Elements to shift:");
		int swapnum = sc.nextInt();
		
		int Temparr[] = new int[arr.length];
		int Temp = 0;
		
		for (int i = swapnum; i < arr.length; i ++) {
			Temparr[Temp] = arr[i];
			Temp++;
		}
		
		for (int i = 0; i < swapnum; i ++) {
			Temparr[Temp] = arr[i];
			Temp++;
		}
		

		for (int i = 0; i < arr.length; i ++) {
			System.out.print(Temparr[i]+" "); 
		
		}
	}
}
