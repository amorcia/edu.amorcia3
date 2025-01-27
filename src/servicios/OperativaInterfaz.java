package servicios;

/**
 * Interfaz encargada de generar los metodos de la funcionalidad(lógica) del programa
 * @author amorcia
 * 27/01/2025
 */
public interface OperativaInterfaz {
	/**
	 * Método encargado de dar de alta un elemento y guardarlo en la lista
	 * @author amorcia
	 * 27/01/2025
	 */
	void altaElemento();
	/**
	 * Método encargado de dar de modificar la cantidad un elemento pidiendo el código del mismo
	 * @author amorcia
	 * 27/01/2025
	 */
	void modificarElemento();
	/**
	 * Método encargado de dar de baja un elemento pidiendo el código del mismo
	 * @author amorcia
	 * 27/01/2025
	 */
	void bajaElemento();
}
