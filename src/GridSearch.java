import java.util.*;


public class GridSearch {

	
public static void Print(ArrayList<String> list){
		
	//System.out.println("Inside Print");
		for(int i =0; i<list.size(); i++){
			
		 System.out.println(list.get(i));
		}	
			
		}
	

 public static ArrayList<Boolean> SearchGrid(ArrayList<String> List, ArrayList<String> pattern){

	 ArrayList<Boolean> Found = new ArrayList<Boolean>();
	 String row = "";
	 int i = 0;
	 int k = 0; 
	 int count = 0;
	 
	 while(i < pattern.size() && k < List.size()){
	
		 row = pattern.get(i);
		 String gridContent = List.get(k);
			
			if(gridContent.contains(row)){
				Found.add(i, true);
				i++;
				k++;
				count++; // count for contiguous sequence
				 System.out.println("Count: " + count);
			}
			else{
				
				if(count > 0 && count < pattern.size()){
					Found.set(0, false);
				}
			  k++;	
			}
	 }
	 System.out.println("Count: " + count);
	 System.out.println("Pattern size: " + pattern.size());
	 if(count < pattern.size()){
			Found.set(0, false);
		}
	 		
	 for(int t =0; t<Found.size(); t++){
			
		 System.out.println(Found.get(t));
		}	
			
	 
	 return Found;
 } 
	
 	public static String Validate(ArrayList<Boolean> structure){
 	
 		
 		int flag = 1;
 		
 		for(int k=0; k<structure.size(); k++){
 			
 		   if(structure.get(k).equals(false)){
 			   flag = 2;
 			   break;
 		   }		
 		}
 	
 	if(flag == 1){
 		return "YES";
 	}
 	else{
 		return "NO";
 	}
 		
 		
 	}
 
 
	public static void main(String[] args) {
	
	ArrayList<String> Larger = new ArrayList<String>(); // contains larger grid values
	ArrayList<String> Pattern = new ArrayList<String>(); // contains pattern grid values
	ArrayList<Boolean> Matches = new ArrayList<Boolean>();	// contains flags for matched values
	
	ArrayList<String> Result = new ArrayList<String>();	// contains flags for matched values
 
	Scanner obj = new Scanner(System.in);
	Scanner input = new Scanner(System.in);
	
	int testcase = obj.nextInt();
	
	for(int i = 1; i <=testcase; i++){
	
		
		int LargerGridRow = obj.nextInt();
		obj.nextInt();
		obj.nextLine();
		//System.out.println("====> " + LargerGridRow);
		 for(int k = 0; k<LargerGridRow; k++){
			 String value = obj.nextLine();
		  Larger.add(value);	  
		 }
		
		 int SmallerGridRow = obj.nextInt();
		 obj.nextInt();
		 obj.nextLine();
		// System.out.println("====> " + SmallerGridRow);
		 for(int m = 0; m<SmallerGridRow; m++){
		  String item = obj.nextLine();
			Pattern.add(item);	  
		 }
		 
		 //Print(Larger);
		// Print(Pattern);
		 
		 // call to function to manipulate input
		  Matches = SearchGrid(Larger, Pattern);
		  Result.add(Validate(Matches));
		  Pattern.clear();
		  Larger.clear();
	}
	
	//System.out.println();
	Print(Result);
	
		
	}

}
