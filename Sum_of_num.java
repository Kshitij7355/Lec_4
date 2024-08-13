package Lec_4;
import java.util.*;
public class Sum_of_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s  = new Scanner(System.in);
        int n = s.nextInt();
        int sum=0;
        for(;n>0;) {
        	int rem = n%10;
        	sum=sum+rem;
        	n/=10;//n=n/10
        }
        System.out.println(sum);
	}

}
