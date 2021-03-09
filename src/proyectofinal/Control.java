/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author jairo
 */
public class Control {
    
    double precioTotal = 0;
    
    public double precioPorUnidad ( double precio){
        double precioProduc = 1.3 * precio;
        setPrecioTotal(precioProduc+this.precioTotal);
        
        return precioProduc;
    }
    
    public double precioPorProducto (int cantidad, double precio){
        double precioProduc = cantidad*precio;
        setPrecioTotal(precioProduc+this.precioTotal);
        
        return precioProduc;
    }
    //setter y getter

    public double getPrecioTotal() {
        return precioTotal;
    }
    
    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
    
}
