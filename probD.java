
import java.util.*;

import java.text.DecimalFormat;
import java.lang.Math;

public class Main {

	public static double formulaf(int[] ab) {
		double p = ab[0] - ab[1];
		p = Math.abs(p) + 1;
		double c = 2/p;
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int[] ab = new int[2];
		ab[0] = sc.nextInt();
		ab[1] = sc.nextInt();
		
		
		double c = formulaf(ab);
		
		DecimalFormat f = new DecimalFormat("##.000000");
		String value = f.format(c);
		System.out.println(value);

	}

}





