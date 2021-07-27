/*
Como primer paso crea una estructura de datos película, que permita definir y almacenar los 
datos  básicos  de  una  película.  Se  considerarán,  al  menos,  los  siguientes  atributos:  id  de  la 
película, nombre, año, calificación (definida por criterio del vendedor), género, estado 
(Disponible, Prestado).  
 */
package proyecto1;

/**
 *
 * @author AdminBeta
 */
public class Pelicula {
    private int idPelicula;
    private String nombrePelicula;
    private int añoPelicula;
    private int calificacionPelicula;
    private String generoPelicula;
    private boolean estadoPelicula;

    public Pelicula() {
        this.idPelicula = 0;
        this.nombrePelicula = "";
        this.añoPelicula = 0;
        this.calificacionPelicula = 0;
        this.generoPelicula = "";
        this.estadoPelicula = true;
    }
        
    public Pelicula(int idPelicula, String nombrePelicula, int añoPelicula, int calificacionPelicula, String generoPelicula, boolean estadoPelicula){
    this.idPelicula = idPelicula;
    this.nombrePelicula = nombrePelicula;
    this.añoPelicula = añoPelicula;
    this.calificacionPelicula = calificacionPelicula;
    this.generoPelicula = generoPelicula;
    this.estadoPelicula = estadoPelicula;
    }
    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public void setAñoPelicula(int añoPelicula) {
        this.añoPelicula = añoPelicula;
    }

    public void setCalificacionPelicula(int calificacionPelicula) {
        this.calificacionPelicula = calificacionPelicula;
    }

    public void setGeneroPelicula(String generoPelicula) {
        this.generoPelicula = generoPelicula;
    }

    public void setEstadoPelicula(boolean estadoPelicula) {
        this.estadoPelicula = estadoPelicula;
    }
    public String getEstadoPeliculaNoBoleano(){
        if(estadoPelicula){
            return "disponible"; 
        } else{
        return "prestado";}
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public int getAñoPelicula() {
        return añoPelicula;
    }

    public int getCalificacionPelicula() {
        return calificacionPelicula;
    }

    public String getGeneroPelicula() {
        return generoPelicula;
    }

    public boolean isEstadoPelicula() {
        return estadoPelicula;
    }
   

    @Override
    public String toString() {
        return "Pelicula{" + "idPelicula=" + idPelicula + ", nombrePelicula=" + nombrePelicula + ", a\u00f1oPelicula=" + añoPelicula + ", calificacionPelicula=" + calificacionPelicula + ", generoPelicula=" + generoPelicula + ", estadoPelicula=" + estadoPelicula + '}';
    }
    
    
}
