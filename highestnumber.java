import java.util.*;
public class highestnumber
 { 
	static int[] cache;
 	static Scanner hn = new Scanner (System.in);
 	
	public static void main(String args[])
 	{ 

		System.out.println("Please enter how many numbers are we checking:");
		int n = hn.nextInt();
		
		if (n != (int) n || n == (int) 1){
			System.out.println("Wrong input, please try again");
			return;
		}
		
		cache = new int[n];
		
		int i = 0;
		do{
		    System.out.println("Please a number:");
		    int val = hn.nextInt();
			cache[i] = val;
			i++;
		}while (i != n);
		
		IntSummaryStatistics stat = Arrays.stream(cache).summaryStatistics();
        int high = stat.getMax();
		System.out.println("Highest number is: " + high);
      
 	}
 }
