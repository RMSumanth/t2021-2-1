
import java.util.*;

public class Rough3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int x = scan.nextInt();
		int actual = 0;
		
		for(int i=1; i<=x; i++)
		{
			actual = (i-1)*2 + 1;
			
			if(i%2 == 0)
			{
				continue;
			}
			else if(i == 1)
			{
				System.out.print(actual + " ");
			}
			else 
			{
				System.out.print(actual - 2 + " ");
				System.out.print(actual + " ");
			}
		}
		scan.close();
	}
}
