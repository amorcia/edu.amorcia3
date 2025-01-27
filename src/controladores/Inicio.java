package controladores;

import java.util.ArrayList;
import java.util.Scanner;

import dtos.ElementoDto;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.OperativaImplementacion;
import servicios.OperativaInterfaz;

/**
 * Clase Inicio, encargada del metodo main y las llamadas a los otros metodos
 * @author amorcia
 * 27/01/2025
 */
public class Inicio {
	//Generador de id
	public static long idAuxiliar = 0;
	//Scanner
	public static Scanner scanner = new Scanner(System.in);
	//ArrayList
	public static ArrayList<ElementoDto> elementos = new ArrayList<ElementoDto>();
	
	/**
	 * Método main, encargado de ejecutar toda la lógica de nuestro programa y mostrarlo por consola
	 * @author amorcia
	 * 27/01/2025
	 * @param args, parametros de configuración
	 */
	public static void main(String[] args) {
		MenuInterfaz menu = new MenuImplementacion();
		OperativaInterfaz operativa = new OperativaImplementacion();
		boolean esCerrado = false;
		
		do {
			byte opcionUsuario = menu.mostrarMenuYSeleccionarOpcion();
			
			switch (opcionUsuario) {
			case 0:
				System.out.println("Cerrando menú...");
				esCerrado = true;
				break;
			case 1:
				operativa.altaElemento();
				break;
			case 2:
				operativa.modificarElemento();
				break;
			case 3:
				operativa.bajaElemento();
				break;

			default:
				System.out.println("Opción inexistente");
				break;
			}
			
		} while (!esCerrado);

	}

}
