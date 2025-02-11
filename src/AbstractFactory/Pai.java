package AbstractFactory;

public abstract class Pai{
	
	private String atrib1;
	private String atrib2;
	private String atrib3;
	
	
	public Pai(String atrib1, String atrib2, String atrib3) {
		super();
		this.atrib1 = atrib1;
		this.atrib2 = atrib2;
		this.atrib3 = atrib3;
	}
	
	public String getAtrib1() {
		return atrib1;
	}
	public void setAtrib1(String atrib1) {
		this.atrib1 = atrib1;
	}
	public String getAtrib2() {
		return atrib2;
	}
	public void setAtrib2(String atrib2) {
		this.atrib2 = atrib2;
	}
	public String getAtrib3() {
		return atrib3;
	}
	public void setAtrib3(String atrib3) {
		this.atrib3 = atrib3;
	}
	
	

}
