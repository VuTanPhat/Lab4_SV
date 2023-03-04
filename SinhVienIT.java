package SinhVienPoly;

public class SinhVienIT extends SinhVienPoly {
	double diemJava;
	double diemCss;
	double diemHtml;
	public SinhVienIT(String nganh,String hoTen,double diemJava,double diemCss,double diemHtml) {
		super(hoTen,nganh);
		this.diemJava=diemJava;
		this.diemCss=diemCss;
		this.diemHtml=diemHtml;
	}
	@Override
	double getDiem() {
		return (2*diemJava+diemCss+diemHtml)/4;
	}
}
