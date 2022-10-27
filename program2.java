//add8 divide it by 3&modulo by5,multi by 5
package thursdaylab;

import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter 4 num");
	int num =s.nextInt();
	float a=(((num+8)/3)%5)*5;
	System.out.println("final result is" +a);
	
	}

}
/*OUTPUT;
 enter 4 num
2345
final result is20.0
*/
