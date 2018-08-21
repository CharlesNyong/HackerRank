import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SparseArrays {

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
    	HashMap<String, Integer> inputMap = new HashMap<String, Integer>();
    	int [] outputArray = new int[queries.length];
    	
    	// map each string 
    	for(String value: strings){
    		if(inputMap.containsKey(value)){
    			int count = inputMap.get(value);
    			count+=1;
    			inputMap.put(value, count);
    		}
    		else{
    			inputMap.put(value, 1);
    		}
    	}
    	
    	// save result in output array
    	for(int i =0; i<queries.length; i++){
    		
    		if( !inputMap.containsKey(queries[i])){
    			outputArray[i] = 0;
    		}
    		else{
    			outputArray[i] = inputMap.get(queries[i]);
    		}
    		
    	}
    	
    	
    	return outputArray;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	String fileName = "SparseArrayFile";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
