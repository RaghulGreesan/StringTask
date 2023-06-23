package StringTask;

//import java.util.Arrays;

public class StringTask1 {

	public static void main(String[] args) {
		String s="sathishc#kumarh#";
		String ss[]=s.split("");
		for(int i=0;i<ss.length;i++) {
			//System.out.print(ss[i]);
			if(ss[i].equals("#"))
			{
				ss[i-1]="#";
			}
		}
		//System.out.println(Arrays.toString(ss));
		
			for(int i=0;i<ss.length;i++) {
				if((!ss[i].equals("#")) ) {
					System.out.print(ss[i]);
					
				}
			//	System.out.println(Arrays.toString(ss));
			}
		//	System.out.println(Arrays.toString(ss));
		}
	}

