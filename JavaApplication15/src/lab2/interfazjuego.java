/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

public class interfazjuego extends javax.swing.JFrame {

    int contador1 = 0;
    int contador2 = 0;

    public interfazjuego() {
        initComponents();
        setResizable(false);
        setSize(1280, 720);

        this.setLocationRelativeTo(null);
        score.setText("0");
        score2.setText("0");

        piedrablue1.setVisible(false);
        papelblue1.setVisible(false);
        tijerablue1.setVisible(false);

        piedrared1.setVisible(false);
        papelred1.setVisible(false);
        tijerarred1.setVisible(false);
        
        Label1.setVisible(false);
        Label2.setVisible(false);
    }

    public void IA() {
        piedrared.setEnabled(true);
        papelred.setEnabled(true);
        tijerarred.setEnabled(true);

        int computer = (int) (Math.random() * 3);
        String cadena = String.valueOf(computer);
        Label2.setText(cadena);

        if (computer == 0) {
            piedrared.setEnabled(false);
        } else if (computer == 1) {
            papelred.setEnabled(false);
        } else if (computer == 2) {
            tijerarred.setEnabled(false);

        }
    }

    public void game() {
        int computer = Integer.parseInt((Label2.getText()));
        if (Label1.getText() == "0" && computer == 0) {
            piedrablue1.setVisible(true);
            papelblue1.setVisible(false);
            tijerablue1.setVisible(false);

            piedrared1.setVisible(true);
            papelred1.setVisible(false);
            tijerarred1.setVisible(false);
            puntaje.setText("EMPATE!");

        } else if (Label1.getText() == "0" && computer == 1) {
            piedrablue1.setVisible(true);
            papelblue1.setVisible(false);
            tijerablue1.setVisible(false);

            piedrared1.setVisible(false);
            papelred1.setVisible(true);
            tijerarred1.setVisible(false);
            puntaje.setText("COMPUTADOR WIN!");
            contador2 = contador2 + 1;
        } else if (Label1.getText() == "0" && computer == 2) {
            piedrablue1.setVisible(true);
            papelblue1.setVisible(false);
            tijerablue1.setVisible(false);

            piedrared1.setVisible(false);
            papelred1.setVisible(false);
            tijerarred1.setVisible(true);
            puntaje.setText("JUGADOR WIN!");
            contador1 = contador1 + 1;
            ///////////////////////////
        } else if (Label1.getText() == "1" && computer == 0) {
            piedrablue1.setVisible(false);
            papelblue1.setVisible(true);
            tijerablue1.setVisible(false);

            piedrared1.setVisible(true);
            papelred1.setVisible(false);
            tijerarred1.setVisible(false);
            puntaje.setText("JUGADOR WIN!");
            contador1 += 1;
        } else if (Label1.getText() == "1" && computer == 1) {
            piedrablue1.setVisible(false);
            papelblue1.setVisible(true);
            tijerablue1.setVisible(false);

            piedrared1.setVisible(false);
            papelred1.setVisible(true);
            tijerarred1.setVisible(false);
            puntaje.setText("EMPATE!");
        } else if (Label1.getText() == "1" && computer == 2) {
            piedrablue1.setVisible(false);
            papelblue1.setVisible(true);
            tijerablue1.setVisible(false);

            piedrared1.setVisible(false);
            papelred1.setVisible(false);
            tijerarred1.setVisible(true);
            puntaje.setText("COMPUTADOR WIN!");
            contador2 += 1;
            ///////////////////////////////////
        } else if (Label1.getText() == "2" && computer == 0) {
            piedrablue1.setVisible(false);
            papelblue1.setVisible(false);
            tijerablue1.setVisible(true);

            piedrared1.setVisible(true);
            papelred1.setVisible(false);
            tijerarred1.setVisible(false);
            puntaje.setText("COMPUTADOR WIN!");
            contador2 += 1;
        } else if (Label1.getText() == "2" && computer == 1) {
            piedrablue1.setVisible(false);
            papelblue1.setVisible(false);
            tijerablue1.setVisible(true);

            piedrared1.setVisible(false);
            papelred1.setVisible(true);
            tijerarred1.setVisible(false);
            puntaje.setText("JUGADOR WIN!");
            contador1 += 1;
        } else if (Label1.getText() == "2" && computer == 2) {
            piedrablue1.setVisible(false);
            papelblue1.setVisible(false);
            tijerablue1.setVisible(true);

            piedrared1.setVisible(false);
            papelred1.setVisible(false);
            tijerarred1.setVisible(true);
            puntaje.setText("EMPATE!");
        }

        score.setText(contador1 + "");
        score2.setText(contador2 + "");

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
        piedrablue = new javax.swing.JButton();
        papelblue = new javax.swing.JButton();
        tijerablue = new javax.swing.JButton();
        piedrared = new javax.swing.JButton();
        papelred = new javax.swing.JButton();
        tijerarred = new javax.swing.JButton();
        piedrablue1 = new javax.swing.JButton();
        papelblue1 = new javax.swing.JButton();
        tijerablue1 = new javax.swing.JButton();
        score = new javax.swing.JLabel();
        score2 = new javax.swing.JLabel();
        piedrared1 = new javax.swing.JButton();
        papelred1 = new javax.swing.JButton();
        tijerarred1 = new javax.swing.JButton();
        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        puntaje = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        piedrablue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/piedra blue.png"))); // NOI18N
        piedrablue.setContentAreaFilled(false);
        piedrablue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piedrablueActionPerformed(evt);
            }
        });
        jPanel1.add(piedrablue, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 128, 135));

        papelblue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/papel blue.png"))); // NOI18N
        papelblue.setContentAreaFilled(false);
        papelblue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                papelblueActionPerformed(evt);
            }
        });
        jPanel1.add(papelblue, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 140, 121));

        tijerablue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tijeras blue.png"))); // NOI18N
        tijerablue.setContentAreaFilled(false);
        tijerablue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tijerablueActionPerformed(evt);
            }
        });
        jPanel1.add(tijerablue, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, -1, -1));

        piedrared.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/piedra red.png"))); // NOI18N
        piedrared.setContentAreaFilled(false);
        jPanel1.add(piedrared, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 380, 140, 130));

        papelred.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/papel red.png"))); // NOI18N
        papelred.setContentAreaFilled(false);
        jPanel1.add(papelred, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 380, 130, 140));

        tijerarred.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tijeras red.png"))); // NOI18N
        tijerarred.setContentAreaFilled(false);
        jPanel1.add(tijerarred, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 510, -1, 190));

        piedrablue1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/piedra blue.png"))); // NOI18N
        piedrablue1.setContentAreaFilled(false);
        jPanel1.add(piedrablue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 128, 135));

        papelblue1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/papel blue.png"))); // NOI18N
        papelblue1.setContentAreaFilled(false);
        papelblue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                papelblue1ActionPerformed(evt);
            }
        });
        jPanel1.add(papelblue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 140, 121));

        tijerablue1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tijeras blue.png"))); // NOI18N
        tijerablue1.setContentAreaFilled(false);
        tijerablue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tijerablue1ActionPerformed(evt);
            }
        });
        jPanel1.add(tijerablue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        score.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        score.setText("0");
        jPanel1.add(score, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 20, 20));

        score2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        score2.setText("0");
        jPanel1.add(score2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 30, 20, 20));

        piedrared1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/piedra red.png"))); // NOI18N
        piedrared1.setContentAreaFilled(false);
        jPanel1.add(piedrared1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 140, 140, 130));

        papelred1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/papel red.png"))); // NOI18N
        papelred1.setContentAreaFilled(false);
        papelred1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                papelred1ActionPerformed(evt);
            }
        });
        jPanel1.add(papelred1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 140, 130, 140));

        tijerarred1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tijeras red.png"))); // NOI18N
        tijerarred1.setContentAreaFilled(false);
        jPanel1.add(tijerarred1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 110, -1, 190));

        Label1.setText("Label1");
        jPanel1.add(Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, -1));

        Label2.setText("Label2");
        jPanel1.add(Label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, -1, -1));

        jLabel1.setFont(new java.awt.Font("Gadugi", 2, 18)); // NOI18N
        jLabel1.setText("JUGADOR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 90, -1));

        jLabel2.setFont(new java.awt.Font("Gadugi", 2, 18)); // NOI18N
        jLabel2.setText("COMPUTADOR");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 30, 140, -1));

        puntaje.setText("jLabel3");
        jPanel1.add(puntaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, -1));

        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

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

    private void papelblueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_papelblueActionPerformed
        Label1.setText("1");
        IA();
        game();
    }//GEN-LAST:event_papelblueActionPerformed

    private void papelblue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_papelblue1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_papelblue1ActionPerformed

    private void tijerablue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tijerablue1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tijerablue1ActionPerformed

    private void piedrablueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piedrablueActionPerformed
        Label1.setText("0");
        IA();
        game();
    }//GEN-LAST:event_piedrablueActionPerformed

    private void tijerablueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tijerablueActionPerformed
        Label1.setText("2");
        IA();
        game();
    }//GEN-LAST:event_tijerablueActionPerformed

    private void papelred1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_papelred1ActionPerformed

    }//GEN-LAST:event_papelred1ActionPerformed

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
            java.util.logging.Logger.getLogger(interfazjuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazjuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazjuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazjuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazjuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton papelblue;
    private javax.swing.JButton papelblue1;
    private javax.swing.JButton papelred;
    private javax.swing.JButton papelred1;
    private javax.swing.JButton piedrablue;
    private javax.swing.JButton piedrablue1;
    private javax.swing.JButton piedrared;
    private javax.swing.JButton piedrared1;
    private javax.swing.JLabel puntaje;
    private javax.swing.JLabel score;
    private javax.swing.JLabel score2;
    private javax.swing.JButton tijerablue;
    private javax.swing.JButton tijerablue1;
    private javax.swing.JButton tijerarred;
    private javax.swing.JButton tijerarred1;
    // End of variables declaration//GEN-END:variables
}
