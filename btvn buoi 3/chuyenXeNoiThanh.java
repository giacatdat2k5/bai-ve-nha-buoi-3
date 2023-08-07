package hellokk;

import java.util.Scanner;

public class chuyenXeNoiThanh extends Quanlixe {
	int soTuyen;
	int soKmDiDc;
	public void nhapTTLan2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so tuyen ");
		soTuyen = sc.nextInt();
		System.out.println("nhap so km di dc ");
		soKmDiDc = sc.nextInt();			
	}
	public int tinhDoanhThu( int soKmDiDc) {
		return( 500000*soKmDiDc);
	}
	public void xuatTTlan2() {
		System.out.println("so tuyen la "+soTuyen);
		System.out.println("so km di dc la "+soKmDiDc);
		System.out.println("doanh thu la "+tinhDoanhThu(soKmDiDc));
	}
}
	


