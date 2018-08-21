import java.util.*;


public class Left_Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int index = 0;
		int arraySize = input.nextInt();
		int numOfRotation = input.nextInt();
		int [] inputArray = new int[arraySize];
		int temp;
		while (index < arraySize){
			inputArray[index] = Integer.parseInt(input.next());
			index ++;
		}
		
		for(int j = 1; j<=numOfRotation; j++){
			for(int i = 0; i<inputArray.length; i++){
				if(i != (arraySize - 1)){
					temp = inputArray[i];
					inputArray[i] = inputArray[i + 1];
					inputArray[i + 1] = temp;
				}		
			}
		}
		
		for(int i = 0; i<inputArray.length; i++){
			System.out.print(inputArray[i] + " ");
		}
		
	}

}
