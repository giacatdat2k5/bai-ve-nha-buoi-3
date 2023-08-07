package hellokk;

import java.util.Scanner;

public class Quanlixe {
	private int maSoChuyen;
	private String hoTenTaiXe;
	private int soXe;
	int doanhThu;
	public int getMaSoChuyen() {
		return maSoChuyen;
	}
	public void setMaSoChuyen(int maSoChuyen) {
		this.maSoChuyen = maSoChuyen;
	}
	public String getHoTenTaiXe() {
		return hoTenTaiXe;
	}
	public void setHoTenTaiXe(String hoTenTaiXe) {
		this.hoTenTaiXe = hoTenTaiXe;
	}
	public int getSoXe() {
		return soXe;
	}
	public void setSoXe(int soXe) {
		this.soXe = soXe;
	}
	public void nhapTT() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ma so chuyen ");
		setMaSoChuyen(sc.nextInt());
		System.out.println("nhap ho ten lai xe");
		setHoTenTaiXe(sc.nextLine());
		System.out.println("nhap so xe ");
		setSoXe(sc.nextInt());
	}
	public void xuatTT() {
		System.out.println("ma so chuyen "+getMaSoChuyen());
		System.out.println("ho ten tai xe "+getHoTenTaiXe());
		System.out.println("so xe "+getSoXe());
	}
		
	}

