package hellokk;

public class inra {
	public static void main(String[] args) {
		chuyenXeNoiThanh nt = new chuyenXeNoiThanh();
		chuyenXeNgoaiThanh ngt = new chuyenXeNgoaiThanh();
		System.out.println("chuyen xe noi thanh");
		nt.nhapTT();
		nt.nhapTTLan2();
		System.out.println("chuyen xe ngoai thanh");
		ngt.nhapTT();
		ngt.nhapTTlan3();
		System.out.println("chuyen xe noi thanh");
		nt.xuatTT();
		nt.xuatTTlan2();
		System.out.println("chuyen xe ngoai thanh");
		ngt.xuatTT();
		ngt.xuatTTlan3();
	}
}
