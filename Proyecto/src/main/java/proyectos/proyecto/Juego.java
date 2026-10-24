package proyectos.proyecto;

public class Juego implements Comparable<Juego> {

    private int id;
    private String nombre;
    private Double calificacion;
    private Estado estado;
    private Plataforma plataforma;

    private static int contador = 0;

    // Constructor que genera el ID automaticamente
    public Juego(String nombre, Double calificacion, Estado estado, Plataforma plataforma) {
        this.id = ++contador;
        this.nombre = nombre;
        this.calificacion = calificacion;
        this.estado = estado;
        this.plataforma = plataforma;
    }

    // Constructor compatible con tu codigo anterior
    public Juego(int id, String nombre, Double calificacion, Estado estado, Plataforma plataforma) {
        this.id = id;
        this.nombre = nombre;
        this.calificacion = calificacion;
        this.estado = estado;
        this.plataforma = plataforma;

        if (id > contador) {
            contador = id;
        }
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
        return "========== JUEGO ==========\n"
                + "ID: " + id
                + "\nTitulo: " + nombre
                + "\nCalificacion: " + calificacion
                + "\nPlataforma: " + plataforma
                + "\nEstado: " + estado
                + "\n===========================";
    }

    // Orden natural: por nombre alfabeticamente
    @Override
    public int compareTo(Juego otro) {
        return this.nombre.compareToIgnoreCase(otro.nombre);
    }
}