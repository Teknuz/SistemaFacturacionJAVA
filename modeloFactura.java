package modelo;

import java.awt.Frame;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import vista.vistaFactura;

/**
 *
 * @author Jose
 */
public class modeloFactura {

    private String id;
    private String codcliente;
    private String usuario;
    private String condicion;
    private String fecha;
    private String numero;
    private String estado;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelocliente;
    DefaultTableModel modeloproducto;
    DefaultTableModel modelodetalle;
    DefaultTableModel modelofactura;
    vistaFactura vista;

    public modeloFactura(vistaFactura vista) {
        this.vista = vista;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(String codcliente) {
        this.codcliente = codcliente;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // funcionalidades
    public void bloquearobjetos(boolean a) {
        vista.txtnumerofac.setEnabled(a);
        vista.txtfecha.setEnabled(a);
        vista.rbncontado.setEnabled(a);
        vista.rbncredito.setEnabled(a);
        vista.txtcodigopro.setEnabled(a);
        vista.txtcantidadpro.setEnabled(a);
        vista.btnbuscarcli.setEnabled(a);
        vista.btnadd.setEnabled(a);
        vista.btnborrar.setEnabled(a);
    }
    public void limpiar() {
        vista.txtnumerofac.setText("");
        vista.txtfecha.setText("");
        vista.rbncontado.setEnabled(true);
        vista.txtcodigopro.setText("");
        vista.txtcantidadpro.setText("");
        vista.txtestado.setText("PENDIENTE");
        vista.txtcodigofac.setText("");
        vista.txtcodigocli.setText("");
        vista.txtnombrecli.setText("");
        vista.txtapellidocli.setText("");
        vista.txtrucxli.setText("");
        vista.txtproducto.setText("");
        modelodetalle.setRowCount(0);
        totales();
        
        
       
    }

    public void activaBotones(boolean n, boolean g, boolean i, boolean b, boolean a) {
        vista.btnnuevo.setEnabled(n);
        vista.btnguardar.setEnabled(g);
        vista.btnimprimir.setEnabled(i);
        vista.btnbuscar.setEnabled(b);
        vista.btnanular.setEnabled(a);
    }

    public void inicio() {
        bloquearobjetos(false);
        activaBotones(true, false, false, true, false);
        modelocliente = (DefaultTableModel) vista.tablaclientebus.getModel();
        modeloproducto = (DefaultTableModel) vista.tablaproductobus.getModel();
        modelodetalle = (DefaultTableModel) vista.tabladetallefac.getModel();
        modelofactura =(DefaultTableModel) vista.tablafactbus.getModel();

    }

    public void llamarbuscadorcliente() {
        vista.buscadorcliente.setSize(685, 441);
        vista.buscadorcliente.setLocationRelativeTo(vista);
        vista.buscadorcliente.setVisible(true);
    }

    public void cargartablacliente(String filtro) {

        String sql = "select * from clientes where cli_apellido like '" + filtro + "%'";

        try {
            modelocliente.setRowCount(0);
            st = utilidades.conexion.sta(st);
            rs = st.executeQuery(sql);
            while (rs.next()) {
                modelocliente.addRow(new Object[]{
                    rs.getString("idclientes"),
                    rs.getString("cli_nombre"),
                    rs.getString("cli_apellido"),
                    rs.getString("cli_ruc")
                });
            }
            vista.tablaclientebus.setModel(modelocliente);
            st.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(modeloFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void transferircliente() {
        Integer fila = vista.tablaclientebus.getSelectedRow();

        vista.txtcodigocli.setText(vista.tablaclientebus.getValueAt(fila, 0).toString());
        vista.txtnombrecli.setText(vista.tablaclientebus.getValueAt(fila, 1).toString());
        vista.txtapellidocli.setText(vista.tablaclientebus.getValueAt(fila, 2).toString());
        vista.txtrucxli.setText(vista.tablaclientebus.getValueAt(fila, 3).toString());

        vista.buscadorcliente.setVisible(false);
        vista.txtcodigopro.requestFocus();

    }

    public void buscarprocod(String cod) {
        String sql = "Select * from productos where idproductos = '" + cod + "'";

        try {
            st = utilidades.conexion.sta(st);
            rs = st.executeQuery(sql);
            rs.next();
            if (rs.getRow() == 0) {
                vista.txtproducto.setText("Producto no encontrado");
            } else {
                vista.txtproducto.setText(rs.getString("pro_nombre"));
                vista.txtcantidadpro.requestFocus();
            }
            st.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(modeloFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void llamarbuscadorproducto() {
        vista.buscadorproducto.setSize(730, 480);
        vista.buscadorproducto.setLocationRelativeTo(vista);
        vista.buscadorproducto.setVisible(true);
        vista.txtfiltropro.requestFocus();
    }

    public void cargartablaproducto(String filtro) {
        String sql = "Select * from productos where pro_nombre like '" + filtro + "%'";
        modeloproducto.setRowCount(0);
        try {
            st = utilidades.conexion.sta(st);
            rs = st.executeQuery(sql);
            while (rs.next()) {
                modeloproducto.addRow(new Object[]{
                    rs.getString("idproductos"),
                    rs.getString("pro_nombre"),
                    rs.getString("pro_precio"),
                    rs.getString("pro_cantidad")
                });
            }
            vista.tablaproductobus.setModel(modeloproducto);
            st.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(modeloFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void transferirproductos() {
        Integer fila = vista.tablaproductobus.getSelectedRow();

        vista.txtcodigopro.setText(vista.tablaproductobus.getValueAt(fila, 0).toString());
        vista.txtproducto.setText(vista.tablaproductobus.getValueAt(fila, 1).toString());
        vista.buscadorproducto.setVisible(false);
        vista.txtcantidadpro.requestFocus();
    }

    public void añadirproducto(String codigo) {
        String sql = "select * from productos where idproductos='" + codigo + "'";

        try {
            st = utilidades.conexion.sta(st);
            rs = st.executeQuery(sql);
            rs.next();
            if (rs.getRow() == 0) {
                JOptionPane.showMessageDialog(vista, "Producto no encontrado");
            } else {
                String iva = rs.getString("pro_iva");

                if (iva.equals("10")) {
                    modelodetalle.addRow(new Object[]{
                        rs.getString("idproductos"),
                        rs.getString("pro_nombre"),
                        rs.getString("pro_precio"),
                        vista.txtcantidadpro.getText(),
                        "",
                        "",
                        Integer.parseInt(vista.txtcantidadpro.getText()) * Integer.parseInt(rs.getString("pro_precio"))
                    });
                }
                if (iva.equals("5")) {
                    modelodetalle.addRow(new Object[]{
                        rs.getString("idproductos"),
                        rs.getString("pro_nombre"),
                        rs.getString("pro_precio"),
                        vista.txtcantidadpro.getText(),
                        "",
                        Integer.parseInt(vista.txtcantidadpro.getText()) * Integer.parseInt(rs.getString("pro_precio")),
                        ""
                    });
                }
                if (iva.equals("0")) {
                    modelodetalle.addRow(new Object[]{
                        rs.getString("idproductos"),
                        rs.getString("pro_nombre"),
                        rs.getString("pro_precio"),
                        vista.txtcantidadpro.getText(),
                        Integer.parseInt(vista.txtcantidadpro.getText()) * Integer.parseInt(rs.getString("pro_precio")),
                        "",
                        ""
                    });
                }
            }
            st.close();
            rs.close();
            vista.tabladetallefac.setModel(modelodetalle);
        } catch (SQLException ex) {
            Logger.getLogger(modeloFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarproducto() {
        int fila = vista.tabladetallefac.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Seleccione un producto para eliminar");
        } else {
            modelodetalle.removeRow(fila);
        }
    }

    public void totales() {
        int cantfilas = vista.tabladetallefac.getRowCount();
        int sumaex = 0, suma5 = 0, suma10 = 0;

        for (int i = 0; i < cantfilas; i++) {
            if (!vista.tabladetallefac.getValueAt(i, 4).equals("")) {
                sumaex = sumaex + Integer.parseInt(vista.tabladetallefac.getValueAt(i, 4).toString());
            }
            if (!vista.tabladetallefac.getValueAt(i, 5).equals("")) {
                suma5 = suma5 + Integer.parseInt(vista.tabladetallefac.getValueAt(i, 5).toString());
            }
            if (!vista.tabladetallefac.getValueAt(i, 6).equals("")) {
                suma10 = suma10 + Integer.parseInt(vista.tabladetallefac.getValueAt(i, 6).toString());
            }
        }
        vista.txtexnta.setText(Integer.toString(sumaex));
        vista.txt5.setText(Integer.toString(suma5));
        vista.txt10.setText(Integer.toString(suma10));

        vista.txttotalfac.setText(Integer.toString(sumaex + suma5 + suma10));
        vista.txtliq5.setText(Integer.toString(suma5 / 21));
        vista.txtliq10.setText(Integer.toString(suma10 / 11));
        vista.txttotaliva.setText(Integer.toString(Integer.parseInt(vista.txtliq5.getText())+Integer.parseInt(vista.txtliq10.getText())));
    }
    public void generarcodigo(){
        String sql ="select ifnull(max(idfacturacion),0)+1 as codigo from facturacion";
        
        try {
            st=utilidades.conexion.sta(st);
            rs= st.executeQuery(sql);
            rs.next();
            vista.txtcodigofac.setText(rs.getString("codigo"));
            st.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(modeloFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void guardarfactura(){
        String sql = "insert into facturacion (idfacturacion,clientes_idclientes,usuarios_idusuarios,fa_condicion,fa_fecha,fa_numero,fa_estado) values ('"+id+"','"+codcliente+"','"+usuario+"','"+condicion+"','"+fecha+"','"+numero+"','"+estado+"')";
        
        try {
            st= utilidades.conexion.sta(st);
            st.executeUpdate(sql);
            st.close();
            JOptionPane.showMessageDialog(vista, "CABECERA GUARDADA");
        } catch (SQLException ex) {
            Logger.getLogger(modeloFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void cargardetallefactura(){
        String sql;
        Integer cantidaditem = vista.tabladetallefac.getRowCount();
        
        for(int i =0; i<cantidaditem;i++){
            sql="insert into detallefacturacion (facturacion_idfacturacion,productos_idproductos,det_cantidad,det_precio) values ('"+id+"','"+vista.tabladetallefac.getValueAt(i, 0)+"','"+vista.tabladetallefac.getValueAt(i, 3)+"','"+vista.tabladetallefac.getValueAt(i, 2)+"')";
            try {
                st=utilidades.conexion.sta(st);
                st.executeUpdate(sql);
                st.close();
            } catch (SQLException ex) {
                Logger.getLogger(modeloFactura.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        JOptionPane.showMessageDialog(vista, "DETALLE GUARDADO");
    }
    public void descontarstock(){
        String sql;
        Integer cantidaditem = vista.tabladetallefac.getRowCount();
        
        for(int i=0;i<cantidaditem;i++){
            sql="update productos set pro_cantidad=pro_cantidad-'"+vista.tabladetallefac.getValueAt(i, 3)+"' where idproductos='"+vista.tabladetallefac.getValueAt(i, 0)+"'";
            try {
                st=utilidades.conexion.sta(st);
                st.executeUpdate(sql);
                st.close();
            } catch (SQLException ex) {
                Logger.getLogger(modeloFactura.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    public void aumentarstock(){
        String sql;
        Integer cantidaditem = vista.tabladetallefac.getRowCount();
        
        for(int i=0;i<cantidaditem;i++){
            sql="update productos set pro_cantidad=pro_cantidad+'"+vista.tabladetallefac.getValueAt(i, 3)+"' where idproductos='"+vista.tabladetallefac.getValueAt(i, 0)+"'";
            try {
                st=utilidades.conexion.sta(st);
                st.executeUpdate(sql);
                st.close();
            } catch (SQLException ex) {
                Logger.getLogger(modeloFactura.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    public void llamarInforme() {

        int nume = Integer.parseInt(vista.txttotalfac.getText());//obtener lo que vamos a convertir
        utilidades.numero n = new utilidades.numero();
        String letras = n.convertirLetras(nume) + ".-";
        Connection conn = null;
        String RUTALOCAL = System.getProperty("user.dir");
        try {
            conn = utilidades.conexion.enlace(conn);
            HashMap parametros = new HashMap();
            parametros.put("factura", vista.txtcodigofac.getText());
            parametros.put("diez", vista.txt10.getText());
            parametros.put("cinco", vista.txt5.getText());
            parametros.put("exenta", vista.txtexnta.getText());
            parametros.put("totaliva", vista.txttotaliva.getText());
            parametros.put("liq5", vista.txtliq5.getText());
            parametros.put("liq10", vista.txtliq10.getText());
            parametros.put("total", vista.txttotalfac.getText());
            parametros.put("letras", letras);
            JasperPrint jp = JasperFillManager.fillReport(RUTALOCAL + "/src/informes/factura.jasper", parametros, conn);
            JasperViewer view = new JasperViewer(jp, false);
            view.setTitle("FACTURA");
            //view.setExtendedState(Frame.MAXIMIZED_BOTH);
            view.setVisible(true); //imprimir con vista previa

            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void llamarbuscadorfac(){
        vista.buscadorfactura.setSize(850,400);
        vista.buscadorfactura.setLocationRelativeTo(vista);
        vista.buscadorfactura.setVisible(true);
        vista.txtfechainicio.requestFocus();
        
    }
    public void cargarfacturas(){
        String sql = "select * from facturacion f inner join clientes c on f.clientes_idclientes=c.idclientes where fa_fecha between '"+vista.txtfechainicio.getText()+"' and '"+vista.txtfechafin.getText()+"'";
        modelofactura.setRowCount(0);
        try {
            st=utilidades.conexion.sta(st);
            rs= st.executeQuery(sql);
            while(rs.next()){
                modelofactura.addRow(new Object[]{
                    rs.getString("idfacturacion"),
                    rs.getString("fa_numero"),
                    rs.getString("fa_condicion"),
                    rs.getString("fa_fecha"),
                    rs.getString("fa_estado"),
                    rs.getString("clientes_idclientes"),
                    rs.getString("cli_nombre"),
                    rs.getString("cli_apellido"),
                    rs.getString("cli_ruc")
                });
            }
            vista.tablafactbus.setModel(modelofactura);
            st.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(modeloFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
   public void transferirfactura(){
        int fila = vista.tablafactbus.getSelectedRow();
        vista.txtcodigofac.setText(vista.tablafactbus.getValueAt(fila, 0).toString());
        vista.txtnumerofac.setText(vista.tablafactbus.getValueAt(fila, 1).toString());
        if(vista.tablafactbus.getValueAt(fila, 2).toString().equals("CONTADO")){
            vista.rbncontado.setSelected(true);
        }else{
            vista.rbncredito.setSelected(true);
        }
        vista.txtfecha.setText(vista.tablafactbus.getValueAt(fila, 3).toString());
        if(vista.tablafactbus.getValueAt(fila, 4).toString().equals("P")){
            vista.txtestado.setText("PENDIENTE");
        }
        if(vista.tablafactbus.getValueAt(fila, 4).toString().equals("A")){
            vista.txtestado.setText("ANULADO");
        }
        if(vista.tablafactbus.getValueAt(fila, 4).toString().equals("C")){
            vista.txtestado.setText("COBRADO");
        }
        vista.txtcodigocli.setText(vista.tablafactbus.getValueAt(fila, 5).toString());
        vista.txtnombrecli.setText(vista.tablafactbus.getValueAt(fila, 6).toString());
        vista.txtapellidocli.setText(vista.tablafactbus.getValueAt(fila, 7).toString());
        vista.txtrucxli.setText(vista.tablafactbus.getValueAt(fila, 8).toString());
        //cargar detalle de la factura
        
        String sql="select d.facturacion_idfacturacion, d.productos_idproductos, d.det_cantidad, d.det_precio, ";
        sql+="p.pro_nombre, if(p.pro_iva='0',d.det_cantidad*d.det_precio,'') as exenta, ";
        sql+="if(p.pro_iva='5',d.det_cantidad*d.det_precio,'') as cinco, ";
        sql+="if(p.pro_iva='10',d.det_cantidad*d.det_precio,'') as diez ";
        sql+="from detallefacturacion d inner join productos p on d.productos_idproductos=p.idproductos where facturacion_idfacturacion ='"+vista.tablafactbus.getValueAt(fila, 0).toString()+"'";
        modelodetalle.setRowCount(0);
        try {
            st=utilidades.conexion.sta(st);
            rs=st.executeQuery(sql);
            while(rs.next()){
                modelodetalle.addRow(new Object[]{
                    rs.getString("d.productos_idproductos"),
                    rs.getString("p.pro_nombre"),
                    rs.getString("d.det_precio"),
                    rs.getString("d.det_cantidad"),
                    rs.getString("exenta"),
                    rs.getString("cinco"),
                    rs.getString("diez")
                });
            }
            vista.tabladetallefac.setModel(modelodetalle);
            st.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(modeloFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
        totales();
        vista.buscadorfactura.setVisible(false);
        activaBotones(false, false, true, true, true);
    }


    public void anularifactura(){
        if(vista.txtestado.getText().equals("PENDIENTE")){
            String sql = "update facturacion set fa_estado='A' where idfacturacion='"+vista.txtcodigofac.getText()+"'";
            try {
                st=utilidades.conexion.sta(st);
                st.executeUpdate(sql);
                st.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(modeloFactura.class.getName()).log(Level.SEVERE, null, ex);
            }
            //aumentar stock
            aumentarstock();
            
            JOptionPane.showMessageDialog(vista, "ANULADO");
            vista.txtestado.setText("ANULADO");
        }
        
    }
    public void cancelar(){
        bloquearobjetos(true);
        limpiar();
        activaBotones(true, false, false, true, false);
        vista.btnnuevo.requestFocus();
        
    }
}
