import java.util.*;
public class highestnumber
 { 
	static int[] cache;
 	static Scanner hn = new Scanner (System.in);
 	
	public static void main(String args[])
 	{ 

		System.out.println("Please enter how many numbers are we checking:");
		int n = hn.nextInt();
		
		if (n == 1){
			System.out.println("Please check 2 or more Integers");
			return;
		}
		
		cache = new int[n];
		
		int i = 0;
		do {

		    System.out.println("Please enter a number:");
		    int val = hn.nextInt();
			cache[i] = val;
			i++;
			
		} while (i != n);
		
		IntSummaryStatistics stat = Arrays.stream(cache).summaryStatistics();
        int high = stat.getMax();
		System.out.println("Highest number is: " + high);
      
 	}
 }
