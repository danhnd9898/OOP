package unit3;
//import javax.swing.*;
import java.util.*;
// import unit5.TruongPhong;
public class NV {
	public static void main(String []args)
	{
		//NhanVien[] nv = new NhanVien[2];
		Scanner sc = new Scanner(System.in);
		NhanVien nv = new NhanVien();
		System.out.println("Nhap thong tin Nhan vien ");
		System.out.println("Nhap Ten Nhan Vien");
		String s = sc.nextLine();
		nv.setTenNhanVien(s);
		System.out.println("Nhap Luong co ban");
		int i = sc.nextInt();
		nv.setLuongCoBan(i);
		nv.inTTin();
		// boolean j = 
		System.out.println(nv.tangLuong(0.2));
		sc.close();
	}
}
