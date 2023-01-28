package svdemo1;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSV {
	// thuoc tinh
	private ArrayList<SinhVien> listSV;
	// get set

	public ArrayList<SinhVien> getListSV() {
		return listSV;
	}

	public void setListSV(ArrayList<SinhVien> listSV) {
		this.listSV = listSV;
	}

	// phuong thuc khoi tao
	public DanhSachSV() {
		this.listSV = new ArrayList<SinhVien>();
	}

	// nhap
	public void nhap(Scanner scan) {
		for (SinhVien sv : this.listSV) {
			sv.nhap(scan);
		}
	}

	public void xuat() {
		for (SinhVien sv : this.listSV) {
			sv.xuat();
		}
	}

	public void tinhDtb() {
		for (SinhVien sv : this.listSV) {
			sv.tinhDtb();
		}
	}

	public void xepLoai() {
		for (SinhVien sv : this.listSV) {
			sv.xepLoai();
		}

	}

	public void themSV(SinhVien sv) {
		this.listSV.add(sv);
	}

	// tim sv cos dtb cao nhat

	public ArrayList<SinhVien> timdssvdtbCaoNhat() {
		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
		// gan svmax = vitri 0
		if (this.listSV.size() > 0) {
			SinhVien svMax = this.listSV.get(0);
			int vtriMaxDauTien = 0;
			for (int i = 0; i < this.listSV.size(); i++) {
				SinhVien svCurrent = this.listSV.get(i);
				if (svCurrent.getDtb() > svMax.getDtb()) {
					svMax = svCurrent;
					vtriMaxDauTien = i;
				}
			}

			// da thay max
			for (int i = vtriMaxDauTien+1; i < this.listSV.size(); i++) {
				SinhVien svCurrent = this.listSV.get(i);
				if (svCurrent.getDtb() == svMax.getDtb()) {
					list.add(svCurrent);
				}
			}
		}
		return list;

	}
	// tim dssv yeu
	public ArrayList<SinhVien> timdssvdtbYeu(){
		ArrayList<SinhVien> listyeu = new ArrayList<SinhVien>();
		for(SinhVien sv:this.listSV) {
			if(sv.getDtb()< 5) {
				listyeu.add(sv);
			}
		}
		return listyeu;
	}
	// tim danh sach sv theo ten
	public ArrayList<SinhVien> timsvTheoTen(String ten){
		ArrayList<SinhVien> listten = new ArrayList<SinhVien>();
		for(SinhVien sv: this.listSV) {
			if(sv.getTen().equalsIgnoreCase(ten)) {
				listten.add(sv);
			}
		}
		return listten;
	}
	// tim sv theo ma
	public SinhVien timsvTheoMa(int ma) {
		SinhVien sv = null;
		for(SinhVien sv1: this.listSV) {
			if(sv1.getMaSV()== ma) {
				sv = sv1;
				break;
			}
		}
		return sv;
		
	}
	// xoa sv theo ma
	public boolean xoasvTheoMa(int ma) {
		boolean deleted = false;
		for(SinhVien sv : this.listSV) {
			if(sv.getMaSV() == ma) {
				this.listSV.remove(sv);
				deleted = true;
				break;
			}
		}
		return deleted;
		
	}
}
