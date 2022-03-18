package alquiler;

public class Vehiculo {

	
	//-----|Atributos|-----//
	
	private String matricula="";
	private String marca="";
	private String modelo="";
	private int caballos;
	private boolean alquilado=false;
	private int diasalquilado=0;
	private Empresa empresaalquilado=null;
	
	//-----|Metodos|-----//

	
	//-----|Constructor|-----//

	public Vehiculo(String matricula, String marca, String modelo, int caballos) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.caballos = caballos;
	}	
	
	public Vehiculo() {
		super();
	}

	


	//-----|Setters & Getters|-----//
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCaballos() {
		return caballos;
	}
	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}
	public boolean isAlquilado() {
		return alquilado;
	}
	public void setAlquilado(boolean alquilado) {
		this.alquilado = alquilado;
	}
	public int getDiasalquilado() {
		return diasalquilado;
	}
	public void setDiasalquilado(int diasalquilado) {
		this.diasalquilado = diasalquilado;
	}
	
	
}
