/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package programa;

/**
 *
 * @author USER
 */
public class vent2_pg6_AceleracionInst extends javax.swing.JPanel {

    /**
     * Creates new form vent2_pg6_AceleracionInst
     */
    public vent2_pg6_AceleracionInst() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel_Content_pg2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cjText2_VariableA = new javax.swing.JTextField();
        cjText2_VariableC = new javax.swing.JTextField();
        cjText2_Tiempo = new javax.swing.JTextField();
        cjText2_FuncionDerivada = new javax.swing.JTextField();
        CALCULAR_VelocidadInst = new javax.swing.JButton();
        BORRAR_VelocidadInst = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cjText2_RESULTADO = new javax.swing.JTextField();
        cjText2_Exponente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cjText2_FuncionInicial = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cjText2_VariableB = new javax.swing.JTextField();

        jPanel2.setBackground(new java.awt.Color(18, 31, 44));

        jPanel_Content_pg2.setBackground(new java.awt.Color(79, 136, 148));
        jPanel_Content_pg2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Entrada (Variables)");
        jPanel_Content_pg2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 320, 50));

        jLabel2.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel2.setText("a");
        jPanel_Content_pg2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 320, 50));

        jLabel3.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel3.setText("c");
        jPanel_Content_pg2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 320, 50));

        jLabel4.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel4.setText("Tiempo");
        jPanel_Content_pg2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, 320, 50));

        jLabel5.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel5.setText(" Función de la  Aceleracion");
        jPanel_Content_pg2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 320, 50));

        cjText2_VariableA.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        cjText2_VariableA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cjText2_VariableA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjText2_VariableAActionPerformed(evt);
            }
        });
        jPanel_Content_pg2.add(cjText2_VariableA, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 110, 80));

        cjText2_VariableC.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        cjText2_VariableC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cjText2_VariableC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjText2_VariableCActionPerformed(evt);
            }
        });
        jPanel_Content_pg2.add(cjText2_VariableC, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 110, 80));

        cjText2_Tiempo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        cjText2_Tiempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cjText2_Tiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjText2_TiempoActionPerformed(evt);
            }
        });
        jPanel_Content_pg2.add(cjText2_Tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, 160, 50));

        cjText2_FuncionDerivada.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        cjText2_FuncionDerivada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cjText2_FuncionDerivada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjText2_FuncionDerivadaActionPerformed(evt);
            }
        });
        jPanel_Content_pg2.add(cjText2_FuncionDerivada, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 440, 70));

        CALCULAR_VelocidadInst.setBackground(new java.awt.Color(51, 255, 51));
        CALCULAR_VelocidadInst.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CALCULAR_VelocidadInst.setText("CALCULAR");
        CALCULAR_VelocidadInst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CALCULAR_VelocidadInstActionPerformed(evt);
            }
        });
        jPanel_Content_pg2.add(CALCULAR_VelocidadInst, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, 210, 60));

        BORRAR_VelocidadInst.setBackground(new java.awt.Color(255, 0, 0));
        BORRAR_VelocidadInst.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BORRAR_VelocidadInst.setText("BORRAR");
        BORRAR_VelocidadInst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BORRAR_VelocidadInstActionPerformed(evt);
            }
        });
        jPanel_Content_pg2.add(BORRAR_VelocidadInst, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 540, 210, 60));

        jLabel6.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel6.setText("b");
        jPanel_Content_pg2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 320, 50));

        cjText2_RESULTADO.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        cjText2_RESULTADO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cjText2_RESULTADO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjText2_RESULTADOActionPerformed(evt);
            }
        });
        jPanel_Content_pg2.add(cjText2_RESULTADO, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, 110, 80));

        cjText2_Exponente.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        cjText2_Exponente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cjText2_Exponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjText2_ExponenteActionPerformed(evt);
            }
        });
        jPanel_Content_pg2.add(cjText2_Exponente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 160, 50));

        jLabel8.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel8.setText(" Función de la Velocidad");
        jPanel_Content_pg2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 370, 50));

        jLabel9.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel9.setText("Resultado");
        jPanel_Content_pg2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 320, 50));

        cjText2_FuncionInicial.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        cjText2_FuncionInicial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cjText2_FuncionInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjText2_FuncionInicialActionPerformed(evt);
            }
        });
        jPanel_Content_pg2.add(cjText2_FuncionInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 450, 70));

        jLabel10.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel10.setText("Exponente");
        jPanel_Content_pg2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 320, 50));

        cjText2_VariableB.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        cjText2_VariableB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cjText2_VariableB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjText2_VariableBActionPerformed(evt);
            }
        });
        jPanel_Content_pg2.add(cjText2_VariableB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 110, 80));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel_Content_pg2, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel_Content_pg2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cjText2_VariableAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjText2_VariableAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cjText2_VariableAActionPerformed

    private void cjText2_VariableCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjText2_VariableCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cjText2_VariableCActionPerformed

    private void cjText2_TiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjText2_TiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cjText2_TiempoActionPerformed

    private void cjText2_FuncionDerivadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjText2_FuncionDerivadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cjText2_FuncionDerivadaActionPerformed

    private void CALCULAR_VelocidadInstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CALCULAR_VelocidadInstActionPerformed
        Integer a=Integer.parseInt(cjText2_VariableA.getText());
        Integer b=Integer.parseInt(cjText2_VariableB.getText());
        Integer c=Integer.parseInt(cjText2_VariableC.getText());
        Integer tiempo=Integer.parseInt(cjText2_Tiempo.getText());
        Integer exp=Integer.parseInt(cjText2_Exponente.getText());
        //      num1=a / num2=b /num3=c
        //
        //a + "t" + "^" + ((int)+ n)  + ("±") + b + "t" + "^" + ((int)+( n - 1)) + ("±") + c + "t"
        if (a >= 0 && b >= 0 && c >= 0) { // +n+n+n --------
            cjText2_FuncionInicial.setText(String.valueOf(a + "t" + "^" + ((int)+ exp)  +"   "+ "+"+"  " + b + "t" + "^" + ((int)+( exp - 1))+"   "+"+"+"   "+c ));
            cjText2_FuncionDerivada.setText(String.valueOf((int)(exp*a)+"t"+"^"+(exp-1)+"   "+"+"+"   "+((int)(exp-1)*b)+"t"+"^"+(exp-2)+"   "+"+"+"   "+"0"));
            cjText2_RESULTADO.setText(Integer.toString((int)(((exp*a)*Math.pow(tiempo, exp-1))+(b*Math.pow(tiempo, exp-2)))));

        } else if (a >= 0 && b >= 0 && c < 0) {//+n+n-n
            cjText2_FuncionInicial.setText(String.valueOf(a + "t" + "^" + ((int)+ exp)  + "+" + b + "t" + "^" + ((int)+( exp - 1))  + c + "t"));
            cjText2_FuncionDerivada.setText(String.valueOf((int)(exp*a)+"t"+"^"+(exp-1)+"+"+((int)(exp-1)*b)+"t"+"^"+(exp-2)+"-"+c));
            cjText2_RESULTADO.setText(String.valueOf((int)((exp*a)*Math.pow(tiempo, exp-1)+a*Math.pow(tiempo, exp-2)-c )));

        } else if (a >= 0 && b < 0 && c < 0) {//+n-n-n ------
           cjText2_FuncionInicial.setText(String.valueOf(a + "t" + "^" + ((int)+ exp)+"   "   + b + "t" + "^" + ((int)+( exp - 1))+"   " + "-" +"   "+ c ));
            cjText2_FuncionDerivada.setText(String.valueOf((int)(exp*a)+"t"+"^"+(exp-1)+"   "+"-"+"   "+((int)(exp-1)*b)+"t"+"^"+(exp-2)+"   "+"-"+"   "+0));
            cjText2_RESULTADO.setText(Integer.toString((int)(((exp*a)*Math.pow(tiempo, exp-1))-((b*(Math.pow(tiempo, exp-2)*(-1)))))));

        } else if (a < 0 && b < 0 && c < 0) {//-n-n-n  --------
            cjText2_FuncionInicial.setText(String.valueOf(+a + "t" + "^" + ((int)+ exp)+"   " + b + "t" + "^" + ((int)+( exp - 1)) +"   " + c + "t"));
            cjText2_FuncionDerivada.setText(String.valueOf((int)(exp*a)+"t"+"^"+(exp-1)+"   "+((int)(exp-1)*b)+"t"+"^"+(exp-2)+"   "+c));
            cjText2_RESULTADO.setText(Integer.toString((int)(((exp*a)*Math.pow(tiempo, exp-1)-((b*-1)*Math.pow(tiempo, exp-2)) ))));

        } else if (a < 0 && b < 0 && c >= 0) {//-n-n+n
            cjText2_FuncionInicial.setText(String.valueOf(+a + "t" + "^" + ((int)+ exp)  +  b + "t" + "^" + ((int)+( exp - 1)) + "+" + c + "t"));
            cjText2_FuncionDerivada.setText(String.valueOf("-"+(int)(exp*a)+"t"+"^"+(exp-1)+"-"+((int)(exp-1)*b)+"t"+"^"+(exp-2)+"+"+c));
            cjText2_RESULTADO.setText(String.valueOf((int)((-exp*a)*Math.pow(tiempo, exp-1)-a*Math.pow(tiempo, exp-2)+c )));

        } else if (a < 0 && b >= 0 && c >= 0) {// -n+n+n
            cjText2_FuncionInicial.setText(String.valueOf(a + "t" + "^" + ((int)+ exp)  + "+" + b + "t" + "^" + ((int)+( exp - 1)) + "+" + c + "t"));
            cjText2_FuncionDerivada.setText(String.valueOf("-"+(int)(exp*a)+"t"+"^"+(exp-1)+"+"+((int)(exp-1)*b)+"t"+"^"+(exp-2)+"+"+c));
            cjText2_RESULTADO.setText(String.valueOf((int)((-exp*a)*Math.pow(tiempo, exp-1)+a*Math.pow(tiempo, exp-2)+c )));

        } else if (a > 0 && b < 0 && c > 0) {//+n-n+n
            cjText2_FuncionInicial.setText(String.valueOf(a + "t" + "^" + ((int)+ exp)  + "-" + b + "t" + "^" + ((int)+( exp - 1)) + "+" + c + "t"));
            cjText2_FuncionDerivada.setText(String.valueOf((int)(exp*a)+"t"+"^"+(exp-1)+"-"+((int)(exp-1)*b)+"t"+"^"+(exp-2)+"+"+c));
            cjText2_RESULTADO.setText(String.valueOf((int)((exp*a)*Math.pow(tiempo, exp-1)-a*Math.pow(tiempo, exp-2)+c )));
        } else if (a < 0 && b > 0 && c < 0) {//-n+n-n"
            cjText2_FuncionInicial.setText(String.valueOf(a + "t" + "^" + ((int)+ exp)  + "+" + b + "t" + "^" + ((int)+( exp - 1)) + "+" + c + "t"));
            cjText2_FuncionDerivada.setText(String.valueOf("-"+(int)(exp*a)+"t"+"^"+(exp-1)+"+"+((int)(exp-1)*b)+"t"+"^"+(exp-2)+"-"+c));
            cjText2_RESULTADO.setText(String.valueOf((int)((-exp*a)*Math.pow(tiempo, exp-1)+a*Math.pow(tiempo, exp-2)-c )));
        }
        else {
            System.out.println("No se cumple ningún caso especificado.");
        }
    }//GEN-LAST:event_CALCULAR_VelocidadInstActionPerformed

    private void BORRAR_VelocidadInstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BORRAR_VelocidadInstActionPerformed
        cjText2_VariableA.setText("");
        cjText2_VariableB.setText("");
        cjText2_VariableC.setText("");
        cjText2_Exponente.setText("");
        cjText2_Tiempo.setText("");
        cjText2_FuncionInicial.setText("");
        cjText2_FuncionDerivada.setText("");
        cjText2_RESULTADO.setText("");
    }//GEN-LAST:event_BORRAR_VelocidadInstActionPerformed

    private void cjText2_RESULTADOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjText2_RESULTADOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cjText2_RESULTADOActionPerformed

    private void cjText2_ExponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjText2_ExponenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cjText2_ExponenteActionPerformed

    private void cjText2_FuncionInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjText2_FuncionInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cjText2_FuncionInicialActionPerformed

    private void cjText2_VariableBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjText2_VariableBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cjText2_VariableBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BORRAR_VelocidadInst;
    private javax.swing.JButton CALCULAR_VelocidadInst;
    private javax.swing.JTextField cjText2_Exponente;
    private javax.swing.JTextField cjText2_FuncionDerivada;
    private javax.swing.JTextField cjText2_FuncionInicial;
    private javax.swing.JTextField cjText2_RESULTADO;
    private javax.swing.JTextField cjText2_Tiempo;
    private javax.swing.JTextField cjText2_VariableA;
    private javax.swing.JTextField cjText2_VariableB;
    private javax.swing.JTextField cjText2_VariableC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_Content_pg2;
    // End of variables declaration//GEN-END:variables
}
