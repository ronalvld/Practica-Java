
package proyectos.proyecto;

public class Juego {
    private int id;
    private String nombre;
    private int calificacion;
    private Estado estado;
    static int contador = 0;
    
    public Juego(int id, String nombre, int calificacion, Estado estado){
        this.id=id;
        this.nombre=nombre;
        this.calificacion=calificacion;
        this.estado = estado;
        contador++;
    }
    
}
