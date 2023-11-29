package STJ7;
import static org.junit.Assert.assertTrue;
import java.util.Scanner;
public class Factorial {
	public static void main (String [] args) {
		int i,pr=1,n;
		System.out.println("Enter Number : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Factorial : ");
		for(i=n;i>0;--i) {
			pr=pr*i;
		}
		System.out.println(pr);
		assertTrue(5040==pr);
	}

}
