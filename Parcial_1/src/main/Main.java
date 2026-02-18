package main;

import logica.Peon;
import logica.Pieza;
import logica.Rey;
import logica.Tablero;
import logica.Torre;

public class Main {
    public static void main(String[] args) {
        Tablero t = new Tablero();

        Pieza peon = new Peon(2, 4);
        Pieza torre = new Torre(4, 4);
        Pieza rey = new Rey(1, 1);

      
        System.out.println("Peon en " + peon.getPosicion());
        System.out.println("Movimientos: " + peon.movimientosValidos(t));
        System.out.println("Cantidad: " + peon.cantidadMovimientos(t));
        System.out.println();

        System.out.println("Torre en " + torre.getPosicion());
        System.out.println("Movimientos: " + torre.movimientosValidos(t));
        System.out.println("Cantidad: " + torre.cantidadMovimientos(t));
        System.out.println();

        System.out.println("Rey en " + rey.getPosicion());
        System.out.println("Movimientos: " + rey.movimientosValidos(t));
        System.out.println("Cantidad: " + rey.cantidadMovimientos(t));
    }
}
