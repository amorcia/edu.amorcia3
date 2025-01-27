package dtos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import controladores.Inicio;

/**
 * Clase encargada de generar un dto para guardar valores que se pasaran a una lista
 * @author amorcia
 * 27/01/2025
 */
public class ElementoDto {
	long idElemento;
	String codigoElemento = "aaaaa";
	String nombreElemento = "aaaaa";
	String descripcionElemento = "aaaaa";
	int cantidadElemento = 0;
	boolean esValido = true;
	//formato fecha
	DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	String fechaPorDefecto = "9999-12-31 23:59";
	LocalDateTime fchAlta = LocalDateTime.parse(fechaPorDefecto, formato);
	LocalDateTime fchBaja = LocalDateTime.parse(fechaPorDefecto, formato);
	
	/**
	 * Constructor encargado de generar id, dar valor a variables y poner la fecha del alta
	 * @author amorcia
	 * 27/01/2025
	 * 
	 * @param nombreElemento, pasamos el nombre del elemento que el usuario nos da
	 * @param descripcionElemento, pasamos la descripción del elemento que el usuario nos da
	 * @param cantidadElemento, pasamos la cantidad del elemento que el usuario nos da
	 */
	public ElementoDto(String nombreElemento, String descripcionElemento,
			int cantidadElemento) {
		super();
		this.idElemento = Inicio.idAuxiliar + 1;
		Inicio.idAuxiliar = this.idElemento;
		this.nombreElemento = nombreElemento;
		this.codigoElemento = this.nombreElemento.substring(0,3) + this.idElemento;
		this.descripcionElemento = descripcionElemento;
		this.cantidadElemento = cantidadElemento;
		this.fchAlta = LocalDateTime.now();
	}
	
	public long getIdElemento() {
		return idElemento;
	}
	public String getCodigoElemento() {
		return codigoElemento;
	}
	public void setCodigoElemento(String codigoElemento) {
		this.codigoElemento = codigoElemento;
	}
	public String getNombreElemento() {
		return nombreElemento;
	}
	public void setNombreElemento(String nombreElemento) {
		this.nombreElemento = nombreElemento;
	}
	public String getDescripcionElemento() {
		return descripcionElemento;
	}
	public void setDescripcionElemento(String descripcionElemento) {
		this.descripcionElemento = descripcionElemento;
	}
	public int getCantidadElemento() {
		return cantidadElemento;
	}
	public void setCantidadElemento(int cantidadElemento) {
		this.cantidadElemento = cantidadElemento;
	}
	public LocalDateTime getFchAlta() {
		return fchAlta;
	}
	public LocalDateTime getFchBaja() {
		return fchBaja;
	}
	public void setFchBaja(LocalDateTime fchBaja) {
		this.fchBaja = fchBaja;
	}
	
	public boolean isEsValido() {
		return esValido;
	}

	public void setEsValido(boolean esValido) {
		this.esValido = esValido;
	}

	@Override
	/**
	 * Método encargado de mostrar el id,nombre y cantidad de los elementos que no estan de baja
	 * @author amorcia
	 * 27/01/2025
	 */
	public String toString() {
		return "idElemento: " + idElemento + 
				"\nNombre: ".concat(nombreElemento).concat("\nCantidad: ") + cantidadElemento;
	}	
	
	
	
}
