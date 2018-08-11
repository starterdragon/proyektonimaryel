import java.util.*;
class highestnumber
 { 
 	static int n1, n2, n3;
 	static Scanner hn=new Scanner (System.in);
 	
	public static void main(String args[])
 	{ 


		System.out.println("Number 1: ");
		n1=hn.nextInt();
		System.out.println("Number 2: ");
		n2=hn.nextInt();
		System.out.println("Number 3: ");
		n3=hn.nextInt();
		
		if (n1>n2 && n1>n3) {
			System.out.println("Highest Number "+n1);
		}
		else if (n2>n1 && n2>n3) {
			System.out.println("Highest Number "+n2);
		}
		else {
			System.out.println("Highest Number "+n3);
		}
			
		


 	}
 }
