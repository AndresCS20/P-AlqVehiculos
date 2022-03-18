package alquiler;

public class Coche extends Vehiculo {

	
	//-----|Atributos|-----//
	
	private int numPuertas=0;
	public static int cochesDisponibles=7;


	
	
	//-----|Metodos|-----//

	public String mostrarCocheSinAlquilar() {
		
		return "Coche [Matricula="+this.getMatricula()+" | Marca="+this.getMarca()+" | Modelo="+this.getModelo()+" | Caballos="+this.getCaballos()+" | Numero de Puertas=" + numPuertas + "]";
		
	}
	
	public String mostrarCocheAlquilados() {
		
		return "Coche [Matricula="+this.getMatricula()+" | Marca="+this.getMarca()+" | Modelo="+this.getModelo()+" | Caballos="+this.getCaballos()+" | Numero de Puertas=" + numPuertas + " | Nombre Empresa="+this.getEmpresaalquilado().getNombre()+"| Dias Restantes="+this.getDiasalquilado()+"]";
		
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
