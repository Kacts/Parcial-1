package logica;

import java.util.List;

public abstract class Pieza {
    protected Posicion pos;

    public Pieza(int fila, int col) {
        this.pos = new Posicion(fila, col);
    }

    public Posicion getPosicion() {
        return pos;
    }

    public abstract List<Posicion> movimientosValidos(Tablero t);

    public int cantidadMovimientos(Tablero t) {
        return movimientosValidos(t).size();
    }
}
