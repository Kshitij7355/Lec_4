package Lec_4;
import java.util.*;
public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int divisor=s.nextInt();
		int divident=s.nextInt();
		int mul=divisor*divident;
		while(divident%divisor!=0) {
			int rem = divident%divisor;
			divident=divisor;
			divisor=rem;
			
		}
		int lcm=mul/divisor;
		System.out.println(lcm);

	}

}
