/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;


import controlador.controladorFactura;

import modelo.modeloFactura;


import vista.vistaFactura;


public class arranque {
    public static void main(String[]args){
 vistaFactura vista = new vistaFactura();
    modeloFactura modelo = new modeloFactura(vista);
    controladorFactura control = new controladorFactura(vista,modelo);
    modelo.inicio();
    vista.setLocationRelativeTo(null);
    vista.setVisible(true);
    }
}
