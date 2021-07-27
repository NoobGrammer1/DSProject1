/*
Crear  una  matrizPeliculas  de  10  fila  y  n  columnas.  Cada  fila  corresponde  a  una  película,  las 
columnas representan la información correspondiente a la película (id de la película, nombre, 
año, calificación, género, estado). La información de la matrizPeliculas se usará para inicializar 
la lista. Se deberá crear una clase listaPeliculas, cada Nodo de la lista representa una película. 
Se  debe  inicializar  la  listaPeliculas  con  la  información  almacenada  en  la  matriz,  todas  las 
películas deben estar inicializadas con el estado Disponible. Para insertar la información desde 
la matriz hacia la lista utilizar el método de ordenamiento por inserción (ordenar por nombre)
 */
package proyecto1;

/**
 *
 * @author AdminBeta
 */
public class Inicializador {

    private String matrizInicial[][];
    
    //inicializo con el constructor
    public Inicializador() {
        this.matrizInicial = new String[11][6];
    }
    
    //seteamos la matriz
    
    public void setInicializador() {
        this.matrizInicial[0][0] = "1";
        this.matrizInicial[0][1] = "Rapidos y Furiosos 1";
        this.matrizInicial[0][2] = "2014";
        this.matrizInicial[0][3] = "8";
        this.matrizInicial[0][4] = "Acción";
        this.matrizInicial[0][5] = "true";
        //Pelicula 2
        this.matrizInicial[1][0] = "2";
        this.matrizInicial[1][1] = "El conjuro";
        this.matrizInicial[1][2] = "2015";
        this.matrizInicial[1][3] = "9";
        this.matrizInicial[1][4] = "Terror";
        this.matrizInicial[1][5] = "true";
        //Pelicula 3
        this.matrizInicial[2][0] = "3";
        this.matrizInicial[2][1] = "It";
        this.matrizInicial[2][2] = "2014";
        this.matrizInicial[2][3] = "7";
        this.matrizInicial[2][4] = "Terror";
        this.matrizInicial[2][5] = "true";
        //Pelicula 4
        this.matrizInicial[3][0] = "4";
        this.matrizInicial[3][1] = "Rio";
        this.matrizInicial[3][2] = "2014";
        this.matrizInicial[3][3] = "5";
        this.matrizInicial[3][4] = "Anime";
        this.matrizInicial[3][5] = "true";
        //Pelicula 5
        this.matrizInicial[4][0] = "5";
        this.matrizInicial[4][1] = "Max";
        this.matrizInicial[4][2] = "2014";
        this.matrizInicial[4][3] = "8";
        this.matrizInicial[4][4] = "Acción";
        this.matrizInicial[4][5] = "true";
        //Pelicula 6
        this.matrizInicial[5][0] = "6";
        this.matrizInicial[5][1] = "Terminator";
        this.matrizInicial[5][2] = "2014";
        this.matrizInicial[5][3] = "8";
        this.matrizInicial[5][4] = "Acción";
        this.matrizInicial[5][5] = "true";
        //Pelicula 7
        this.matrizInicial[6][0] = "7";
        this.matrizInicial[6][1] = "Rapidos y Furiosos 1";
        this.matrizInicial[6][2] = "2014";
        this.matrizInicial[6][3] = "8";
        this.matrizInicial[6][4] = "Acción";
        this.matrizInicial[6][5] = "true";
        //Pelicula 8
        this.matrizInicial[7][0] = "8";
        this.matrizInicial[7][1] = "Coco";
        this.matrizInicial[7][2] = "2017";
        this.matrizInicial[7][3] = "9";
        this.matrizInicial[7][4] = "Anime";
        this.matrizInicial[7][5] = "true";
        //Pelicula 9
        this.matrizInicial[8][0] = "9";
        this.matrizInicial[8][1] = "Duro de matar";
        this.matrizInicial[8][2] = "1988";
        this.matrizInicial[8][3] = "7";
        this.matrizInicial[8][4] = "Acción";
        this.matrizInicial[8][5] = "true";
        //Pelicula 10
        this.matrizInicial[9][0] = "10";
        this.matrizInicial[9][1] = "Deadpool";
        this.matrizInicial[9][2] = "2016";
        this.matrizInicial[9][3] = "8";
        this.matrizInicial[9][4] = "Comedia";
        this.matrizInicial[9][5] = "true";
        //Pelicula 11
        this.matrizInicial[10][0] = "11";
        this.matrizInicial[10][1] = "Cadáver";
        this.matrizInicial[10][2] = "2018";
        this.matrizInicial[10][3] = "10";
        this.matrizInicial[10][4] = "Terror";
        this.matrizInicial[10][5] = "true";
    }

    public String[][] getMatrizInicial() {
        return matrizInicial;
    }

    public void setMatrizInicial(String[][] matrizInicial) {
        this.matrizInicial = matrizInicial;
    }
    
}
