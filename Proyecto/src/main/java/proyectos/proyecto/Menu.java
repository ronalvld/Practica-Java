
package proyectos.proyecto;

import java.util.Scanner;


public class Menu {
    
    public static void Menu(){
        
        
        System.out.println("1.-Agregar");
        System.out.println("2.-Eliminar");
        System.out.println("3.-Modificar Estado");
        System.out.println("4.-Mostrar Lista");
        System.out.println("5.-Salir");

    }
    
    public static int opcionMenu(){
        Menu.Menu();
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione una opcion:");
        int opcion;
        while(true){
            if(!sc.hasNextInt()){
                System.out.println("Opcion invalida");
                Menu.Menu();
                sc.next();
                continue;
            }
             opcion = sc.nextInt();
             
             if (opcion < 1 || opcion > 5) {
             System.out.println("Opcion fuera de rango.");
             Menu.Menu();
             continue;
            }
            return opcion;
  
        }
    }
    
}
