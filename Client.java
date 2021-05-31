package Prototype;

public class Client {

	public static void main(String[] args) {
		R10 Samsung1 = new R10();
		Samsung1.setTamano("5.7");
		Samsung1.setCpu("SD 430");
		Samsung1.setMemory("6GB");
		Samsung1.setVersionAndroid("11.1");
		Samsung1.setCamara("13MP");
		Samsung1.setBluetooth("5.0");
		Samsung1.setCantidadDeMemoriasExternas("2");
		Samsung1.setAccesorios("");
		Samsung1.setSim(new Sim("",""));
		
		
		R10 SamsungReal1 = (R10) Samsung1.clone();
		SamsungReal1.setAccesorios("Audifonos, Estuche");
		SamsungReal1.setSim(new Sim("Tigo","624808888"));

		R10 SamsungReal2 = (R10) Samsung1.clone();
		SamsungReal2.setAccesorios("Cargador, Estuche");
		SamsungReal2.setSim(new Sim("Entel","33344999"));

		
		R10 SamsungReal3 = (R10) Samsung1.clone();
		SamsungReal3.setAccesorios("Estuche");
		SamsungReal3.setSim(new Sim("Viva","72340812"));

		
		SamsungReal1.showInformation();
		SamsungReal2.showInformation();
		SamsungReal3.showInformation();

		
		


	}

}
