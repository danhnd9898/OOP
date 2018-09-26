package unit2;
import java.util.Scanner;
public class Ex1 {
public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	int n,d=1;
	
	do {
	System.out.println(" Nhap chieu cao =");
	n = sc.nextInt();
   } while((n>=8) || (n<=3));
	int[][] A= new int[n][n];
   for(int i=0; i<(n+1)/2; i++)
   {   int j=i, k=i;
	   for(j=i; j<(n-i-1); j++)
		   A[j][k]= d++;
	   for(k=i; k<(n-i-1); k++ )
		   A[j][k]= d++;
	   for( j=(n-i-1); j!=i; j--)
		   A[j][k]= d++;
	   for(k=(n-i-1); k!=i; k--)
		   A[j][k] = d++;
	}
   for (int i=0; i<n; i++)
   {
	   for( int j=0; j<n; j++)
		   System.out.print(" " + A[i][j]);
   		System.out.println(" ");	 
   }
	sc.close();
	System.exit(0);
}
}
