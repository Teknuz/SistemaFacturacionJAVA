/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author guido
 */
public class vistaFactura extends javax.swing.JFrame {

    /**
     * Creates new form vistaFactura
     */
    public vistaFactura() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buscadorcliente = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        txtfiltrocli = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaclientebus = new javax.swing.JTable();
        btnaceptarcli = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buscadorproducto = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        txtfiltropro = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaproductobus = new javax.swing.JTable();
        btnaceptarpro = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        buscadorfactura = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        txtfechainicio = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtfechafin = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablafactbus = new javax.swing.JTable();
        btnaceptar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtcodigousu = new javax.swing.JLabel();
        txtnombreusu = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnumerofac = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rbncontado = new javax.swing.JRadioButton();
        rbncredito = new javax.swing.JRadioButton();
        txtestado = new javax.swing.JLabel();
        txtcodigofac = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcodigocli = new javax.swing.JTextField();
        txtrucxli = new javax.swing.JTextField();
        txtnombrecli = new javax.swing.JTextField();
        txtapellidocli = new javax.swing.JTextField();
        btnbuscarcli = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtcodigopro = new javax.swing.JTextField();
        txtproducto = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtcantidadpro = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnborrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabladetallefac = new javax.swing.JTable();
        txtexnta = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt10 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtliq5 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtliq10 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txttotaliva = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txttotalfac = new javax.swing.JTextField();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnimprimir = new javax.swing.JButton();
        btnanular = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();

        jLabel5.setText("Buscar cliente");

        txtfiltrocli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfiltrocliActionPerformed(evt);
            }
        });

        tablaclientebus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "codigo", "nombre", "apellido", "ruc"
            }
        ));
        jScrollPane1.setViewportView(tablaclientebus);
        if (tablaclientebus.getColumnModel().getColumnCount() > 0) {
            tablaclientebus.getColumnModel().getColumn(0).setMinWidth(50);
            tablaclientebus.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaclientebus.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        btnaceptarcli.setText("Aceptar");

        javax.swing.GroupLayout buscadorclienteLayout = new javax.swing.GroupLayout(buscadorcliente.getContentPane());
        buscadorcliente.getContentPane().setLayout(buscadorclienteLayout);
        buscadorclienteLayout.setHorizontalGroup(
            buscadorclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscadorclienteLayout.createSequentialGroup()
                .addGroup(buscadorclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buscadorclienteLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(buscadorclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(buscadorclienteLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtfiltrocli, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(buscadorclienteLayout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(btnaceptarcli)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        buscadorclienteLayout.setVerticalGroup(
            buscadorclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscadorclienteLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(buscadorclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtfiltrocli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnaceptarcli)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jLabel12.setText("PRODUCTOS");

        tablaproductobus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "PRODUCTO", "CANTIDAD", "PRECIO"
            }
        ));
        jScrollPane3.setViewportView(tablaproductobus);

        btnaceptarpro.setText("ACEPTAR");

        javax.swing.GroupLayout buscadorproductoLayout = new javax.swing.GroupLayout(buscadorproducto.getContentPane());
        buscadorproducto.getContentPane().setLayout(buscadorproductoLayout);
        buscadorproductoLayout.setHorizontalGroup(
            buscadorproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscadorproductoLayout.createSequentialGroup()
                .addGroup(buscadorproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buscadorproductoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(buscadorproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(buscadorproductoLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtfiltropro, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(buscadorproductoLayout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(btnaceptarpro)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        buscadorproductoLayout.setVerticalGroup(
            buscadorproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscadorproductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buscadorproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtfiltropro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnaceptarpro)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jLabel15.setText("jLabel15");

        jLabel7.setText("FECHA DESDE");

        txtfechainicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechainicioActionPerformed(evt);
            }
        });

        jLabel18.setText("FECHA HASTA");

        tablafactbus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "cod", "Numero", "Condicion", "Fecha", "Estado", "Cod Cli", "Nombre", "Apellido", "Ruc"
            }
        ));
        jScrollPane4.setViewportView(tablafactbus);

        btnaceptar.setText("ACEPTAR");

        javax.swing.GroupLayout buscadorfacturaLayout = new javax.swing.GroupLayout(buscadorfactura.getContentPane());
        buscadorfactura.getContentPane().setLayout(buscadorfacturaLayout);
        buscadorfacturaLayout.setHorizontalGroup(
            buscadorfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buscadorfacturaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtfechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtfechafin, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
            .addGroup(buscadorfacturaLayout.createSequentialGroup()
                .addGroup(buscadorfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buscadorfacturaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buscadorfacturaLayout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(btnaceptar)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        buscadorfacturaLayout.setVerticalGroup(
            buscadorfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscadorfacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buscadorfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtfechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtfechafin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnaceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtcodigousu.setText("1");

        txtnombreusu.setText("Jose");

        jLabel8.setText("FECHA");

        jLabel9.setText("FACTURA");

        jLabel10.setText("CONDICION DE VENTA");

        buttonGroup1.add(rbncontado);
        rbncontado.setText("CONTADO");

        buttonGroup1.add(rbncredito);
        rbncredito.setText("CREDITO");

        txtestado.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtestado.setText("PENDIENTE");

        txtcodigofac.setText("Id factura");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(txtnumerofac, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcodigofac, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(rbncontado)
                        .addContainerGap(146, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(79, 79, 79))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbncredito)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtcodigousu)
                        .addGap(18, 18, 18)
                        .addComponent(txtnombreusu)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(txtestado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel9)
                    .addContainerGap(454, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(txtcodigofac, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnumerofac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(txtestado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcodigousu)
                    .addComponent(txtnombreusu)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbncontado)
                    .addComponent(rbncredito))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(jLabel9)
                    .addContainerGap(118, Short.MAX_VALUE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Código");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 16, -1, -1));

        jLabel2.setText("Nombre");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 54, -1, -1));

        jLabel3.setText("Apellido");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 89, -1, -1));

        jLabel4.setText("Ruc");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 121, -1, -1));

        txtcodigocli.setEnabled(false);
        jPanel2.add(txtcodigocli, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 10, 170, -1));

        txtrucxli.setEnabled(false);
        jPanel2.add(txtrucxli, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 170, -1));

        txtnombrecli.setEnabled(false);
        jPanel2.add(txtnombrecli, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 170, -1));

        txtapellidocli.setEnabled(false);
        jPanel2.add(txtapellidocli, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 170, -1));

        btnbuscarcli.setText("Buscar");
        jPanel2.add(btnbuscarcli, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("PRODUCTO");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel3.add(txtcodigopro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 50, -1));

        txtproducto.setText("NOMBRE DEL PRODUCTO");
        jPanel3.add(txtproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 470, 30));

        jLabel11.setText("CANTIDAD");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));
        jPanel3.add(txtcantidadpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 90, -1));

        btnadd.setText("+");
        jPanel3.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, -1, -1));

        btnborrar.setText("-");
        jPanel3.add(btnborrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, -1, -1));

        tabladetallefac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "NOMBRE", "PRECIO", "CANTIDAD", "EXENTA", "5%", "10%"
            }
        ));
        jScrollPane2.setViewportView(tabladetallefac);
        if (tabladetallefac.getColumnModel().getColumnCount() > 0) {
            tabladetallefac.getColumnModel().getColumn(0).setMinWidth(50);
            tabladetallefac.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabladetallefac.getColumnModel().getColumn(0).setMaxWidth(50);
            tabladetallefac.getColumnModel().getColumn(2).setMinWidth(70);
            tabladetallefac.getColumnModel().getColumn(2).setPreferredWidth(70);
            tabladetallefac.getColumnModel().getColumn(2).setMaxWidth(70);
            tabladetallefac.getColumnModel().getColumn(3).setMinWidth(70);
            tabladetallefac.getColumnModel().getColumn(3).setPreferredWidth(70);
            tabladetallefac.getColumnModel().getColumn(3).setMaxWidth(70);
            tabladetallefac.getColumnModel().getColumn(4).setMinWidth(70);
            tabladetallefac.getColumnModel().getColumn(4).setPreferredWidth(70);
            tabladetallefac.getColumnModel().getColumn(4).setMaxWidth(70);
            tabladetallefac.getColumnModel().getColumn(5).setMinWidth(70);
            tabladetallefac.getColumnModel().getColumn(5).setPreferredWidth(70);
            tabladetallefac.getColumnModel().getColumn(5).setMaxWidth(70);
            tabladetallefac.getColumnModel().getColumn(6).setMinWidth(70);
            tabladetallefac.getColumnModel().getColumn(6).setPreferredWidth(70);
            tabladetallefac.getColumnModel().getColumn(6).setMaxWidth(70);
        }

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 880, 190));

        txtexnta.setText("0");
        txtexnta.setEnabled(false);
        jPanel3.add(txtexnta, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 70, -1));

        txt5.setText("0");
        txt5.setEnabled(false);
        jPanel3.add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, 70, -1));

        txt10.setText("0");
        txt10.setEnabled(false);
        jPanel3.add(txt10, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 240, 70, -1));

        jLabel13.setText("Liq. 5%");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        txtliq5.setText("0");
        txtliq5.setEnabled(false);
        jPanel3.add(txtliq5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 90, -1));

        jLabel14.setText("10%");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        txtliq10.setText("0");
        txtliq10.setEnabled(false);
        jPanel3.add(txtliq10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 110, -1));

        jLabel16.setText("TOTAL IVA");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        txttotaliva.setText("0");
        txttotaliva.setEnabled(false);
        jPanel3.add(txttotaliva, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 110, -1));

        jLabel17.setText("SUB TOTALES");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, -1, 20));

        txttotalfac.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txttotalfac.setText("0");
        txttotalfac.setEnabled(false);
        jPanel3.add(txttotalfac, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 210, 40));

        btnnuevo.setText("NUEVO");
        jPanel3.add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel3.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        btnimprimir.setText("IMPRIMIR");
        jPanel3.add(btnimprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));

        btnanular.setText("ANULAR");
        jPanel3.add(btnanular, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, -1));

        btnbuscar.setText("BUSCAR");
        jPanel3.add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, -1));

        btncancelar.setText("CANCELAR");
        jPanel3.add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 339, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarActionPerformed

    private void txtfiltrocliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfiltrocliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfiltrocliActionPerformed

    private void txtfechainicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechainicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechainicioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vistaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaFactura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnaceptar;
    public javax.swing.JButton btnaceptarcli;
    public javax.swing.JButton btnaceptarpro;
    public javax.swing.JButton btnadd;
    public javax.swing.JButton btnanular;
    public javax.swing.JButton btnborrar;
    public javax.swing.JButton btnbuscar;
    public javax.swing.JButton btnbuscarcli;
    public javax.swing.JButton btncancelar;
    public javax.swing.JButton btnguardar;
    public javax.swing.JButton btnimprimir;
    public javax.swing.JButton btnnuevo;
    public javax.swing.JDialog buscadorcliente;
    public javax.swing.JDialog buscadorfactura;
    public javax.swing.JDialog buscadorproducto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JRadioButton rbncontado;
    public javax.swing.JRadioButton rbncredito;
    public javax.swing.JTable tablaclientebus;
    public javax.swing.JTable tabladetallefac;
    public javax.swing.JTable tablafactbus;
    public javax.swing.JTable tablaproductobus;
    public javax.swing.JTextField txt10;
    public javax.swing.JTextField txt5;
    public javax.swing.JTextField txtapellidocli;
    public javax.swing.JTextField txtcantidadpro;
    public javax.swing.JTextField txtcodigocli;
    public javax.swing.JLabel txtcodigofac;
    public javax.swing.JTextField txtcodigopro;
    public javax.swing.JLabel txtcodigousu;
    public javax.swing.JLabel txtestado;
    public javax.swing.JTextField txtexnta;
    public javax.swing.JTextField txtfecha;
    public javax.swing.JTextField txtfechafin;
    public javax.swing.JTextField txtfechainicio;
    public javax.swing.JTextField txtfiltrocli;
    public javax.swing.JTextField txtfiltropro;
    public javax.swing.JTextField txtliq10;
    public javax.swing.JTextField txtliq5;
    public javax.swing.JTextField txtnombrecli;
    public javax.swing.JLabel txtnombreusu;
    public javax.swing.JTextField txtnumerofac;
    public javax.swing.JLabel txtproducto;
    public javax.swing.JTextField txtrucxli;
    public javax.swing.JTextField txttotalfac;
    public javax.swing.JTextField txttotaliva;
    // End of variables declaration//GEN-END:variables
}
