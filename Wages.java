import java.util.*;




 /*Please dont change class name, Dcoder 
 and class must not be public*/


 //Compiler version JDK 1.8




public class Wages
 { 
 	static char n;
 	static double h,r,w,e;
 	static Scanner wages =new Scanner (System.in);
 	
	public static void main(String args[])
 	{ 


		System.out.println("Name of Employee: ");
		n=wages.next().charAt (0);
		System.out.println("Num of hours worked: ");
		h=wages.nextDouble();
		System.out.println("Rate per hour: ");
		r=wages.nextDouble();
		
		if (h>40) {
			e= h-40;
			w=(e*1.5+40)*r;
			
				System.out.println("Salary: "+w);
				}
		else {
			w=h*r;
				System.out.println("Salary: "+w);
		}
		


 	}
 }
