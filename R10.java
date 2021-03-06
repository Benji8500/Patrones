package Prototype;

public class R10 implements iPrototype {
	
	private String tamano;
    private String cpu;
    private String memory;
    private Sim sim;
    private String versionAndroid;
    private String camara;
    private String bluetooth;
    private String cantidadDeMemoriasExternas;
    private String tipoBateria;
    private String accesorios;
    
    public R10() {
    	
    }
    
    
    
	public String getTamano() {
		return tamano;
	}



	public void setTamano(String tamano) {
		this.tamano = tamano;
	}



	public String getCpu() {
		return cpu;
	}



	public void setCpu(String cpu) {
		this.cpu = cpu;
	}



	public String getMemory() {
		return memory;
	}



	public void setMemory(String memory) {
		this.memory = memory;
	}



	public Sim getSim() {
		return sim;
	}



	public void setSim(Sim sim) {
		this.sim = sim;
	}



	public String getVersionAndroid() {
		return versionAndroid;
	}



	public void setVersionAndroid(String versionAndroid) {
		this.versionAndroid = versionAndroid;
	}



	public String getCamara() {
		return camara;
	}



	public void setCamara(String camara) {
		this.camara = camara;
	}



	public String getBluetooth() {
		return bluetooth;
	}



	public void setBluetooth(String bluetooth) {
		this.bluetooth = bluetooth;
	}



	public String getCantidadDeMemoriasExternas() {
		return cantidadDeMemoriasExternas;
	}



	public void setCantidadDeMemoriasExternas(String cantidadDeMemoriasExternas) {
		this.cantidadDeMemoriasExternas = cantidadDeMemoriasExternas;
	}



	public String getTipoBateria() {
		return tipoBateria;
	}



	public void setTipoBateria(String tipoBateria) {
		this.tipoBateria = tipoBateria;
	}



	public String getAccesorios() {
		return accesorios;
	}



	public void setAccesorios(String accesorios) {
		this.accesorios = accesorios;
	}



	@Override
	public Object clone() {
		R10 objClone = new R10();
		objClone.setTamano(this.tamano);
		objClone.setCpu(this.cpu);
		objClone.setMemory(this.memory);
		objClone.setSim(this.sim);
		objClone.setVersionAndroid(this.versionAndroid);
		objClone.setCamara(this.camara);
		objClone.setBluetooth(this.bluetooth);
		objClone.setCantidadDeMemoriasExternas(this.cantidadDeMemoriasExternas);
		objClone.setTipoBateria(this.tipoBateria);
		objClone.setAccesorios(this.accesorios);

		return objClone;
	}
	
	 public void showInformation(){
	        System.out.println("***********************");
	        System.out.println("tamano: "+tamano);
	        System.out.println("cpu: "+cpu);
	        System.out.println("memory: "+memory);
	        System.out.println("Empresa telefonia: "+sim.getEmpresaTel());
	        System.out.println("Numero: "+sim.getNumTel());
	        System.out.println("versionAndroid: "+versionAndroid);
	        System.out.println("camara: "+camara);
	        System.out.println("bluetooth: "+bluetooth);
	        System.out.println("cantidadDeMemoriasExternas: "+cantidadDeMemoriasExternas);
	        System.out.println("factura: "+cantidadDeMemoriasExternas);
	        System.out.println("tipoBateria:"+ tipoBateria);
	        System.out.println("accesorios: "+ accesorios);
	    }

}
