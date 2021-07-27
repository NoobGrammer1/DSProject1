/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author AdminBeta
 */
    public class Nodo {
        
        Pelicula dato;
        Nodo enlace;

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
        

    public Nodo(Pelicula dato) {
        this.dato =dato;
        this.enlace = null;
    }
    

    public Nodo(Pelicula dato, Nodo enlace) {
        this.dato = dato;
        this.enlace = enlace;
    }

    public Pelicula getDato() {
        return dato;
    }

    public void setDato(Pelicula dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato.toString() + '}';
    }  

    }
