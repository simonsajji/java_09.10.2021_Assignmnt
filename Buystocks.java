package sep21;

public class Buystocks {
	
	public static void main(String args[]) {
		int[] prices= {2,7,5,9,0,9,7,3,10,7,2,11};
		int buy=0;
	    int sell=0;int j=0;
	    int profit=0;
	            
	    for(buy=0;buy<prices.length;buy++){
	    	for(sell=buy+1;sell<prices.length;sell++){
	                    if(((prices[sell]-prices[buy])>profit) && (sell>buy)){
	                        profit=prices[sell]-prices[buy];
	                    }
	                    
	                
	            }
	                
	            }
	            System.out.println(profit);
            
    
            
            
        
        
            
        
        
 
    }

}
