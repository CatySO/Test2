package proyectojuegos;

import java.util.Scanner;
import java.util.Random;

public class EncuentraSimbolo extends Juego {
	
	 private final int TAMAÑO_ARREGLO = 5;

	    public EncuentraSimbolo(String nombreUsuario, int edadUsuario) {
	        super(nombreUsuario, edadUsuario);
	    }

	    @Override
	    public void jugar() {
	        System.out.println("Bienvenido a Encuentra el Símbolo, " + nombreUsuario + "!");
	        Random rand = new Random();
	        int posicionX = rand.nextInt(TAMAÑO_ARREGLO);

	        Scanner scanner = new Scanner(System.in);

	        while (vidas > 0) {
	            System.out.println("Ingresa una posición entre 1 y " + TAMAÑO_ARREGLO + " para encontrar la X:");
	            int posicionUsuario = scanner.nextInt();

	            if (posicionUsuario == posicionX + 1) {
	                System.out.println("¡Felicidades, has encontrado la X!");
	                partidasGanadas++;
	                break;
	            } else {
	                System.out.println("Posición incorrecta. Te quedan " + (--vidas) + " vidas.");
	            }
	        }

	        if (vidas == 0) {
	            System.out.println("¡Has perdido! La X estaba en la posición: " + (posicionX + 1));
	            partidasPerdidas++;
	        }
	    }

}
