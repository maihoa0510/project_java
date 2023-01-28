package svdemo1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
//		DanhSachSV ds= new DanhSachSV();
		TruongHoc truong = new TruongHoc();
		truong.nhap();
		doMenu(truong);
		
	}
	public static void inMenu() {
		System.out.println("vui long chon");
		System.out.println("1 Them");
		System.out.println("2 Xuat");
		System.out.println("3 Liet ke dssv co dtb cao nhat");
		System.out.println("4 Liet ke dssv co dtb yeu");
		System.out.println("5 Tim sv theo ten");
		System.out.println("6 Tim sv theo ma");
		System.out.println("7 Tim sv theo ma");
		System.out.println("0 thoat");
	}
	public static void doMenu(TruongHoc truong) {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		do {
			inMenu();
			System.out.println("vui long nhap");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				SinhVien sv = new SinhVien();
				sv.nhap(scan);
				truong.themSV(sv);
				break;
			case 2:
				truong.tinhDtb();
				truong.xepLoai();
				truong.xuat();
				break;
			case 3:
				ArrayList<SinhVien> list = truong.timdssvdtbCaoNhat();
				for(SinhVien sv1: list) {
					sv1.xuat();
				}
				break;
			case 4:
				ArrayList<SinhVien> listyeu = truong.timdssvdtbyeu();
				for(SinhVien sv1: listyeu) {
					sv1.xuat();
				}
				break;
			case 5:
				System.out.println("vui long nhap ten sv can tim");
				String ten = scan.nextLine();
				ArrayList<SinhVien> listten = truong.timsvTheoTen(ten);
				for(SinhVien sv1: listten) {
					sv1.xuat();
				}
				break;
			case 6:
				System.out.println("vui long nhap ma sv can tim");
				int ma = Integer.parseInt(scan.nextLine());
				SinhVien svFound = truong.timsvTheoMa(ma);
				if(svFound != null){
					svFound.xuat();
				}else {
					System.out.println("khong co sv nao ma la: " + ma);
				}
				
				break;
			case 7:
				System.out.println("vui long nhap ma sv can xoa");
				int maxoa = Integer.parseInt(scan.nextLine());
				boolean deleted = truong.xoasvTheoMa(maxoa);
				if(deleted) {
					System.out.println("xoa thanh cong");
				}else {
					System.out.println("chua duoc xoa, ma khong co trong danh sach");
				}
				break;
			case 0:
				flag = false;
				break;
			}
		}
		while(flag);
	}

}
