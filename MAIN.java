import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.TreeMap;

public class MAIN {
	public static void main(String[] args) {
		LinkedList<Anh_Tai> dsAnhTai = new LinkedList<>();

		Chuong_Trinh ct = new Chuong_Trinh(1, dsAnhTai);

		Anh_Tai at1 = new Anh_Tai("Bang Kieu", null, 1973, 35, null, 0, 0);
		Anh_Tai at2 = new Anh_Tai("Tu Long", null, 1973, 25, null, 0, 0);
		Anh_Tai at3 = new Anh_Tai("Dinh Tien Đat", null, 1981, 29, null, 0, 0);
		Anh_Tai at4 = new Anh_Tai("Tien Luat", null, 1982, 25, null, 0, 0);
		Anh_Tai at5 = new Anh_Tai("Do Hoang Hiep", null, 1986, 28, null, 0, 0);
		Anh_Tai at6 = new Anh_Tai("Thanh Duy", null, 1986, 17, null, 0, 0);
		Anh_Tai at7 = new Anh_Tai("Quoc Thien", null, 1988, 16, null, 0, 0);
		Anh_Tai at8 = new Anh_Tai("Binz", null, 1988, 14, null, 0, 0);
		Anh_Tai at9 = new Anh_Tai("TCuong Seven", null, 1989, 14, null, 0, 0);
		Anh_Tai at10 = new Anh_Tai("Jun Pham", null, 1989, 14, null, 0, 0);
		Anh_Tai at11 = new Anh_Tai("BB Tran", null, 1990, 15, null, 0, 0);
		Anh_Tai at12 = new Anh_Tai("S.T Son Thach", null, 1990, 25, null, 0, 0);
		Anh_Tai at13 = new Anh_Tai("Rhymastic", null, 1991, 15, null, 0, 0);
		Anh_Tai at14 = new Anh_Tai("(S)TRONG Trong Hieu", null, 1992, 9, null, 0, 0);
		Anh_Tai at15 = new Anh_Tai("Soobin", null, 1992, 14, null, 0, 0);
		Anh_Tai at16 = new Anh_Tai("Kay Tran", null, 1994, 10, null, 0, 0);
		Anh_Tai at17 = new Anh_Tai("Bui Cong Nam", null, 1994, 7, null, 0, 0);
		Anh_Tai at18 = new Anh_Tai("Phan Đinh Tùng", null, 1976, 25, null, 0, 0);
		Anh_Tai at19 = new Anh_Tai("Tuan Hung", null, 1978, 29, null, 0, 0);
		Anh_Tai at20 = new Anh_Tai("Ha Le", null, 1984, 20, null, 0, 0);
		Anh_Tai at21 = new Anh_Tai("Thien Minh", null, 1990, 16, null, 0, 0);
		Anh_Tai at22 = new Anh_Tai("Kien ung", null, 1992, 14, null, 0, 0);
		Anh_Tai at23 = new Anh_Tai("Duy Khanh", null, 1995, 16, null, 0, 0);
		Anh_Tai at24 = new Anh_Tai("Truong The Vinh", null, 1984, 22, null, 0, 0);
		Anh_Tai at25 = new Anh_Tai("Tang Phuc", null, 1990, 7, null, 0, 0);
		Anh_Tai at26 = new Anh_Tai("Lien Binh Phat", null, 1990, 7, null, 0, 0);
		Anh_Tai at27 = new Anh_Tai("Pham Khanh Hung", null, 1982, 25, null, 0, 0);
		Anh_Tai at28 = new Anh_Tai("Đang Khoi", null, 1983, 20, null, 0, 0);
		Anh_Tai at29 = new Anh_Tai("Nguyen Tran Duy Nhat", null, 1989, 29, null, 0, 0);
		Anh_Tai at30 = new Anh_Tai("Neko Le", null, 1990, 15, null, 0, 0);
		Anh_Tai at31 = new Anh_Tai("Hong Son", null, 1970, 35, null, 0, 0);
		Anh_Tai at32 = new Anh_Tai("Thanh Trung", null, 1983, 21, null, 0, 0);
		Anh_Tai at33 = new Anh_Tai("HuyR", null, 1995, 9, null, 0, 0);

		dsAnhTai.add(at1);
		dsAnhTai.add(at2);
		dsAnhTai.add(at3);
		dsAnhTai.add(at4);
		dsAnhTai.add(at5);
		dsAnhTai.add(at6);
		dsAnhTai.add(at7);
		dsAnhTai.add(at8);
		dsAnhTai.add(at9);
		dsAnhTai.add(at10);
		dsAnhTai.add(at11);
		dsAnhTai.add(at12);
		dsAnhTai.add(at13);
		dsAnhTai.add(at14);
		dsAnhTai.add(at15);
		dsAnhTai.add(at16);
		dsAnhTai.add(at17);
		dsAnhTai.add(at18);
		dsAnhTai.add(at19);
		dsAnhTai.add(at20);
		dsAnhTai.add(at21);
		dsAnhTai.add(at22);
		dsAnhTai.add(at23);
		dsAnhTai.add(at24);
		dsAnhTai.add(at25);
		dsAnhTai.add(at26);
		dsAnhTai.add(at27);
		dsAnhTai.add(at28);
		dsAnhTai.add(at29);
		dsAnhTai.add(at30);
		dsAnhTai.add(at31);
		dsAnhTai.add(at32);
		dsAnhTai.add(at33);
		// anh tai tham gia
		ct.printAnhTai();

		// set diem hoa luc va diem ca nhan

		ct.setDiemAnhTai(at1, 480, 300);
		ct.setDiemAnhTai(at2, 130, 0);
		ct.setDiemAnhTai(at3, 160, 0);
		ct.setDiemAnhTai(at4, 130, 0);
		ct.setDiemAnhTai(at5, 520, 0);
		ct.setDiemAnhTai(at6, 780, 300);
		ct.setDiemAnhTai(at7, 230, 0);
		ct.setDiemAnhTai(at8, 260, 0);
		ct.setDiemAnhTai(at9, 440, 300);
		ct.setDiemAnhTai(at10, 80, 0);
		ct.setDiemAnhTai(at11, 100, 0);
		ct.setDiemAnhTai(at12, 230, 0);
		ct.setDiemAnhTai(at13, 450, 0);
		ct.setDiemAnhTai(at14, 250, 0);
		ct.setDiemAnhTai(at15, 880, 300);
		ct.setDiemAnhTai(at16, 380, 0);
		ct.setDiemAnhTai(at17, 710, 300);
		ct.setDiemAnhTai(at18, 330, 0);
		ct.setDiemAnhTai(at19, 210, 0);
		ct.setDiemAnhTai(at20, 160, 0);
		ct.setDiemAnhTai(at21, 540, 330);
		ct.setDiemAnhTai(at22, 140, 0);
		ct.setDiemAnhTai(at23, 220, 0);
		ct.setDiemAnhTai(at24, 440, 0);
		ct.setDiemAnhTai(at25, 190, 0);
		ct.setDiemAnhTai(at26, 220, 0);
		ct.setDiemAnhTai(at27, 130, 0);
		ct.setDiemAnhTai(at28, 850, 300);
		ct.setDiemAnhTai(at29, 260, 0);
		ct.setDiemAnhTai(at30, 760, 300);
		ct.setDiemAnhTai(at31, 370, 0);
		ct.setDiemAnhTai(at32, 250, 0);
		ct.setDiemAnhTai(at33, 200, 0);

		// in diem ca nha va hoa luc
		ct.printdiem();

		// cac nhom san khau khi ra mat
		LinkedList<Anh_Tai> dsThanhViennRaMat1 = new LinkedList<>();
		dsThanhViennRaMat1.add(at19);
		dsThanhViennRaMat1.add(at1);
		dsThanhViennRaMat1.add(at2);
		dsThanhViennRaMat1.add(at31);
		LinkedList<Anh_Tai> dsThanhViennRaMat2 = new LinkedList<>();
		dsThanhViennRaMat2.add(at16);
		dsThanhViennRaMat2.add(at15);
		dsThanhViennRaMat2.add(at9);
		dsThanhViennRaMat2.add(at22);
		LinkedList<Anh_Tai> dsThanhViennRaMat3 = new LinkedList<>();
		dsThanhViennRaMat3.add(at18);
		dsThanhViennRaMat3.add(at32);
		dsThanhViennRaMat3.add(at5);
		LinkedList<Anh_Tai> dsThanhViennRaMat4 = new LinkedList<>();
		dsThanhViennRaMat4.add(at14);
		dsThanhViennRaMat4.add(at12);
		dsThanhViennRaMat4.add(at6);
		dsThanhViennRaMat4.add(at11);
		dsThanhViennRaMat4.add(at30);
		LinkedList<Anh_Tai> dsThanhViennRaMat5 = new LinkedList<>();
		dsThanhViennRaMat5.add(at8);
		dsThanhViennRaMat5.add(at13);
		dsThanhViennRaMat5.add(at3);
		dsThanhViennRaMat5.add(at20);
		LinkedList<Anh_Tai> dsThanhViennRaMat6 = new LinkedList<>();
		dsThanhViennRaMat6.add(at28);
		dsThanhViennRaMat6.add(at27);
		dsThanhViennRaMat6.add(at7);
		LinkedList<Anh_Tai> dsThanhViennRaMat7 = new LinkedList<>();
		dsThanhViennRaMat7.add(at23);
		dsThanhViennRaMat7.add(at25);
		dsThanhViennRaMat7.add(at17);
		dsThanhViennRaMat7.add(at33);
		dsThanhViennRaMat7.add(at10);
		LinkedList<Anh_Tai> dsThanhViennRaMat8 = new LinkedList<>();
		dsThanhViennRaMat8.add(at21);
		dsThanhViennRaMat8.add(at4);
		dsThanhViennRaMat8.add(at24);
		dsThanhViennRaMat8.add(at26);
		dsThanhViennRaMat8.add(at29);

		// cac nhom vong 1 sau khi ghep nhom
		LinkedList<Anh_Tai> dsThanhVienVong11 = new LinkedList<>();
		dsThanhVienVong11.add(at19);
		dsThanhVienVong11.add(at29);
		dsThanhVienVong11.add(at26);
		dsThanhVienVong11.add(at14);
		LinkedList<Anh_Tai> dsThanhVienVong12 = new LinkedList<>();
		dsThanhVienVong12.add(at32);
		dsThanhVienVong12.add(at20);
		dsThanhVienVong12.add(at5);
		dsThanhVienVong12.add(at7);
		dsThanhVienVong12.add(at22);
		LinkedList<Anh_Tai> dsThanhVienVong13 = new LinkedList<>();
		dsThanhVienVong13.add(at27);
		dsThanhVienVong13.add(at24);
		dsThanhVienVong13.add(at10);
		dsThanhVienVong13.add(at11);
		dsThanhVienVong13.add(at33);
		LinkedList<Anh_Tai> dsThanhVienVong14 = new LinkedList<>();
		dsThanhVienVong14.add(at3);
		dsThanhVienVong14.add(at4);
		dsThanhVienVong14.add(at13);
		LinkedList<Anh_Tai> dsThanhVienVong15 = new LinkedList<>();
		dsThanhVienVong15.add(at2);
		dsThanhVienVong15.add(at9);
		dsThanhVienVong15.add(at15);
		LinkedList<Anh_Tai> dsThanhVienVong16 = new LinkedList<>();
		dsThanhVienVong16.add(at31);
		dsThanhVienVong16.add(at1);
		dsThanhVienVong16.add(at8);
		dsThanhVienVong16.add(at12);
		LinkedList<Anh_Tai> dsThanhVienVong17 = new LinkedList<>();
		dsThanhVienVong17.add(at18);
		dsThanhVienVong17.add(at28);
		dsThanhVienVong17.add(at30);
		dsThanhVienVong17.add(at25);
		dsThanhVienVong17.add(at16);
		LinkedList<Anh_Tai> dsThanhVienVong18 = new LinkedList<>();
		dsThanhVienVong18.add(at6);
		dsThanhVienVong18.add(at21);
		dsThanhVienVong18.add(at17);
		dsThanhVienVong18.add(at23);

		Bai_Hat bh1 = new Bai_Hat("Ba ke con nghe va Duoi anh đen san khau", null, null, null);
		Bai_Hat bh2 = new Bai_Hat("Mot lan dang do va Di qua cau vong", null, null, null);
		Bai_Hat bh3 = new Bai_Hat("Vo nguoi ta va Chuyen ba nguoi", null, null, null);
		Bai_Hat bh4 = new Bai_Hat("Lột xác va Chuyện nhỏ", null, null, null);
		Bai_Hat bh5 = new Bai_Hat("Trong com", null, null, null);
		Bai_Hat bh6 = new Bai_Hat("Tinh thuc sau giac ngu dong", null, null, null);
		Bai_Hat bh7 = new Bai_Hat("Diu dang đen tung phut giay va Buoc đen ben em", null, null, null);
		Bai_Hat bh8 = new Bai_Hat("Ao mua đong va Tro ve", null, null, null);

		Nhom n1 = new Nhom("Dam me", bh1, dsThanhVienVong11, 0);
		Nhom n2 = new Nhom("Hat", bh2, dsThanhVienVong12, 0);
		Nhom n3 = new Nhom("Ngu hanh", bh3, dsThanhVienVong13, 0);
		Nhom n4 = new Nhom("Tai sinh", bh4, dsThanhVienVong14, 0);
		Nhom n5 = new Nhom("Sao sang", bh5, dsThanhVienVong15, 0);
		Nhom n6 = new Nhom("Xuan ha thu dong", bh6, dsThanhVienVong16, 0);
		Nhom n7 = new Nhom("KK", bh7, dsThanhVienVong17, 0);
		Nhom n8 = new Nhom("Xuong rong", bh8, dsThanhVienVong18, 0);

		LinkedList<Nhom> dsNhonCD = new LinkedList<>();
		dsNhonCD.add(n1);
		dsNhonCD.add(n2);
		dsNhonCD.add(n3);
		dsNhonCD.add(n4);
		dsNhonCD.add(n5);
		dsNhonCD.add(n6);
		dsNhonCD.add(n7);
		dsNhonCD.add(n8);
		Cong_Dien cd = new Cong_Dien("cong dien vong 1", "Người thiếu niên thuở nào", dsNhonCD);

		// danh sach nhom trinh dien vong 1
		System.out.println("--trinh dien vong 1--");
		cd.printdsCD();

		int[] arrDiem = new int[] { 760, 650, 1660, 900, 1490, 1680, 1060, 1750 };
		cd.tinhDiemCuoi(dsNhonCD, arrDiem);
		cd.printDiemNhomCD();

		cd.nhomNghiHiem(dsNhonCD);

		System.out.println("--trinh dien vong 2--");
		// System.out.println(--danh sach cong dien vong 2 lan 1--);
		// nhom va thanh vien cac nhom
		LinkedList<Anh_Tai> dsThanhVienVong21 = new LinkedList<>();
		dsThanhVienVong21.add(at18);
		dsThanhVienVong21.add(at29);
		dsThanhVienVong21.add(at25);
		dsThanhVienVong21.add(at26);
		dsThanhVienVong21.add(at14);
		dsThanhVienVong21.add(at16);
		LinkedList<Anh_Tai> dsThanhVienVong22 = new LinkedList<>();
		dsThanhVienVong22.add(at1);
		dsThanhVienVong22.add(at6);
		dsThanhVienVong22.add(at8);
		dsThanhVienVong22.add(at21);
		dsThanhVienVong22.add(at17);
		dsThanhVienVong22.add(at23);
		LinkedList<Anh_Tai> dsThanhVienVong23 = new LinkedList<>();
		dsThanhVienVong23.add(at24);
		dsThanhVienVong23.add(at20);
		dsThanhVienVong23.add(at10);
		dsThanhVienVong23.add(at11);
		dsThanhVienVong23.add(at22);
		dsThanhVienVong23.add(at33);
		LinkedList<Anh_Tai> dsThanhVienVong24 = new LinkedList<>();
		dsThanhVienVong24.add(at2);
		dsThanhVienVong24.add(at3);
		dsThanhVienVong24.add(at7);
		dsThanhVienVong24.add(at9);
		dsThanhVienVong24.add(at13);
		dsThanhVienVong24.add(at15);

		// cong dien vong 2 lan 1
		Bai_Hat bh21 = new Bai_Hat("Giau sang");
		Bai_Hat bh22 = new Bai_Hat("Dau co loi lam");
		Bai_Hat bh23 = new Bai_Hat("Tinh yeu ngu quen");
		Bai_Hat bh24 = new Bai_Hat("Chot nghe buoc em ve");

		Nhom n21 = new Nhom("Kame", bh21, dsThanhVienVong11, 0);
		Nhom n22 = new Nhom("Phat Tai", bh22, dsThanhVienVong12, 0);
		Nhom n23 = new Nhom("Cuu Long", bh23, dsThanhVienVong13, 0);
		Nhom n24 = new Nhom("Tinh Tu", bh24, dsThanhVienVong14, 0);

		LinkedList<Nhom> dsNhomCD21 = new LinkedList<>();
		dsNhomCD21.add(n21);
		dsNhomCD21.add(n22);
		dsNhomCD21.add(n23);
		dsNhomCD21.add(n24);

		Cong_Dien cd21 = new Cong_Dien("cong dien vong 2", "Loi nhan tu vu tru", dsNhomCD21);

		// danh sach cong dien vong 2 lan 1
		cd21.printdsCD();

		int[] arrDiem21 = new int[] { 1580, 1790, 1480, 2150 };
		cd21.tinhDiemCuoi(dsNhomCD21, arrDiem21);
		cd21.printDiemNhomCD();

		cd21.nhomNghiHiem2(dsNhomCD21);

		// diem hoa luc anh tai trong nhom nghi hiem
		Chuong_Trinh ct2 = new Chuong_Trinh(2, dsAnhTai);
		ct2.setDiemAnhTai(at24, 0, 370);
		ct2.setDiemAnhTai(at20, 0, 180);
		ct2.setDiemAnhTai(at10, 0, Integer.MAX_VALUE);// khong co diem
		ct2.setDiemAnhTai(at11, 0, 680);
		ct2.setDiemAnhTai(at22, 0, 90);
		ct2.setDiemAnhTai(at33, 0, 40);

		// danh sach loai vong 2 lan 1
		LinkedList<Nhom> nghihiem21 = cd21.nhomNghiHiem2(dsNhomCD21);
		cd21.dsAnhTaiBiLoai(nghihiem21);

		System.out.println("\nnhom va anh tai tham gia vong 2 lan 2");
		System.out.println("--nhom va anh tai tham gia vong 2 lan 2--");
		// nhom va thanh vien cac nhom
		LinkedList<Anh_Tai> dsThanhVienVong221 = new LinkedList<>();
		dsThanhVienVong221.add(at2);
		dsThanhVienVong221.add(at19);
		dsThanhVienVong221.add(at4);
		dsThanhVienVong221.add(at7);
		dsThanhVienVong221.add(at13);
		dsThanhVienVong221.add(at15);

		LinkedList<Anh_Tai> dsThanhVienVong222 = new LinkedList<>();
		dsThanhVienVong222.add(at18);
		dsThanhVienVong222.add(at28);
		dsThanhVienVong222.add(at30);
		dsThanhVienVong222.add(at25);
		dsThanhVienVong222.add(at16);

		LinkedList<Anh_Tai> dsThanhVienVong223 = new LinkedList<>();
		dsThanhVienVong223.add(at31);
		dsThanhVienVong223.add(at6);
		dsThanhVienVong223.add(at21);
		dsThanhVienVong223.add(at12);
		dsThanhVienVong223.add(at17);
		dsThanhVienVong223.add(at23);

		LinkedList<Anh_Tai> dsThanhVienVong224 = new LinkedList<>();
		dsThanhVienVong224.add(at27);
		dsThanhVienVong224.add(at32);
		dsThanhVienVong224.add(at5);
		dsThanhVienVong224.add(at10);

		Bai_Hat bh221 = new Bai_Hat("Nhung ke mong mo");
		Bai_Hat bh222 = new Bai_Hat("Bao tien một mớ bình yen?");
		Bai_Hat bh223 = new Bai_Hat("Got hong va Cao got");
		Bai_Hat bh224 = new Bai_Hat("Neu mot mai toi bay lên troi");

		Nhom n221 = new Nhom("Tinh Tu", bh221, dsThanhVienVong221, 0);
		Nhom n222 = new Nhom("Kame Tai", bh222, dsThanhVienVong222, 0);
		Nhom n223 = new Nhom("Phat Tai", bh223, dsThanhVienVong223, 0);
		Nhom n224 = new Nhom("Cuu Long", bh224, dsThanhVienVong224, 0);

		LinkedList<Nhom> dsNhomCD221 = new LinkedList<>();
		dsNhomCD221.add(n221);
		dsNhomCD221.add(n222);
		dsNhomCD221.add(n223);
		dsNhomCD221.add(n224);
		Cong_Dien cd221 = new Cong_Dien("cong dien vong 2 lan 2", "Loi nhan tu vu tru", dsNhomCD221);
		cd221.printdsCD();

		int[] arrDiem22 = new int[] { 4620, 3350, 2920, 2710 };
		cd221.tinhDiemCuoi(dsNhomCD221, arrDiem22);
		cd221.printDiemNhomCD();
		cd221.nhomNghiHiem2(dsNhomCD221);
		int[] arrDiemHoaLuc22 = new int[] { 280, 80, 340, 210, 150, 790, 350, 140, 460, 170, 750, 90, 420, 100, 930,
				430, 450, 80, 40, 170, 1210 };
		System.out.println(
				"danh sach diem binh chon bang map: " + cd221.bangDiemBinhChonCaNhan(dsNhomCD221, arrDiemHoaLuc22));
		cd221.anhTaiBiLoai(cd221.bangDiemBinhChonCaNhan(dsNhomCD221, arrDiemHoaLuc22));

		System.out.println("--danh sach cong dien vong 3 lan 1-- ");
		LinkedList<Anh_Tai> dsThanhVienVong31 = new LinkedList<>();
		dsThanhVienVong31.add(at3);
		dsThanhVienVong31.add(at4);
		dsThanhVienVong31.add(at20);
		dsThanhVienVong31.add(at7);
		dsThanhVienVong31.add(at13);

		LinkedList<Anh_Tai> dsThanhVienVong32 = new LinkedList<>();
		dsThanhVienVong32.add(at19);
		dsThanhVienVong32.add(at28);
		dsThanhVienVong32.add(at6);
		dsThanhVienVong32.add(at4);
		dsThanhVienVong32.add(at15);

		LinkedList<Anh_Tai> dsThanhVienVong33 = new LinkedList<>();
		dsThanhVienVong33.add(at30);
		dsThanhVienVong33.add(at25);
		dsThanhVienVong33.add(at21);
		dsThanhVienVong33.add(at11);
		dsThanhVienVong33.add(at17);

		LinkedList<Anh_Tai> dsThanhVienVong34 = new LinkedList<>();
		dsThanhVienVong34.add(at1);
		dsThanhVienVong34.add(at18);
		dsThanhVienVong34.add(at27);
		dsThanhVienVong34.add(at24);
		dsThanhVienVong34.add(at5);

		// cong dien vong 3
		Bai_Hat bh31 = new Bai_Hat("Thu hoài");
		Bai_Hat bh32 = new Bai_Hat("Là anh đó");
		Bai_Hat bh33 = new Bai_Hat("Anh sẽ nhớ mãi");
		Bai_Hat bh34 = new Bai_Hat("Buông");

		Nhom n31 = new Nhom("Tre", bh31, dsThanhVienVong31, 0);
		Nhom n32 = new Nhom("Ca lon", bh32, dsThanhVienVong32, 0);
		Nhom n33 = new Nhom("Chin muoi", bh33, dsThanhVienVong33, 0);
		Nhom n34 = new Nhom("Mut gung", bh34, dsThanhVienVong34, 0);

		LinkedList<Nhom> dsNhomCD31 = new LinkedList<>();
		dsNhomCD31.add(n31);
		dsNhomCD31.add(n32);
		dsNhomCD31.add(n33);
		dsNhomCD31.add(n34);

		Cong_Dien cd31 = new Cong_Dien("cong dien vong 3 lan 1", "tam khien", dsNhomCD31);
		cd31.printdsCD();
		int[] arrDiemHoaLuc31 = new int[] { 1530, 1650, 1610, 1870 };
		System.out.println("Diem tung nhom vong 3 lan 1:");
		System.out.println(cd31.bangDiemNhom(dsNhomCD31, arrDiemHoaLuc31));
		cd31.nhomNghiHiem(cd31.bangDiemNhom(dsNhomCD31, arrDiemHoaLuc31));
		System.out.println(
				"Anh tai bi loai vong nay do thanh vien trong nhom da lua chon diem thap nhat nhung khon cong bo:\t"
						+ at20.getNgheDanh());

		System.out.println("--danh sach vong 3 lan 2--");

		LinkedList<Anh_Tai> dsThanhVienVong321 = new LinkedList<>();
		dsThanhVienVong321.add(at31);
		dsThanhVienVong321.add(at27);
		dsThanhVienVong321.add(at24);
		dsThanhVienVong321.add(at5);
		dsThanhVienVong321.add(at29);
		LinkedList<Anh_Tai> dsThanhVienVong322 = new LinkedList<>();
		dsThanhVienVong322.add(at2);
		dsThanhVienVong322.add(at6);
		dsThanhVienVong322.add(at9);
		dsThanhVienVong322.add(at10);
		dsThanhVienVong322.add(at15);
		LinkedList<Anh_Tai> dsThanhVienVong323 = new LinkedList<>();
		dsThanhVienVong323.add(at3);
		dsThanhVienVong323.add(at20);
		dsThanhVienVong323.add(at7);
		dsThanhVienVong323.add(at8);
		dsThanhVienVong323.add(at23);

		LinkedList<Anh_Tai> dsThanhVienVong324 = new LinkedList<>();
		dsThanhVienVong324.add(at21);
		dsThanhVienVong324.add(at11);
		dsThanhVienVong324.add(at26);
		dsThanhVienVong324.add(at12);
		dsThanhVienVong324.add(at16);

		Bai_Hat bh321 = new Bai_Hat("Trieu ly do");
		Bai_Hat bh322 = new Bai_Hat("Duong xa uot mua va Đung qua loi đo");
		Bai_Hat bh323 = new Bai_Hat("Trai Đat om Mat Troi");
		Bai_Hat bh324 = new Bai_Hat("Let Me Feel Your Love Tonight");

		Nhom n321 = new Nhom("Mut gung", bh321, dsThanhVienVong321, 0);
		Nhom n322 = new Nhom("Ca lon", bh322, dsThanhVienVong322, 0);
		Nhom n323 = new Nhom("tre", bh323, dsThanhVienVong323, 0);
		Nhom n324 = new Nhom("Chin muoi", bh324, dsThanhVienVong324, 0);

		LinkedList<Nhom> dsNhomCD321 = new LinkedList<>();
		dsNhomCD321.add(n321);
		dsNhomCD321.add(n322);
		dsNhomCD321.add(n323);
		dsNhomCD321.add(n324);
		Cong_Dien cd321 = new Cong_Dien(dsNhomCD321);
		cd321.printdsCD();
		int[] arrDiemNhom321 = new int[] { 1600, 1880, 1580, 1900 };
		System.out.println("Diem tung nhom vong 3 lan 2:");
		System.out.println(cd31.bangDiemNhom(dsNhomCD321, arrDiemNhom321));
		cd321.nhomNghiHiem(cd31.bangDiemNhom(dsNhomCD321, arrDiemNhom321));
		int[] arrDiemHoaLuc321 = new int[] { 210, 150, 290, 610, 230 };
		// nhom nghi hiem
		LinkedList<Nhom> nhomnghihimecd32 = new LinkedList<>();
		nhomnghihimecd32.add(n323);
		System.out.println("Bang diem ca nhan:\n" + cd321.bangDiemBinhChonCaNhan(nhomnghihimecd32, arrDiemHoaLuc321));
		cd321.anhTaiBiLoai(cd321.bangDiemBinhChonCaNhan(nhomnghihimecd32, arrDiemHoaLuc321));

		System.out.println("--Diem tung nhom vong 4 Nhom--");
		LinkedList<Anh_Tai> dsThanhVienVong41 = new LinkedList<>();
		dsThanhVienVong41.add(at30);
		dsThanhVienVong41.add(at25);
		dsThanhVienVong41.add(at21);
		dsThanhVienVong41.add(at11);
		dsThanhVienVong41.add(at26);
		dsThanhVienVong41.add(at12);
		dsThanhVienVong41.add(at16);
		dsThanhVienVong41.add(at17);

		LinkedList<Anh_Tai> dsThanhVienVong42 = new LinkedList<>();
		dsThanhVienVong42.add(at3);
		dsThanhVienVong42.add(at4);
		dsThanhVienVong42.add(at7);
		dsThanhVienVong42.add(at8);
		dsThanhVienVong42.add(at13);
		dsThanhVienVong42.add(at23);

		LinkedList<Anh_Tai> dsThanhVienVong43 = new LinkedList<>();
		dsThanhVienVong43.add(at1);
		dsThanhVienVong43.add(at18);
		dsThanhVienVong43.add(at27);
		dsThanhVienVong43.add(at24);
		dsThanhVienVong43.add(at5);
		dsThanhVienVong43.add(at29);

		LinkedList<Anh_Tai> dsThanhVienVong44 = new LinkedList<>();
		dsThanhVienVong44.add(at2);
		dsThanhVienVong44.add(at19);
		dsThanhVienVong44.add(at28);
		dsThanhVienVong44.add(at6);
		dsThanhVienVong44.add(at9);
		dsThanhVienVong44.add(at10);
		dsThanhVienVong44.add(at14);
		dsThanhVienVong44.add(at15);

		Bai_Hat bh41 = new Bai_Hat("Mua tren pho Hue");
		Bai_Hat bh42 = new Bai_Hat("Đao lieu");
		Bai_Hat bh43 = new Bai_Hat("Da co hoai lang");
		Bai_Hat bh44 = new Bai_Hat("Chiec khan pieu");

		Nhom n41 = new Nhom("Chin muoi", bh41, dsThanhVienVong41, 0);
		Nhom n42 = new Nhom("Tre", bh42, dsThanhVienVong42, 0);
		Nhom n43 = new Nhom("Mut gung", bh43, dsThanhVienVong43, 0);
		Nhom n44 = new Nhom("Ca lon", bh44, dsThanhVienVong44, 0);

		LinkedList<Nhom> dsNhomCD4 = new LinkedList<>();
		dsNhomCD4.add(n41);
		dsNhomCD4.add(n42);
		dsNhomCD4.add(n43);
		dsNhomCD4.add(n44);
		Cong_Dien cd4 = new Cong_Dien(dsNhomCD321);
		cd4.printdsCD();
		int[] arrDiemNhom4 = new int[] { 5620, 6060, 3680, 3790 };
		System.out.println("Diem tung nhom vong 4 thi Nhom:");
		System.out.println(cd4.bangDiemNhom(dsNhomCD4, arrDiemNhom4));

		cd4.nhomNghiHiemVong4(cd31.bangDiemNhom(dsNhomCD4, arrDiemNhom4));
		LinkedList<Nhom> nhomnghihimem41 = new LinkedList<>();
		nhomnghihimem41.add(n41);
		LinkedList<Nhom> nhomnghihimem42 = new LinkedList<>();
		nhomnghihimem42.add(n43);
		LinkedList<Nhom> nhomnghihimem43 = new LinkedList<>();
		nhomnghihimem43.add(n44);
		int[] arrDiemHoaLuc41 = new int[] { 0, 150, 350, 370, 130, 270, 680, 340 };
		int[] arrDiemHoaLuc42 = new int[] { 190, 160, 0, 230, 330, 0 };
		int[] arrDiemHoaLuc43 = new int[] { 630, 310, 0, 90, 340, 680, 690, 360 };

		System.out.println("Bang diem ca nhan:\n" + cd4.bangDiemBinhChonCaNhan(nhomnghihimem41, arrDiemHoaLuc41));
		System.out.println("Bang diem ca nhan:\n" + cd4.bangDiemBinhChonCaNhan(nhomnghihimem42, arrDiemHoaLuc42));
		System.out.println("Bang diem ca nhan:\n" + cd4.bangDiemBinhChonCaNhan(nhomnghihimem43, arrDiemHoaLuc43));
		cd4.anhTaiBiLoai(cd4.bangDiemBinhChonCaNhan(nhomnghihimem41, arrDiemHoaLuc41));
		cd4.anhTaiBiLoai(cd4.bangDiemBinhChonCaNhan(nhomnghihimem42, arrDiemHoaLuc42));
		cd4.anhTaiBiLoai(cd4.bangDiemBinhChonCaNhan(nhomnghihimem43, arrDiemHoaLuc43));

		// vong 5
		System.out.println("--Diem tung nhom vong5--");
		System.out.println("--Diem tung nhom vong5 lan 1--");
		LinkedList<Anh_Tai> dsThanhVienVong51 = new LinkedList<>();
		dsThanhVienVong51.add(at2);
		dsThanhVienVong51.add(at18);
		dsThanhVienVong51.add(at19);
		dsThanhVienVong51.add(at24);
		dsThanhVienVong51.add(at10);
		dsThanhVienVong51.add(at11);
		dsThanhVienVong51.add(at12);
		dsThanhVienVong51.add(at22);
		dsThanhVienVong51.add(at14);
		dsThanhVienVong51.add(at15);
		dsThanhVienVong51.add(at16);

		LinkedList<Anh_Tai> dsThanhVienVong52 = new LinkedList<>();
		dsThanhVienVong52.add(at3);
		dsThanhVienVong52.add(at4);
		dsThanhVienVong52.add(at20);
		dsThanhVienVong52.add(at5);
		dsThanhVienVong52.add(at6);
		dsThanhVienVong52.add(at7);
		dsThanhVienVong52.add(at8);
		dsThanhVienVong52.add(at25);
		dsThanhVienVong52.add(at21);
		dsThanhVienVong52.add(at26);
		dsThanhVienVong52.add(at13);
		dsThanhVienVong52.add(at17);
		dsThanhVienVong52.add(at23);

		Bai_Hat bh51 = new Bai_Hat("Phai");
		Bai_Hat bh52 = new Bai_Hat("If");

		Nhom n51 = new Nhom("tinh hoa", bh51, dsThanhVienVong51, 0);
		Nhom n52 = new Nhom("thieu nhi", bh52, dsThanhVienVong52, 0);

		LinkedList<Nhom> dsNhomCD51 = new LinkedList<>();
		dsNhomCD51.add(n51);
		dsNhomCD51.add(n52);
		Cong_Dien cd51 = new Cong_Dien(dsNhomCD51);
		cd51.printdsCD();
		cd51.nhomNghiHiem(dsNhomCD51);
		int[] arrDiemNhom51 = new int[] { 1720, 1780 };
		System.out.println("Diem tung nhom vong 5 lan 1:");
		System.out.println(cd51.bangDiemNhom(dsNhomCD51, arrDiemNhom51));
		cd51.nhomNghiHiemVong4(cd51.bangDiemNhom(dsNhomCD51, arrDiemNhom51));

		System.out.println("--Diem tung nhom vong5 lan 2--");
		int[] arrDiemNhom52 = new int[] { 1850, 1650 };
		System.out.println("Diem tung nhom vong 5 lan 2:");
		System.out.println(cd51.bangDiemNhom(dsNhomCD51, arrDiemNhom52));
		cd51.nhomNghiHiemVong4(cd51.bangDiemNhom(dsNhomCD51, arrDiemNhom52));

		System.out.println("--Diem tung nhom vong5 lan 3--");
		int[] arrDiemNhom53 = new int[] { 1900, 1510 };
		System.out.println("Diem tung nhom vong 5 lan 3:");
		System.out.println(cd51.bangDiemNhom(dsNhomCD51, arrDiemNhom53));
		cd51.nhomNghiHiemVong4(cd51.bangDiemNhom(dsNhomCD51, arrDiemNhom53));

		int[] arr51 = new int[] { 290, 420, 170, 160, 190, 660, 860, 400, 350, 220, 370, 970, 740 };
		int[] arr52 = new int[] { 380, 390, 180, 260, 630, 440, 650, 140, 310, 90, 460, 490, 200 };
		LinkedList<Nhom> dsNhomCD531 = new LinkedList<>();
		LinkedList<Nhom> dsNhomCD532 = new LinkedList<>();
		dsNhomCD531.add(n51);
		dsNhomCD532.add(n52);
		System.out.println("Bang diem ca nhan:\n" + cd4.bangDiemBinhChonCaNhan(dsNhomCD531, arr51));
		System.out.println("Bang diem ca nhan:\n" + cd4.bangDiemBinhChonCaNhan(dsNhomCD532, arr52));
		// danh sach loai
		cd51.anhTaiBiLoai(cd51.bangDiemBinhChonCaNhan(dsNhomCD531, arr51));
		cd51.anhTaiBiLoai2nguoi(cd51.bangDiemBinhChonCaNhan(dsNhomCD532, arr52));

		// vong chung ket
		System.out.println("--vong chung ket--");

		LinkedList<Anh_Tai> dsThanhVienChungKet1 = new LinkedList<>();
		dsThanhVienChungKet1.add(at1);
		dsThanhVienChungKet1.add(at2);
		dsThanhVienChungKet1.add(at18);
		dsThanhVienChungKet1.add(at19);
		dsThanhVienChungKet1.add(at9);
		dsThanhVienChungKet1.add(at10);
		dsThanhVienChungKet1.add(at11);
		dsThanhVienChungKet1.add(at12);
		dsThanhVienChungKet1.add(at22);
		dsThanhVienChungKet1.add(at14);
		dsThanhVienChungKet1.add(at15);
		dsThanhVienChungKet1.add(at16);
		LinkedList<Anh_Tai> dsThanhVienChungKet2 = new LinkedList<>();
		dsThanhVienChungKet2.add(at3);
		dsThanhVienChungKet2.add(at4);
		dsThanhVienChungKet2.add(at20);
		dsThanhVienChungKet2.add(at5);
		dsThanhVienChungKet2.add(at6);
		dsThanhVienChungKet2.add(at7);
		dsThanhVienChungKet2.add(at8);
		dsThanhVienChungKet2.add(at21);
		dsThanhVienChungKet2.add(at13);
		dsThanhVienChungKet2.add(at17);
		dsThanhVienChungKet2.add(at23);

		Bai_Hat bh61 = new Bai_Hat("Me yeu con");
		Bai_Hat bh62 = new Bai_Hat("Dong thoi gian");

		Nhom n61 = new Nhom("tinh hoa", bh61, dsThanhVienChungKet1, 0);
		Nhom n62 = new Nhom("thieu nhi", bh62, dsThanhVienChungKet2, 0);

		LinkedList<Nhom> dsNhomCDCK = new LinkedList<>();
		dsNhomCDCK.add(n61);
		dsNhomCDCK.add(n62);
		Cong_Dien cdck = new Cong_Dien(dsNhomCDCK);

		int[] arrDiemNhomck1 = new int[] { 1850, 1650 };
		System.out.println("Diem tung nhom vong chung ket lan 1:");
		System.out.println(cd51.bangDiemNhom(dsNhomCD51, arrDiemNhomck1));
		int[] arrDiemNhomck2 = new int[] { 1600, 1900 };
		System.out.println("Diem tung nhom vong chung ket lan 2:");
		System.out.println(cd51.bangDiemNhom(dsNhomCD51, arrDiemNhomck2));
		cdck.printdsCD();
		System.out.println("Diem tung nhom vong chung ket lan 3:");
		int[] arrDiemNhomck3 = new int[] { 3230, 3170 };
		System.out.println(cd51.bangDiemNhom(dsNhomCD51, arrDiemNhomck3));

		int[] arrck1 = new int[] { 508, 712, 214, 270, 799, 1087, 556, 580, 163, 598, 1141, 1121 };
		int[] arrck2 = new int[] { 346, 352, 256, 333, 561, 563, 866, 246, 592, 732, 325 };
		LinkedList<Nhom> dsNhomCk1 = new LinkedList<>();
		LinkedList<Nhom> dsNhomCk2 = new LinkedList<>();
		dsNhomCk1.add(n61);
		dsNhomCk2.add(n62);
		System.out.println("Bang diem ca nhan team thang:\n" + cdck.bangDiemBinhChonCaNhan(dsNhomCk1, arrck1));
		System.out.println("Bang diem ca nhan team thua:\n" + cdck.bangDiemBinhChonCaNhan(dsNhomCk2, arrck2));

		TreeMap<String, Integer> ans = cd51.banhDiemVongChungKet(cdck.bangDiemBinhChonCaNhan(dsNhomCk1, arrck1),
				cdck.bangDiemBinhChonCaNhan(dsNhomCk2, arrck2));

		cdck.giaTocTaiNang(ans, 330);
		cdck.anhTaiTop23(ans, 330);

	}
}