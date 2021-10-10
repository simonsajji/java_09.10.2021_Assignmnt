package sep21;

public class Intersection {
	public static void main(String args[]) {
		int j=0;int i=0;int u=0;
	    int[] nums1= {8,5,6,7};
	    int[] nums2= {1,3,2,5,4,7,6};
	    
	    if(nums1.length>=nums2.length) {
	    	u=nums1.length;
	    }
	    else {
	    	u=nums2.length;
	    }
	    int[] arr=new int[u];
	    int k=0;
	    
	
	    
	    while(i<nums1.length && (k<arr.length)){
	    	
	    	for(j=0;j<nums2.length;j++){
	    	
	    		if(nums1[i]==nums2[j] ) {
	    			
	    			arr[k]=nums2[j];
	    			k++;
		    		break;
		    	}
	    		else{
	    			k=k;
	    		}
	    		
	    		
	    	
		    

		   
	    	}
	    	i++;
	    }
	    for(int h=0;h<u;h++){
	    	for(int g=h+1;g<u;g++) {
	    		if(arr[h]==arr[g]) {
	    			arr[g]=0;
	    		}
	    		
	    	}
	    	
	    }
	    int q=0;int w=0;
	    int[] arr_new=new int[u];
	    while(q<arr_new.length && w<arr.length) {
	    	if(arr[w]!=0) {
	    		arr_new[q]=arr[w];
	    		q++;
	    	}
	    	w++;
	    }
	    
	    // printing the new arry
	    
	    for(int r=0;r<arr_new.length;r++) {
	    	System.out.println(arr_new[r]);
	    }
	    	
	 }
	        
	    

}
