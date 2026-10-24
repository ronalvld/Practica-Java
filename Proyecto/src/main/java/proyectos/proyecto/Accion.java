package proyectos.proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class Accion {

    private static final Scanner sc = new Scanner(System.in);

    // Buscar un juego por su ID real
    private static Juego buscarPorId(ArrayList<Juego> juegos, int id) {
        for (Juego juego : juegos) {
            if (juego.getId() == id) {
                return juego;
            }
        }
        return null;
    }

    // Leer un entero y validar la entrada
    private static int leerEntero(String mensaje) {
        while (true) {
            System.out.println(mensaje);

            if (sc.hasNextInt()) {
                int numero = sc.nextInt();
                sc.nextLine();
                return numero;
            }

            System.out.println("No valido. Ingrese un numero.");
            sc.nextLine();
        }
    }

    // ELIMINAR JUEGO
    public static ArrayList<Juego> Elminar(ArrayList<Juego> juegos) {

        int id = leerEntero("Que juego quieres eliminar? (Ingresar ID)");

        Juego juego = buscarPorId(juegos, id);

        if (juego == null) {
            System.out.println("No existe un juego con ese ID");
            return juegos;
        }

        System.out.println("Se ha eliminado: " + juego.getNombre());

        juegos.remove(juego);

        // No disminuir Juego.contador.
        // Los ID eliminados no deben reutilizarse.

        return juegos;
    }

    // AGREGAR JUEGO
    public static ArrayList<Juego> Agregar(ArrayList<Juego> juegos) {

        System.out.println("Ingrese el nombre del juego:");
        String nombre = sc.nextLine();

        double calificacion;

        while (true) {
            System.out.println("Ingrese la calificacion (0 a 10):");

            if (sc.hasNextDouble()) {
                calificacion = sc.nextDouble();
                sc.nextLine();

                if (calificacion >= 0 && calificacion <= 10) {
                    break;
                }

                System.out.println("La calificacion debe estar entre 0 y 10.");
            } else {
                System.out.println("Ingrese un numero valido.");
                sc.nextLine();
            }
        }

        // Seleccionar estado
        Estado[] estados = Estado.values();

        System.out.println("Seleccione el estado:");

        for (int i = 0; i < estados.length; i++) {
            System.out.println((i + 1) + ". " + estados[i]);
        }

        int opcionEstado;

        while (true) {
            opcionEstado = leerEntero("Ingrese una opcion:");

            if (opcionEstado >= 1 && opcionEstado <= estados.length) {
                break;
            }

            System.out.println("Opcion fuera de rango.");
        }

        Estado estado = estados[opcionEstado - 1];

        // Seleccionar plataforma
        Plataforma[] plataformas = Plataforma.values();

        System.out.println("Seleccione la plataforma:");

        for (int i = 0; i < plataformas.length; i++) {
            System.out.println((i + 1) + ". " + plataformas[i]);
        }

        int opcionPlataforma;

        while (true) {
            opcionPlataforma = leerEntero("Ingrese una opcion:");

            if (opcionPlataforma >= 1 && opcionPlataforma <= plataformas.length) {
                break;
            }

            System.out.println("Opcion fuera de rango.");
        }

        Plataforma plataforma = plataformas[opcionPlataforma - 1];

        // Crear el juego con ID automatico
        Juego nuevo = new Juego(
                nombre,
                calificacion,
                estado,
                plataforma
        );

        juegos.add(nuevo);

        System.out.println("Juego agregado correctamente:");
        System.out.println(nuevo);

        return juegos;
    }

    // MODIFICAR ESTADO
    public static ArrayList<Juego> ModificarEstado(ArrayList<Juego> juegos) {

        int id = leerEntero("Ingrese el ID del juego a cambiar de estado:");

        Juego juego = buscarPorId(juegos, id);

        if (juego == null) {
            System.out.println("No existe un juego con ese ID");
            return juegos;
        }

        System.out.println("Juego: " + juego.getNombre());
        System.out.println("Estado actual: " + juego.getEstado());

        Estado[] estados = Estado.values();

        System.out.println("Seleccione el nuevo estado:");

        int cantidadOpciones = 0;

        for (Estado estado : estados) {
            if (estado != juego.getEstado()) {
                cantidadOpciones++;
                System.out.println(cantidadOpciones + ". " + estado);
            }
        }

        int opcion;

        while (true) {
            opcion = leerEntero("Ingrese una opcion:");

            if (opcion >= 1 && opcion <= cantidadOpciones) {
                break;
            }

            System.out.println("Opcion fuera de rango.");
        }

        int contadorOpciones = 0;

        for (Estado estado : estados) {
            if (estado != juego.getEstado()) {
                contadorOpciones++;

                if (contadorOpciones == opcion) {
                    juego.setEstado(estado);
                    break;
                }
            }
        }

        System.out.println("Estado actualizado correctamente.");
        System.out.println(juego);

        return juegos;
    }
}