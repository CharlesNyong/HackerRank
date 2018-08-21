import java.util.Scanner;

/* A more efficient way of solving this is to
 * sort both strings and then compare in 0(n) times rather than n^2
 * */
public class TwoString {

	public static void main(String[] args) {
	
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your test case ");
		int testcase = obj.nextInt();
		obj.nextLine();
		
		
		for(int i = 1; i <= testcase; i++){
			
			boolean flag = false;
			String A = obj.nextLine();
			String B = obj.nextLine();
		
			for(int j = 0; j< A.length(); j++){
				for(int k = 0; k< B.length(); k++){
				  if(A.charAt(j) == B.charAt(k)){
					flag = true;
					System.out.println("YES");
					break;
				  }
				}
				if(flag)
				 break;	
			}
			    if(!flag)
			    System.out.println("NO");
		}
		
		
	}
	
		
}
