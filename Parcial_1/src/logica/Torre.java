package logica;

import java.util.ArrayList;
import java.util.List;

public class Torre extends Pieza {

    public Torre(int fila, int col) {
        super(fila, col);
    }

    @Override
    public List<Posicion> movimientosValidos(Tablero t) {
        List<Posicion> movs = new ArrayList<>();
        int f = pos.getFila();
        int c = pos.getCol();

       
        for (int nf = f + 1; nf <= Tablero.SIZE; nf++) movs.add(new Posicion(nf, c));
       
        for (int nf = f - 1; nf >= 1; nf--) movs.add(new Posicion(nf, c));
   
        for (int nc = c + 1; nc <= Tablero.SIZE; nc++) movs.add(new Posicion(f, nc));
       
        for (int nc = c - 1; nc >= 1; nc--) movs.add(new Posicion(f, nc));

        return movs;
    }
}
