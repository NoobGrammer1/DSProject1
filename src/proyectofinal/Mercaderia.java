/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author stali
 */
public class Mercaderia {
    
private String nombre;
private int codigo;
private int cantidad;
private double precio;

//contructores

    public Mercaderia() {
    }

    public Mercaderia(String nombre, int codigo, int cantidad, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

//metodos set

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    //metodos get

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }
    //metodo toString

    @Override
    public String toString() {
        return "Mercaderia{" + "nombre=" + nombre + ", codigo=" + codigo + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }
    

}
