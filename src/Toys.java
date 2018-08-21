import java.util.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Toys {

	private int [] Ar;
	private int [] numb;
	private int index;
	private int sz;
	int inx;
	private static int flag;  
	private int money;
	
	public Toys(int[] list, int lent, int amount){
    Ar = new int[lent]; /*create the array in that contains the number*/
    Ar = list;
    numb = new int[lent];
    sz = lent;
	inx =0;
    flag = 0;
    money = amount;
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
		
		
			for(int m=0; m<Ar.length; m++){
			
			   	if(money > Ar[m]){
			   	  count++;	
			   	}
		
			
		} /*end of outer loops*/
			System.out.print(count);	
   }
	
	 public static void main(String[] args) throws IOException  {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	      Toys ab = null;
	      int[] array = null;
	      int ind = 0;
	      Scanner key = new Scanner(System.in);
	      int k, put; /*input variables*/
	      int size = 0;
	      StringTokenizer obj = null, p = null;
	      boolean tel = false;
	      int price = 0; 
	      
	      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	      String s;
	      
	      while ((s = in.readLine()) != null && s.length() != 0){
	    	  
	    	  
	    	  /*when we read the first line of input do this*/
	    	  if(flag == 0){
	    		  p = new StringTokenizer(s, " ");
	    		  
	    		  while(p.hasMoreTokens()){
	    		  if(p.countTokens() == 2)
	    			 size = Integer.parseInt(p.nextToken());
	    		  else if(p.countTokens() < 2)
	    		   	 price = Integer.parseInt(p.nextToken()); 
	    		  }
	    		  array = new int[size];
	    		  
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
	    		     ab = new Toys(array, size, price);
	    		     break;
	    		    }
	       	    } /*end of the while loop*/
	    		 ab = new Toys(array, size, price);   
	    	 
	     }
	     
	    flag++;	   
	    }
	      
	     // ab.print();
	     //ab.seed();
		 ab.compute();
}
	 
} 

