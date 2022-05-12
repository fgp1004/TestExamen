package jcolonia.daw2021.rifa;

import static java.lang.System.out;

import java.util.Scanner;

public class VistaMenúBásico extends Vista{

	private String[] opcionesMenúPrincipal;

	public VistaMenúBásico(String texto, Scanner entrada, String[] opcionesMenúPrincipal) {
		super(texto, entrada);
		this.opcionesMenúPrincipal=opcionesMenúPrincipal;
	}

	public int mostrarOpciones() {
		String lineaTexto;
		int número = 0;
		boolean numEsCorrecto = false;

		out.println("Introduce una de las opciones (a ser posible válida 😊)");
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
