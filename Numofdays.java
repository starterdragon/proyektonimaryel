import java.util.*;
class Numofdays
 { 
 	static int d, m, y;
 	static Scanner no=new Scanner (System.in);
 	
	public static void main(String args[])
 	{ 


		System.out.println("Enter Number of Month: ");
		m=no.nextInt();
		
		if (m==1 || m==3|| m==5 || m==7 || m==8 || m==10 || m==12) {
			
			System.out.println("31 days");
		}
		else if (m==2) {
			
			System.out.println("What year: ");
		y=no.nextInt();
		
			if (y%4==0)
				
			System.out.println("29 days");
			
			else 
				System.out.println("28 days");
		
		}
		
		else if (m==4 || m==6 ||m==9 ||m==11) {
			System.out.println("30 days");
		}
		
		else {
			System.out.println("Invalid");
		}


 	}
 }
