package estructuradedatos2026;

import java.awt.Color;
import java.util.Random;

public class SaludarjF extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SaludarjF.class.getName());

    public SaludarjF() {
        initComponents();
        
        /** inicialiar componentes **/
        lblsaludo.setText("HOLA JAVA SWING");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        btnSaludar = new javax.swing.JButton();
        lblsaludo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnSaludar.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnSaludar.setText("Saludar");
        btnSaludar.addActionListener(this::btnSaludarActionPerformed);

        lblsaludo.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        lblsaludo.setForeground(new java.awt.Color(204, 0, 0));
        lblsaludo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsaludo.setText("Hola");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblsaludo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSaludar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaludar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblsaludo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaludarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaludarActionPerformed
        // Inicia el click
        
     String nombre = txtNombre.getText();
        
        lblsaludo.setText("HOLA "+ nombre);
        lblsaludo.setFont(new java.awt.Font("Helvetica", 1, 30));
        
        Random ran = new Random();
        int red= ran.nextInt(256);
        int green= ran.nextInt(256);
        int blue= ran.nextInt(256);
        jPanel1.setBackground(new java.awt.Color(red, green, blue));
        btnSaludar.setBackground(new java.awt.Color(red, green, blue));
        txtNombre.setText("");
        //Aqui termina el click
    }//GEN-LAST:event_btnSaludarActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new SaludarjF().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaludar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblsaludo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
