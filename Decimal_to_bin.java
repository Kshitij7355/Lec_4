package Lec4;

import java.util.Scanner;

public class Decimal_to_bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int mul=1;
		int sum=0;
		while(n>0) {
			int rem =n%10;
			sum+=rem*mul;
			mul=mul*2;
			n/=10;
		}
		System.out.println(sum);

	}

}
