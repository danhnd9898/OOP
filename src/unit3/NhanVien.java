package unit3;

public class NhanVien {
private String tenNhanVien= "noname";
private double luongCoBan;
private double heSoLuong = 1;
final double LUONG_MAX = 10000;
 
public void inTTin()
{
	System.out.println("Ten Nhan vien "+ tenNhanVien);
	System.out.println("Luong co ban "+ luongCoBan);
	System.out.println("He So Luong "+ heSoLuong);
	
}
public boolean tangLuong(double tang)
{
	if (LUONG_MAX < luongCoBan*(heSoLuong + tang))
		// System.out.println("0"); 
		return false;
	else // System.out.println("1");
		return true;
}
public String getTenNhanVien()
{
	return tenNhanVien;
}
public void setTenNhanVien(String tenNhanVien)
{
	this.tenNhanVien = tenNhanVien;
}
public double getLuongCoBan()
{
	return luongCoBan;
}
public void setLuongCoBan(double luongCoBan)
{
	this.luongCoBan = luongCoBan;
}
}
