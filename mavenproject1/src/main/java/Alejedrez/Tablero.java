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
public class Tablero {

    Pieza tablero[][] = new Pieza[8][8];

    public Tablero() {
        //Creación de Torre
        tablero[0][0] = new Torre('n');
        tablero[0][7] = new Torre('n');
        tablero[7][0] = new Torre('b');
        tablero[7][7] = new Torre('b');
        //Creación de Caballo
        tablero[0][1] = new Caballo('n');
        tablero[0][6] = new Caballo('n');
        tablero[7][1] = new Caballo('b');
        tablero[7][6] = new Caballo('b');
        //Creación Alfil
        tablero[0][2] = new Alfil('n');
        tablero[0][5] = new Alfil('n');
        tablero[7][2] = new Alfil('b');
        tablero[7][5] = new Alfil('b');
        //Creación Dama

        //Creacion Rey
        //Demás...
    }

    /**
     * Imprime el array Pieza
     */
    public void pintarTablero() {
        System.out.printf("    %2c%2c%2c%2c%2c%2c%2c%2c\n", 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H');
        for (int i = 0; i < tablero.length; i++) {
            for (int j = -1; j < tablero.length; j++) {
                if (j == -1) {
                    System.out.printf("%d   ", i + 1);
                } else {
                    if (tablero[i][j] == null) {
                        System.out.printf("%2c", ' ');
                    } else {
                        System.out.printf("%2s", tablero[i][j].toString());
                    }
                }
            }
            System.out.println("");
        }
    }

}
