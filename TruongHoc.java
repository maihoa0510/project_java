package svdemo1;

import java.util.ArrayList;

public class TruongHoc {
	// thuoc tinh
	private DanhSachSV dssvToanTruong;
	// get set

	public DanhSachSV getDssvToanTruong() {
		return dssvToanTruong;
	}

	public void setDssvToanTruong(DanhSachSV dssvToanTruong) {
		this.dssvToanTruong = dssvToanTruong;
	}
	// constructors
	public TruongHoc() {
		this.dssvToanTruong = new DanhSachSV();
	}
	// input , output
	public void nhap() {
		SinhVien sv = new SinhVien("hoa",1, 8, 9, 9);
		this.dssvToanTruong.themSV(sv);
		sv = new SinhVien("hoang",2, 10, 9, 9);
		this.dssvToanTruong.themSV(sv);
		sv = new SinhVien("nam",3, 10, 8, 9);
		this.dssvToanTruong.themSV(sv);
		sv = new SinhVien("ngoc",4, 3, 5, 9);
		this.dssvToanTruong.themSV(sv);
		sv = new SinhVien("lan",5, 10, 9, 9);
		this.dssvToanTruong.themSV(sv);
	}
	public void xuat() {
		this.dssvToanTruong.xuat();
	}
	// nghiep vu
	public void themSV(SinhVien sv) {
		 this.dssvToanTruong.themSV(sv);
	}
	public void tinhDtb() {
		this.dssvToanTruong.tinhDtb();
	}
	public void xepLoai() {
		this.dssvToanTruong.xepLoai();
	}
	public ArrayList<SinhVien> timdssvdtbCaoNhat() {
		return this.dssvToanTruong.timdssvdtbCaoNhat();
	}
	public ArrayList<SinhVien> timdssvdtbyeu() {
		return this.dssvToanTruong.timdssvdtbYeu();
	}
	public ArrayList<SinhVien> timsvTheoTen(String tensv) {
		return this.dssvToanTruong.timsvTheoTen(tensv);
	}
	public SinhVien timsvTheoMa(int ma) {
		return this.dssvToanTruong.timsvTheoMa(ma);
		
	}
	public boolean xoasvTheoMa(int ma) {
		return this.dssvToanTruong.xoasvTheoMa(ma);
		
	}
	
}
