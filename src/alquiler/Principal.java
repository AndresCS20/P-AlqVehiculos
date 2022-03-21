package alquiler;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class Principal {

	public static Scanner scString = new Scanner(System.in);
	public static Scanner scInt = new Scanner(System.in);

	// ----Datos Vehiculos----//
	public static Coche coche0 = new Coche("4345AB", "Opel", "Astra", 130, 5);
	public static Coche coche1 = new Coche("9090CD", "Audi", "A1", 150, 5);
	public static Coche coche2 = new Coche("1234EF", "Renault", "Clio", 100, 3);
	public static Coche coche3 = new Coche("4567GH", "Audi", "A5", 140, 5);
	public static Coche coche4 = new Coche("8910IJ", "Ford", "Fieta", 90, 3);
	public static Coche coche5 = new Coche("1011KL", "Chevrolet", "Camaro", 200, 3);
	public static Coche coche6 = new Coche("1213MN", "Ford", "Mustang", 200, 3);
	public static Coche coches[] = { coche0, coche1, coche2, coche3, coche4, coche5, coche6 };

	public static Furgoneta furgoneta0 = new Furgoneta("2002GF", "Citroen", "Berlingo", 90, 30.5);
	public static Furgoneta furgoneta1 = new Furgoneta("5040FD", "Renault", "Kangoo", 110, 60.3);
	public static Furgoneta furgoneta2 = new Furgoneta("2454LO", "Mercedes-Benz", "Sprinter", 163, 80.5);
	public static Furgoneta furgonetas[] = { furgoneta0, furgoneta1, furgoneta2 };

	public static Moto moto0 = new Moto("9999XX", "Yamaha", "MT-10", 166, true);
	public static Moto moto1 = new Moto("1111AA", "Ducati", "Panigale", 228, false);
	public static Moto motos[] = { moto0, moto1 };

	public static Vehiculo vehiculos[] = { coche0, coche1, coche2, coche3, coche4, coche5, coche6, furgoneta0,
			furgoneta1, furgoneta2, moto0, moto1 };

	// ----Datos Empresas----//
	public static Empresa empresa0 = new Empresa("Empresa01", "9876584D");
	public static Empresa empresa1 = new Empresa("Empresa02", "9134353F");
	public static Empresa empresa2 = new Empresa("Empresa03", "4534533Q");
	public static Empresa empresa3 = new Empresa("Empresa04", "0004545E");
	public static Empresa empresa4 = new Empresa("Empresa05", "234242QD");
	public static Empresa empresa5 = new Empresa("Empresa06", "9154533A");
	public static Empresa empresas[] = { empresa0, empresa1, empresa2, empresa3, empresa4, empresa5 };

	public static ArrayList<Vehiculo> vehiculosSinAlquilar = new ArrayList();
	public static ArrayList<Vehiculo> vehiculosAlquilados = new ArrayList();

	public static void main(String[] args) {

		int dia = 1;
		int opcionEmpresa = 0;
		int diasAlquiler = 0;
		int vehiculoEmpresa = 0;
		boolean subPrograma = true;
		Vehiculo vehiculoalquilar = null;
		String texto = "";
		int opcion = 0;

		// Inicio programa
		for (int i = 0; i < vehiculos.length; i++) {

			vehiculosSinAlquilar.add(vehiculos[i]);
		}

		while (true) {

			System.out.println("\t\tDia " + dia);

			// Alquiler empresas
			while (subPrograma) {
				opcion = 0;
				System.out.println("\t| Listado de Empresas | ");

				for (int i = 0; i < empresas.length; i++) {

					System.out.println("ID: " + (i+1) + " | " + empresas[i]);
				}
				do {
					System.out.println(
							"¿Que empresa quiere alquilar un Vehiculo? Introduce la id de la Empresa, -1 y -2 para mostrar informes o -3 para pasar de dia.");
					opcion = introducirNumero(opcion);
				} while (opcion < -3 || opcion > empresas.length);
				if (opcion == -3) {

					System.out.println("Pasando de dia...");
					break;
				}
				// Inicio de Alquiler de Vehiculos
				if (opcion >= 0) {
					opcionEmpresa = opcion-1;
					opcion = 0;
					do {
						System.out.println("\t-|Elige el tipo de Vehiculo|-");
						System.out.println("1º| Coche");
						System.out.println("2º| Furgoneta");
						System.out.println("3º| Moto");
						opcion = introducirNumero(opcion);
					} while (opcion < 0 && opcion > 2);

					switch (opcion - 1) {
					// Alquiler de Coches
					case 0:
						if (Coche.cochesDisponibles > 0) {
							System.out.println("HAS ELEGIDO COCHE");
							System.out.println("Durante cuantos dias?");
							opcion = 0;
							do {

								opcion = introducirNumero(opcion);
							} while (opcion < 1);
							diasAlquiler = opcion;
							System.out.println("Numero de dias alquiler " + diasAlquiler);
							for (int i = 0; i < vehiculosSinAlquilar.size(); i++) {
								if (vehiculosSinAlquilar.get(i) instanceof Coche
										&& !vehiculosSinAlquilar.get(i).isAlquilado()) {
									vehiculoalquilar = vehiculosSinAlquilar.get(i);
									vehiculosSinAlquilar.remove(i);
									break;
								}
							}
							vehiculoalquilar.setAlquilado(true);
							vehiculoalquilar.setDiasalquilado(diasAlquiler);
							vehiculoalquilar.setEmpresaalquilado(empresas[opcionEmpresa]);
							vehiculosAlquilados.add(vehiculoalquilar);
							Coche.cochesDisponibles--;
							System.out.println("Quedan " + Coche.cochesDisponibles + " Coches disponibles");
						} else
							System.err.println("ERROR: No hay Coches disponibles para alquilar");
						break;
					// Alquiler de Furgonetas
					case 1:
						if (Furgoneta.furgonetasDisponibles > 0) {
							System.out.println("HAS ELEGIDO FURGONETA");
							System.out.println("Durante cuantos dias?");
							opcion = 0;
							do {
								opcion = introducirNumero(opcion);
							} while (opcion < 1);
							diasAlquiler = opcion;
							System.out.println("Numero de dias alquiler " + diasAlquiler);
							for (int i = 0; i < vehiculosSinAlquilar.size(); i++) {
								if (vehiculosSinAlquilar.get(i) instanceof Furgoneta
										&& !vehiculosSinAlquilar.get(i).isAlquilado()) {
									vehiculoalquilar = vehiculosSinAlquilar.get(i);
									vehiculosSinAlquilar.remove(i);
									break;
								}
							}
							vehiculoalquilar.setAlquilado(true);
							vehiculoalquilar.setDiasalquilado(diasAlquiler);
							vehiculoalquilar.setEmpresaalquilado(empresas[opcionEmpresa]);
							vehiculosAlquilados.add(vehiculoalquilar);
							Furgoneta.furgonetasDisponibles--;
							System.out.println("Quedan " + Furgoneta.furgonetasDisponibles + " Furgonetas disponibles");
						} else
							System.err.println("ERROR: No hay Furgonetas disponibles para alquilar");
						break;
					// Alquiler de Motos
					case 2:
						if (Moto.motosDisponibles > 0) {
							System.out.println("HAS ELEGIDO MOTO ");
							System.out.println("Durante cuantos dias?");
							opcion = 0;
							do {
								opcion = introducirNumero(opcion);
							} while (opcion <1);
							diasAlquiler = opcion;
							System.out.println("Numero de dias alquiler " + diasAlquiler);
							for (int i = 0; i < vehiculosSinAlquilar.size(); i++) {
								if (vehiculosSinAlquilar.get(i) instanceof Moto
										&& !vehiculosSinAlquilar.get(i).isAlquilado()) {
									vehiculoalquilar = vehiculosSinAlquilar.get(i);
									vehiculosSinAlquilar.remove(i);
									break;
								}
							}
							vehiculoalquilar.setAlquilado(true);
							vehiculoalquilar.setDiasalquilado(diasAlquiler);
							vehiculoalquilar.setEmpresaalquilado(empresas[opcionEmpresa]);
							vehiculosAlquilados.add(vehiculoalquilar);
							Moto.motosDisponibles--;
							System.out.println("Quedan " + Moto.motosDisponibles + " Motos disponibles");
						} else
							System.err.println("ERROR: No hay Motos disponibles para alquilar");
						break;
					default:
						System.out.println("ERROR: Numero Introducido no coincide con una opcion");
						break;
					}
				}

				// Mostrar la Primera Lista de Vehiculos sin Alquilar y Alquilados
				if (opcion == -1) {

					System.out.println("\t\t\t\tPrimera Lista");
					if (vehiculosSinAlquilar.size() > 0) {
						System.out.println("\t\t\t---| Vehiculos Sin Alquilar |---");
						for (int i = 0; i < vehiculosSinAlquilar.size(); i++) {

							if (vehiculosSinAlquilar.get(i) instanceof Coche) {
								System.out.println(((Coche) vehiculosSinAlquilar.get(i)).mostrarCocheSinAlquilar());
							}

							if (vehiculosSinAlquilar.get(i) instanceof Furgoneta) {
								System.out.println(
										((Furgoneta) vehiculosSinAlquilar.get(i)).mostrarFurgonetaSinAlquilar());
							}

							if (vehiculosSinAlquilar.get(i) instanceof Moto) {
								System.out.println(((Moto) vehiculosSinAlquilar.get(i)).mostrarMotoSinAlquilar());
							}
						}
					} else
						System.out.println("\n\t\t\t---| No hay Vehiculos sin Alquilar |---\n");
					if (vehiculosAlquilados.size() > 0) {
						System.out.println("\n\t\t\t---| Vehiculos Alquilados |---");
						for (int i = 0; i < vehiculosAlquilados.size(); i++) {

							if (vehiculosAlquilados.get(i) instanceof Coche) {
								System.out.println(((Coche) vehiculosAlquilados.get(i)).mostrarCocheAlquilados());
							}

							if (vehiculosAlquilados.get(i) instanceof Furgoneta) {
								System.out
										.println(((Furgoneta) vehiculosAlquilados.get(i)).mostrarFurgonetaAlquilados());
							}

							if (vehiculosAlquilados.get(i) instanceof Moto) {
								System.out.println(((Moto) vehiculosAlquilados.get(i)).mostrarMotoAlquilados());
							}
						}
					} else
						System.out.println("\n\t\t\t---| No hay Vehiculos Alquilados |---\n");
					break;
				}

				// Ordenar y Mostrar la Segunda Lista

				if (opcion == -2) {
					if (vehiculosAlquilados.size() > 0) {
						System.out.println("\n\t\t\t---| Vehiculos Alquilados |---");
						mostrarSegundaLista();
					} else
						System.out.println("\n\t\t\t---| No hay Vehiculos Alquilados |---\n");

					break;
				
				}
			}
			// Quitar dias a los coches alquilados y quitar los coches alquilados que ya
			// hayan terminado su alquiler

			cambioDia();

			// Terminar Programa
			texto = "";
			System.out.println("Introduce Stop para detener el programa o pulsa Enter para pasar de dia.");
			texto = scString.nextLine();
			if (texto.equalsIgnoreCase("Stop")) {

				System.out.println(
						"\t\n|X| Has decidido terminar el programa despues de " + dia + " dias funcionando. |X|");
				break;
			}

			dia++;

		}

	}

	private static void cambioDia() {
		for (int i = 0; i < vehiculosAlquilados.size(); i++) {

			if (vehiculosAlquilados.get(i).getDiasalquilado() > 0) {

				vehiculosAlquilados.get(i).setDiasalquilado(vehiculosAlquilados.get(i).getDiasalquilado() - 1);

			}

			else {

				vehiculosAlquilados.get(i).setAlquilado(false);
				vehiculosAlquilados.get(i).setEmpresaalquilado(null);
				vehiculosSinAlquilar.add(vehiculosAlquilados.get(i));
				vehiculosAlquilados.remove(i);

			}

		}
	}

	public static void mostrarSegundaLista() {
		ArrayList<Vehiculo> segundaLista = new ArrayList<Vehiculo>();
		segundaLista.addAll(vehiculosAlquilados);
		Comparator<Vehiculo> comparador = new Comparator<Vehiculo>() {
			@Override
			public int compare(Vehiculo vehiculo0, Vehiculo vehiculo1) {
				return vehiculo0.getDiasalquilado() - vehiculo1.getDiasalquilado();
			}
		};
		Collections.sort(segundaLista, comparador);

		for(int i=0; i<segundaLista.size(); i++) {
			System.out.println(segundaLista.get(i));
		}

	}

	private static int introducirNumero(int opcion) {
		String texto;
		try {
			texto = scString.nextLine();
			opcion = Integer.valueOf(texto);
		} catch (NumberFormatException e) {
			System.err.println("ERROR: No has introducido un numero");
		}
		return opcion;
	}

}
