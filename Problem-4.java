
import java.util.*;

public class Problem4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		
		int array[] = new int[size];
		System.out.println("Enter all the elements whose multiples is to be checked");
		for(int i=0; i<array.length; i++)
		{
			array[i] = scan.nextInt();
		}
		
		int one = 0; int two = 0; int three = 0; int four = 0; int five = 0; int six = 0; int seven = 0; int eight = 0; int nine = 0;
		
		for (int i = 0; i<array.length; i++)
		{
			one++;
			
			if(array[i] % 2 == 0)
			{
				two++;
			}
			if(array[i] % 3 == 0)
			{
				three++;
			}
			if(array[i] % 4 == 0)
			{
				four++;
			}
			
			if(array[i] % 5  == 0)
			{
				five++;
			}
			
			if(array[i] % 6  == 0)
			{
				six++;
			}
			
			if(array[i] % 7  == 0)
			{
				seven++;
			}
			
			if(array[i] % 8  == 0)
			{
				eight++;
			}
			
			if(array[i] % 9  == 0)
			{
				nine++;
			}
		}
		
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		map.put(1, one);
		map.put(2, two);
		map.put(3, three);
		map.put(4, four);
		map.put(5, five);
		map.put(6, six);
		map.put(7, seven);
		map.put(8, eight);
		map.put(9, nine);
		System.out.println(map);
		
		scan.close();
	}
}
