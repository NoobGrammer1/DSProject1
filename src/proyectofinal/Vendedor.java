/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author Oscar
 */
public class Vendedor extends Persona{
    int RUCv;
    String codigo;

    public Vendedor(int RUCv, String codigo, String Nombre, String Apellido) {
        super(Nombre, Apellido);
        this.RUCv = RUCv;
        this.codigo = codigo;
    }

    public void setRUCv(int RUCv) {
        this.RUCv = RUCv;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
