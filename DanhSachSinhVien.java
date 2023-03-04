package SinhVienPoly;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachSinhVien {
	ArrayList<SinhVienPoly>list=new ArrayList<>();

	public void nhap() {
	do {
			Scanner sc=new Scanner(System.in);
			System.out.print("Nhập họ tên: ");
			String hoTen= sc.nextLine();
			if(hoTen==null|| hoTen.equals("")) {
			break;
		}
			System.out.print("nhập tên ngành: ");
			String nganh=sc.nextLine();
			if(nganh.equalsIgnoreCase("IT"))
		{
				System.out.print("điểm Java: ");
				double diemJava=sc.nextDouble();
				System.out.print("điểm Css: ");
				double diemCss=sc.nextDouble();
				System.out.print("điểm Html: ");
				double diemHtml=sc.nextDouble();
				SinhVienPoly newSV=new SinhVienIT(hoTen,nganh,diemJava,diemCss,diemHtml);
				list.add(newSV);
		}else if(nganh.equalsIgnoreCase("Biz")) {
				System.out.print("điểm Marketing: ");
				double diemMarketing=sc.nextDouble();
				System.out.print("điểm Sales: ");
				double diemSales=sc.nextDouble();
				SinhVienPoly newSV=new SinhVienBiz(hoTen,nganh,diemMarketing,diemSales);
				list.add(newSV);
		}
		}while(true);
	}
	public void xuat() {
		for(SinhVienPoly sv: list) {
			System.out.printf("Họ Tên: %s |Ngành: %s | ĐiểmTB: %.2f | Học Lực: %s \n",sv.gethoTen(),sv.getnganh(),sv.getDiem(),sv.getHocLuc());
		}
	}
	public void xuatGioi() {
		for(SinhVienPoly sv:list) {
			if(sv.getHocLuc().equalsIgnoreCase("Giỏi")) {
				xuat();
					System.out.printf("Họ Tên: %s |Ngành: %s | ĐiểmTB: %.2f | Học Lực: %s \n",sv.gethoTen(),sv.getnganh(),sv.getDiem(),sv.getHocLuc());
			}
		}
	}
	Comparator<SinhVienPoly> comp=new Comparator<SinhVienPoly>() {
		@Override
		public int compare(SinhVienPoly o1,SinhVienPoly o2) {
			return Double.compare(o1.getDiem(),o2.getDiem());
		}
	};
	public void sapxeptheodiem()
	{
		Collections.sort(list, comp);
		System.out.println("Sắp xếp theo điểm");
		xuat();
	}
	public void menu() {
		Scanner s=new Scanner(System.in);
		int Chon = 0;
		do {
			System.out.println("Menu chương trình");
			System.out.println("1. Nhập danh sách sinh viên");
			System.out.println("2. Xuất danh sách sinh viên");
			System.out.println("3. Xuất danh sách sinh viên có học lực giỏi");
			System.out.println("4. Sắp xếp danh sách sinh viên theo điểm");
			System.out.println("0. Thoát");
			System.out.print("Mời chọn: ");
			Chon=s.nextInt();
			if (Chon!=0) {
				switch (Chon) {
				case 0:
					break;
				case 1:
					nhap();
					break;
				case 2:
					xuat();
					break;
				case 3:
					xuatGioi();
					break;
				case 4:
					sapxeptheodiem();
					break;
				default:
					System.out.println("Vui lòng nhập lại!");
				}
			}
		}while(Chon!=0);
	}
}
