package modelo;

import controlador.menucontrolador;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vista.menuprincipalvista;
import vista.vistalogin;

/**
 *
 * @author Jose
 */
public class modelologin {

    public String usuario;
    public String clave;
    Statement st;
    ResultSet rs;
    vistalogin vista;

    public modelologin(vistalogin vista) {
        this.vista = vista;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    //fucnionalidades
    public void acceder() {
        String sql = "select * from usuarios where us_nombre'" + usuario + "' and us_clave='" + clave + "'";

        try {
            st = utilidades.conexion.sta(st);
            rs = st.executeQuery(sql);
            rs.next();
            if (rs.getRow() == 0) {
                JOptionPane.showMessageDialog(vista, "DATOS INCORRECTOS");
            } else{
            menuprincipalvista v = new menuprincipalvista();
                menumodelo m = new menumodelo(v);
                menucontrolador c = new menucontrolador(v, m);
                 v.setLocationRelativeTo(null);
                   v.setVisible(true);
             
            }
        } catch (SQLException ex) {
            Logger.getLogger(modelologin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
