package Lec4;

import java.util.Scanner;

public class Prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int count=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				count++;
				break;
			}
		}
		if(count==1) {
			System.out.println("Not Prime");
		}
		else {
			System.out.println("prime no");
		}

	}

}
