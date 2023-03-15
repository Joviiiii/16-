package work;
import java.util.Scanner;
public class Practice5_28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year you want to check: ");
		int year = input.nextInt();
		System.out.print("Enter the day of the week for the first day of the year: ");
		int i = input.nextInt();
		String[] week = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Frifay","Saturay","Sunday"};
		System.out.println("January 1, " + year + " is " + week[i]);
		//i=(i+31)/7;
		System.out.println("February 1, " + year + " is " + week[i=(i+31)%7]);
		if((year%4==0 && year%100!=0)||year%400==0)
			i=(i+29)%7;
		else
			i=(i+28)%7;
		System.out.println("March 1, " + year + " is " + week[i]);
		System.out.println("April 1, " + year + " is " + week[i=(i+31)%7]);
		System.out.println("May 1, " + year + " is " + week[i=(i+30)%7]);
		System.out.println("June 1, " + year + " is " + week[i=(i+31)%7]);
		System.out.println("JUly 1, " + year + " is " + week[i=(i+30)%7]);
		System.out.println("August 1, " + year + " is " + week[i=(i+31)%7]);
		System.out.println("September 1, " + year + " is " + week[i=(i+31)%7]);
		System.out.println("October 1, " + year + " is " + week[i=(i+30)%7]);
		System.out.println("November 1, " + year + " is " + week[i=(i+31)%7]);
		System.out.println("December 1, " + year + " is " + week[i=(i+30)%7]);
	}
}
