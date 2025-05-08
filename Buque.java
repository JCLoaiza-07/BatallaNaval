package BatallaNaval;

import java.util.ArrayList;

public class Buque extends Ficha {
    // Llamada al costructor de la clase padre
    public Buque(ArrayList<Integer> posicion, String estado) {
        super(2, posicion, estado);
    }
}
