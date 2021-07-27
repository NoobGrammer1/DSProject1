
package proyecto1;

import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author AdminBeta
 */
public class ListaPelicula {
     Nodo inicio;
     Queue<Pelicula> colaPeliculas = new LinkedList<Pelicula>();
    

    //Constructores
    public ListaPelicula() {
        this.inicio = null;
    }

    public ListaPelicula(Nodo nodo) {
        this.inicio = nodo;
    }
    
    //Metodo de ordenamiento por insercion para nodos
    
    public void InicializarDatos(){
        Inicializador inicializar = new Inicializador();
        inicializar.setInicializador();
        for(int i=0;i < 11;i++){
            String id = inicializar.getMatrizInicial()[i][0];
            String nombre= inicializar.getMatrizInicial()[i][1];
            int año = Integer.parseInt(inicializar.getMatrizInicial()[i][2]);
            int calificacion=Integer.parseInt(inicializar.getMatrizInicial()[i][3]);
            String genero=inicializar.getMatrizInicial()[i][4];     
            
            Pelicula pelicula = new Pelicula(Integer.parseInt(id),nombre,año,calificacion,genero, true);
            //addInicio(pelicula);
            addOrdenamiento(pelicula);
        }
    }
    
    
    //Pregunta si esta vacia la lista
    public boolean estaVacia(){
        return (inicio == null);
    }
    
    
    //Agregar al inicio
    public void addInicio(Pelicula dato){
        if (estaVacia()){
            inicio = new Nodo(dato);
        }else{
            inicio = new Nodo(dato, inicio);
        }
    }
    
    //Metodo de ordenamiento por insercion
    
    public ListaPelicula addOrdenamiento(Pelicula dato){
        
        Nodo nuevo = new Nodo(dato);
        Nodo anterior  = new Nodo(dato);
        Nodo p = this.inicio;
        int bandera = 0;
        
        if (estaVacia()){
            inicio = new Nodo(dato);
        }else{
             while(bandera == 0){
                 if(p != null ){
                    //if(dato.getNombrePelicula().compareTo(p.getDato().getNombrePelicula()) >= 0){
                    if(dato.getIdPelicula() >= p.getDato().getIdPelicula()){
                       anterior = p; 
                       p = p.getEnlace();
                    }else{
                        if(p == inicio){
                            addInicio(dato);
                        }else{
                            anterior.setEnlace(nuevo);
                            nuevo.setEnlace(p);
                            bandera = 1;
                        }
                    } 
                 }else if (p == null){
                     anterior.setEnlace(nuevo);
                     bandera = 1;
                 } 
             }   
        }
        return this;
    }    
    
    //Listar las 10 mejores peliculas por calificacion
    
    public Pelicula[] Pelicula10Mejores(){
       
        int numPeliculas = 0;
         Pelicula lp[] = {};     
        if(estaVacia()){
           // System.out.println("La lista esta vacia");
        }else{
            Nodo p = this.inicio;
             while(p!=null){
              numPeliculas += 1;    
              p=p.enlace;
            }  
             
            int i = 0;

        Pelicula peliculas[] = new Pelicula[numPeliculas];

            p = this.inicio;
            while(p!=null){
            peliculas[i++] = p.getDato();
            p=p.enlace;
            } 

        quicksort(peliculas, 0, peliculas.length - 1);
            
        if(numPeliculas > 10){
            System.out.println();
            for(int j = 0; j < 10; j++){
                System.out.print("\n" + peliculas[j]);
            }
            return Arrays.copyOfRange(peliculas,0,10);
        }else{
            System.out.println();
            for(int j = peliculas.length - 1; j > -1; j--){
                System.out.print("\n" + peliculas[j]);
            }
            return peliculas;
        } 
                
        }   
     
           return lp;
    }
    
    //Busqueda binaria
    
    //Encotrar el nodo del medio
    public Nodo middleNode(Nodo inicio, Nodo ultimo)
    {
        if (inicio == null)
            return null;
 
        Nodo slow = inicio;
        Nodo fast = inicio.enlace;
 
        while (fast != ultimo)
        {
            fast = fast.enlace;
            if (fast != ultimo)
            {
                slow = slow.enlace;
                fast = fast.enlace;
            }
        }
        return slow;
    }
    
    //Codigo de la busqueda binaria
    public Pelicula binarySearch(int idPelicula)
    {
        Nodo start = this.inicio;
        Nodo last = null;
 
        do
        {
            // Find Middle
            Nodo mid = middleNode(start, last);
 
            // If middle is empty
            if (mid == null){
                System.out.println("Lista de peliculas vacía.");
                return null;
            }
            // If value is present at middle
            if (mid.getDato().getIdPelicula() == idPelicula){
                System.out.println("\n \n La pelicula es: " + mid.getDato());
                return mid.getDato();
            }    
 
            // If value is less than mid
            else if (mid.getDato().getIdPelicula() < idPelicula)
            {
                start = mid.getEnlace();
            }
 
            // If the value is more than mid.
            else {
                last = mid;}
        } while (last == null || last != start);
 
        // value not present
        System.out.println("Pelicula no encontrada");
        return null;
    }
    // ---------------------------------------------------------------------------
    //Metodo de ordenamiento por QuickSort donde ordena la lista segun su calificacion
    public static void quicksort(Pelicula a [], int primero, int ultimo){
        int i = primero, j = ultimo;
        Pelicula pivote = a[(primero + ultimo) / 2];
        while (i <= j){
            while (a[i].getCalificacionPelicula() > pivote.getCalificacionPelicula()){
                i++;
            }
            while (a[j].getCalificacionPelicula() < pivote.getCalificacionPelicula()){
                j--;
            }
            if (i <= j){
                intercambiar(a,i,j);
                i++;
                j--;
            }
        }
        if (primero < j){
            quicksort(a, primero, j);
        }
        if (i < ultimo){
            quicksort(a, i, ultimo);
        }
    }
    
    //Metodo para intercambiar el lugar de  un arreglo
    public static void intercambiar(Pelicula [] arreglo, int i, int k){
        Pelicula temp;
        temp = arreglo[i];
        arreglo [i] = arreglo [k];
        arreglo[k] = temp;
    }
       
    //Borrar
    public void borrarUnNodo(Pelicula pelicula){
    boolean bandera= true;
        if(estaVacia())
        JOptionPane.showMessageDialog (null, "No existen peliculas a eliminar","Error", JOptionPane.ERROR_MESSAGE);
        else {
            Nodo p, q, r;
            p = q = this.inicio;
            while(p != null) {
                if(pelicula.getNombrePelicula().compareToIgnoreCase(p.getDato().getNombrePelicula()) == 0) {
                    if(p == inicio) {
                        inicio = inicio.enlace;
                    }else{
                        q.enlace = p.enlace;
                        bandera=false;
                        JOptionPane.showMessageDialog (null, "La pelicula ha sido eliminada");
                        break;
                    }                
                }else {
                    q = p;
                    p = p.enlace;
                }
            }
            if(bandera=true){
             JOptionPane.showMessageDialog (null, "La pelicula ingresada no ha sido encontrada","Error", JOptionPane.ERROR_MESSAGE);
        }        
    }
}

     //Metodo para listar las peliculas por año de creacion
    public Pelicula[] ListarAñoCreacion(int año){
        Pelicula pelicula[]=new Pelicula[ContarPeliculas(año,"")];
        int i=0;
        if(estaVacia()){
            return null;
        }else{
            Nodo q, p;
            q=p=this.inicio;
             while(p!=null){
                 if(p.dato.getAñoPelicula()==año){
                     pelicula[i]=p.getDato();
                     i++;
                 }
              p=p.enlace;
          }  
        }
        return pelicula;
    }
    
    //Mostrar las peliculas segun el genero
    public Pelicula[] ListarGenero(String genero){
        Pelicula pelicula[]=new Pelicula[ContarPeliculas(0,genero)];
        int i=0;
        if(estaVacia()){
            return null;
        }else{
            Nodo q, p;
            q=p=this.inicio;
             while(p!=null){
                 if(p.dato.getGeneroPelicula().equalsIgnoreCase(genero)){
                     pelicula[i]=p.getDato();
                     i++;
                 }
              p=p.enlace;
          }  
        }
        return pelicula;
    }
    
    public int ContarPeliculas(int año, String genero){
    int contador=0;
    if(año!=0){
    if(estaVacia()){
            return contador;
        }else{
            Nodo q, p;
            q=p=this.inicio;
             while(p!=null){
                 if(p.dato.getAñoPelicula()==año){
                 contador++;
                 }
              p=p.enlace;
          }  
        }
    }else{
    if(estaVacia()){
            return contador;
        }else{
            Nodo q, p;
            q=p=this.inicio;
             while(p!=null){
                 if(p.dato.getGeneroPelicula().equals(genero)){
                 contador++;
                 }
              p=p.enlace;
          }  
        }
    }
     return contador;
}
    
    /*public String[] getGeneros(){
        String generosDisponibles[];
        
    return [];
    }*/
    
    //Busqueda lineal
    public Pelicula[] BuscarPelicula(String nombrePelicula){
        
        int numPeliculas = 0;
        
        if(estaVacia()){
            System.out.println("La lista esta vacia");
            return null;
        }else{
            Nodo p = this.inicio;
             while(p!=null){
              if(p.getDato().getNombrePelicula().equalsIgnoreCase(nombrePelicula)){
                  numPeliculas += 1;
              }
              p = p.getEnlace();
            }
             
             Pelicula peliculas [] = new Pelicula[numPeliculas]; 
             int i = 0;
             
             p = this.inicio;
             while(p!=null){
              if(p.getDato().getNombrePelicula().equalsIgnoreCase(nombrePelicula)){
                  peliculas[i++] = p.getDato();
              }
              p = p.getEnlace();
            }
             
             System.out.println();
            for(int j = peliculas.length - 1; j > -1; j--){
                System.out.print("\n" + peliculas[j]);
            }
            
            return peliculas;
        }
        
        
        
        
        
        /*Pelicula salida[]=new Pelicula[100];
        salida[0]=null;
        int index = 0;
        if(estaVacia()){
          // salida= new Pe;licula[]();
        }else{
            Nodo q, p;
            q=p=this.inicio;
             while(p!=null){
                 if(p.dato.getNombrePelicula().equals(nombrePelicula)){
                 salida[index]= p.getDato();
                 index++;
                 }
              p=p.enlace;
          }  
        }
        return salida;*/
    }

    //Agrega una pelicula a la cola
    
    public Queue agregarACola(int idPelicula){
           
        Pelicula pelicula = new Pelicula();
        
        if(estaVacia()){
            System.out.println("La lista de peliculas esta vacia");
        }else if(this.colaPeliculas.size() == 5){
            System.out.println("La cola de peliculas esta llena");
        }else{
            Nodo p = this.inicio;
             while(p!=null){
              if(p.getDato().getIdPelicula() == idPelicula){
                  pelicula = p.getDato();
                  p = null;
              }else{
              p = p.getEnlace();
              }
            }
            this.colaPeliculas.add(pelicula);
        }
        
        return this.colaPeliculas;
        
    }

    public Queue<Pelicula> getColaPeliculas() {
        return colaPeliculas;
    }

    public void setColaPeliculas(Queue<Pelicula> colaPeliculas) {
        this.colaPeliculas = colaPeliculas;
    }
    
    //Elimina una pelicula de la cabeza de la cola
    
    public Queue sacarUnaPelicula(){
        if(colaPeliculas.isEmpty()){
            JOptionPane.showMessageDialog( null, "La cola está vacía" );
            System.out.println("La cola está vacía");
        }else{
            colaPeliculas.remove(); 
        }
        return this.colaPeliculas;
    }
    
    
    
    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    @Override
    public String toString() {
        String salida="";
        if (estaVacia()){
            return "Lista Vacia";
        }else{
            salida = "\n\nLa lista de Peliculas es:";
            Nodo p = inicio;
        while(p!=null){
            salida += "\n" + p.getDato().toString();
            p = p.enlace;
        }
        }
        return salida;
    }
  
//Modificar  el  atributo  estado  de  Disponible  a  Prestado  de  aquellas  películas  que  el 
//usuario haya alquilado. 
public void modificarEstado(String nombrePelicula){
  Pelicula p = BuscarPelicula(nombrePelicula)[0];
  p.setEstadoPelicula(false);
}

/*Crear  un  método  seleccionarPeliculas  que  permita  al  usuario  seleccionar  las  películas 
que podría alquilar (máximo 5), guardar el  id de las películas que seleccione el usuario 
en una cola temporal, y muestre la información almacenada en la cola una vez que el 
usuario  haya  terminado  de  seleccionar  las  películas  que  le  interesa  o  cuando  haya 
llegado al máximo permitido (5). */

  }