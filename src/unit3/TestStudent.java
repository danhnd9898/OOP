package unit3;
import java.util.Scanner;
public class TestStudent {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Nhap n = ");
		int N = scanner.nextInt();
		Student[] cls = new Student[N];
		for (int i=0; i<N; i++){
		String name = scanner.next();
		int year = scanner.nextInt();
		cls[i] = new Student(year, name);
		}
		scanner.close();
		int total = 0;
		System.out.println("Danh sach lop: ");
		for (int i=0; i<N; ++i){
		total += 2012-cls[i].getYear();
		System.out.println(cls[i].getName());
		}
		System.out.println("Tong so tuoi: " + total);
		}
}
