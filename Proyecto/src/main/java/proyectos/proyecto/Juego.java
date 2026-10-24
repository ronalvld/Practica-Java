
package proyectos.proyecto;

public class Juego {
    private int id;
    private String nombre;
    private int calificacion;
    private Estado estado;
    private Plataforma plataforma;
    static int contador = 0;
    
    public Juego(int id, String nombre, int calificacion, Estado estadom, Plataforma plataforma){
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

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
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
        return "Juego{" + "id=" + id + ", nombre=" + nombre + ", calificacion=" + calificacion + ", estado=" + estado + ", plataforma=" + plataforma + '}';
    }
    
   
}
