package string;

public class stringsearch {

	public static void main(String[] args) {
		
		
		//indexOf(char)
		//indexOf(string)
		//indexOf(char,startindex)
		String v="I am the best ever that is my positive atttitude";
		int ans1=v.indexOf("ever");
		System.out.println(ans1);
		
		//lastIndexOf(char)
		//lastIndexOf(string)
		//lastIndexOf(char,startindex)		
		int ans2=v.lastIndexOf("a",30);
		System.out.println(ans2);
		
		
		
		
	}

}
