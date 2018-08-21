
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayManipulation {

	private static int[] inputArray;
	private static int arraySize;
	private static int rowCount;
	
    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
    	//initialize class array
        inputArray = new int[n];
        int max = inputArray[0];
        
        for(int row = 0; row<rowCount; row++){
        	updateArray(queries[row][0], queries[row][1], queries[row][2]);
        }
        
        // find max value in updated array
        for(int val: inputArray){
        	if(val > max){
        		max = val;
        	}
        }
        
        return max;
    }
    
    public static void updateArray(int leftIndex, int rightIndex, int sum){
    	
    	for(int i = (leftIndex - 1); i<=(rightIndex-1); i++){
    		inputArray[i]+=sum;
    	}
    	
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("File.txt"));

        String[] nm = scanner.nextLine().split(" ");
       // System.out.println("row " + nm[0] + " Col: " + nm[1]);
        
        arraySize = Integer.parseInt(nm[0]);

        rowCount = Integer.parseInt(nm[1]);

        int[][] queries = new int[rowCount][3];
        
        System.out.println("row: " + rowCount);
        
        for (int i = 0; i <rowCount; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(arraySize, queries);

        System.out.println("Max: " + result);
        //bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
