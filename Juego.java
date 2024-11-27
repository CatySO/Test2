package proyectojuegos;

import java.util.Scanner;

public abstract class Juego {
	
	 protected String nombreUsuario;
	    protected int edadUsuario;
	    protected int partidasGanadas;
	    protected int partidasPerdidas;
	    protected int vidas;
	    
	    
	    public Juego(String nombreUsuario, int edadUsuario) {
	        this.nombreUsuario = nombreUsuario;
	        this.edadUsuario = edadUsuario;
	        this.partidasGanadas = 0;
	        this.partidasPerdidas = 0;
	        this.vidas = 3;
	    }

	    public abstract void jugar();

	    public void mostrarelHistorial() {
	        System.out.println("Historial de " + nombreUsuario + ":");
	        System.out.println("Partidas ganadas: " + partidasGanadas);
	        System.out.println("Partidas perdidas: " + partidasPerdidas);
	    }
	    
		}

	    
	    


