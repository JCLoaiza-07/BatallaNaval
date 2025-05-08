package BatallaNaval;

import java.util.ArrayList;

public abstract class Ficha {
    // Atributos de la clase Abstracta
    private int tamanho;
    private ArrayList<Integer> posicion;
    private String estado;

    // Constructor
    public Ficha(int tamanho, ArrayList<Integer> posicion, String estado) {
        this.tamanho = tamanho;
        this.posicion = posicion;
        this.estado = estado;
    }

    // Getters
    public int getTamanho() {
        return tamanho;
    }

    public ArrayList<Integer> getPosicion() {
        return posicion;
    }

    public String getEstado() {
        return estado;
    }

    // Setters
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
