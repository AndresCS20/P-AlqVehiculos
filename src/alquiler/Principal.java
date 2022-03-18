package alquiler;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class Principal {

	public static Scanner scString=new Scanner(System.in);
	public static Scanner scInt=new Scanner(System.in);

	
	//----Datos Vehiculos----//
	public static Coche coche0=new Coche("4345AB","Opel","Astra",130,5);
	public static Coche coche1=new Coche("9090CD","Audi","A1",150,5);
	public static Coche coche2=new Coche("1234EF","Renault","Clio",100,3);
	public static Coche coche3=new Coche("4567GH","Audi","A5",140,5);
	public static Coche coche4=new Coche("8910IJ","Ford","Fieta",90,3);
	public static Coche coche5=new Coche("1011KL","Chevrolet","Camaro",200,3);
	public static Coche coche6=new Coche("1213MN","Ford","Mustang",200,3);
	public static Coche coches[]={coche0,coche1,coche2,coche3,coche4,coche5,coche6};
	
	public static Furgoneta furgoneta0=new Furgoneta("2002GF","Citroen","Berlingo",90,30.5);
	public static Furgoneta furgoneta1=new Furgoneta("5040FD","Renault","Kangoo",110,60.3);
	public static Furgoneta furgoneta2=new Furgoneta("2454LO","Mercedes-Benz","Sprinter",163,80.5);
	public static Furgoneta furgonetas[]={furgoneta0,furgoneta1,furgoneta2};
	
	public static Moto moto0=new Moto("9999XX","Yamaha","MT-10",166,true);
	public static Moto moto1=new Moto("1111AA","Ducati","Panigale",228,false);
	public static Moto motos[]={moto0,moto1};
	
	public static Vehiculo vehiculos[]={coche0,coche1,coche2,coche3,coche4,coche5,coche6,furgoneta0,furgoneta1,furgoneta2,moto0,moto1};
	
	//----Datos Empresas----//
	public static Empresa empresa0=new Empresa("Empresa01","9876584D");
	public static Empresa empresa1=new Empresa("Empresa02","9134353F");
	public static Empresa empresa2=new Empresa("Empresa03","4534533Q");
	public static Empresa empresa3=new Empresa("Empresa04","0004545E");
	public static Empresa empresa4=new Empresa("Empresa05","234242QD");
	public static Empresa empresa5=new Empresa("Empresa06","9154533A");
	public static Empresa empresas[]= {empresa0,empresa1,empresa2,empresa3,empresa4,empresa5};
	
	public static ArrayList<Vehiculo> vehiculosSinAlquilar = new ArrayList();
	
//	public static ArrayList<Vehiculo> vehiculosSinAlquilar = {coche0,coche1,coche2,coche3,coche4,coche5,coche6,furgoneta0,furgoneta1,furgoneta2,moto0,moto1};
	public static ArrayList<Vehiculo> vehiculosAlquilados = new ArrayList();

	public static void main(String[] args) {
		

		int dia=1;
		int opcionEmpresa=0;
		int diasAlquiler=0;
		int vehiculoEmpresa = 0;
		boolean subPrograma=true;
		String texto="";
		int opcion=0;
		//Inicio programa		
		for (int i=0; i<vehiculos.length; i++) {
			
			vehiculosSinAlquilar.add(vehiculos[i]);
		}
		
		while (true) {
			
			System.out.println("\t\tDia "+dia);
			

			//Alquiler empresas	
			while (subPrograma) {
			opcion=0;
			System.out.println("\t| Listado de Empresas | ");	
				
			for (int i=0; i<empresas.length; i++) {
				
				System.out.println("ID: "+i+ " | "+empresas[i]);
			}
			do {
				System.out.println("¿Que empresa quiere alquilar un Vehiculo? Introduce la id de la Empresa o -1 o -2 para mostrar informes.");
				opcion = introducirNumero(opcion);
			} while (opcion<-2 || opcion>empresas.length);
			
			opcionEmpresa=opcion;
			opcion=0;
			do {
				System.out.println("\t-|Elige el tipo de Vehiculo|-");
				System.out.println("1º| Coche");
				System.out.println("2º| Furgoneta");
				System.out.println("3º| Moto");		
				opcion = introducirNumero(opcion);	
				} while (opcion<0 && opcion>2);

			
			
			switch (opcion-1) {
			case 0:
				if (Coche.cochesDisponibles>0) {
				System.out.println("HAS ELEGIDO COCHE");
				System.out.println("Durante cuantos dias?");
				opcion=0;
				do {
					
					opcion = introducirNumero(opcion);
				}while(opcion<0);
				diasAlquiler=opcion;
				System.out.println("Numero de dias alquiler " + diasAlquiler);
				for (int i=0; i<vehiculos.length; i++) {
					
					if (vehiculos[i] instanceof Coche && !vehiculos[i].isAlquilado()) {
						
							
							vehiculoEmpresa=i;
							break;
							
					}

				}

					vehiculos[vehiculoEmpresa].setDiasalquilado(diasAlquiler);
					vehiculos[vehiculoEmpresa].setEmpresaalquilado(empresas[opcionEmpresa]);
					vehiculosSinAlquilar.remove(vehiculoEmpresa);
					vehiculosAlquilados.add(vehiculos[vehiculoEmpresa]);
					System.out.println("VSA: "+vehiculosSinAlquilar.size() +" | VA: "+vehiculosAlquilados.size());
				
				Coche.cochesDisponibles--;
				System.out.println("Quedan "+Coche.cochesDisponibles+" Furgonetas disponibles");
				}
				else System.err.println("ERROR: No hay Motos disponibles para alquilar");
				break;
			case 1:
				if (Furgoneta.furgonetasDisponibles>0) {
				System.out.println("HAS ELEGIDO FURGONETA");
				System.out.println("Durante cuantos dias?");
				opcion=0;
				do {
					
					opcion = introducirNumero(opcion);
				}while(opcion<0);
				diasAlquiler=opcion;
				System.out.println("Numero de dias alquiler " + diasAlquiler);
				for (int i=0; i<vehiculos.length; i++) {
					
					if (vehiculos[i] instanceof Furgoneta && !vehiculos[i].isAlquilado()) {
							vehiculoEmpresa=i;
							break;
					}
				}

					vehiculos[vehiculoEmpresa].setDiasalquilado(diasAlquiler);//Tal ves malo
					vehiculos[vehiculoEmpresa].setEmpresaalquilado(empresas[opcionEmpresa]);
					vehiculosSinAlquilar.remove(vehiculoEmpresa);
					vehiculosAlquilados.add(vehiculos[vehiculoEmpresa]);
					System.out.println("VSA: "+vehiculosSinAlquilar.size() +" | VA: "+vehiculosAlquilados.size());
				
					Furgoneta.furgonetasDisponibles--;
				System.out.println("Quedan "+Furgoneta.furgonetasDisponibles+" Furgonetas disponibles");
			}
			else System.err.println("ERROR: No hay Motos disponibles para alquilar");
				break;
			case 2:
				if (Moto.motosDisponibles>0) {
				System.out.println("HAS ELEGIDO MOTO ");
				System.out.println("Durante cuantos dias?");
				opcion=0;
				do {
					
					opcion = introducirNumero(opcion);
				}while(opcion<0);
				diasAlquiler=opcion;
				System.out.println("Numero de dias alquiler " + diasAlquiler);
				for (int i=0; i<vehiculos.length; i++) {
					
					if (vehiculos[i] instanceof Moto && !vehiculos[i].isAlquilado()) {						
							vehiculoEmpresa=i;
							break;		
					}
				}

					vehiculos[vehiculoEmpresa].setDiasalquilado(diasAlquiler);//Tal ves malo
					vehiculos[vehiculoEmpresa].setEmpresaalquilado(empresas[opcionEmpresa]);
					vehiculosSinAlquilar.remove(vehiculoEmpresa);
					vehiculosAlquilados.add(vehiculos[vehiculoEmpresa]);
					System.out.println("VSA: "+vehiculosSinAlquilar.size() +" | VA: "+vehiculosAlquilados.size());
				
					Moto.motosDisponibles--;
				System.out.println("Quedan "+Moto.motosDisponibles+" Furgonetas disponibles");
				}
				else System.err.println("ERROR: No hay Motos disponibles para alquilar");
				break;
			default:
				System.out.println("ERROR: Numero Introducido no coincide con una opcion");
				break;
			}
						
			
			System.out.println("Pulsa enter para volver a alquilar una vehiculo o introduce 'Parar' para salir del proceso de Alquiler");
			texto=scString.nextLine();
			if (texto.equalsIgnoreCase("Parar")) {
						break;
			}	
				
			}
			
			texto="";
			//Terminar Programa
			System.out.println("Introduce Stop para detener el programa o pulsa Enter para pasar de dia.");
			texto=scString.nextLine();
			if (texto.equalsIgnoreCase("Stop")) {
				
				System.out.println("\t\n|X| Has decidido terminar el programa despues de " + dia + " dias funcionando. |X|");
				break;
			}
			
			dia++;
			
		}
		

	}

	private static int introducirNumero(int opcion) {
		String texto;
		try {
			texto=scString.nextLine();
			opcion=Integer.valueOf(texto);
		} catch (NumberFormatException e) {
			System.err.println("ERROR: No has introducido un numero");
		}
		return opcion;
	}

}
