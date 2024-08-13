package Lec4;

import java.util.Scanner;

public class Fac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int mul=1;
		if(n==0) {
			System.out.println(mul);
		}
		else {
			while(n>0) {
				mul=mul*n;
				n--;
			}
		}
		System.out.println(mul);

	}

}
