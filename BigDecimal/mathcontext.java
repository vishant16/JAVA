package bigdecimal;

import java.util.*;
import java.math.*;
public class mathcontext {

	public static void main(String[]vshu)
	
	{
		BigDecimal a,ans;
		Scanner in=new Scanner(System.in);
		MathContext m1=new MathContext(2);		//take two digit from right
		a=in.nextBigDecimal();	
		ans=a.abs(m1);
		System.out.println(ans);
		
		
	}
}
