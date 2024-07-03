
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.modelologin;
import vista.vistalogin;

/**
 *
 * @author Jose
 */
public class logincontrolador implements ActionListener{
    vistalogin vista;
    modelologin modelo;

    public logincontrolador(vistalogin vista, modelologin modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.btnaceptar.addActionListener(this);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object p = e.getSource();
        
        if(p.equals(vista.btnaceptar)){
            modelo.setUsuario(vista.txtusuario.getText());
            modelo.setClave(vista.txtclave.getText());
            modelo.acceder();
        }
    }
    
    
}
