
public class Bai_Hat {
	private String tenBaiHat, nhacSi, hoaAmPhoiKhi, yeuCau;

	    public Bai_Hat(String tenBaiHat, String nhacSi, String hoaAmPhoiKhi, String yeuCau) {
	        this.tenBaiHat = tenBaiHat;
	        this.nhacSi = nhacSi;
	        this.hoaAmPhoiKhi = hoaAmPhoiKhi;
	        this.yeuCau = yeuCau;
	    }
	    public Bai_Hat(String tenBaiHat) {
	        this.tenBaiHat = tenBaiHat;  
	    }

	    @Override
	    public String toString() {
	        return "\tBai_Hat:" + tenBaiHat + ", nhacSi=" + nhacSi + ", hoaAmPhoiKhi=" + hoaAmPhoiKhi + ", yeuCau="
	                + yeuCau ;
	    }
}
