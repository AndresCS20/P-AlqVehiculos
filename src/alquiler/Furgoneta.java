package alquiler;

public class Furgoneta extends Vehiculo {

	
	//-----|Atributos|-----//
	
	private double capacidad=0; //Litros
	public static int furgonetasDisponibles=3;


	
	//-----|Metodos|-----//

	
	@Override
	public String toString() {
		return "Furgoneta  " + this.getMarca() + " "+this.getModelo() + " "+ this.getMatricula() + " " + this.getEmpresaalquilado().getNombre() + " " + this.getDiasalquilado() + " dias restantes";
	}
	
	
	public String mostrarFurgonetaSinAlquilar() {
		
		return "Furgoneta " + this.getMarca() + " "+this.getModelo() + " "+ this.getMatricula();
	}
	
	public String mostrarFurgonetaAlquilados() {
		
		return "Furgoneta  " + this.getMarca() + " "+this.getModelo() + " "+ this.getMatricula() + " " + this.getEmpresaalquilado().getNombre() + " " + this.getDiasalquilado() + " dias restantes";
	}
	
	
	//-----|Constructor|-----//

	public Furgoneta(String matricula, String marca, String modelo, int caballos,double capacidad) {
		super(matricula, marca, modelo, caballos);
		this.capacidad = capacidad;
	}
	
	
	
	
	//-----|Setters & Getters|-----//
	
	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}




	public static int getFurgonetasDisponibles() {
		return furgonetasDisponibles;
	}




	public static void setFurgonetasDisponibles(int furgonetasDisponibles) {
		Furgoneta.furgonetasDisponibles = furgonetasDisponibles;
	}
	
	
}
