

import java.util.Scanner;

public class Pangram {
	
	
	static public void insert(int[] A){
	 for(int i =0; i<A.length; i++){
		A[i] = 0; 
	 }	
	}
	
	public static void main(String[] args) {
		
	char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	int[] Marked = new int[26]; //array to determine if all alphabets has been used 
	insert(Marked);
	boolean flag = false;
	
	//read input from the user
	Scanner input = new Scanner(System.in);
	String text =  input.nextLine();
	text  = text.toLowerCase();
	
	for(int k =0; k<26; k++){
		
		for(int m = 0; m<text.length(); m++){
		  
			 if(alpha[k] == text.charAt(m)){
				 Marked[k] = 1; // mark the characters we've found so that we know if the sentence contains all characters
			 }
		}
	}
	
	for(int y=0; y<26; y++){
		if(Marked[y] == 0){
			flag = true;
			break;
		}
	}
	
	
	if(flag == false)
		System.out.println("Sentence is a panagram");
	else if(flag == true){
		System.out.println("Sentence is not a panagram");
	}
	
	}	
	

}
