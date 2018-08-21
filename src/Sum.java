
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sum {
	
	public static void main(String[] args){
	  
		StringTokenizer token; 
		int size; // array size
		Scanner scan = new Scanner(System.in);
		Scanner but = new Scanner(System.in);
		String input;
		long sum = 0000;

		//System.out.println("Please enter size here");
        int l = scan.nextInt();
		scan.nextLine();
   		input = scan.nextLine(); // read the whole line of input as a string

   		token = new StringTokenizer(input, " ");
         
   		 while(token.hasMoreTokens()){
          sum+= Long.parseLong(token.nextToken());
   			// System.out.println(token.nextToken() + " ");
   		 }

   		 System.out.println(sum);
   		 String word = " man was meant to stay on the ground god would have given us roots";
   		 System.out.println("Length: " + word.length());

     } // end of main

}