package Day_10;
import java.util.*;
class Details
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int deposit = sc.nextInt();
		int costPerDay = sc.nextInt();
		System.out.printf("%s %.2f %.2f%n", name, (double) deposit, (double) costPerDay);
		
	}

}
