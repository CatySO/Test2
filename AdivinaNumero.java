package proyectojuegos;

import java.util.Scanner;
import java.util.Random;

public class AdivinaNumero extends Juego {

	
	private final int MIN_NUMERO = 1;
    private final int MAX_NUMERO = 10;

    public AdivinaNumero(String nombreUsuario, int edadUsuario) {
        super(nombreUsuario, edadUsuario);
    }

    @Override
    public void jugar() {
        System.out.println("Bienvenido a Adivina el Número, " + nombreUsuario + "!");
        
        Random rand = new Random();
        
        int numeroAdivinar = rand.nextInt(MAX_NUMERO) + MIN_NUMERO;

        Scanner scanner = new Scanner(System.in);

        while (vidas > 0) {
            System.out.println("Ingresa un número entre " + MIN_NUMERO + " y " + MAX_NUMERO + ":");
            int numeroUsuario = scanner.nextInt();

            if (numeroUsuario == numeroAdivinar) {
                System.out.println("¡Felicidades, has adivinado el número!");
                partidasGanadas++;
                break;
            } else {
                System.out.println("Número incorrecto. Te quedan " + (--vidas) + " vidas.");
            }
        }

        if (vidas == 0) {
            System.out.println("¡Has perdido! El número era: " + numeroAdivinar);
            partidasPerdidas++;
        }
}
}
