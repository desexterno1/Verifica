package presentacion;

public class PantallaConfiguracion extends javax.swing.JFrame {

    public PantallaConfiguracion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel3 = new org.edisoncor.gui.panel.Panel();
        panel2 = new org.edisoncor.gui.panel.Panel();
        BTCliente = new javax.swing.JButton();
        BTTarjetaAmiga = new javax.swing.JButton();
        BTBaseDatos = new javax.swing.JButton();
        BTOs = new javax.swing.JButton();
        BTAplicacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        setUndecorated(true);

        panel3.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel3.setColorSecundario(new java.awt.Color(255, 255, 255));

        panel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 5, true));
        panel2.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel2.setColorSecundario(new java.awt.Color(255, 255, 255));

        BTCliente.setBackground(new java.awt.Color(255, 102, 0));
        BTCliente.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        BTCliente.setForeground(new java.awt.Color(255, 255, 255));
        BTCliente.setText("Cliente Frecuente");
        BTCliente.setToolTipText("");
        BTCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTCliente.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BTCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTClienteActionPerformed(evt);
            }
        });

        BTTarjetaAmiga.setBackground(new java.awt.Color(255, 102, 0));
        BTTarjetaAmiga.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        BTTarjetaAmiga.setForeground(new java.awt.Color(255, 255, 255));
        BTTarjetaAmiga.setText("Tarjeta Amiga");
        BTTarjetaAmiga.setToolTipText("");
        BTTarjetaAmiga.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTTarjetaAmiga.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BTTarjetaAmiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTTarjetaAmigaActionPerformed(evt);
            }
        });

        BTBaseDatos.setBackground(new java.awt.Color(255, 102, 0));
        BTBaseDatos.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        BTBaseDatos.setForeground(new java.awt.Color(255, 255, 255));
        BTBaseDatos.setText("Base de Datos");
        BTBaseDatos.setToolTipText("");
        BTBaseDatos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTBaseDatos.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BTBaseDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTBaseDatosActionPerformed(evt);
            }
        });

        BTOs.setBackground(new java.awt.Color(255, 102, 0));
        BTOs.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        BTOs.setForeground(new java.awt.Color(255, 255, 255));
        BTOs.setText("Os");
        BTOs.setToolTipText("");
        BTOs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTOs.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BTOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTOsActionPerformed(evt);
            }
        });

        BTAplicacion.setBackground(new java.awt.Color(255, 102, 0));
        BTAplicacion.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        BTAplicacion.setForeground(new java.awt.Color(255, 255, 255));
        BTAplicacion.setText("Aplicacion");
        BTAplicacion.setToolTipText("");
        BTAplicacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTAplicacion.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BTAplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTAplicacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BTBaseDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(BTOs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTAplicacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTTarjetaAmiga, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(232, 232, 232))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(BTCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(BTTarjetaAmiga, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(BTBaseDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(BTOs, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(BTAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTClienteActionPerformed
        new presentacion.pantallaConfCliente().setVisible(true); 
    }//GEN-LAST:event_BTClienteActionPerformed

    private void BTTarjetaAmigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTTarjetaAmigaActionPerformed
        new presentacion.pantallaConfTAmiga().setVisible(true); 
    }//GEN-LAST:event_BTTarjetaAmigaActionPerformed

    private void BTBaseDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTBaseDatosActionPerformed
        new presentacion.pantallaConfBD().setVisible(true); 
    }//GEN-LAST:event_BTBaseDatosActionPerformed

    private void BTOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTOsActionPerformed
        
    }//GEN-LAST:event_BTOsActionPerformed

    private void BTAplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTAplicacionActionPerformed
        this.dispose();
    }//GEN-LAST:event_BTAplicacionActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaConfiguracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTAplicacion;
    private javax.swing.JButton BTBaseDatos;
    private javax.swing.JButton BTCliente;
    private javax.swing.JButton BTOs;
    private javax.swing.JButton BTTarjetaAmiga;
    private org.edisoncor.gui.panel.Panel panel2;
    private org.edisoncor.gui.panel.Panel panel3;
    // End of variables declaration//GEN-END:variables
}
