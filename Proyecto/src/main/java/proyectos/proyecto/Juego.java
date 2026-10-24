
package proyectos.proyecto;
import java.util.Collections;

public class Juego implements Comparable<Juego> {
    private int id;
    private String nombre;
    private Double calificacion;
    private Estado estado;
    private Plataforma plataforma;
    static int contador = 0;
    
    public Juego(int id, String nombre, Double calificacion, Estado estado, Plataforma plataforma){
        this.id=id;
        this.nombre=nombre;
        this.calificacion=calificacion;
        this.estado = estado;
        this.plataforma = plataforma;
        contador++;
      
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Titulo: "+nombre+ "ID: "+id+
                "\nCalificacion :"+calificacion+
                "\nPlataforma :"+plataforma+
                "\nEstado :"+estado+
                "\n########################################";
       
    }

    @Override
    public int compareTo(Juego otro) {
      return this.compareTo(otro);
    }
    
   
}
