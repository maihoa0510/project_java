package svdemo1;

import java.util.Scanner;

public class SinhVien {
	// thuoc tinh
	private String ten;
	private int maSV;
	private float toan;
	private float ly;
	private float hoa;
	private float dtb;
	private String xl;
	// get set
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public float getToan() {
		return toan;
	}
	public void setToan(float toan) {
		this.toan = toan;
	}
	public float getLy() {
		return ly;
	}
	public void setLy(float ly) {
		this.ly = ly;
	}
	public float getHoa() {
		return hoa;
	}
	public void setHoa(float hoa) {
		this.hoa = hoa;
	}
	public float getDtb() {
		return dtb;
	}
	public String getXl() {
		return xl;
	}
	// phuong thuc khoi tao
	public SinhVien() {}
	public SinhVien(String ten, int maSV, float toan, float ly, float hoa) {
		
		this.ten = ten;
		this.maSV = maSV;
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
	}
	// nhap xuat
	public void nhap(Scanner scan) {
		System.out.print("nhao ten");
		this.ten = scan.nextLine();
		System.out.print("nhao masv");
		this.maSV = Integer.parseInt(scan.nextLine());
		System.out.print("nhao toan");
		this.toan = Float.parseFloat(scan.nextLine());
		System.out.print("nhaoly");
		this.ly = Float.parseFloat(scan.nextLine());
		System.out.print("nhao hoa");
		this.hoa = Float.parseFloat(scan.nextLine());
	}
	public void xuat() {
		System.out.println("ten: "+this.ten +" | " +" masv: "+ this.maSV +" | " + " toan: "+ this.toan +
				" | " + " hoa: "+this.hoa + " | " +" ly: "+this.ly + " | " +" dtb: "+this.dtb + " | " +" xep loai: "+ this.xl);
	}
	// nghiep vu
	
	public void tinhDtb() {
		this.dtb =  Math.round((this.toan + this.hoa + this.ly)/3);
	}
	public void xepLoai() {
		if(this.dtb>=9) {
			this.xl="xuat xac";
		}else if (this.dtb>=8) {
			this.xl="gioi";
		}
		else if (this.dtb>=7) {
			this.xl="kha";
		}
		else if (this.dtb>7) {
			this.xl="tb kha";
		}
		else if (this.dtb>6) {
			this.xl="tb";
		}
		else if (this.dtb>=5) {
			this.xl="yeu";
		}
	}
	
	//
	
}
