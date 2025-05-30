package sample;

public class Mergearr {
	public static void main(String args[]) {
		String input = "Hello Good Morning";
		String output = "";
//		for(int i = 0; i < input.length();i++) {
//			if (input.charAt(i) != ' ') {
//				output += input.charAt(i);
//			}
//		}
		
		//output = input.replaceAll(" ", "");
		
		String arr[] = input.split(" ");
		for (int i = 0;i < arr.length; i++) {
			output +=arr[i];
		}
		System.out.print(output);
	}

}
