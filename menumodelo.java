
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.menuprincipalvista;

/**
 *
 * @author Jose
 */
public class menumodelo {
    menuprincipalvista vista;
    Statement st;
    ResultSet rs;

    public menumodelo(menuprincipalvista vista) {
        this.vista = vista;
    }
    
  
    
}
