package unit4;
import javax.swing.JOptionPane;;
public class Swap 
{
 public static void swap(int var1, int var2)
 {
	 int temp;
	 temp = var1;
	 var1 = var2;
	 var2 = temp;
 }
public static void main(String [] args)
{
	int x= 5;
	int y= 9;
	//Swap s = new Swap();
	swap(x,y);
	JOptionPane.showMessageDialog(null, x +" " + y);
	System.exit(0);
	
}
}