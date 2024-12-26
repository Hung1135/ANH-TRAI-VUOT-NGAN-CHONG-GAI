import java.util.Iterator;
import java.util.LinkedList;

public class Nhom {
	 private String tenNhom;
	    private Bai_Hat baiHat;
	    private LinkedList<Anh_Tai> dsThanhVien;
	    private int diemBinhChonNhom;

	    public Nhom(String tenNhom, Bai_Hat baiHat, LinkedList<Anh_Tai> dsThanhVien, int diemBinhChonNhom) {
	        this.tenNhom = tenNhom;
	        this.baiHat = baiHat;
	        this.dsThanhVien = dsThanhVien;
	        this.diemBinhChonNhom = diemBinhChonNhom;
	    }

	    public LinkedList<Anh_Tai> getDsThanhVien() {
	        return dsThanhVien;
	    }

	    public void setDsThanhVien(LinkedList<Anh_Tai> dsThanhVien) {
	        this.dsThanhVien = dsThanhVien;
	    }

	    public String getTenNhom() {
	        return tenNhom;
	    }

	    public void setTenNhom(String tenNhom) {
	        this.tenNhom = tenNhom;
	    }

	    public Bai_Hat getBaiHat() {
	        return baiHat;
	    }

	    public void setBaiHat(Bai_Hat baiHat) {
	        this.baiHat = baiHat;
	    }

	    public int getDiemBinhChonNhom() {
	        return diemBinhChonNhom;
	    }

	    public void setDiemBinhChonNhom(int diemBinhChonNhom) {
	        this.diemBinhChonNhom = diemBinhChonNhom;
	    }

	    @Override
	    public String toString() {
	        return "Nhom [tenNhom=" + tenNhom + ", baiHat=" + baiHat + ", dsThanhVien=" + dsThanhVien
	                + ", diemBinhChonNhom="
	                + diemBinhChonNhom + "]";
	    }

//	   public LinkedList<Anh_Tai> loaiThanhVien(LinkedList<Anh_Tai> dsAnhTai, Anh_Tai anhtai){
//		   int index =-1;		  
//			for (Anh_Tai at : dsAnhTai) {
//				index++;
//				if(at.getNgheDanh().equals(anhtai.getNgheDanh())){
//					dsAnhTai.remove(index);
//				}
//		}
//		   return dsAnhTai;
//	   }
	    
	    
}
