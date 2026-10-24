
package proyectos.proyecto;

import java.util.Comparator;


public class CompCali implements Comparator<Juego>{

    @Override
    public int compare(Juego o1, Juego o2) {
        return Double.compare(o1.getCalificacion(), o2.getCalificacion());
    }
    
    
}
