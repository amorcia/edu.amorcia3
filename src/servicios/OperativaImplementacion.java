package servicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import controladores.Inicio;
import dtos.ElementoDto;

/**
 * Clase encargada de la lógica de los métodos de la funcionalidad 
 * para dar de alta, modificar algo o dar de baja
 * @author amorcia
 * 27/01/2025
 */
public class OperativaImplementacion implements OperativaInterfaz {

	@Override
	public void altaElemento() {
		System.out.println("Introduzca el nombre del elemento: ");
		String nombre = Inicio.scanner.next();
		System.out.println("Introduzca la descripción del elemento: ");
		Inicio.scanner.nextLine();
		String descripcion = Inicio.scanner.nextLine();
		System.out.println("Introduzca la cantidad existente del elemento: ");
		int cantidad = Inicio.scanner.nextInt();
		
		ElementoDto elemento = new ElementoDto(nombre,descripcion,cantidad);
		Inicio.elementos.add(elemento);
		System.out.println("Su id sera: " + elemento.getIdElemento());
		System.out.println("Su codigo sera: ".concat(elemento.getCodigoElemento()).concat("\n"));
		
		for(ElementoDto mostrarElementos : Inicio.elementos) {
			if(mostrarElementos.isEsValido() == true) {
				System.out.println(mostrarElementos.toString());
			}
		}
	}

	@Override
	public void modificarElemento() {
		System.out.println("Introduzca el codigo del elemento a modificar: ");
		String codigoAVerificar = Inicio.scanner.next();
		for(ElementoDto mostrarElementos : Inicio.elementos) {
			String codigo = mostrarElementos.getCodigoElemento();
			if(codigo.equals(codigoAVerificar)) {
				System.out.println("Modifique la cantidad sumando o restando: ".concat("\n"));
				int cantidadAAñadir = Inicio.scanner.nextInt();
				int cantidadAModificar = mostrarElementos.getCantidadElemento();
				int totalElementos = cantidadAModificar + cantidadAAñadir;
				mostrarElementos.setCantidadElemento(totalElementos);
			}else {
				System.out.println("Código inexistente".concat("\n"));
			}
		}
		
		for(ElementoDto mostrarElementos : Inicio.elementos) {
			if(mostrarElementos.isEsValido() == true) {
				System.out.println(mostrarElementos.toString());
			}
		}

	}

	@Override
	public void bajaElemento() {
		System.out.println("Introduzca el codigo del elemento a modificar: ".concat("\n"));
		String codigoABorrar = Inicio.scanner.next();
		for(ElementoDto mostrarElementos : Inicio.elementos) {
			String codigo = mostrarElementos.getCodigoElemento();
			if(codigo.equals(codigoABorrar)) {
				mostrarElementos.setFchBaja(LocalDateTime.now());
				mostrarElementos.setEsValido(false);
			}else {
				System.out.println("Código inexistente".concat("\n"));
			}
		}
		
		for(ElementoDto mostrarElementos : Inicio.elementos) {
			if(mostrarElementos.isEsValido() == true) {
				System.out.println(mostrarElementos.toString());
			}
		}
	}
}
