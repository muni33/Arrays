package sample;

public class Swaparrayback22 {
	
	public static int[] swap(int start, int end, int[] arr){
		int Temp = 0;
		while(start < end) {
			Temp = arr[start];
			arr[start] = arr[end];
			arr[end] = Temp;
			start++;
			end--;
			
		}
		return arr;
	}
	public static void main(String args[]) {
	int n =3;
	int arr[] = {1,2,3,4,5,6,7};
	swap(0, n - 1 , arr);
	swap(n , arr.length-1, arr);
	swap(0, arr.length-1, arr);
	for(int digit:arr) {
		System.out.print(digit);
	}
	
	}

}
