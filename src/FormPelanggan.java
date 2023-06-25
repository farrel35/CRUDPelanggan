
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FormPelanggan extends javax.swing.JFrame {

    public static Connection conn;
    public static Statement stm;
    public static ResultSet rs;

    DefaultTableModel tabmodel;

    public FormPelanggan() throws SQLException {
        initComponents();
        conn = DriverManager.getConnection("jdbc:mysql://localhost/a112113437", "root", "");
        tampildata();
        disabledText(false);
    }

    private void tampildata() {
        tabmodel = new DefaultTableModel();
        tabmodel.addColumn("Kode Pelanggan");
        tabmodel.addColumn("Nama Pelanggan");
        tabmodel.addColumn("Alamat Pelanggan");
        tabmodel.addColumn("Kota Pelanggan");

        jTable1.setModel(tabmodel);

        try {
            String query = "SELECT * FROM pelanggan";
            stm = conn.createStatement();
            rs = stm.executeQuery(query);

            while (rs.next()) {
                String kode = rs.getString("kode_pelanggan");
                String nama = rs.getString("nama_pelanggan");
                String alamat = rs.getString("alamat_pelanggan");
                String kota = rs.getString("kota_pelanggan");

                tabmodel.addRow(new Object[]{kode, nama, alamat, kota});
            }

            jTable1.setModel(tabmodel);
        } catch (SQLException ex) {
            Logger.getLogger(FormPelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void disabledText(boolean b) {
        tkode_pelanggan.setEnabled(b);
        tnama_pelanggan.setEnabled(b);
        talamat_pelanggan.setEnabled(b);
        tkota_pelanggan.setEnabled(b);
    }

    private void deleteText() {
        tkode_pelanggan.setText("");
        tnama_pelanggan.setText("");
        talamat_pelanggan.setText("");
        tkota_pelanggan.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tkode_pelanggan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tnama_pelanggan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        talamat_pelanggan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tkota_pelanggan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("ENTRY DATA PELANGGAN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Kode Pelanggan");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 9, -1, -1));

        tkode_pelanggan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tkode_pelangganKeyPressed(evt);
            }
        });
        jPanel2.add(tkode_pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 6, 201, -1));

        jLabel3.setText("Nama Pelanggan");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 37, -1, -1));

        tnama_pelanggan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tnama_pelangganFocusGained(evt);
            }
        });
        tnama_pelanggan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tnama_pelangganKeyPressed(evt);
            }
        });
        jPanel2.add(tnama_pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 34, 200, -1));

        jLabel5.setText("Alamat Pelanggan");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 65, -1, -1));

        talamat_pelanggan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                talamat_pelangganFocusGained(evt);
            }
        });
        talamat_pelanggan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                talamat_pelangganKeyPressed(evt);
            }
        });
        jPanel2.add(talamat_pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 62, 201, -1));

        jLabel6.setText("Kota Pelanggan");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 93, -1, -1));

        tkota_pelanggan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tkota_pelangganFocusGained(evt);
            }
        });
        jPanel2.add(tkota_pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 90, 201, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        btnSave.setText("SAVE");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });

        btnNew.setText("NEW");
        btnNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewMouseClicked(evt);
            }
        });

        btnUpdate.setText("UPDATE");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });

        btnPrint.setText("PRINT");
        btnPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrintMouseClicked(evt);
            }
        });

        btnExit.setText("EXIT");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        int pilih = JOptionPane.showConfirmDialog(null, "Yakin keluar?", "Perhatian", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (pilih == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitMouseClicked

    private void tkode_pelangganKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tkode_pelangganKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tnama_pelanggan.requestFocus();
        }
    }//GEN-LAST:event_tkode_pelangganKeyPressed

    private void tnama_pelangganFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tnama_pelangganFocusGained
        if (tkode_pelanggan.getText().isEmpty()) {
            tkode_pelanggan.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Kode Pelanggan kosong!");
        }
    }//GEN-LAST:event_tnama_pelangganFocusGained

    private void btnNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseClicked
        deleteText();
        disabledText(true);
    }//GEN-LAST:event_btnNewMouseClicked

    private void talamat_pelangganFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_talamat_pelangganFocusGained
        if (tnama_pelanggan.getText().isEmpty()) {
            tnama_pelanggan.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Nama Pelanggan kosong!");
        }
    }//GEN-LAST:event_talamat_pelangganFocusGained

    private void tkota_pelangganFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tkota_pelangganFocusGained
        if (talamat_pelanggan.getText().isEmpty()) {
            talamat_pelanggan.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Alamat Pelanggan kosong!");
        }
    }//GEN-LAST:event_tkota_pelangganFocusGained

    private void tnama_pelangganKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tnama_pelangganKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            talamat_pelanggan.requestFocus();
        }
    }//GEN-LAST:event_tnama_pelangganKeyPressed

    private void talamat_pelangganKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_talamat_pelangganKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tkota_pelanggan.requestFocus();
        }
    }//GEN-LAST:event_talamat_pelangganKeyPressed

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        String query2 = "insert into pelanggan values ('" + tkode_pelanggan.getText() + "', '" + tnama_pelanggan.getText() + "', '" + talamat_pelanggan.getText() + "', '" + tkota_pelanggan.getText() + "')";
        try {
            stm = conn.createStatement();
            stm.executeUpdate(query2);
            tampildata();
            deleteText();
            disabledText(false);
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(rootPane, "Sudah ada kode pelanggan " + tkode_pelanggan.getText());
            } else {
                Logger.getLogger(FormPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSaveMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        tkode_pelanggan.setText((String) jTable1.getValueAt(jTable1.getSelectedRow(), 0));
        tnama_pelanggan.setText((String) jTable1.getValueAt(jTable1.getSelectedRow(), 1));
        talamat_pelanggan.setText((String) jTable1.getValueAt(jTable1.getSelectedRow(), 2));
        tkota_pelanggan.setText((String) jTable1.getValueAt(jTable1.getSelectedRow(), 3));
        disabledText(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        String query3 = "update pelanggan set nama_pelanggan = '" + tnama_pelanggan.getText() + "',alamat_pelanggan = '" + talamat_pelanggan.getText() + "',kota_pelanggan = '" + tkota_pelanggan.getText() + "' where kode_pelanggan='" + tkode_pelanggan.getText() + "'";

        try {
            stm = conn.createStatement();
            stm.executeUpdate(query3);
            JOptionPane.showMessageDialog(rootPane, "Berhasil update data");
            tampildata();
            deleteText();
            disabledText(false);
        } catch (SQLException ex) {
            Logger.getLogger(FormPelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        int pilih = JOptionPane.showConfirmDialog(null, "Yakin menghapus data ini?", "Perhatian", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (pilih == 0) {
            String query4 = "delete from pelanggan where kode_pelanggan='" + tkode_pelanggan.getText() + "'";

            try {
                stm = conn.createStatement();
                stm.executeUpdate(query4);
                tampildata();
                deleteText();
                disabledText(false);
            } catch (SQLException ex) {
                Logger.getLogger(FormPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseClicked
        MessageFormat header = new MessageFormat("Data Pelanggan");
        MessageFormat footer = new MessageFormat("Farrel Ardian/A11.2O21.13437");

        try {
            PrintRequestAttributeSet set = new HashPrintRequestAttributeSet();
            set.add(OrientationRequested.PORTRAIT);
            jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, set, true);
            JOptionPane.showMessageDialog(rootPane, "Print Sukses");
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(rootPane, "Print failed");
        }
    }//GEN-LAST:event_btnPrintMouseClicked

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
            java.util.logging.Logger.getLogger(FormPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FormPelanggan().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FormPelanggan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField talamat_pelanggan;
    private javax.swing.JTextField tkode_pelanggan;
    private javax.swing.JTextField tkota_pelanggan;
    private javax.swing.JTextField tnama_pelanggan;
    // End of variables declaration//GEN-END:variables

}
