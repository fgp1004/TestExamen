package jcolonia.daw2021.rifa;

import static java.lang.System.out;

import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class VistaMenúBásico.
 */
public class VistaMenúBásico extends Vista{

	/** The opciones menú principal. */
	private String[] opcionesMenúPrincipal;

	/**
	 * Instantiates a new vista menú básico.
	 *
	 * @param texto the texto
	 * @param entrada the entrada
	 * @param opcionesMenúPrincipal the opciones menú principal
	 */
	public VistaMenúBásico(String texto, Scanner entrada, String[] opcionesMenúPrincipal) {
		super(texto, entrada);
		this.opcionesMenúPrincipal=opcionesMenúPrincipal;
	}

	/**
	 * Mostrar opciones.
	 */
	public void mostrarOpciones() {
		out.println("----------------------------------------");
		for (int i = 0; i < opcionesMenúPrincipal.length; i++) {
			out.printf("Opcion %d .- %s\n", i + 1, opcionesMenúPrincipal[i]);

		}
		out.println("----------------------------------------\n");
	}

	/**
	 * Pedir opción.
	 *
	 * @return the int
	 */
	public int pedirOpción() {
		String lineaTexto;
		int número = 0;
		boolean numEsCorrecto = false;
		
		while (!numEsCorrecto) {
			try {
				lineaTexto = getEntrada().nextLine();
				número = Integer.parseInt(lineaTexto);
				if (número < 0 || número > opcionesMenúPrincipal.length) {
					out.println("No ha elegido una opcion valida.");
					throw new NumberFormatException("Valor introducido fuera de rango de opciones.\n");
				} else {
					numEsCorrecto = true;
				}
			} catch (NumberFormatException ex) {
				out.printf("\tNo es una de las opciones validas: «%s»%n", ex.getMessage());
			}
		}

		return número;
	}
	
	

}
