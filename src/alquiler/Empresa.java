package alquiler;
import java.util.ArrayList;
import java.util.Scanner;
public class Empresa {
	
	//-----|Atributos|-----//
	
	private String nombre="";
	private String CIF="";
	private ArrayList<Vehiculo>vehiculoAlquilados=new ArrayList();

	
	//-----|Metodos|-----//

	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", CIF=" + CIF + "]";
	}	
	
	
//	public static void alquilerVehiculo(int opcion,Vehiculo vehiculos[]) {
//	Scanner scString=new Scanner(System.in);
//	int opcionMenu=0;
//	String texto="";
//	do {
//		System.out.println("\t-|Elige el tipo de Vehiculo|-");
//		System.out.println("1º| Coche");
//		System.out.println("2º| Furgoneta");
//		System.out.println("3º| Moto");		
//	
//		try {
//			texto=scString.nextLine();
//			opcionMenu=Integer.valueOf(texto);
//		} catch (NumberFormatException e) {
//			System.err.println("ERROR: No has introducido un numero");
//		}	} while (opcionMenu<0 && opcionMenu>2);
//
//	
//	
//	switch (opcionMenu-1) {
//	case 0:
//		System.out.println("HAS ELEGIDO COCHE");
//		Coche.cochesDisponibles--;
//		System.out.println(Coche.cochesDisponibles);
//		break;
//	case 1:
//		System.out.println("HAS ELEGIDO FURGONETA");
//		break;
//	case 2:
//		System.out.println("HAS ELEGIDO MOTO ");
//		break;
//	default:
//		break;
//	}
//	
//	}



	
	
	
	//-----|Constructor|-----//

	public Empresa(String nombre, String cIF) {
		super();
		this.nombre = nombre;
		CIF = cIF;
	}	
	
	//-----|Setters & Getters|-----//
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCIF() {
		return CIF;
	}
	public void setCIF(String cIF) {
		CIF = cIF;
	}

	
	
}
