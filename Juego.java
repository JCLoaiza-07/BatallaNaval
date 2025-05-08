package BatallaNaval;

public class Juego {
    private Tablero tableroJugador1;
    private Tablero tableroJugador2;
    private boolean turnoJugador1;

    public Juego() {
        this.tableroJugador1 = new Tablero();
        this.tableroJugador2 = new Tablero();
        this.turnoJugador1 = true; // Para que comience el jugador 1
    }

    public void iniciarJuego() {
        System.out.println("¡Bienvenido a Batalla Naval!");
        tableroJugador1.mostrarTablero();
        tableroJugador2.mostrarTablero();
    }

    public void cambiarTurno() {
        turnoJugador1 = !turnoJugador1;
    }
}
