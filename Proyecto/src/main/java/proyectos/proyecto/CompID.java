
package proyectos.proyecto;

import java.util.Comparator;


public class CompID implements Comparator<Juego>{

    
    @Override
    public int compare(Juego o1, Juego o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
    
}
