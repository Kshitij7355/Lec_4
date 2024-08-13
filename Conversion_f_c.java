package Lec4;

import java.util.Scanner;

public class Conversion_f_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int min =s.nextInt();
		int max = s.nextInt();
		int step =s.nextInt();
		for(int i=min;i<=max;i=i+step) {
			int c = (int)((5.0/9)*(i-32));
			System.out.println(min +"\t"+c);
		}

	}

}
