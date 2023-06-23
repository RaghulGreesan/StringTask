package StringTask;
public class StringTask {
public static void main(String args[]) {
	String a="java is a programming language";
	String s="java is language";
	String aa[]=a.split(" ");
	String ss[]=s.split(" ");
	for (int i=0;i<aa.length;i++) {
		for(int j=0;j<ss.length;j++) {
			if(aa[i].equalsIgnoreCase(ss[j])) {
				System.out.print(ss[j]+"  ");
			}
		}
	}
	
}
}
