package bigdecimal;

import java.math.*;
import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		
		
		Scanner in=new Scanner(System.in);	
		BigDecimal a,b,Add,Sub,Mul,Div1,Div2,max,min,pow,rem,roundoff;
		a=in.nextBigDecimal();
		b=in.nextBigDecimal();
		
		Add=a.add(b);			//add
		Sub=a.subtract(b);		//sub
		Mul=a.multiply(b);		//mul
		
		
		
		if(a.compareTo(b)==0){
			System.out.println("a=b");}
		else if(a.compareTo(b)>0){
			System.out.println("a>b");}
		else {System.out.println("a<b");}
		
		System.out.println("add is "+Add);
		System.out.println("sub is "+Sub);
		System.out.println("mul is "+Mul);
		
		
		Div1=a.divide(b,0);		//div with roundoff
		System.out.println("div with round off "+Div1);
		

		Div2=a.divide(b,4,1);		//div
		System.out.println("div with round off "+Div2);
		
		//max min
		max=a.max(b);			
		min=a.min(b);
		pow=a.pow(5);			//power
		rem=a.remainder(b);		//remainder	
		
		
		MathContext m1=new MathContext(3);		//3 roundoff digit from right
		roundoff=a.round(m1);
		System.out.println(max);
		System.out.println(min);
		System.out.println(pow);
		System.out.println(rem);
		System.out.print(roundoff);
		
		
		//signum function(-1,0,1)
				

		int sig=a.signum();				
		System.out.print(sig);
		
		
	}

}
