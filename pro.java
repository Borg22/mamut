package test;

import java.util.Scanner;

public class pro {

 public static void main(String[] args) {
	
	 Scanner input = new Scanner(System.in);
	 
	 
	 int tal = input.nextInt();
	 int sum = tal;
	 while(tal != 0) {
		 tal = input.nextInt();
		 sum += tal;
	 }
	 System.out.println(sum);
	 
 }
}




