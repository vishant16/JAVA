package string;

import java.math.BigInteger;
import java.util.Scanner;

public class biginteger {
	
	
	public static void main(String[]vshu){
		
		Scanner in=new Scanner(System.in);
		
		BigInteger bi;
		BigInteger a;
		BigInteger b;
		
		 a=in.nextBigInteger();
		 b=in.nextBigInteger();
		
		bi=(a.multiply(b));
		//bi=(BigInteger.valueOf(a).add(BigInteger.valueOf(b)));
		System.out.println(bi);
		
		

	}
}
