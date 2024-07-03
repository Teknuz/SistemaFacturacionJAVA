package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.menumodelo;
import modelo.modeloFactura;
import vista.menuprincipalvista;
import vista.vistaFactura;

/**
 *
 * @author Jose
 */
public class menucontrolador implements ActionListener {

    menuprincipalvista vista;
    menumodelo modelo;

    public menucontrolador(menuprincipalvista vista, menumodelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.menufactura.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object p = e.getSource();
        if (p.equals(vista.menufactura)) {
            vistaFactura v = new vistaFactura();
            modeloFactura m = new modeloFactura(v);
            controladorFactura control = new controladorFactura(v, m);
            m.inicio();
            v.setLocationRelativeTo(null);
            v.setVisible(true);
        }
    }

}
