package SinhVienPoly;

public class SinhVienBiz extends SinhVienPoly{
	double diemMarketing;
	double diemSales;
	public SinhVienBiz(String nganh,String hoTen,double diemMarketing,double diemSales) {
		super(hoTen,nganh);
		this.diemMarketing=diemMarketing;
		this.diemSales=diemSales;
	}
	@Override
	double getDiem() {
		return (2*diemMarketing+diemSales)/3;
	}
	
}
