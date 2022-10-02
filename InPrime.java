package week1.day2;

import java.util.Iterator;

public class InPrime {
	
	public static void main(String[] args) {
		
		int input = 17;
		boolean bPrime = true;
		
		for (int i = 5; i < input-1; i++) {
			if (input%5==0) {
				System.out.println("Non Prime");
				bPrime = false;
				break;
				
			}
			if (bPrime) {
				System.out.println("Prime");
				break;
				
			}
		}
				
	}

}
