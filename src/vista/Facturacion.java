/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author dave_
 */
public class Facturacion extends javax.swing.JFrame {

    /**
     * Creates new form Facturacion
     */
    public Facturacion() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Admin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtidfac = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        txtcantidadFac = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        txtmontoFac = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        txtnitFac = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        txtusuarioFac = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        txtclienteFac = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        txttarjetaPuntosFac = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        txtlongitudfac = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
        txtlatitudfac = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();
        txtfechaFac = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblventasfacturacion = new javax.swing.JTable();
        lbltotalventas = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnfacturacion1 = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1230, 620));
        jPanel1.setPreferredSize(new java.awt.Dimension(1230, 620));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Admin.setBackground(new java.awt.Color(0, 93, 139));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FACTURACION");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/recibo.png"))); // NOI18N

        javax.swing.GroupLayout AdminLayout = new javax.swing.GroupLayout(Admin);
        Admin.setLayout(AdminLayout);
        AdminLayout.setHorizontalGroup(
            AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminLayout.createSequentialGroup()
                .addGap(499, 499, 499)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(483, Short.MAX_VALUE))
        );
        AdminLayout.setVerticalGroup(
            AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel3.setText("ID tarjeta Pts:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel4.setText("ID Factura:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel5.setText("Cantidad productos:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel6.setText("Monto facturacion:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel7.setText("Fecha facturacion:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel8.setText("NIT facturacion:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel9.setText("ID Usuario:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel10.setText("ID Cliente:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel11.setText("Longitud:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, 20));

        jLabel12.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel12.setText("Latitud:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, -1, 20));

        txtidfac.setBorder(null);
        jPanel1.add(txtidfac, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 175, -1));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 175, 10));

        txtcantidadFac.setBorder(null);
        jPanel1.add(txtcantidadFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 175, -1));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 175, 10));

        txtmontoFac.setBorder(null);
        jPanel1.add(txtmontoFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 175, -1));
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 175, 10));

        txtnitFac.setBorder(null);
        jPanel1.add(txtnitFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 175, -1));
        jPanel1.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 175, 10));

        txtusuarioFac.setBorder(null);
        jPanel1.add(txtusuarioFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 175, -1));
        jPanel1.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 175, 10));

        txtclienteFac.setBorder(null);
        jPanel1.add(txtclienteFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 175, -1));
        jPanel1.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 175, 10));

        txttarjetaPuntosFac.setBorder(null);
        jPanel1.add(txttarjetaPuntosFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 175, -1));
        jPanel1.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 175, 10));

        txtlongitudfac.setBorder(null);
        jPanel1.add(txtlongitudfac, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 175, -1));
        jPanel1.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, 175, 10));

        txtlatitudfac.setBorder(null);
        jPanel1.add(txtlatitudfac, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 570, 175, -1));
        jPanel1.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 600, 175, 10));
        jPanel1.add(txtfechaFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 175, -1));

        tblventasfacturacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblventasfacturacion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 107, 830, 430));

        lbltotalventas.setBackground(new java.awt.Color(204, 255, 204));
        lbltotalventas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lbltotalventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 550, 170, 40));

        jLabel13.setText("TOTAL:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 560, -1, -1));

        btnfacturacion1.setBackground(new java.awt.Color(0, 93, 139));
        btnfacturacion1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        btnfacturacion1.setForeground(new java.awt.Color(255, 255, 255));
        btnfacturacion1.setText("BUSCAR FECHAS");
        btnfacturacion1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btnfacturacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, 140, 30));

        btncancel.setBackground(new java.awt.Color(0, 93, 139));
        btncancel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btncancel.setForeground(new java.awt.Color(255, 255, 255));
        btncancel.setText("REGRESAR");
        btncancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 550, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Facturacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Admin;
    public javax.swing.JButton btncancel;
    public javax.swing.JButton btnfacturacion1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    public javax.swing.JLabel lbltotalventas;
    public javax.swing.JTable tblventasfacturacion;
    public javax.swing.JTextField txtcantidadFac;
    public javax.swing.JTextField txtclienteFac;
    public com.toedter.calendar.JDateChooser txtfechaFac;
    public javax.swing.JTextField txtidfac;
    public javax.swing.JTextField txtlatitudfac;
    public javax.swing.JTextField txtlongitudfac;
    public javax.swing.JTextField txtmontoFac;
    public javax.swing.JTextField txtnitFac;
    public javax.swing.JTextField txttarjetaPuntosFac;
    public javax.swing.JTextField txtusuarioFac;
    // End of variables declaration//GEN-END:variables
}
