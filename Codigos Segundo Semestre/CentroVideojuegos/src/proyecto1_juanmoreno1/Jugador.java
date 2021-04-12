
package proyecto1_juanmoreno1;




public class Jugador {

    private String nombre;
    private int minutos;
    private int identificacion;
    private String fecha;

    public Jugador(String nombre,int identificacion,String fecha){
     this.nombre = nombre;
     this.identificacion = identificacion;
     this.fecha = fecha ;
    }
    public void agregarTiempo(int minutos){
        this.minutos = minutos;
    }

    public int consultarTiempo() {
        return minutos;
    }

    public int consultarIdentificacion() {
       
        return identificacion;
    }


    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", minutos=" + minutos + ", identificacion=" + identificacion + ", fecha=" + fecha + '}';
    }
   

}

