package proyecto1_juanmoreno1;

public class CentroVideoJuegos {

    private int ingresosTotales;
    private Estacion estacion1 = new Estacion(1);//se inicializo
    private Estacion estacion2 = new Estacion(2);
    private Estacion estacion3 = new Estacion(3);
    private Estacion estacion4 = new Estacion(4);
    private Estacion estacion5 = new Estacion(5);

    public void ingresarJugador(int idEstacion, String nombre, int identificacion, String fecha) {
        Estacion estacionAuxiliar = buscarEstacionPorIdEstacion(idEstacion); //se llama a la clase estacion y pide el parametro de idEstacion
        if (estacionAuxiliar != null) { //if para que no se pueda entrar si ya hay alguien
            if (estacionAuxiliar.estaOcupado() == true) {
                System.out.println("el nuevo jugador no se puede agregar a la estacion");
                System.out.println(estacionAuxiliar.consultarJugador());
            } else { //para agregar si no hay nadie
                Jugador jugadorAAsignar = new Jugador(nombre, identificacion, fecha);// se crea  jugador 
                estacionAuxiliar.agregarJugador(jugadorAAsignar);//se asigna un jugador
                System.out.print("El " + jugadorAAsignar.toString() + " ha sido asignado a la estacion " + idEstacion);
            }

        }
    }

    public Estacion buscarEstacionPorIdEstacion(int idEstacion) { //se llena el cuerpo de este metodo
        if (idEstacion == 1) {
            return estacion1;
        }
        if (idEstacion == 2) {
            return estacion2;
        }
        if (idEstacion == 3) {
            return estacion3;
        }
        if (idEstacion == 4) {
            return estacion4;
        }
        if (idEstacion == 5) {
            return estacion5;
        }
        return null;
    }

    public void agregarTiempoAJugador(int identificacion, int minutos) {
        Jugador buscaJugador = buscarJugador(identificacion);

        if (buscaJugador != null) {
            buscaJugador.agregarTiempo(minutos);
            System.out.println("El nuevo estado del jugador: " + buscaJugador.toString());
        } else {
            System.out.println("El jugador consultado NO existe.");
        }

    }

    public Jugador buscarJugador(int identificacion) {
        if (estacion1.consultarJugador() != null) {
            if (estacion1.consultarJugador().consultarIdentificacion() == identificacion) {
                return estacion1.consultarJugador();
            }
        }
        if (estacion2.consultarJugador() != null) {
            if (estacion2.consultarJugador().consultarIdentificacion() == identificacion) {
                return estacion2.consultarJugador();
            }
        }
        if (estacion3.consultarJugador() != null) {
            if (estacion3.consultarJugador().consultarIdentificacion() == identificacion) {
                return estacion3.consultarJugador();
            }
        }
        if (estacion4.consultarJugador() != null) {
            if (estacion4.consultarJugador().consultarIdentificacion() == identificacion) {
                return estacion4.consultarJugador();
            }
        }
        if (estacion5.consultarJugador() != null) {
            if (estacion5.consultarJugador().consultarIdentificacion() == identificacion) {
                return estacion5.consultarJugador();
            }
        }

        return null;
    }

    public void cambiarJugadorEstacion(int identificacion, int idEstacion) {

        Estacion jugadorACambiar = buscarEstacionPorIdJugador(identificacion);
        Estacion estacionAuxiliar = buscarEstacionPorIdEstacion(idEstacion);

        if (jugadorACambiar != null) {
            Jugador jugadorCambiado = estacion1.consultarJugador();
            if (jugadorACambiar == estacion1) {
                estacion1.desocupar();
                estacionAuxiliar.agregarJugador(jugadorCambiado);
                System.out.print("El " + jugadorCambiado.toString() + " ha sido asignado a la estacion: " + idEstacion);
            }
        }
        if (jugadorACambiar != null) {
            Jugador jugadorCambiado = estacion2.consultarJugador();
            if (jugadorACambiar == estacion2) {
                estacion2.desocupar();
                estacionAuxiliar.agregarJugador(jugadorCambiado);
                System.out.print("El " + jugadorCambiado.toString() + " ha sido asignado a la estacion: " + idEstacion);
            }
        }
        if (jugadorACambiar != null) {
            Jugador jugadorCambiado = estacion3.consultarJugador();
            if (jugadorACambiar == estacion3) {
                estacion3.desocupar();
                estacionAuxiliar.agregarJugador(jugadorCambiado);
                System.out.print("El " + jugadorCambiado.toString() + " ha sido asignado a la estacion: " + idEstacion);
            }
        }
        if (jugadorACambiar != null) {
            Jugador jugadorCambiado = estacion4.consultarJugador();
            if (jugadorACambiar == estacion4) {
                estacion4.desocupar();
                estacionAuxiliar.agregarJugador(jugadorCambiado);
                System.out.print("El " + jugadorCambiado.toString() + " ha sido asignado a la estacion: " + idEstacion);
            }
        }
        if (jugadorACambiar != null) {
            Jugador jugadorCambiado = estacion5.consultarJugador();
            if (jugadorACambiar == estacion5) {
                estacion5.desocupar();
                estacionAuxiliar.agregarJugador(jugadorCambiado);
                System.out.print("El " + jugadorCambiado.toString() + " ha sido asignado a la estacion: " + idEstacion);
            }
        } else {
            System.out.println("El jugador consultado NO existe.");
        }
    }

    public Estacion buscarEstacionPorIdJugador(int identificacion) {
        if (estacion1.consultarJugador() != null) {
            if (estacion1.consultarJugador().consultarIdentificacion() == identificacion) {
                return estacion1;
            }
        }
        if (estacion2.consultarJugador() != null) {
            if (estacion2.consultarJugador().consultarIdentificacion() == identificacion) {
                return estacion2;
            }
        }
        if (estacion3.consultarJugador() != null) {
            if (estacion3.consultarJugador().consultarIdentificacion() == identificacion) {
                return estacion3;
            }
        }
        if (estacion4.consultarJugador() != null) {
            if (estacion4.consultarJugador().consultarIdentificacion() == identificacion) {
                return estacion4;
            }
        }
        if (estacion5.consultarJugador() != null) {
            if (estacion5.consultarJugador().consultarIdentificacion() == identificacion) {
                return estacion5;
            }
        }
        return null;

    }

    public void registrarSalidaJugador(int identificacion) {

        if (estacion1.consultarJugador() != null) {
            if (estacion1.consultarJugador().consultarIdentificacion() == identificacion) {
                Jugador consultarJugador = estacion1.consultarJugador();
                estacion1.desocupar();
                System.out.println("se ha registrado la salida del jugador " + consultarJugador.toString() + " debe cancelar $" + (estacion1.consultarJugador().consultarTiempo() * 100));
            }
        }
        if (estacion2.consultarJugador() != null) {
            if (estacion2.consultarJugador().consultarIdentificacion() == identificacion) {
                Jugador consultarJugador = estacion2.consultarJugador();
                estacion2.desocupar();
                System.out.println("se ha registrado la salida del jugador " + consultarJugador.toString() + " debe cancelar $" + (estacion2.consultarJugador().consultarTiempo() * 100));
            }
        }
        if (estacion3.consultarJugador() != null) {
            if (estacion3.consultarJugador().consultarIdentificacion() == identificacion) {
                Jugador consultarJugador = estacion3.consultarJugador();
                estacion3.desocupar();
                System.out.println("se ha registrado la salida del jugador " + consultarJugador.toString() + " debe cancelar $" + (estacion3.consultarJugador().consultarTiempo() * 100));
            }
        }
        if (estacion4.consultarJugador() != null) {
            if (estacion4.consultarJugador().consultarIdentificacion() == identificacion) {
                Jugador consultarJugador = estacion4.consultarJugador();
                estacion4.desocupar();
                System.out.println("se ha registrado la salida del jugador " + consultarJugador.toString() + " debe cancelar $" + (estacion4.consultarJugador().consultarTiempo() * 100));
            }
        }
        if (estacion5.consultarJugador() != null) {
            if (estacion5.consultarJugador().consultarIdentificacion() == identificacion) {
                Jugador consultarJugador = estacion5.consultarJugador();
                estacion5.desocupar();
                System.out.println("se ha registrado la salida del jugador " + consultarJugador.toString() + " debe cancelar $" + (estacion5.consultarJugador().consultarTiempo() * 100));
            }
        }
    }

    public int consultarIngresosTotates() {
        return ingresosTotales;
    }

    //sustentacion requerimento 8
    public void descuentos(int identificacion) {
        
        if (estacion1.consultarJugador() != null) {
            Jugador descuento = hacerDescuento(identificacion);
            if (estacion1.consultarJugador().consultarIdentificacion() == identificacion) {
                Jugador consultarJugador = estacion1.consultarJugador();
                estacion1.desocupar();
                if (estacion1.consultarJugador().consultarTiempo() <= 50) {
                    estacion1.consultarJugador().agregarTiempo(estacion1.consultarJugador().consultarTiempo() - 30);}
                System.out.println("se ha registrado la salida del jugador " + consultarJugador.toString() + " debe cancelar $" + (estacion1.consultarJugador().consultarTiempo() * 100));
            }
        }
        if (estacion2.consultarJugador() != null) {
            Jugador descuento = hacerDescuento(identificacion);
            if (estacion2.consultarJugador().consultarIdentificacion() == identificacion) {
                Jugador consultarJugador = estacion2.consultarJugador();
                estacion2.desocupar();
                 if (estacion2.consultarJugador().consultarTiempo() <= 50) {
                    estacion2.consultarJugador().agregarTiempo(estacion2.consultarJugador().consultarTiempo() - 30);}
                System.out.println("se ha registrado la salida del jugador " + consultarJugador.toString() + " debe cancelar $" + (estacion2.consultarJugador().consultarTiempo() * 100));
            }
        }
        if (estacion3.consultarJugador() != null) {
            Jugador descuento = hacerDescuento(identificacion);
            if (estacion3.consultarJugador().consultarIdentificacion() == identificacion) {
                Jugador consultarJugador = estacion3.consultarJugador();
                estacion3.desocupar();
                      if (estacion3.consultarJugador().consultarTiempo() <= 50) {
                    estacion3.consultarJugador().agregarTiempo(estacion3.consultarJugador().consultarTiempo() - 30);}
                System.out.println("se ha registrado la salida del jugador " + consultarJugador.toString() + " debe cancelar $" + (estacion3.consultarJugador().consultarTiempo() * 100));
            }
        }
        if (estacion4.consultarJugador() != null) {
            Jugador descuento = hacerDescuento(identificacion);
            if (estacion4.consultarJugador().consultarIdentificacion() == identificacion) {
                Jugador consultarJugador = estacion4.consultarJugador();
                estacion4.desocupar();
                 if (estacion4.consultarJugador().consultarTiempo() <= 50) {
                    estacion4.consultarJugador().agregarTiempo(estacion4.consultarJugador().consultarTiempo() - 30);}
                System.out.println("se ha registrado la salida del jugador " + consultarJugador.toString() + " debe cancelar $" + (estacion4.consultarJugador().consultarTiempo() * 100));
            }
        }
        if (estacion5.consultarJugador() != null) {
            Jugador descuento = hacerDescuento(identificacion);
            if (estacion5.consultarJugador().consultarIdentificacion() == identificacion) {
                Jugador consultarJugador = estacion5.consultarJugador();
                 if (estacion5.consultarJugador().consultarTiempo() <= 50) {
                    estacion5.consultarJugador().agregarTiempo(estacion5.consultarJugador().consultarTiempo() - 30);}
                estacion5.desocupar();
                System.out.println("se ha registrado la salida del jugador " + consultarJugador.toString() + " debe cancelar $" + (estacion5.consultarJugador().consultarTiempo() * 100));
            }
        }
    }

    public Jugador hacerDescuento(int identificacion) {

        return null;
    }

    @Override
    public String toString() {
        return "CentroVideoJuegos{" + "ingresosTotales=" + ingresosTotales + ", estacion1=" + estacion1 + ", estacion2=" + estacion2 + ", estacion3=" + estacion3 + ", estacion4=" + estacion4 + '}';
    }

}
