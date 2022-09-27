
import java.util.*;

public class Problem2 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of odd integers to be printed");
		int x = scan.nextInt();

		for(int i=0; i<x; i++)
		{
			int temp = 1 + i*2;
			System.out.print(temp + " ");
		}
		scan.close();		
	}
}
