
package lab2;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class matrices extends javax.swing.JFrame {
        Logicamatrices pasa = new Logicamatrices();

    public matrices() {
        initComponents();
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
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 249, 99));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 220, 118));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 213, 95));

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

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 213, 95));

        OPCIONES1.setBackground(new java.awt.Color(255, 113, 91));
        OPCIONES1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        OPCIONES1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OPCIONES1ActionPerformed(evt);
            }
        });
        jPanel1.add(OPCIONES1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        OPCION2.setBackground(new java.awt.Color(255, 113, 91));
        OPCION2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        OPCION2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OPCION2ActionPerformed(evt);
            }
        });
        jPanel1.add(OPCION2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        OPCIONES3.setBackground(new java.awt.Color(255, 113, 91));
        OPCIONES3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        OPCIONES3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OPCIONES3ActionPerformed(evt);
            }
        });
        jPanel1.add(OPCIONES3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        OPCIONES4.setBackground(new java.awt.Color(255, 113, 91));
        OPCIONES4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        OPCIONES4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OPCIONES4ActionPerformed(evt);
            }
        });
        jPanel1.add(OPCIONES4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 153, 102));
        jLabel1.setText("x");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 36, 6, 18));

        jLabel2.setBackground(new java.awt.Color(255, 153, 102));
        jLabel2.setText("x");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 37, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 153, 102));
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 3, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Filas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 153, 102));
        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 3, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Columas");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 153, 102));
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 3, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Filas");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 153, 102));
        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 3, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Columas");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        Suma.setBackground(new java.awt.Color(255, 204, 204));
        Suma.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        Suma.setText("Suma");
        Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumaActionPerformed(evt);
            }
        });
        jPanel1.add(Suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        Resta.setBackground(new java.awt.Color(255, 204, 204));
        Resta.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        Resta.setText("Resta");
        Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestaActionPerformed(evt);
            }
        });
        jPanel1.add(Resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        Multiplicacion.setBackground(new java.awt.Color(255, 204, 204));
        Multiplicacion.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        Multiplicacion.setText("Multiplicación");
        Multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicacionActionPerformed(evt);
            }
        });
        jPanel1.add(Multiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        INVERSE.setBackground(new java.awt.Color(255, 204, 204));
        INVERSE.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        INVERSE.setText("A ^-1");
        INVERSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INVERSEActionPerformed(evt);
            }
        });
        jPanel1.add(INVERSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, -1, -1));

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

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 213, 95));

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/54974hd.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 420));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OPCIONES1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OPCIONES1ActionPerformed
        pasa.lista1=(String) OPCIONES1.getSelectedItem(); 
        pasa.lista3=(String) OPCIONES1.getSelectedItem();

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
        pasa.lista4=(String) OPCIONES3.getSelectedItem();
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
                     pasa.Matriz1[i][j]=Double.parseDouble(array_tabla1[i][j]);
                 }
             }
             String[][] array_tabla2 = new String[tabla2.getRowCount()][tabla2.getColumnCount()];
             for (int i = 0; i < tabla2.getRowCount(); i++) {
                 for (int j = 0; j < tabla2.getColumnCount(); j++) {
                     array_tabla2[i][j] = (String) tabla2.getValueAt(i, j);
                     pasa.Matriz2[i][j]=Double.parseDouble(array_tabla2[i][j]);
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
        int n = Integer.parseInt((String)OPCIONES1.getSelectedItem());
     int g = Integer.parseInt((String) OPCIONES4.getSelectedItem());

    if(OPCION2.getSelectedItem().equals(OPCIONES3.getSelectedItem()))
    {
        
             String[][] array_tabla1 = new String[tabla1.getRowCount()][tabla1.getColumnCount()];
             for (int i = 0; i < tabla1.getRowCount(); i++) {
                 for (int j = 0; j < tabla1.getColumnCount(); j++) {
                     array_tabla1[i][j] = ((String) tabla1.getValueAt(i, j));
                     pasa.Matriz1[i][j]=Double.parseDouble(array_tabla1[i][j]);
                 }
             }
          
             String[][] array_tabla2 = new String[tabla2.getRowCount()][tabla2.getColumnCount()];
             for (int i = 0; i < tabla2.getRowCount(); i++) {
                 for (int j = 0; j < tabla2.getColumnCount(); j++) {
                     array_tabla2[i][j] = (String) tabla2.getValueAt(i, j);
                     pasa.Matriz2[i][j]=Double.parseDouble(array_tabla2[i][j]);
                 }
             }
             this.mostrarmatriz(pasa.multiplicarmatrices(pasa.Matriz1,pasa.Matriz2), n, g);     
        
    }else{
        JOptionPane.showMessageDialog(null, "error las columnas de la matriz 1 no son iguales a las filas de la matriz 2");
    }

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
                     pasa.Matriz1[i][j]=Double.parseDouble(array_tabla1[i][j]);
                 }
             }
          
             String[][] array_tabla2 = new String[tabla2.getRowCount()][tabla2.getColumnCount()];
             for (int i = 0; i < tabla2.getRowCount(); i++) {
                 for (int j = 0; j < tabla2.getColumnCount(); j++) {
                     array_tabla2[i][j] = (String) tabla2.getValueAt(i, j);
                     pasa.Matriz2[i][j]=Double.parseDouble(array_tabla2[i][j]);
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
        int n = Integer.parseInt((String)OPCIONES1.getSelectedItem());
    int g = Integer.parseInt((String) OPCION2.getSelectedItem());
    if(OPCIONES1.getSelectedItem().equals(OPCION2.getSelectedItem()))
    {
        String[][] array_tabla1 = new String[tabla1.getRowCount()][tabla1.getColumnCount()];
        for (int i = 0; i < tabla1.getRowCount(); i++) {
        for (int j = 0; j < tabla1.getColumnCount(); j++) {
        array_tabla1[i][j] = ((String) tabla1.getValueAt(i, j));
        pasa.Matriz1[i][j]=Double.parseDouble(array_tabla1[i][j]);
        }
        }
        if(pasa.determinante(pasa.Matriz1)!=0){
           this.mostrarmatriz(pasa.inversamatrices(pasa.Matriz1), n,g);  
        }else{
            JOptionPane.showMessageDialog(null, "la matriz a no tiene inversa");
   
        }     
        }else{
            JOptionPane.showMessageDialog(null, "error las matrices no es cuadrada");
    }
    }//GEN-LAST:event_INVERSEActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Maininterfaz abrir = new Maininterfaz();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
    public void mostrarmatriz(Double Res[][], int n, int g){// emtodo pasar valores tabla 3
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tabla1;
    private javax.swing.JTable tabla2;
    private javax.swing.JTable tabla3;
    // End of variables declaration//GEN-END:variables

   
}

