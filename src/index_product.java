
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class index_product {

	private int[] A; //array to store input
	int j, k; //for left and right
	int size;
	int maxp;
	int index;
	
	
	public index_product(int sz){
	this.size = sz; //define the size of the array
	 A = new int[size+1];
	 A[0] = 0;
	 maxp = 0; //default max product
	 index = 1;
	}
	
	public void insert(int value){
		
		if(index < (size+1)){ //keep inserting while index is less than size
			A[index] = value;
			index++;
		}
	}
	
	public void print(){
	 int ind;
	 
	 for(ind = 0; ind < (size + 1); ind++){
		 System.out.println(" ==>" + A[ind]);
	 }
	}
	
	public int Left(int m){
		
		int t = (m - 1);
	//	System.out.println("M = " + m);
		while(t > 0){
		
			if(A[t] > A[m]){
				//System.out.println("M = " + m + " " + "left of M is " + t);
				return t; //index where the nearest left element is found
			}
			t--; //keep traversing left
		}
		
	
		
		return 0; //if index does not exit 
		
	} //end of method
	
	public int Right(int p){
		
		int q = (p+1);
		//System.out.println("P = " + p);
		while(q < (size+1)){
			
			if(A[q] > A[p]){
			
				//System.out.println("P = " + p + " " + "right of P is " + q);	
			  return q;
			}
			
			q++; //keep traversing right
		}
		
		return 0; //when index does not exist
	}
	
	//function to compute max index product
	public int Product(){
	int count;
	
	 for(count = 0; count < (size+1); count++){
		 
		 //start computing the maximum product for the index
		 if(count > 0){
		//	 System.out.println("count = " + count);
		   j = Left(count);
		   k = Right(count);
		   
		   if(maxp < (j * k)){
			  maxp = (j * k); 
		   }
		   
		 }//end of outer if
		 
	 }
	
	 
	return maxp; //return the max product of indices 
	}
	
	 public static void main(String[] args) throws IOException  {
	   /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.*/
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	      String s;
	      index_product items = null; //object for processing
	      int flag = 0;
	      StringTokenizer obj = null;
	      boolean tel = false;
	      
		 while ((s = in.readLine()) != null && s.length() != 0){
		  // System.out.println(" " + s);
		   
		   if(flag == 0){ // if its the first time read size only
			 int size = Integer.parseInt(s);
			 items = new index_product(size);
			
		   }
		   
		   if(flag == 1){
			   
			   		if(tel == false){  //tokenizes only once
	    		      obj = new StringTokenizer(s, " ");
	    		      tel = true;
	    		     }
			   		
			   	 while(obj.hasMoreTokens()){
	    		       
	    		    	int put = Integer.parseInt(obj.nextToken());
	    		       
	    		    items.insert(put);  //insert each new value u get
	    		    
	       	    } /*end of the while loop*/   	
			   		  
		   } //end of if
		   flag = 1;
		 
		 } // end of reading while loop

	//items.print();	 
	System.out.println("" + items.Product());
	}

}
