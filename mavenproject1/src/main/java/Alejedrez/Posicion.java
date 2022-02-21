/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alejedrez;

/**
 *
 * @author ale
 */
public class Posicion {
    protected int fila;
    protected int columna;


    public Posicion() {
        
    }
    public Posicion(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }
    /**
     * Establece el atributo
     *
     * @param fila
     */
    public void setFila(int fila) {
        this.fila = fila;
    }
    /**
     * Establece el atributo
     *
     * @param columna
     */
    public void setColumna(int columna) {
        this.columna = columna;
    }
    /**
     * @return Devuelve el atributo
     */
    public int getFila() {
        return fila;
    }
    /**
     * @return Devuelve el atributo
     */
    public int getColumna() {
        return columna;
    }

    /**
     * @return Devuelve la posición de una figura
     *
     */
    @Override
    public String toString() {
        return "Posicion{" + "fila=" + fila + ", columna=" + columna + '}';
    }

    
    
    
}
