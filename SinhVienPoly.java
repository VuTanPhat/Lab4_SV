package SinhVienPoly;

public abstract class SinhVienPoly {
	private String hoTen;
	private String nganh;

	public SinhVienPoly(String hoTen, String nganh) 
	{
		this.hoTen= hoTen;
		this.nganh= nganh;
	}
	public String gethoTen()
	{
		return hoTen;
	}
	public String getnganh() 
	{
		return nganh;
	}
	abstract double getDiem();
	public String getHocLuc()
	{
		String HocLuc = null;
		double Diem= getDiem();
		if(Diem >= 9) {
			HocLuc= "Xuất sắc";
		}else if(Diem>= 7.5) {
			HocLuc= "Giỏi";
		}else if(Diem>= 6.5) {
			HocLuc= "Khá";
		}else if(Diem>= 5) {
			HocLuc= "Trung Bình";		
		}else {
			HocLuc= "Yếu";
		}
		return HocLuc;
	}
}
