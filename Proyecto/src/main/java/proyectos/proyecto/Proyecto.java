

package proyectos.proyecto;
import java.util.ArrayList;

public class Proyecto {
    

    
    public static void main(String[] args) {
        
         ArrayList<Juego> juegos = new ArrayList<>();

        juegos.add(new Juego(1, "Minecraft", 9.5, Estado.COMPLETADO, Plataforma.PC));
        juegos.add(new Juego(2, "The Witcher 3", 9.8, Estado.COMPLETADO, Plataforma.PS4));
        juegos.add(new Juego(3, "Cyberpunk 2077", 8.5, Estado.PROGRESO, Plataforma.PC));
        juegos.add(new Juego(4, "Zelda: Breath of the Wild", 9.7, Estado.COMPLETADO, Plataforma.SWITCH));
        juegos.add(new Juego(5, "Red Dead Redemption 2", 9.6, Estado.PENDIENTE, Plataforma.PS4));
        juegos.add(new Juego(6, "Halo Infinite", 8.0, Estado.PROGRESO, Plataforma.XBOXONE));
        juegos.add(new Juego(7, "Stardew Valley", 9.0, Estado.PENDIENTE, Plataforma.PC));
        juegos.add(new Juego(8, "Super Mario Odyssey", 9.4, Estado.PENDIENTE, Plataforma.SWITCH));

    for (Juego juego : juegos) {
            System.out.println(juego);
        }
    }
    
    
}
