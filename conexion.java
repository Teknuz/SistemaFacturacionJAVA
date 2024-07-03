package utilidades;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jose
 */
public class conexion {
    static Connection conn=null;
    static Statement st=null;
    static String bd= "ejemploguido";
    static String usuario="root";
    static String clave="";
    static String url="jdbc:mysql://localhost:3306/"+bd;
    
    //se crea la clase conexion para que sirva de enlace a la base de datos
    
    public static Connection enlace(Connection conn) throws SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, usuario, clave);
        }catch(Exception e){
            System.err.println("Base de datos no conectada");
        }
        return conn;
    }
    
    //para preparar la conexion y ejecutar las sentencias en base de datos (SQL)
    
   public static Statement sta(Statement st) throws SQLException {
        conn = enlace(conn);
        st = conn.createStatement();
        return st;
    }
}
