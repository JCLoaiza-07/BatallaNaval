package BatallaNaval;

import java.util.ArrayList;

public class Tablero {
    // Atributos del tablero
    private static final int FILAS = 8;
    private static final int COLUMNAS = 8;
    private String[][] tablero;

    // Constructor
    public Tablero() {
        this.tablero = new String[FILAS][COLUMNAS];
        this.fichas = new ArrayList<>();

        // Inicializamos el tablero con "~" para celdas vacías
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tablero[i][j] = "[  ]";

            }
        }

    }

    public void mostrarTablero() {
        System.out.println("Estado actual del tablero:");

        // Mostrar encabezados de las columnas (números)
        System.out.print("    "); // Espacio para alinear con las letras
        for (int col = 1; col <= COLUMNAS; col++) {
            System.out.print(col + "   "); // Números como encabezados de las columnas
        }
        System.out.println(); // Salto de línea después de los números

        // Mostrar las filas (letras) y el contenido del tablero
        for (int fila = 0; fila < FILAS; fila++) {
            // Mostrar la letra de la fila
            System.out.print((char) ('A' + fila) + " "); // Convierte el índice en letra ('A', 'B', etc.)

            // Mostrar las celdas de esa fila
            for (int col = 0; col < COLUMNAS; col++) {
                System.out.print(tablero[fila][col]); // Imprime cada celda
            }
            System.out.println(); // Salto de línea tras cada fila
        }
    }
}
