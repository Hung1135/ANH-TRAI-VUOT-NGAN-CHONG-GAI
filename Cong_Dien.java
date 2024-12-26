
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.print.attribute.SetOfIntegerSyntax;

public class Cong_Dien implements Comparable<Cong_Dien> {

	private String idCD, chuDeCD;
	private LinkedList<Nhom> dsNhomCD;

	public Cong_Dien(String idCD, String chuDeCD, LinkedList<Nhom> dsNhomCD) {
		this.idCD = idCD;
		this.chuDeCD = chuDeCD;
		this.dsNhomCD = dsNhomCD;
	}

	public Cong_Dien(LinkedList<Nhom> dsNhomCD) {
		this.dsNhomCD = dsNhomCD;
	}

	public LinkedList<Nhom> getDsNhomCD() {
		return dsNhomCD;
	}

	public void setDsNhomCD(LinkedList<Nhom> dsNhomCD) {
		this.dsNhomCD = dsNhomCD;
	}

	// ds nhom va thanh vien cong dien
	public void printdsCD() {
		System.out.println();
		for (Nhom nhom : dsNhomCD) {
			System.out.println(
					"\tnhom:" + nhom.getTenNhom() + nhom.getBaiHat() + "\ndsThanhVien:" + nhom.getDsThanhVien());
		}
	}

	// tinh diem cuoi vong 1
	public void tinhDiemCuoi(LinkedList<Nhom> Nhom, int[] arrDiemtheothutu) {
		int index = 0;
		for (Nhom nhom : Nhom) {
			nhom.setDiemBinhChonNhom(arrDiemtheothutu[index]);
			index++;
		}
	}

	// 2 nhom diem it nhat trong nhom
	public int[] diemItNhat(LinkedList<Nhom> nhom) {

		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		for (Nhom n : nhom) {
			if (n.getDiemBinhChonNhom() < min1) {
				min2 = min1;
				min1 = n.getDiemBinhChonNhom();
			} else if (n.getDiemBinhChonNhom() < min2) {
				min2 = n.getDiemBinhChonNhom();
			}
		}

		return new int[] { min1, min2 };
	}

	// nhom nghi hiem co the bi loai o vong 1
	public LinkedList<Nhom> nhomNghiHiem(LinkedList<Nhom> nhom) {
		LinkedList<Nhom> ans = new LinkedList<Nhom>();
		for (Nhom n : nhom) {
			if ((n.getDiemBinhChonNhom() == diemItNhat(nhom)[0]) || n.getDiemBinhChonNhom() == diemItNhat(nhom)[1]) {
				ans.add(n);
			}
		}
		for (Nhom s : ans) {
			System.out.println("nhom nghi hiem \t" + s.getTenNhom() + "\tdiem nhom\t" + s.getDiemBinhChonNhom());
		}
		return ans;
	}

	// 1 nhom nghi hiem
	public LinkedList<Nhom> nhomNghiHiem2(LinkedList<Nhom> nhom) {
		LinkedList<Nhom> ans = new LinkedList<>();
		int min = Integer.MAX_VALUE;
		for (Nhom n : nhom) {
			if (n.getDiemBinhChonNhom() < min) {
				min = n.getDiemBinhChonNhom();
			}
		}
		for (Nhom s : nhom) {
			if (s.getDiemBinhChonNhom() == min) {
				ans.add(s);
				System.out.println("nhom nghi hiem:\t" + s.getTenNhom() + "\t" + s.getDiemBinhChonNhom());
			}
		}
		return ans;
	}

	// in diem nhom
	public void printDiemNhomCD() {
		System.out.println("\nDiem tung nhom khi cong dien xong ");
		for (Nhom nhom : dsNhomCD) {
			System.out.println("\tnhom:" + nhom.getTenNhom() + "\tdiem binh chon:" + nhom.getDiemBinhChonNhom());
		}
	}

	// 2 anh diem it nhat trong nhom
	public int[] anhTaiDiemIt(LinkedList<Anh_Tai> anhtai) {

		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		for (Anh_Tai n : anhtai) {
			if (n.getDiemHoaLuc() < min1) {
				min2 = min1;
				min1 = n.getDiemHoaLuc();
			} else if (n.getDiemHoaLuc() < min2) {
				min2 = n.getDiemHoaLuc();
			}
		}
		return new int[] { min1, min2 };
	}

	// nhan vo nhom nghi hiem tra vo anh tai loai
	public LinkedList<Anh_Tai> dsAnhTaiBiLoai(LinkedList<Nhom> nhomNghiHiem) {
		LinkedList<Anh_Tai> ans = new LinkedList<Anh_Tai>();
		for (Nhom nhom : nhomNghiHiem) {
			for (Anh_Tai anhtai : nhom.getDsThanhVien()) {
				if ((anhtai.getDiemHoaLuc() == anhTaiDiemIt(nhom.getDsThanhVien())[0])
						|| (anhtai.getDiemHoaLuc() == anhTaiDiemIt(nhom.getDsThanhVien())[1])) {
					ans.add(anhtai);
				}
			}
		}
		for (Anh_Tai a : ans) {
			System.out.println("anh tai bi loai:\t" + a.getNgheDanh());
		}
		return ans;
	}

	// bang diem hoa luc ca nhan
	public TreeMap<String, Integer> bangDiemBinhChonCaNhan(LinkedList<Nhom> nhom, int[] arrDiem) {
		int index = 0;
		TreeMap<String, Integer> map = new TreeMap<>();
		for (Nhom n : nhom) {
			for (Anh_Tai anhtai : n.getDsThanhVien()) {
				map.put(anhtai.getNgheDanh(), arrDiem[index]);
				index++;
			}
		}
		return map;
	}

	public TreeMap<String, Integer> bangDiemNhom(LinkedList<Nhom> nhom, int[] arrDiem) {
		int index = 0;
		TreeMap<String, Integer> map = new TreeMap<>();
		for (Nhom n : nhom) {
			map.put(n.getTenNhom(), arrDiem[index]);
			index++;
		}
		return map;
	}

	// nhom co 1 nhom nghi hiem
	public LinkedList<Nhom> nhomNghiHiem(TreeMap<String, Integer> map) {
		int min = Integer.MAX_VALUE;
		LinkedList<Nhom> ans = new LinkedList<>();
		for (Map.Entry entry : map.entrySet()) {
			if (min > (int) entry.getValue()) {
				min = (int) entry.getValue();
			}
		}
		for (Map.Entry entry : map.entrySet()) {
			if (min == (int) entry.getValue()) {
				System.out.println("Nhom bi nghi hiem:" + entry.getKey() + "\t" + entry.getValue());
			}
		}

		return ans;
	}

	// nhom nghi hiem vong 4 gom 3 nhom
	public LinkedList<Nhom> nhomNghiHiemVong4(TreeMap<String, Integer> map) {
		int max = Integer.MIN_VALUE;
		LinkedList<Nhom> ans = new LinkedList<>();
		for (Map.Entry entry : map.entrySet()) {
			if (max < (int) entry.getValue()) {
				max = (int) entry.getValue();
			}
		}
		for (Map.Entry entry : map.entrySet()) {
			if (max != (int) entry.getValue()) {
				System.out.println("Nhom bi nghi hiem:" + entry.getKey() + "\t" + entry.getValue());
			}
		}

		return ans;
	}

	public void anhTaiBiLoai(TreeMap<String, Integer> map) {
		LinkedList<Anh_Tai> ans = new LinkedList<>();
		int min = Integer.MAX_VALUE;
		for (Map.Entry entry : map.entrySet()) {
			if (min > (int) entry.getValue()) {
				min = (int) entry.getValue();
			}
		}
		for (Map.Entry entry : map.entrySet()) {
			if (min == (int) entry.getValue()) {
				System.out.println("Anh tai bi loai:\t" + entry.getKey());
			}
		}

	}// vong thi co 2 anh tai bi loai

	public void anhTaiBiLoai2nguoi(TreeMap<String, Integer> map) {
		LinkedList<Anh_Tai> ans = new LinkedList<>();
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		for (Map.Entry entry : map.entrySet()) {
			if (min1 > (int) entry.getValue()) {
				min2 = min1;
				min1 = (int) entry.getValue();
			} else if (min2 > (int) entry.getValue()) {
				min2 = (int) entry.getValue();
			}
		}
		for (Map.Entry entry : map.entrySet()) {
			if ((min1 == (int) entry.getValue()) || (min2 == (int) entry.getValue())) {
				System.out.println("Anh tai bi loai:\t" + entry.getKey());
			}
		}

	}

	public TreeMap<String, Integer> banhDiemVongChungKet(TreeMap<String, Integer> map1, TreeMap<String, Integer> map2) {
		TreeMap<String, Integer> ans = new TreeMap<String, Integer>();
		for (Map.Entry entry : map1.entrySet()) {
			ans.put((String) entry.getKey(), (int) entry.getValue());
		}
		for (Map.Entry entry : map2.entrySet()) {
			ans.put((String) entry.getKey(), (int) entry.getValue());
		}
		return ans;
	}


	//danh sach gia toc tai nang
	public TreeMap<String, Integer> giaTocTaiNang(TreeMap<String, Integer> map, int n){
		TreeMap<String, Integer> ans = new TreeMap<String, Integer>();
		for (Map.Entry entry : map.entrySet()) {
			if ((int)entry.getValue()>n) {
				ans.put((String) entry.getKey(), (int) entry.getValue());
			}
		}
		System.err.println("danh sach gia toc tai nang:");
		for (Map.Entry entry : ans.entrySet()) {
				System.out.println(entry.getKey());
		}
		return ans;
	}
	
	//danh sach gia toc top 23
		public TreeMap<String, Integer> anhTaiTop23(TreeMap<String, Integer> map, int n){
			TreeMap<String, Integer> ans = new TreeMap<>();
			for (Map.Entry entry : map.entrySet()) {
				if ((int)entry.getValue()<= n) {
					ans.put((String) entry.getKey(), (int) entry.getValue());
				}
			}
			System.err.println("danh sach anh tai top 23:");
			for (Map.Entry entry : ans.entrySet()) {
					System.out.println(entry.getKey());
			}
			return ans;
		}
	@Override
	public int compareTo(Cong_Dien o) {
		return 0;
	}

}
