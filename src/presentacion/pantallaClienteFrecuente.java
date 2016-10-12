package presentacion;

import java.awt.event.ActionListener;
import verificador.ClienteFrecuente;

public class pantallaClienteFrecuente extends javax.swing.JFrame {
    ClienteFrecuente Cliente;

    public pantallaClienteFrecuente(ClienteFrecuente cliente) {
        Cliente = cliente;
        initComponents();
    }
    
    public pantallaClienteFrecuente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel3 = new org.edisoncor.gui.panel.Panel();
        panel1 = new org.edisoncor.gui.panel.Panel();
        panel2 = new org.edisoncor.gui.panel.Panel();
        jLabel1 = new javax.swing.JLabel();
        LBLtarjeta = new javax.swing.JLabel();
        LBLNotarjeta = new javax.swing.JLabel();
        LBLSaldo1 = new javax.swing.JLabel();
        LBLSaldoValue2 = new javax.swing.JLabel();
        LBLSaldo2 = new javax.swing.JLabel();
        LBLSaldoValue1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panel3.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel3.setColorSecundario(new java.awt.Color(255, 255, 255));

        panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/del-sol1.jpg")));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
        );

        panel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 5, true));
        panel2.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel2.setColorSecundario(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cliente Frecuente");

        LBLtarjeta.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        LBLtarjeta.setText("Tarjeta:");

        LBLNotarjeta.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        LBLNotarjeta.setText("XXXX-XXXX-XXXX-XXXX");

        LBLSaldo1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        LBLSaldo1.setText("SALDO1");

        LBLSaldoValue2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        LBLSaldoValue2.setText("$100000");

        LBLSaldo2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        LBLSaldo2.setText("SALDO2");

        LBLSaldoValue1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        LBLSaldoValue1.setText("$100000");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBLSaldo1)
                            .addComponent(LBLSaldo2))
                        .addGap(31, 31, 31)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBLSaldoValue1)
                            .addComponent(LBLSaldoValue2)))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(LBLtarjeta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LBLNotarjeta)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(180, 180, 180)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLtarjeta)
                    .addComponent(LBLNotarjeta))
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(LBLSaldo1))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(LBLSaldoValue1)))
                .addGap(37, 37, 37)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLSaldo2)
                    .addComponent(LBLSaldoValue2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 554, Short.MAX_VALUE)))
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
            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
       
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String Tarjeta = Cliente.getTarjeta();
        
        if (Tarjeta.substring(0,3).equals("990") || Tarjeta.substring(0,3).equals("991")){
            LBLNotarjeta.setText("XXXX-XXXXX-" + Tarjeta.substring(8,12));
            LBLSaldo1.setText("SALDO MONEDERO:");
            LBLSaldo2.setText("SALDO PUNTOS:");
            LBLSaldoValue1.setText(String.valueOf(Cliente.getImporte()));
            LBLSaldoValue2.setText(String.valueOf(Cliente.getSaldo()));
        }else if(Tarjeta.substring(0,3).equals("992")){
            LBLNotarjeta.setText(Tarjeta.substring(7,13));
            LBLSaldo1.setText("CREDITO DISPONIBLE:");
            LBLSaldoValue1.setText(String.valueOf(Cliente.getImporte()));
            
            LBLSaldo2.setVisible(false);
            LBLSaldoValue2.setVisible(false);
        }else if(Tarjeta.substring(0,3).equals("993") || Tarjeta.substring(0,3).equals("996") || Tarjeta.substring(0,3).equals("997")){
            LBLNotarjeta.setText(Tarjeta);
            LBLSaldo1.setText("SALDO:");
            LBLSaldoValue1.setText(String.valueOf(Cliente.getImporte()));
            
            LBLSaldo2.setVisible(false);
            LBLSaldoValue2.setVisible(false);
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(pantallaClienteFrecuente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantallaClienteFrecuente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantallaClienteFrecuente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantallaClienteFrecuente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantallaClienteFrecuente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBLNotarjeta;
    private javax.swing.JLabel LBLSaldo1;
    private javax.swing.JLabel LBLSaldo2;
    private javax.swing.JLabel LBLSaldoValue1;
    private javax.swing.JLabel LBLSaldoValue2;
    private javax.swing.JLabel LBLtarjeta;
    private javax.swing.JLabel jLabel1;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.Panel panel2;
    private org.edisoncor.gui.panel.Panel panel3;
    // End of variables declaration//GEN-END:variables
}
