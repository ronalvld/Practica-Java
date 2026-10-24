

package proyectos.proyecto;
import java.util.ArrayList;

public class Proyecto {
    

    
    public static void main(String[] args) {
        
            ArrayList<Juego> juegos = new ArrayList<>();

            juegos.add(new Juego("Minecraft", 9.5, Estado.COMPLETADO, Plataforma.PC));
            juegos.add(new Juego("The Witcher 3", 9.8, Estado.COMPLETADO, Plataforma.PS4));
            juegos.add(new Juego("Cyberpunk 2077", 8.5, Estado.PROGRESO, Plataforma.PC));
            juegos.add(new Juego("Zelda: Breath of the Wild", 9.7, Estado.COMPLETADO, Plataforma.SWITCH));
            juegos.add(new Juego("Red Dead Redemption 2", 9.6, Estado.PENDIENTE, Plataforma.PS4));
            juegos.add(new Juego("Halo Infinite", 8.0, Estado.PROGRESO, Plataforma.XBOXONE));
            juegos.add(new Juego("Stardew Valley", 9.0, Estado.PENDIENTE, Plataforma.PC));
            juegos.add(new Juego("Super Mario Odyssey", 9.4, Estado.PENDIENTE, Plataforma.SWITCH));
            juegos.add(new Juego("Elden Ring", 9.7, Estado.PROGRESO, Plataforma.PS4));
            juegos.add(new Juego("Terraria", 8.9, Estado.COMPLETADO, Plataforma.PC));

            System.out.println("Juegos registrados: " + juegos.size());

            for (Juego juego : juegos) {
                System.out.println(juego);
            }
            
            
            int opcion;
            boolean a = true;
            while(a){
                opcion = Menu.opcionMenu();
                switch(opcion){
                case 1: Accion.Agregar(juegos);
                        break;
                case 2: Accion.Elminar(juegos);
                        break;
                case 3: Accion.ModificarEstado(juegos);
                        break;
                case 4: 
                        for (Juego juego : juegos) {
                        System.out.println(juego);
                           
                    }
                        break;
                case 5: 
                    System.out.println("Saliendo....");
                    a = false;
                    break;
            }
        }

        
    }
    
    
}
