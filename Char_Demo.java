package Lec4;

import java.util.Scanner;

public class Char_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char c =s.next().charAt(0);
		char ch = 'a';
		char ch1 ='0';
		System.out.println(ch);
		System.out.println(ch1);
		System.out.println((int)(ch));
		System.out.println((int)(ch1));
		System.out.println(ch+ch1);
		ch++;
		System.out.println(ch);

	}

}
