/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueogeneral;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Cliente {
    private int password;
    private String nombreUsuario;
    public boolean tienecuenta;
    private  int idusuario;
    
    public void corroborarcuenta(boolean tienecuenta){
        if (this.tienecuenta == false){
           JOptionPane.showMessageDialog(null,"Usuario Invalido");
        };
    }
}
