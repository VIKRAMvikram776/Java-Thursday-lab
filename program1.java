//check number odd or even
package thursdaylab;

import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter number:");
	int val = s.nextInt();
	String eveodd = (val % 2==0)?"even":"odd";//Ternary-operator used
	System.out.println(val +"is"+eveodd);

	}

}

/*OUTPUT;
enter number:
10
10iseven
*/
