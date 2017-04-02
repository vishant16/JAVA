package java;

import java.util.*;
public class stringtokenizer {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		String ans=in.nextLine();
		StringTokenizer st=new StringTokenizer(ans,"!@,'._?");
		int count=st.countTokens();
		System.out.println(count);
		while(st.hasMoreTokens())
		{
			String s=st.nextToken();
			
			System.out.println(s);
		}

	}

}
