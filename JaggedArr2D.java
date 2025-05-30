package sample;
import java.util.Scanner;
public class JaggedArr2D {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of organisations:");
		int a = sc.nextInt();
		
		System.out.print("Enter number of Companies:");
		int b = sc.nextInt();
		
		String arr[][][] = new String [a][b][];
		
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				System.out.println("Enter the number of Employees in Organisation"+ (i+1)+"and Company:"+(j+1));
				arr[i][j] = new String [sc.nextInt()];			
					
				}
		}
		
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				for(int k = 0; k < arr[i][j].length; k++) {
				System.out.println("Enter the name of Employees"+(k+1)+" in Organisation"+ (i+1)+"and Company:"+(j+1));
				arr[i][j][k] =sc.next();			
					
				}
		}
		}
		
		for(int i = 0; i < a; i++) {
			System.out.println("Organization"+(i+1));
		
			for(int j = 0; j < b; j++) {
				System.out.println("Company"+(j+1));
				System.out.println("employee names:");

			
				for(int k = 0; k < arr[i][j].length; k++) {
					
				
					System.out.println(arr[i][j][k]); 
				}
			}
		}
		
		}

}
