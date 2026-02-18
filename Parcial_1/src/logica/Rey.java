package logica;

import java.util.ArrayList;
import java.util.List;

public class Rey extends Pieza {

    public Rey(int fila, int col) {
        super(fila, col);
    }

    @Override
    public List<Posicion> movimientosValidos(Tablero t) {
        List<Posicion> movs = new ArrayList<>();
        int f = pos.getFila();
        int c = pos.getCol();

        for (int df = -1; df <= 1; df++) {
            for (int dc = -1; dc <= 1; dc++) {
                if (df == 0 && dc == 0) continue; 
                int nf = f + df;
                int nc = c + dc;
                if (t.esValida(nf, nc)) {
                    movs.add(new Posicion(nf, nc));
                }
            }
        }
        return movs;
    }
}
