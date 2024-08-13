package Lec5;

import java.util.Scanner;

public class Faherheit_to_Celsius {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int min =s.nextInt();
		int max = s.nextInt();
		int steps=s.nextInt();
		for(int i=min;i<=max;i+=steps) {
			int c = (int)((5.0/9)*(i-32));
			System.out.println(i+"\t"+c);
		}

	}

}
