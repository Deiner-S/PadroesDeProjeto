package Builder;

public class Burger {
	
	private String carne;
	private String pao;
	private String salada;
	private String molho;
	
	@Override
	public String toString() {
		return "Burger [carne=" + carne + ", pao=" + pao + ", salada=" + salada + ", molho=" + molho + "]";
	}
	public String getCarne() {
		return carne;
	}
	public void setCarne(String carne) {
		this.carne = carne;
	}
	public String getPao() {
		return pao;
	}
	public void setPao(String pao) {
		this.pao = pao;
	}
	public String getSalada() {
		return salada;
	}
	public void setSalada(String salada) {
		this.salada = salada;
	}
	public String getMolho() {
		return molho;
	}
	public void setMolho(String molho) {
		this.molho = molho;
	}
	
	

}
