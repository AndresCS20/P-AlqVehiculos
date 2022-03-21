package alquiler;

public class Coche extends Vehiculo {

	
	//-----|Atributos|-----//
	
	private int numPuertas=0;
	public static int cochesDisponibles=7;


	
	
	//-----|Metodos|-----//

	@Override
	public String toString() {
		return "Coche " + this.getMarca() + " "+this.getModelo() + " "+ this.getMatricula() + " " + this.getEmpresaalquilado().getNombre() + " " + this.getDiasalquilado() + " dias restantes";
	}

	public String mostrarCocheSinAlquilar() {
		
		return "Coche " + this.getMarca() + " "+this.getModelo() + " "+ this.getMatricula();
	}
	
	public String mostrarCocheAlquilados() {
		
		return "Coche " + this.getMarca() + " "+this.getModelo() + " "+ this.getMatricula() + " " + this.getEmpresaalquilado().getNombre() + " " + this.getDiasalquilado() + " dias restantes";
	}
	//-----|Constructor|-----//

	public Coche(String matricula, String marca, String modelo, int caballos, int numPuertas) {
		super(matricula, marca, modelo, caballos);
		this.numPuertas = numPuertas;
	}	
	
	//-----|Setters & Getters|-----//

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}


	
	
	
}
