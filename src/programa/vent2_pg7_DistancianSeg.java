/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package programa;

/**
 *
 * @author USER
 */
public class vent2_pg7_DistancianSeg extends javax.swing.JPanel {

    /**
     * Creates new form vent2_pg7_DistanciaNseg
     */
    public vent2_pg7_DistancianSeg() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_Content_pg2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cjText2_VelocidadInicial = new javax.swing.JTextField();
        cjText2_Aceleracion = new javax.swing.JTextField();
        cjText2_RESULTADO = new javax.swing.JTextField();
        CALCULAR_PosFinal = new javax.swing.JButton();
        BORRAR_PosFinal = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cjText2_nSegundo = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(18, 31, 44));

        jPanel_Content_pg2.setBackground(new java.awt.Color(79, 136, 148));
        jPanel_Content_pg2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ingrese Velocidad Inicial ");
        jPanel_Content_pg2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 320, 50));

        jLabel2.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingrese Aceleracion");
        jPanel_Content_pg2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 320, 50));

        jLabel4.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Resultado ");
        jPanel_Content_pg2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 320, 50));

        cjText2_VelocidadInicial.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        cjText2_VelocidadInicial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cjText2_VelocidadInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjText2_VelocidadInicialActionPerformed(evt);
            }
        });
        jPanel_Content_pg2.add(cjText2_VelocidadInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 110, 80));

        cjText2_Aceleracion.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        cjText2_Aceleracion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cjText2_Aceleracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjText2_AceleracionActionPerformed(evt);
            }
        });
        jPanel_Content_pg2.add(cjText2_Aceleracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 110, 80));

        cjText2_RESULTADO.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        cjText2_RESULTADO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cjText2_RESULTADO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjText2_RESULTADOActionPerformed(evt);
            }
        });
        jPanel_Content_pg2.add(cjText2_RESULTADO, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, 160, 80));

        CALCULAR_PosFinal.setBackground(new java.awt.Color(51, 255, 51));
        CALCULAR_PosFinal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CALCULAR_PosFinal.setText("CALCULAR");
        CALCULAR_PosFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CALCULAR_PosFinalActionPerformed(evt);
            }
        });
        jPanel_Content_pg2.add(CALCULAR_PosFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, 210, 60));

        BORRAR_PosFinal.setBackground(new java.awt.Color(255, 0, 0));
        BORRAR_PosFinal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BORRAR_PosFinal.setText("BORRAR");
        BORRAR_PosFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BORRAR_PosFinalActionPerformed(evt);
            }
        });
        jPanel_Content_pg2.add(BORRAR_PosFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 540, 210, 60));

        jLabel6.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Ingrese enesimo Segundo");
        jPanel_Content_pg2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 320, 50));

        cjText2_nSegundo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        cjText2_nSegundo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cjText2_nSegundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjText2_nSegundoActionPerformed(evt);
            }
        });
        jPanel_Content_pg2.add(cjText2_nSegundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 110, 80));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel_Content_pg2, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel_Content_pg2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cjText2_VelocidadInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjText2_VelocidadInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cjText2_VelocidadInicialActionPerformed

    private void cjText2_AceleracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjText2_AceleracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cjText2_AceleracionActionPerformed

    private void cjText2_RESULTADOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjText2_RESULTADOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cjText2_RESULTADOActionPerformed

    private void CALCULAR_PosFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CALCULAR_PosFinalActionPerformed
      Integer cj_VelocidadInicial=Integer.parseInt(cjText2_VelocidadInicial.getText());   
      Integer cj_Aceleracion=Integer.parseInt(cjText2_Aceleracion.getText());
      Integer cj_nSegundo=Integer.parseInt(cjText2_nSegundo.getText());
      
      //Dn=Vo±(a(2n-1))/2
      
      if (cj_Aceleracion > 0 ) {//movimientoAcelerado
            cjText2_RESULTADO.setText(String.valueOf(cj_VelocidadInicial+(cj_Aceleracion*(2*cj_nSegundo))/2)); } 
      else  { //movimientoDesacelerado
             cjText2_RESULTADO.setText(String.valueOf(cj_VelocidadInicial-(cj_Aceleracion*(2*cj_nSegundo))/2)); }
      
    }//GEN-LAST:event_CALCULAR_PosFinalActionPerformed

    private void BORRAR_PosFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BORRAR_PosFinalActionPerformed
        cjText2_VelocidadInicial.setText("");
        cjText2_Aceleracion.setText("");
        cjText2_nSegundo.setText("");
        cjText2_RESULTADO.setText("");
    }//GEN-LAST:event_BORRAR_PosFinalActionPerformed

    private void cjText2_nSegundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjText2_nSegundoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cjText2_nSegundoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BORRAR_PosFinal;
    private javax.swing.JButton CALCULAR_PosFinal;
    private javax.swing.JTextField cjText2_Aceleracion;
    private javax.swing.JTextField cjText2_RESULTADO;
    private javax.swing.JTextField cjText2_VelocidadInicial;
    private javax.swing.JTextField cjText2_nSegundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Content_pg2;
    // End of variables declaration//GEN-END:variables
}
