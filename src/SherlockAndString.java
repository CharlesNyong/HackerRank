import java.util.*;

import java.util.Map.Entry;

/* Solution to the Sherlock and the Valid String problem
 * from HackerRank can be found under 
 * practice > interview preparation kit > String Manipulation
 * 
 * */

public class SherlockAndString {
	static HashSet<Character> set;
	static int[] arrFreq;
	static HashMap<Integer, Integer> countOfFreq;
	
	/* returns a unique count of characters in a
	 * string. The string is store in a hashset
	 * */
	public static int getUniqueStringLength(){
		return (set.size());
	}
	
	public static void setup(String input){
		set = new HashSet<Character>();
		arrFreq = new int[256]; // ascii character length;
		
		
		for(int i =0; i < input.length(); i++){
			arrFreq[input.charAt(i)]++; // count the frequencies
			set.add(input.charAt(i));
		}
		Arrays.sort(arrFreq);
	}
	
	public static String isValid(String s){
		SherlockAndString.setup(s);
		int uniqueLength = SherlockAndString.getUniqueStringLength();
		countOfFreq = new HashMap<Integer, Integer>();
		int max = 0;
		int prevCount = 0;
//		int prevFreq = 0;
//		boolean firstTime = true;
		int countOfCharWithSimilarFreq = 0;
		for(int frequency: arrFreq){
			if(frequency > 0){
				//System.out.println("Frequency: " + frequency);
				if(countOfFreq.containsKey(frequency)){
					prevCount = countOfFreq.get(frequency);
					prevCount+=1;
					countOfFreq.put(frequency, prevCount);
				}
				else{
					countOfFreq.put(frequency, 1);
				}
			}	
		}
		
		//System.out.println(countOfFreq.isEmpty());
		// find the max
		for(Entry<Integer, Integer> entry : countOfFreq.entrySet()) {
			// bug here [seems like the hashmap doesn't contain anything]
    		int value = entry.getValue();
    		//System.out.println("Key : " + entry.getKey() +  " Frequency count: " + value);
    		if(value > max){
    			max = value;
        	}
		}
		
		int diff = (uniqueLength - max);
		String result = "";
		//System.out.println("Length: " + uniqueLength + " max: " + max);
		if(diff > 1 || diff < 0)
			result = "NO";
		else if(diff == 0 || diff == 1)
			result = "YES";
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputReader = new Scanner(System.in);
		String input = inputReader.nextLine();
		System.out.println(SherlockAndString.isValid(input));
//		for(char i=97; i<=122; i++){
//			System.out.println("index = " + i + " value: " + arrFreq[i]);
//		}
		
		//System.out.println(SherlockAndString.getUniqueStringLength());
	}
}
