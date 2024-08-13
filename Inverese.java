
package Lec4;

import java.util.Scanner;

public class Inverese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int pos=1;
		int sum=0;
		while(n>0) {
			int rem =n%10;
			sum+=pos*Math.pow(10, rem-1);
			pos++;
			n/=10;
			
		}
		System.out.println(sum);
		

	}

}
