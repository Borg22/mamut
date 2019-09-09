package test;

import java.util.ArrayList;

public class test1 {
	
	

	
		
		private static ArrayList<String> Borg = new ArrayList<String>();
		
		public static void add(String a) {
			Borg.add(a);
		}
		
		public static ArrayList<String> returnerna(){
			return Borg;
		}
	}


