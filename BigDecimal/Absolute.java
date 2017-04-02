package bigdecimal;

import java.math.*;
import java.util.*;
public class Absolute {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		BigDecimal a;
		a=in.nextBigDecimal();
		BigDecimal ans=a.abs();			//remove - sign
		System.out.println(ans);
	}

}
