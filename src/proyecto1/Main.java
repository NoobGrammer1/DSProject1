package proyecto1;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author AdminBeta
 */
public class Main {

    public static void main(String[] args) {
    
        //JOptionPane.showMessageDialog (null, "asdasd","Error", JOptionPane.DEFAULT_OPTION);

        ListaPelicula lista = new ListaPelicula();
        lista.InicializarDatos();
        System.out.print(lista.toString());
        //lista.Pelicula10Mejores();
        lista.binarySearch(5);
        
        /*lista.agregarACola(1);
        lista.agregarACola(2);
        lista.agregarACola(3);
        System.out.println("\n" + lista.colaPeliculas);
        lista.sacarUnaPelicula();
        System.out.println("\n" + lista.colaPeliculas);
        
        /*String id="A06";
        String nombre="it";
        int año=2014;
        int calif=8;
        String genero="accion";
        boolean estado=true;
        Pelicula pelicula = new Pelicula(id, nombre, año, calif, genero, estado);
        lista.addInicio(pelicula);
        System.out.print(lista.toString());*/
    }

}
