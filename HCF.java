package Lec4;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int divident=s.nextInt();
		int divisor=s.nextInt();
		while(divident%divisor!=0) {
			int rem =divident%divisor;
			divident=divisor;
			divisor=rem;
			
		}
		System.out.println(divisor);
		 
		 

	}

}
