package alquiler;

public class Moto extends Vehiculo {

	
	//-----|Atributos|-----//
	
	private boolean portacaso=false; //True==Si tiene portacaso && False==No tiene portacaso
	public static int motosDisponibles=2;


	
	//-----|Metodos|-----//

	@Override
	public String toString() {
		return "Moto  " + this.getMarca() + " "+this.getModelo() + " "+ this.getMatricula() + " " + this.getEmpresaalquilado().getNombre() + " " + this.getDiasalquilado() + " dias restantes";
	}
	
	public String mostrarMotoSinAlquilar() {
		
		return "Moto  " + this.getMarca() + " "+this.getModelo() + " "+ this.getMatricula();
	}
	
	public String mostrarMotoAlquilados() {
		
		return "Moto  " + this.getMarca() + " "+this.getModelo() + " "+ this.getMatricula() + " " + this.getEmpresaalquilado().getNombre() + " " + this.getDiasalquilado() + " dias restantes";
	}
	
	//-----|Constructor|-----//

	public Moto(String matricula, String marca, String modelo, int caballos,boolean portacaso) {
		super(matricula, marca, modelo, caballos);
		this.portacaso = portacaso;
	}	
	
	//-----|Setters & Getters|-----//
	
	public boolean isPortacaso() {
		return portacaso;
	}

	public void setPortacaso(boolean portacaso) {
		this.portacaso = portacaso;
	}

	public static int getMotosDisponibles() {
		return motosDisponibles;
	}

	public static void setMotosDisponibles(int motosDisponibles) {
		Moto.motosDisponibles = motosDisponibles;
	}
	

	
	
	
	
	
}
