
package lab2;

import javax.swing.JTable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class matrices extends javax.swing.JFrame {
        Logicamatrices pasa = new Logicamatrices();
        



    
    public matrices() {
        initComponents();
        JTable tabla1, tabla2, tabla3;

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        OPCIONES1 = new javax.swing.JComboBox<>();
        OPCION2 = new javax.swing.JComboBox<>();
        OPCIONES3 = new javax.swing.JComboBox<>();
        OPCIONES4 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Suma = new javax.swing.JButton();
        Resta = new javax.swing.JButton();
        Multiplicacion = new javax.swing.JButton();
        INVERSE = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 249, 99));

        jPanel1.setBackground(new java.awt.Color(255, 220, 118));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

        jScrollPane1.setBackground(new java.awt.Color(0, 51, 204));

        tabla1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "1", "2", "3", "4"
            }
        ));
        tabla1.setToolTipText("");
        tabla1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla1.setGridColor(new java.awt.Color(102, 102, 102));
        tabla1.setRowSelectionAllowed(false);
        tabla1.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tabla1.setSelectionForeground(new java.awt.Color(255, 204, 51));
        jScrollPane1.setViewportView(tabla1);

        jScrollPane3.setBackground(new java.awt.Color(255, 153, 102));

        tabla2.setAutoCreateRowSorter(true);
        tabla2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "1", "2", "3", "4"
            }
        ));
        tabla2.setToolTipText("");
        tabla2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla2.setRowSelectionAllowed(false);
        jScrollPane3.setViewportView(tabla2);

        OPCIONES1.setBackground(new java.awt.Color(255, 113, 91));
        OPCIONES1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        OPCIONES1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OPCIONES1ActionPerformed(evt);
            }
        });

        OPCION2.setBackground(new java.awt.Color(255, 113, 91));
        OPCION2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        OPCION2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OPCION2ActionPerformed(evt);
            }
        });

        OPCIONES3.setBackground(new java.awt.Color(255, 113, 91));
        OPCIONES3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        OPCIONES3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OPCIONES3ActionPerformed(evt);
            }
        });

        OPCIONES4.setBackground(new java.awt.Color(255, 113, 91));
        OPCIONES4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        OPCIONES4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OPCIONES4ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 153, 102));
        jLabel1.setText("x");

        jLabel2.setBackground(new java.awt.Color(255, 153, 102));
        jLabel2.setText("x");

        jLabel3.setBackground(new java.awt.Color(255, 153, 102));
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 3, 11)); // NOI18N
        jLabel3.setText("Filas");

        jLabel4.setBackground(new java.awt.Color(255, 153, 102));
        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 3, 11)); // NOI18N
        jLabel4.setText("Columas");

        jLabel5.setBackground(new java.awt.Color(255, 153, 102));
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 3, 11)); // NOI18N
        jLabel5.setText("Filas");

        jLabel6.setBackground(new java.awt.Color(255, 153, 102));
        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 3, 11)); // NOI18N
        jLabel6.setText("Columas");

        Suma.setBackground(new java.awt.Color(255, 204, 204));
        Suma.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        Suma.setText("Suma");
        Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumaActionPerformed(evt);
            }
        });

        Resta.setBackground(new java.awt.Color(255, 204, 204));
        Resta.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        Resta.setText("Resta");
        Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestaActionPerformed(evt);
            }
        });

        Multiplicacion.setBackground(new java.awt.Color(255, 204, 204));
        Multiplicacion.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        Multiplicacion.setText("Multiplicación");
        Multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicacionActionPerformed(evt);
            }
        });

        INVERSE.setBackground(new java.awt.Color(255, 204, 204));
        INVERSE.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        INVERSE.setText("A * B^-1");
        INVERSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INVERSEActionPerformed(evt);
            }
        });

        jScrollPane4.setBackground(new java.awt.Color(255, 153, 102));

        tabla3.setAutoCreateRowSorter(true);
        tabla3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tabla3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla3.setToolTipText("");
        tabla3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla3.setRowSelectionAllowed(false);
        jScrollPane4.setViewportView(tabla3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(OPCIONES1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OPCION2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(OPCIONES3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OPCIONES4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(53, 53, 53)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Suma)
                        .addGap(18, 18, 18)
                        .addComponent(Resta)
                        .addGap(18, 18, 18)
                        .addComponent(Multiplicacion)))
                .addGap(18, 18, 18)
                .addComponent(INVERSE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OPCIONES1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPCION2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OPCIONES4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPCIONES3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Resta)
                    .addComponent(Suma)
                    .addComponent(Multiplicacion)
                    .addComponent(INVERSE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

    private void OPCIONES1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OPCIONES1ActionPerformed
        pasa.lista1=(String) OPCIONES1.getSelectedItem(); 
    }//GEN-LAST:event_OPCIONES1ActionPerformed

    private void OPCION2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OPCION2ActionPerformed
       pasa.lista2=(String) OPCION2.getSelectedItem();
       pasa.tamaño(tabla1);
    }//GEN-LAST:event_OPCION2ActionPerformed

    private void OPCIONES4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OPCIONES4ActionPerformed
       pasa.lista2=(String) OPCIONES4.getSelectedItem();
       pasa.tamaño(tabla2);
       
    }//GEN-LAST:event_OPCIONES4ActionPerformed

    private void OPCIONES3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OPCIONES3ActionPerformed
        pasa.lista1=(String) OPCIONES3.getSelectedItem(); 
    }//GEN-LAST:event_OPCIONES3ActionPerformed

    private void SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumaActionPerformed
    int n = Integer.parseInt((String)OPCIONES1.getSelectedItem());
    int g = Integer.parseInt((String) OPCION2.getSelectedItem());

    if(OPCIONES1.getSelectedItem().equals(OPCIONES3.getSelectedItem()))
    {
        if(OPCION2.getSelectedItem().equals(OPCIONES4.getSelectedItem())){
             String[][] array_tabla1 = new String[tabla1.getRowCount()][tabla1.getColumnCount()];
             for (int i = 0; i < tabla1.getRowCount(); i++) {
                 for (int j = 0; j < tabla1.getColumnCount(); j++) {
                     array_tabla1[i][j] = ((String) tabla1.getValueAt(i, j));
                 }
             }
             for (int i = 0; i < tabla1.getRowCount(); i++) {
                 for (int j = 0; j < tabla1.getColumnCount(); j++) {
                    pasa.Matriz1[i][j]=Double.parseDouble(array_tabla1[i][j]);

                 }
             }
             String[][] array_tabla2 = new String[tabla2.getRowCount()][tabla2.getColumnCount()];
             for (int i = 0; i < tabla2.getRowCount(); i++) {
                 for (int j = 0; j < tabla2.getColumnCount(); j++) {
                     array_tabla2[i][j] = (String) tabla2.getValueAt(i, j);
                 }
             }
             for (int i = 0; i < tabla2.getRowCount(); i++) {
                 for (int j = 0; j < tabla2.getColumnCount(); j++) {
                     pasa.Matriz2[i][j]=Double.parseDouble(array_tabla2[i][j]);
                 }
             }
             for (int i = 0; i < tabla2.getRowCount(); i++) {
                for (int j = 0; j < tabla2.getColumnCount(); j++) {
                    pasa.Matriz2[i][j] = Double.parseDouble(array_tabla2[i][j]);
                }
            }
             this.mostrarmatriz(pasa.sumamatrices(pasa.Matriz1,pasa.Matriz2), n,g);    
        }else{
            JOptionPane.showMessageDialog(null, "error las matrices no tienen el mismo tamaño");
        }
    }else{
        JOptionPane.showMessageDialog(null, "error las matrices no tienen el mismo tamaño");
    }
   

    }//GEN-LAST:event_SumaActionPerformed

    private void MultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MultiplicacionActionPerformed

    private void RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestaActionPerformed
     int n = Integer.parseInt((String)OPCIONES1.getSelectedItem());
     int g = Integer.parseInt((String) OPCION2.getSelectedItem());

    if(OPCIONES1.getSelectedItem().equals(OPCIONES3.getSelectedItem()))
    {
        if(OPCION2.getSelectedItem().equals(OPCIONES4.getSelectedItem())){
             String[][] array_tabla1 = new String[tabla1.getRowCount()][tabla1.getColumnCount()];
             for (int i = 0; i < tabla1.getRowCount(); i++) {
                 for (int j = 0; j < tabla1.getColumnCount(); j++) {
                     array_tabla1[i][j] = ((String) tabla1.getValueAt(i, j));
                 }
             }
             for (int i = 0; i < tabla1.getRowCount(); i++) {
                 for (int j = 0; j < tabla1.getColumnCount(); j++) {
                    pasa.Matriz1[i][j]=Double.parseDouble(array_tabla1[i][j]);

                 }
             }
             String[][] array_tabla2 = new String[tabla2.getRowCount()][tabla2.getColumnCount()];
             for (int i = 0; i < tabla2.getRowCount(); i++) {
                 for (int j = 0; j < tabla2.getColumnCount(); j++) {
                     array_tabla2[i][j] = (String) tabla2.getValueAt(i, j);
                 }
             }
             for (int i = 0; i < tabla2.getRowCount(); i++) {
                 for (int j = 0; j < tabla2.getColumnCount(); j++) {
                     pasa.Matriz2[i][j]=Double.parseDouble(array_tabla2[i][j]);
                 }
             }
             for (int i = 0; i < tabla2.getRowCount(); i++) {
                for (int j = 0; j < tabla2.getColumnCount(); j++) {
                    pasa.Matriz2[i][j] = Double.parseDouble(array_tabla2[i][j]);
                }
            }
            
             this.mostrarmatriz(pasa.restarmatrices(pasa.Matriz1,pasa.Matriz2), n, g);
   
                
        }else{
            JOptionPane.showMessageDialog(null, "error las matrices no tienen el mismo tamaño");
        }
    }else{
        JOptionPane.showMessageDialog(null, "error las matrices no tienen el mismo tamaño");
    }
    }//GEN-LAST:event_RestaActionPerformed

    private void INVERSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INVERSEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INVERSEActionPerformed

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
            java.util.logging.Logger.getLogger(matrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(matrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(matrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(matrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new matrices().setVisible(true);
            }
        });
    }
    public void mostrarmatriz(Double Res[][], int n, int g){
        DefaultTableModel Modelo2 = (DefaultTableModel) tabla3.getModel();
        Modelo2.setRowCount(n);
        Modelo2.setColumnCount(g); 
        for(int i=0;i<n;i++){
            for(int j=0;j<g;j++){
                tabla3.setValueAt(Res[i][j], i, j);
            }
        }
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton INVERSE;
    private javax.swing.JButton Multiplicacion;
    private javax.swing.JComboBox<String> OPCION2;
    private javax.swing.JComboBox<String> OPCIONES1;
    private javax.swing.JComboBox<String> OPCIONES3;
    private javax.swing.JComboBox<String> OPCIONES4;
    private javax.swing.JButton Resta;
    private javax.swing.JButton Suma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tabla1;
    private javax.swing.JTable tabla2;
    private javax.swing.JTable tabla3;
    // End of variables declaration//GEN-END:variables

   
}
