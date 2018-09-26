package unit1;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i,j;
		System.out.println("Nhap i =");
		i = sc.nextInt();
		System.out.println("Nhap j =");
		j= sc.nextInt();
		JOptionPane.showMessageDialog(null, i+j);
		sc.close();
		System.exit(0);
		
	}

}
