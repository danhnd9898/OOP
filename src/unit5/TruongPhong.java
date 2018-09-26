package unit5;
import unit3.NhanVien;
public class TruongPhong {
	private int phucap;
	public void setPhuCap(int pc)
	{
		this.phucap = pc;
	}
	public long getPhuCap()
	{
		return phucap;
	}
	public float luong()
	{
		float luong = heSoLuong * luongCoBan + phucap;
		return (float)luong;
	}
	public void inTTin()
	{
		System.out.println(getTenNhanVien()+" " + luong()+" " );
	}
}
