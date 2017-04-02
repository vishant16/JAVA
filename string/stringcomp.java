package string;

public class stringcomp 
{
	public static void main(String[]vshu)
	{
		
	
		
		//equals()
		String v="vishant";
		String v1="panchal";
		boolean ans=v.equals(v1);
		System.out.println(ans);
		
		//equalsIgnorreCase()
		String v2="Vishant";
		String v3="viShANt";
		boolean ans1=v2.equalsIgnoreCase(v3);
		System.out.println(ans1);
		
		//regionMatches(s1startindex,string2name,s2startindex,numchars)
		String v4="i am the best";
		String v5="i am best ever";
		boolean ans3=v4.regionMatches(0, v5, 0, 4);
		System.out.println(ans3);
		
		//startsWith(),endsWith()
		
		String v6="I am the best";
		boolean ans4=v6.startsWith("I");
		boolean ans5=v6.endsWith("best");
		System.out.println(ans4);
		System.out.println(ans5);
		
		// ==-  -> compares two reference object
		String a="vishant panchal";
		String b="vishant panchal";
		boolean ans6=(a==b);
		System.out.println(ans6);
		
		//compareTo()
		
		String arr[]={"vishant","vinay","PRignesh","sagar","milind","nitin","jaydeep"};
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if( arr[j].compareTo(arr[i])<0 ){		
							String temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;}}}	
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);}}}
			
			
			
				
	

