import java.util.LinkedList;

public class Chuong_Trinh {
	private int lanToChuc;
	private  LinkedList<Anh_Tai> dsAnhTai;
	    public Chuong_Trinh(int lanToChuc, LinkedList<Anh_Tai> dsAnhTai) {
	        this.lanToChuc = lanToChuc;
	        this.dsAnhTai = dsAnhTai;
	    }


	  public void printAnhTai(){
	    //System.out.println("lan to chuc "+lanToChuc);
	    System.out.println("Danh Sach Anh Tai");
	    for (Anh_Tai anh_Tai : dsAnhTai) {
	        System.out.println(anh_Tai);
	    }
	  }

	  //n la diem binh chon, k la diem hoa luc
	  public void setDiemAnhTai(Anh_Tai anhtai, int n, int k){
	    anhtai.setDiemBinhChon(n);
	    anhtai.setDiemHoaLuc(k);
	   
	}
	  //in diem
	public void printdiem(){
	 for (Anh_Tai anhtai : dsAnhTai) {
	  System.out.println(anhtai.toString()+"\tdiem binh chon: "+ anhtai.getDiemBinhChon() + 
	  "\tdiem hoa luc:"+ anhtai.getDiemHoaLuc());
	 }
	} 
	
	
	
}
