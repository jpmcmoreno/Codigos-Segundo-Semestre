package proyecto1_juanmoreno1;

import java.util.Scanner;

public class Menu {

    //Atributos de la clase
    private Scanner sc;
    private CentroVideoJuegos centroVideoJuegos;

    //Constructor de la clase
    public Menu() {
        sc = new Scanner(System.in);

        centroVideoJuegos = new CentroVideoJuegos();
    }//Cierra constructor

    public static void main(String[] args) {
        Menu menu = new Menu(); //objeto para acceder a los métodos de esta misma clase
        menu.desplegarMenu();
    }  //cierra main

    public void desplegarMenu() {
        mostrarOpciones();
        System.out.print("Seleccione una opción: ");
        int opcionSeleccionada = Integer.parseInt(sc.nextLine());
        ejecutarOpcion(opcionSeleccionada);
        desplegarMenu(); //llamada recursiva
    }//cierra desplegarMenu

    private void mostrarOpciones() {
        String cadenaMenu = "\nCentro de Videojuegos.";
        cadenaMenu += "\n0. Salir.";
        cadenaMenu += "\n1. Asignar jugador a estación.";
        cadenaMenu += "\n2. Agregar tiempo a jugador.";
        cadenaMenu += "\n3. Cambiar jugador de estación.";
        cadenaMenu += "\n4. Registrar salida de jugador.";
        cadenaMenu += "\n5. Descuentos";
        System.out.println(cadenaMenu);
    }//cierra mostrarOpciones

    private void ejecutarOpcion(int opcionSeleccionada) {
        switch (opcionSeleccionada) {
            case 0:

                System.exit(0);

                break;
            case 1:
                System.out.println("1. Asignar jugador a estación.");
                ingresarJugador();
                break;

            case 2:
                System.out.println("2. Agregar tiempo a jugador.");
                agregarTiempoAJugador();
                break;

            case 3:
                System.out.println("3. Cambiar jugador de estación.");
                cambiarJugadorDeEstacion();
                break;
            case 4:
                System.out.println("4. Registrar salida de jugador.");
                registrarSalidaJugador();
                break;
            case 5:
                System.out.println("5. Descuentos");
                hacerDescuento();
                break;
            default:
                System.out.println("Gracias por utilizar el Sistema.");

        }
    }   //Cierra ejecutarOpcion

    public void ingresarJugador() {
        System.out.println("Ingrese los datos separados por &");
        String entrada = sc.nextLine();
        String[] datos = entrada.split("&");
        int idEstacion = Integer.parseInt(datos[0]);
        int identificacion = Integer.parseInt(datos[1]);
        String nombre = datos[2];
        String fecha = datos[3];//hasta aca se pide datos separado por &
        System.out.println("salida");
        //if else para que ingrese el jugador
        if (centroVideoJuegos.buscarEstacionPorIdEstacion(idEstacion) == null) { //cuando no encuentra un id
            System.out.println("numero de estacion icorrecto. debe ingresar un numero de 1 a 4");
        } else {
            centroVideoJuegos.ingresarJugador(idEstacion, nombre, identificacion, fecha);//se ingresa el jugador con sus datos
        }

    }

    public void agregarTiempoAJugador() {
        System.out.println("Ingrese los datos separados por &");
        String entrada = sc.nextLine();
        String[] datos = entrada.split("&");
        int identificacion = Integer.parseInt(datos[0]);
        int minutos = Integer.parseInt(datos[1]);//hasta aca se pide datos separados por &
        System.out.println("salida");

        if (centroVideoJuegos.buscarJugador(identificacion) == null) {
            System.out.println("No se puede utilizar esta opción hasta que no haya al menos un jugador en el centro.");
        } else {
            centroVideoJuegos.agregarTiempoAJugador(identificacion, minutos);
        }
    }

    public void cambiarJugadorDeEstacion() {
        System.out.println("Ingrese los datos separados por &");
        String entrada = sc.nextLine();
        String[] datos = entrada.split("&");
        int identificacion = Integer.parseInt(datos[0]);
        int idEstacion = Integer.parseInt(datos[1]);//hasta aca se pide datos separados por &
        System.out.println("salida");
        if (centroVideoJuegos.buscarJugador(identificacion) == null) {
            System.out.println("No se puede utilizar esta opción hasta que no haya al menos un jugador en el centro.");
        }
        if (centroVideoJuegos.buscarEstacionPorIdEstacion(idEstacion) == null) {
            System.out.println("numero de estacion icorrecto. debe ingresar un numero de 1 a 4");
        } else {
            centroVideoJuegos.cambiarJugadorEstacion(identificacion, idEstacion);
        }

    }

    public void registrarSalidaJugador() {
        String entrada = sc.nextLine();
        int identificacion = Integer.parseInt(entrada);
        System.out.println("salida");
        if (centroVideoJuegos.buscarJugador(identificacion) == null) {
            System.out.println("No se puede utilizar esta opción hasta que no haya al menos un jugador en el centro.");
        }
        centroVideoJuegos.registrarSalidaJugador(identificacion);

    }
    
    public void hacerDescuento(){
        String entrada = sc.nextLine();
        System.out.println("ingrese los datos");
        int identificacion = Integer.parseInt(entrada);
        System.out.println("salida");
        if (centroVideoJuegos.buscarJugador(identificacion) == null) {
            System.out.println("No se puede utilizar esta opción hasta que no haya al menos un jugador en el centro.");
        }
        centroVideoJuegos.descuentos(identificacion);
    }

}//Cierra class

