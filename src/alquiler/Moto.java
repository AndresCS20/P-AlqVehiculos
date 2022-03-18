package alquiler;

public class Moto extends Vehiculo {

	
	//-----|Atributos|-----//
	
	private boolean portacaso=false; //True==Si tiene portacaso && False==No tiene portacaso
	private int motosDisponibles=2;


	
	//-----|Metodos|-----//

	
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

	public int getMotosDisponibles() {
		return motosDisponibles;
	}

	public void setMotosDisponibles(int motosDisponibles) {
		this.motosDisponibles = motosDisponibles;
	}	
	
	
	
	
	
}
