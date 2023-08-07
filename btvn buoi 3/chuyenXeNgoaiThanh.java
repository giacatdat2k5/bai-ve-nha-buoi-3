package hellokk;

import java.util.Scanner;

public class chuyenXeNgoaiThanh extends Quanlixe{
	String noiDen;
	int soNgayDiDc;
	public void nhapTTlan3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap noi den ");
		noiDen = sc.nextLine();
		System.out.println("nhap so ngay di dc ");
		soNgayDiDc = sc.nextInt();
	}
	public int doanhThuNgoaiThanh(int soNgayDiDc) {
		return (soNgayDiDc*500000);
	}
	public void xuatTTlan3() {
		System.out.println("noi den "+noiDen);
		System.out.println("no ngay di dc "+soNgayDiDc );
		System.out.println("doanh thu la "+doanhThuNgoaiThanh(soNgayDiDc));
	}
}
