/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class AgendaPribadiGUI extends javax.swing.JFrame {
    int x=0; //deklarasi untuk manambahkan tabel  

    public AgendaPribadiGUI() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbltanggal = new javax.swing.JLabel();
        lblwaktu = new javax.swing.JLabel();
        lblkegiatan = new javax.swing.JLabel();
        txtkegiatan = new javax.swing.JTextField();
        txtwaktu = new javax.swing.JTextField();
        txttanggal = new javax.swing.JTextField();
        btntambah = new javax.swing.JButton();
        btnbersih = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabel = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnhapus = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AGENDA PRIBADI", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 102, 153))); // NOI18N

        lbltanggal.setText("Tanggal");

        lblwaktu.setText("Waktu");

        lblkegiatan.setText("Kegiatan");

        btntambah.setText("Tambah");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btnbersih.setText("Bersihkan");
        btnbersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbersihActionPerformed(evt);
            }
        });

        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblkegiatan)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbltanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblwaktu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtkegiatan, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(txtwaktu, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttanggal))
                        .addGap(0, 114, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btntambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnbersih)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnsimpan)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltanggal)
                    .addComponent(txttanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblwaktu)
                    .addComponent(txtwaktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblkegiatan)
                    .addComponent(txtkegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbersih)
                    .addComponent(btnsimpan)
                    .addComponent(btntambah))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tanggal", "Waktu", "Kegiatan"
            }
        ));
        jScrollPane1.setViewportView(jtabel);

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnedit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnhapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnkeluar)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnedit)
                    .addComponent(btnhapus)
                    .addComponent(btnkeluar))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        jtabel.setValueAt(txttanggal.getText(),x,0); 
        jtabel.setValueAt(txtwaktu.getText(),x,1);
        jtabel.setValueAt(txtkegiatan.getText(),x,2);
        x=x+1; //deklarasi untuk menambahkan pada button tambah
    }//GEN-LAST:event_btntambahActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        String tanya = "Apakah Anda Yakin Akan Menghapus Data ?";
        boolean yakin = JOptionPane.showConfirmDialog(rootPane, tanya)==JOptionPane.YES_OPTION;
        if (yakin){  
        jtabel.setValueAt("", jtabel.getSelectedRow(),0);
        jtabel.setValueAt("", jtabel.getSelectedRow(),1);
        jtabel.setValueAt("", jtabel.getSelectedRow(),2);
      }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnbersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbersihActionPerformed
        txttanggal.setText("");
        txtwaktu.setText("");
        txtkegiatan.setText("");
        txttanggal.requestFocus();
    }//GEN-LAST:event_btnbersihActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        DefaultTableModel model = (DefaultTableModel) jtabel.getModel();
        if (jtabel.getSelectedRow()==-1) {
            if (jtabel.getSelectedRow()==0){
                JOptionPane.showMessageDialog(null, "Belum ada data yang terpilih");
            }else{
                JOptionPane.showMessageDialog(null,"Silahkan Pilih Data");
            }
        }else{
        txttanggal.setText(model.getValueAt(jtabel.getSelectedRow(), 0).toString());
        txtwaktu.setText(model.getValueAt(jtabel.getSelectedRow(), 1).toString());
        txtkegiatan.setText(model.getValueAt(jtabel.getSelectedRow(), 2).toString());
        btntambah.setEnabled(false);
        }
    }//GEN-LAST:event_btneditActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        DefaultTableModel model = (DefaultTableModel) jtabel.getModel();
        if (jtabel.getSelectedRow()==-1) {
            if (jtabel.getRowCount()==0) {
                JOptionPane.showMessageDialog(null, "Belum ada Data yang terpilih");
            }else{
                JOptionPane.showMessageDialog(null, "Silahkan Pilih Data");
            }
        }else{
            model.setValueAt(txttanggal.getText(), jtabel.getSelectedRow(), 0);
            model.setValueAt(txtwaktu.getText(), jtabel.getSelectedRow(), 1);
            model.setValueAt(txtkegiatan.getText(), jtabel.getSelectedRow(), 2);
            btntambah.setEnabled(true);
            JOptionPane.showMessageDialog((null), "Data telah diubah");
            txttanggal.setText("");
            txtwaktu.setText("");
            txtkegiatan.setText(""); 
            txttanggal.requestFocus();
           
        }
    }//GEN-LAST:event_btnsimpanActionPerformed

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
            java.util.logging.Logger.getLogger(AgendaPribadiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendaPribadiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendaPribadiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendaPribadiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendaPribadiGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbersih;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btntambah;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtabel;
    private javax.swing.JLabel lblkegiatan;
    private javax.swing.JLabel lbltanggal;
    private javax.swing.JLabel lblwaktu;
    private javax.swing.JTextField txtkegiatan;
    private javax.swing.JTextField txttanggal;
    private javax.swing.JTextField txtwaktu;
    // End of variables declaration//GEN-END:variables
}
