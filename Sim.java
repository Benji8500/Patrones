package Prototype;

public class Sim {
	private String empresaTel;
	private String numTel;
	
	public Sim() {
		
	}
	
	public Sim(String tel, String num) {
		this.empresaTel=tel;
		this.numTel=num;
	}
	public String getEmpresaTel() {
		return empresaTel;
	}
	public void setEmpresaTel(String empresaTel) {
		this.empresaTel = empresaTel;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	
	

}
