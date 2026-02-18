package logica;

public class Tablero {

    public static int SIZE = 8;

    public boolean esValida(int fila, int col) {
        return fila >= 1 && fila <= SIZE && col >= 1 && col <= SIZE;
    }
}
