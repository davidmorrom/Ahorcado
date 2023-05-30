package Ahorcado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mensajes {

	private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * Se imprime: ---- PERSONAJE DE FICCIÓN ----
	 */
	public void mensaje_inicial() {
		System.out.println("---- PERSONAJE DE FICCIÓN ----");
	}

	/**
	 * Método que solicita al jugador una nueva letra con el mensaje: Introduzca una
	 * letra:
	 * 
	 * @return devuelve el carácter que ha introducido el usuario. En caso de
	 *         introducir más de un carácter, el juego SOLO se quedará con la
	 *         primera de ellas, despreciando el resto
	 */
	public char pedir_letra() {
		// IMPLEMENTAR
		return 0;
	}

	/**
	 * Se imprime: ACIERTO!
	 */
	public void acierto() {
		System.out.println("ACIERTO!");
	}

	/**
	 * Se imprime: FALLO!
	 */
	public void fallo() {
		System.out.println("FALLO!");
	}

	/**
	 * Se imprime: GANASTE !!!!!!!
	 */
	public void ganar() {
		System.out.println("GANASTE !!!!!!!");
	}

	/**
	 * Se imprime: PERDISTE !!!!!!!
	 */
	public void perder() {
		System.out.println("PERDISTE !!!!!!!");
	}
}