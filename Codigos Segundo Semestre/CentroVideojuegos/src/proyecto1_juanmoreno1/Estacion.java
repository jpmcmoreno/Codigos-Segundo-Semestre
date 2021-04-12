
package proyecto1_juanmoreno1;


public class Estacion {
 private int idEstacion = 0;
 private boolean ocupado;
 private Jugador jugador;
 
 public Estacion(int idEstacion){
 this.idEstacion = idEstacion;    
 }
 

    public void agregarJugador(Jugador jugador) {
        this.jugador = jugador;
        this.ocupado = true;
    }

    public boolean estaOcupado() {
        return ocupado;
    }

    public Jugador desocupar() {
        this.ocupado = false;
        return jugador;
        
    }

    public Jugador consultarJugador() {
        return jugador;
    }

    @Override
    public String toString() {
        return "Estacion{" + "idEstacion=" + idEstacion + ", ocupado=" + ocupado + ", jugador=" + jugador + '}';
    }
 

}
