package alquiler;

public class Furgoneta extends Vehiculo {

	
	//-----|Atributos|-----//
	
	private double capacidad=0; //Litros
	public static int furgonetasDisponibles=3;


	
	//-----|Metodos|-----//

	
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
