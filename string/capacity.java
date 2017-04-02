package string;

public class capacity {
	
	
	
	public static void main(String[]vshu)
	{
		
	//capacity
	StringBuffer sb=new StringBuffer("i vishant");
	StringBuffer sb1=new StringBuffer("vishant");
	StringBuffer sb3=new StringBuffer("vishant panchal");
	//it reserves inbuilt 16 spaces when blank because it reduces reallocation
	System.out.println(sb.capacity());
	
	
	//append(string)
	System.out.println(sb.append(" panchal "));
	
	//insert(str,chr)
	System.out.println(sb.insert(2,"am "));
	
	//reverse
	System.out.println(sb1.reverse());
	
	//delete(startindex,endindex)
	//deleteCharAt(position)
	System.out.println(sb3.delete(2,5));
	System.out.println(sb3.deleteCharAt(2));
	
	//replace
	String s="vishant";
	String v=s.replace("ish", "iisshh");
	System.out.println(v);
	
}
}
