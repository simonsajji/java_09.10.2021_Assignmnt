package sep21;

public class Reverse_arry {
	public static void main(String args[]) {
		
		int[] arr= {2,5,3,6,7,3,1};
		int[] rev= new int[arr.length];
		int i=0;  
		int j=arr.length-1;
		while(i<rev.length && j>=0) {
			rev[i]=arr[j];
			i++;
			j--;
		}
		
		for(int k=0;k<rev.length;k++) {
			System.out.println(rev[k]);
		}
	}

}
