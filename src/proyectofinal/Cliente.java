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
public class Cliente extends Persona{
    int RUCc;

    public Cliente(int RUCc, String Nombre, String Apellido) {
        super(Nombre, Apellido);
        this.RUCc = RUCc;
    }

    public void setRUCc(int RUCc) {
        this.RUCc = RUCc;
    }
    
}
