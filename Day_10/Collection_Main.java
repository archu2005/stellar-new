package Day_10;
import java.util.ArrayList;
import java.util.Scanner;
public class Collection_Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> b = new ArrayList<String>();
		int a = sc.nextInt();
	    for(int i=0;i<a;i++)
	    {
	    	b.add(sc.nextLine());
	    }
	    System.out.println(b);
		
	}

}
