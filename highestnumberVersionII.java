import java.util.*;
public class highestnumberVersionII
 { 
	static int[] cache;
 	
	public static void main(String args[])
 	{ 
        	actual( new Scanner (System.in) );
 	}
 	
 	public static void actual( Scanner patricia ){
 	    System.out.println("Please enter how many numbers we're gonna check:");
		int yel = patricia.nextInt();
		if (yel == 1){
			System.out.println("Please check two or more integers");
			return;
		}
		
		cache = new int[yel];
		System.out.println("Please enter "+ yel +" numbers:");
		
		int i = 0;
		
		do {
		    int val = patricia.nextInt();
			cache[i] = val;
			i++;
		} while (i != yel);
		
		IntSummaryStatistics stat = Arrays.stream(cache).summaryStatistics();
		System.out.println("Highest number is: " + stat.getMax());
		
		int[] cache;
		
		System.out.println("Would you like to try again?");
		System.out.println("type '1' to confirm");
		if (patricia.nextInt() == 1){
		    actual( patricia );
		} else {
		    return;
		}
 	}
 }
