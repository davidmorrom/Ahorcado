package Ahorcado;

import java.util.ArrayList;

public class Marcador {
	private int numAciertos, numFallos, intentos, puntos;
	private ArrayList<Character> listaAciertos, listaFallos;

	/**
	 * Constructor que inicializa el juego del ahorcado
	 * 
	 * @param intentos número de fallos permitidos para adivinar la palabra
	 */
	public Marcador(int intentos) {
		this.numAciertos = 0;
		this.numFallos = 0;
		this.intentos = intentos;
		this.puntos = 0;
		listaAciertos = new ArrayList<Character>();
		listaFallos = new ArrayList<Character>();
	}

	/**
	 * Método de tipo set que actualiza la puntuación del marcador con la fórmula: 5
	 * puntos por cada acierto y 1 punto menos por cada fallo
	 */
	private void actualizar() {
		// IMPLEMENTAR;
	}

	/**
	 * Método que sirve para indicarle al jugador qué letras ha acertado y qué
	 * letras ha fallado Cada una de ellas sólo se imprime en caso de que haya
	 * elementos dentro. La sintaxis es la siguiente: -> Letras acertadas: A B C...
	 * en caso de que el jugador haya indicado esas letras y se encuentren en la
	 * palabra -> Letras falladas: X Y Z... en caso de que el jugador haya indicado
	 * esas letras y se NO encuentren en la palabra
	 */
	private void mostrarAciertoyFallos() {
		// IMPLEMENTAR
	}

	/**
	 * Método que dibuja el Marcador, que incluye los aciertos y fallos (en caso de
	 * que existan), el número de intentos que quedan con la siguiente sintaxis: ->
	 * Intentos restantes = X, siendo X el número de intentos (posibles fallos) que
	 * quedan y los puntos, con la siguiente sintaxis: -> PUNTOS = Y, siendo Y el
	 * número total de puntos
	 */
	public void mostrarMarcador() {
		// IMPLEMENTAR
	}

	/**
	 * Método que incrementa el número de aciertos, actualiza los puntos y añade la
	 * letra a la lista de Aciertos
	 * 
	 * @param letra que ha introducido el jugador
	 * @see listaAciertos
	 * @see actualizar()
	 */
	public void acertar(char letra) {
		// IMPLEMENTAR
	}

	/**
	 * Método que incrementa el número de fallos, disminuye el número de intentos,
	 * actualiza los puntos y añade la letra a la lista de Fallos
	 * 
	 * @param letra que ha introducido el jugador
	 * @see listaFallos
	 * @see actualizar()
	 */
	public void fallar(char letra) {
		// IMPLEMENTAR
	}

	/**
	 * Método que sirve para saber si el juego se ha terminado por haber agotado el
	 * número de intentos disponibles
	 * 
	 * @return true cuando se han agotado el número de intentos posibles (es igual a
	 *         cero)
	 */
	public boolean finJuego() {
		// IMPLEMENTAR
		return false;
	}
}