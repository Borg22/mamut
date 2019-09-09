package test;

import java.util.Scanner;

public class test2 {
	

		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String ord = input.next();
		System.out.println(reverse(ord));		
	 }
		public static String reverse(String Word) {
			if(Word.length()==1) {
				return Word;
			}else {
				return Word.charAt(Word.length() - 1) + reverse(Word.substring(0, Word.length() - 1));
			}
			
		}
	}

