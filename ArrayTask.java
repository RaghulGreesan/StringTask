package StringTask;
//import java.util.*;
//import java.lang.*;
public class ArrayTask {

	public static void main(String[] args) {
 
	int arr[]= {1,2,0,0,5,6,0};
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>0) {
			System.out.print(arr[i]);
		}
	}
	for(int j=0;j<arr.length;j++) {
		if(arr[j]==0) {
			System.out.print(arr[j]);
		}
	}
		
	}

}
