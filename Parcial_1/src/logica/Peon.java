package logica;

import java.util.ArrayList;
import java.util.List;

public class Peon extends Pieza {

    public Peon(int fila, int col) {
        super(fila, col);
    }

    @Override
    public List<Posicion> movimientosValidos(Tablero t) {
        List<Posicion> movs = new ArrayList<>();

        int f = pos.getFila();
        int c = pos.getCol();

      
        if (t.esValida(f + 1, c)) {
            movs.add(new Posicion(f + 1, c));
        }

       
        if (f == 2 && t.esValida(f + 2, c)) {
            movs.add(new Posicion(f + 2, c));
        }

        return movs;
    }
}
