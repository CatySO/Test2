package proyectojuegos;

import java.util.Scanner;

public class MainJuego {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Centro de Juegos");

        System.out.println("Ingresa tu nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingresa tu edad:");
        int edad = scanner.nextInt();

        Juego juego = null;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Selecciona el juego que quieres jugar:");
            System.out.println("1. Adivina el Número");
            System.out.println("2. Encuentra el Símbolo");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                juego = new AdivinaNumero(nombre, edad);
            } else if (opcion == 2) {
                juego = new EncuentraSimbolo(nombre, edad);
            } else {
                System.out.println("Opción no válida. Por favor selecciona 1 o 2.");
                i--; // Restar uno al contador para permitir al usuario seleccionar de nuevo
                continue;
            }

            juego.jugar();
        }

        juego.mostrarelHistorial();
    
	}

}
