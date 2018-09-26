package unit2;
import java.util.Scanner;
public class Ex2 {
public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap chieu cao =");
	int h = sc.nextInt();
	if (h%2 == 1);
	else h--;
	for (int i=1; i <= h; i= i+1)
	{
		for(int j=1; j<= (h-i); j++)
			System.out.print("  ");
		for(int j=1; j<=(i*2-1); j++)
			System.out.print(" *");
		System.out.println("");
	}
	
	sc.close();
	System.exit(0);
}
}
