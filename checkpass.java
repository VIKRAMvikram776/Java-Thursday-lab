

//accept pass and confirm pass 
package thursdaylab;

import java.util.Scanner;

public class checkpass {

	public static void main(String[] args) {
		 String  a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("enter 1st a pass");
		a=s.next();
		System.out.println("enter 2nd pass");
		b=s.next();
		if(a.equals(b))//compares two strings if true the string are equal&false not equal
		{
			System.out.println("allow");
			}
		else
		{
			System.out.println("error");
			
		}
	}

}
/*OUTPUT:
enter 1st a pass
11
enter 2nd pass
12
error
*/
