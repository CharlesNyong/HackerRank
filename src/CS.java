import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class CS {

	private int [] Ar;
	private int [] numb;
	private int index;
	private int sz;
	int inx;
	private static int flag;  
	
	public CS(int[] list, int lent){
    Ar = new int[lent]; /*create the array in that contains the number*/
    Ar = list;
    numb = new int[lent];
    sz = lent;
	inx =0;
    flag = 0;
		}
	
	public void insert(int input){
	
	  
	  /*insert while the index is low*/
	 if(inx < sz){
	 Ar[inx] = input;
	 inx++;
	 }
	 
	
   }
	
	public void print(){
		 for(int y=0; y<sz; y++){
				System.out.println(" " + Ar[y]); 
			 }
	}
	
	public void seed(){
	
		for(int i = 0; i<sz; i++){
		  numb[i] = i; /*seed the array*/	
		}
		
		/*for(int k = 0; k<100; k++){
			  System.out.println(" " + numb[k]);	
			}*/
	}
	
	public void compute(){
		int index = 0;
		int key;
		int count = 0;
		
		for(int l= 0; l<Ar.length; l++){
		 
			 key = numb[index++];  /*retrieve the value from the array for comparison*/
			
			 count = 0;
			for(int m=0; m<Ar.length; m++){
			
			   	if(key == Ar[m]){
			   	  count++;	
			   	}
			}
		System.out.print(" " + count);	
		} /*end of outer loops*/
   }
	
	 public static void main(String[] args) throws IOException  {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	      CS ab = null;
	      int[] array = null;
	      int ind = 0;
	      Scanner key = new Scanner(System.in);
	      int k, put; /*input variables*/
	      int size = 0;
	      StringTokenizer obj = null;
	      boolean tel = false;
	      
	      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	      String s;
	      
	      while ((s = in.readLine()) != null && s.length() != 0){
	    	  
	    	  
	    	  
	    	  if(flag == 0){
	    		  put = Integer.parseInt(s);
	    		  size = put;
	    		  array = new int[put];
	    		
	    	  }
	    	   if(flag > 0){
	    		     
	    		    if(tel == false){
	    		      obj = new StringTokenizer(s, " ");
	    		      tel = true;
	    		     }
	    		  
	    		     
	    		   while(obj.hasMoreTokens()){
	    		       
	    		    	put = Integer.parseInt(obj.nextToken());
	    		       
	    		     if(ind < size){  /*keep inserting things while the array isn't full*/
	        	       array[ind] = put;
	        	       ind++;
	    		     }
	    		     else if(ind > size){
	    		     ab = new CS(array, size);
	    		     break;
	    		    }
	       	    } /*end of the while loop*/
	    		 ab = new CS(array, size);   
	    	 
	     }
	     
	    flag++;	   
	    }
	      
	     // ab.print();
	     ab.seed();
		 ab.compute();
}
	 
} 
