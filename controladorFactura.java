
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import modelo.modeloFactura;
import vista.vistaFactura;

/**
 *
 * @author Jose
 */
public class controladorFactura implements ActionListener, KeyListener{
    
    vistaFactura vista;
    modeloFactura modelo;

    public controladorFactura(vistaFactura vista, modeloFactura modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.btnnuevo.addActionListener(this);
        vista.btnbuscarcli.addActionListener(this);
        vista.txtfiltrocli.addKeyListener(this);
        vista.txtcodigopro.addActionListener(this);
        vista.btnaceptarcli.addActionListener(this);
        vista.txtfiltropro.addKeyListener(this);
        vista.btnaceptarpro.addActionListener(this);
        vista.btnadd.addActionListener(this);
        vista.btnborrar.addActionListener(this);
        vista.txtnumerofac.addActionListener(this);
        vista.txtfecha.addActionListener(this);
        vista.rbncontado.addActionListener(this);
        vista.rbncontado.addKeyListener(this);
        vista.rbncredito.addActionListener(this);
        vista.txtcantidadpro.addActionListener(this);
        vista.btnguardar.addActionListener(this);
        vista.btnimprimir.addActionListener(this);
        vista.btnbuscar.addActionListener(this);
        vista.txtfechafin.addActionListener(this);
        vista.btnaceptar.addActionListener(this);
        vista.btnanular.addActionListener(this);
        vista.btncancelar.addActionListener(this);
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object p = e.getSource();
        if(p.equals(vista.btncancelar)){
            modelo.cancelar();
        }
        if(p.equals(vista.btnanular)){
            modelo.anularifactura();
        }
        if(p.equals(vista.btnaceptar)){
            //modelo.setId(vista.txtcodigofac.getText());
            modelo.transferirfactura();
        }
        if(p.equals(vista.txtfechafin)){
            modelo.cargarfacturas();
        }
        if(p.equals(vista.btnbuscar)){
            modelo.llamarbuscadorfac();
        }
        if(p.equals(vista.btnimprimir)){
            modelo.llamarInforme();
        }
        if(p.equals(vista.btnguardar)){
            modelo.setId(vista.txtcodigofac.getText());
            modelo.setCodcliente(vista.txtcodigocli.getText());
            modelo.setUsuario(vista.txtcodigousu.getText());
            String condicion;
            if(vista.rbncontado.isSelected()==true){
                condicion="CONTADO";
            }else{
                condicion="CREDITO";
            }
            modelo.setCondicion(condicion);
            modelo.setFecha(vista.txtfecha.getText());
            modelo.setNumero(vista.txtnumerofac.getText());
            if(vista.txtestado.getText().equals("PENDIENTE")){
               modelo.setEstado("P"); 
            }
            modelo.guardarfactura();
            modelo.cargardetallefactura();
            modelo.descontarstock();
            modelo.bloquearobjetos(true);
            modelo.activaBotones(true, false, true, false, false);
        }
        if(p.equals(vista.txtcantidadpro)){
            vista.btnadd.requestFocus();
        }
        if(p.equals(vista.rbncredito)){
            vista.btnbuscarcli.requestFocus();
        }
        if(p.equals(vista.rbncontado)){
            vista.btnbuscarcli.requestFocus();
        }
        if(vista.txtfecha.equals(p)){
            vista.rbncontado.requestFocus();
        }
        if(vista.txtnumerofac.equals(p)){
            vista.txtfecha.requestFocus();
        }
        if(p.equals(vista.btnborrar)){
            modelo.eliminarproducto();
            modelo.totales();
        }
        if(p.equals(vista.btnadd)){
            modelo.añadirproducto(vista.txtcodigopro.getText());
            modelo.totales();
            vista.txtcodigopro.setText("");
            vista.txtproducto.setText("");
            vista.txtcantidadpro.setText("");
            vista.txtcodigopro.requestFocus();
        }
        if(p.equals(vista.btnnuevo)){
            modelo.bloquearobjetos(true);
            modelo.activaBotones(false, true, false, false, false);
            modelo.generarcodigo();
            vista.txtnumerofac.requestFocus();
        }
        if(p.equals(vista.btnbuscarcli)){
            modelo.llamarbuscadorcliente();
            vista.txtfiltrocli.requestFocus();
            modelo.cargartablacliente("");
        }
        if(p.equals(vista.txtcodigopro)){
            if(vista.txtcodigopro.getText().trim().length()==0){
                modelo.llamarbuscadorproducto();
                modelo.cargartablaproducto("");
            }else{
                modelo.buscarprocod(vista.txtcodigopro.getText());
            }
            
        }
        if(p.equals(vista.btnaceptarcli)){
            modelo.transferircliente();
        }
        if(p.equals(vista.btnaceptarpro)){
            modelo.transferirproductos();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        Object p = e.getSource();
        
        if(p.equals(vista.rbncontado)){
            vista.rbncredito.requestFocus();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        Object p = e.getSource();
        if(p.equals(vista.txtfiltrocli)){
            modelo.cargartablacliente(vista.txtfiltrocli.getText());
        }
        if(p.equals(vista.txtfiltropro)){
            modelo.cargartablaproducto(vista.txtfiltropro.getText());
        }
    }
    
}
