package Lec5;

import java.util.Scanner;

public class Inverese_num {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int pos=1;
		int sum=0;
		while(n>0) {
			int rem =n%10;
			sum+=pos*Math.pow(10, rem-1);
			n/=10;
			pos++;
		}
		System.out.println(sum);

	}

}
