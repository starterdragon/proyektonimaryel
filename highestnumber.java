import java.util.*;
public class highestnumber
 { 
	static int[] cache;
 	static Scanner patricia = new Scanner (System.in);
 	
	public static void main(String args[])
 	{ 

		System.out.println("Please enter how many numbers we're going check:");
		int yel = patricia.nextInt();
		
		if (yel == 1){
			System.out.println("Please check 2 or more Integers");
			return;
		}
		
		cache = new int[yel];
		
		int i = 0;
		do {

		    System.out.println("Please enter a number:");
		    int val = patricia.nextInt();
			cache[i] = val;
			i++;
			
		} while (i != yel);
		
		IntSummaryStatistics stat = Arrays.stream(cache).summaryStatistics();
		System.out.println("Highest number is: " + stat.getMax());
 	}
 }
