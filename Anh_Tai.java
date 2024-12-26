import java.util.LinkedList;

public class Anh_Tai {
	private String ngheDanh, hoten;
	private int namSinh, namHoatDong;
	private LinkedList<String> dsNgheNghiep;
	   int diemBinhChon, diemHoaLuc;
	    
	    public Anh_Tai(String ngheDanh, String hoten, int namSinh, int namHoatDong, LinkedList<String> dsNgheNghiep,
	            int diemBinhChon, int diemHoaLuc) {
	        this.ngheDanh = ngheDanh;
	        this.hoten = hoten;
	        this.namSinh = namSinh;
	        this.namHoatDong = namHoatDong;
	        this.dsNgheNghiep = dsNgheNghiep;
	        this.diemBinhChon = diemBinhChon;
	        this.diemHoaLuc = diemHoaLuc;
	    }

	    @Override
	    public String toString() {
	        return "Anh_Tai [ngheDanh=" + ngheDanh + ", hoten=" + hoten + ", namSinh=" + namSinh + ", namHoatDong="
	                + namHoatDong + ", dsNgheNghiep=" + dsNgheNghiep + "]";
	    }


	    public int getDiemBinhChon() {
	        return diemBinhChon;
	    }

	    public void setDiemBinhChon(int diemBinhChon) {
	        this.diemBinhChon = diemBinhChon;
	    }

	    public int getDiemHoaLuc() {
	        return diemHoaLuc;
	    }

	    public void setDiemHoaLuc(int diemHoaLuc) {
	        this.diemHoaLuc = diemHoaLuc;
	    }

		public String getNgheDanh() {
			return ngheDanh;
		}

		public void setNgheDanh(String ngheDanh) {
			this.ngheDanh = ngheDanh;
		}
	  
	
}
