package servicios;

import controladores.Inicio;

/**
 * Clase encargada de llevar la lógica del menú para mostrarlo y para guardar y dar una opción
 * @author amorcia
 * 27/01/2025
 */
public class MenuImplementacion implements MenuInterfaz {

	@Override
	public byte mostrarMenuYSeleccionarOpcion() {
		System.out.println("--------MENÚ--------");
		System.out.println("0. Cerrar menú");
		System.out.println("1. Dar de alta un nuevo elemento");
		System.out.println("2. Modificar la cantidad existente de un elemento");
		System.out.println("3. Eliminar un elemento");
		System.out.println("------------------");
		System.out.println("Seleccione la opción deseada: ");
		byte opcionUsuario = Inicio.scanner.nextByte();
		return opcionUsuario;
	}

}
