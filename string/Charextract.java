package string;

public class Charextract {

	 			
	

	public static void main(String[] args) {
		
		
		String v="vishant";
	
		//charAt(position)
		char charat =v.charAt(5);
		System.out.println(charat);
		
		//getChars(start,end,char[],0);
		String getchar="i am the best";
		char v1[]=new char[5-2];
		getchar.getChars(2, 5, v1, 0);
		System.out.println(v1);
		
		//getBytes -char to bytes
		String v3="ABC";
		byte v4[]=v3.getBytes();
		System.out.println(v4[0]);
		
		//toCharArray()
		char []v5=v.toCharArray();
		System.out.println(v5[0]);
			

	}

}
