/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package asdbigprojectfourpeople;

import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.table.DefaultTableModel;
import java.text.NumberFormat;

/**
 *
 * @author julio
 */
public class Kasir extends javax.swing.JFrame {

    protected static JRootPane kasirRootPane;

    /**
     * Creates new form Kasir
     */
    public Kasir() {
        initComponents();

        // akalin agar obj kasir bisa diakses dari tempat lain
        kasirRootPane = this.rootPane;

        // ambil waktu open dari toko ini
        Date now = new Date();
        open = "" + now.getTime();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        inputIdPesananKasir = new javax.swing.JLabel();
        inputNamaKasir = new javax.swing.JTextField();
        addButtonToDapur = new javax.swing.JButton();
        labelNamaKasir = new javax.swing.JLabel();
        comboBoxIdPesananKasir = new javax.swing.JComboBox<>();
        labelJenisBayarKasir = new javax.swing.JLabel();
        comboBoxJenisBayarKasir = new javax.swing.JComboBox<>();
        labelMakanKasir = new javax.swing.JLabel();
        comboBoxMakanKasir = new javax.swing.JComboBox<>();
        labelCatatanKasir = new javax.swing.JLabel();
        inputCatatanSingkatKasir = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelHargaKasir = new javax.swing.JLabel();
        labelTotalHargaKasir = new javax.swing.JLabel();
        inputBanyakPesananKasir = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kasir (Main)");
        setPreferredSize(new java.awt.Dimension(700, 355));
        setSize(new java.awt.Dimension(700, 354));

        inputIdPesananKasir.setText("Nama Pesanan");

        addButtonToDapur.setText("Add");
        addButtonToDapur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonToDapurActionPerformed(evt);
            }
        });

        labelNamaKasir.setText("Nama");

        comboBoxIdPesananKasir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paket Keluarga", "Paket Kombo", "Paket Hemat", "Paket Sultan" }));
        comboBoxIdPesananKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxIdPesananKasirActionPerformed(evt);
            }
        });

        labelJenisBayarKasir.setText("Metode Pembayaran");

        comboBoxJenisBayarKasir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Gopay", "Shopeepay", "OVO", "Debit" }));

        labelMakanKasir.setText("Makan Di");

        comboBoxMakanKasir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tempat", "Bawa Pulang" }));

        labelCatatanKasir.setText("Catatan Singkat");

        inputCatatanSingkatKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCatatanSingkatKasirActionPerformed(evt);
            }
        });

        jLabel5.setText("Total Harga");

        jLabel6.setText("Banyak Pesanan");

        labelHargaKasir.setText("Rp120.000");

        labelTotalHargaKasir.setText("Rp120.000");

        inputBanyakPesananKasir.setText("1");
        inputBanyakPesananKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBanyakPesananKasirActionPerformed(evt);
            }
        });
        inputBanyakPesananKasir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputBanyakPesananKasirKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputBanyakPesananKasirKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputIdPesananKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNamaKasir)
                            .addComponent(labelJenisBayarKasir)
                            .addComponent(labelMakanKasir)
                            .addComponent(labelCatatanKasir)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTotalHargaKasir)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(inputNamaKasir)
                                .addComponent(addButtonToDapur)
                                .addComponent(inputCatatanSingkatKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(comboBoxMakanKasir, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comboBoxJenisBayarKasir, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comboBoxIdPesananKasir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(labelHargaKasir)))
                            .addComponent(inputBanyakPesananKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelNamaKasir)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputIdPesananKasir)
                            .addComponent(comboBoxIdPesananKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelHargaKasir))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelJenisBayarKasir)
                            .addComponent(comboBoxJenisBayarKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMakanKasir)
                            .addComponent(comboBoxMakanKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputNamaKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(labelTotalHargaKasir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(inputBanyakPesananKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCatatanKasir)
                    .addComponent(inputCatatanSingkatKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addButtonToDapur)
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //======================================================================================================================================================
    // buat pesanan dari myQueue dengan size 99 dan size dalemny 5
    // ingat ini array 2 dimensi
    public static MyQueue pesanan = new MyQueue(99, 7);
    public static String open;

    private boolean validasiInputanBanyak() {
        String[] angka = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        for (var an : angka) {
            if (labelTotalHargaKasir.getText().contains(an)) {
                return false;
            }
        }
        return true;
    }

    private void tampilkanTotalHarga() {
        // Validasi untuk nampilin Total Harga
        int banyakPesanan = 0;
        boolean notInt = false;
        try {
            banyakPesanan = Integer.valueOf(inputBanyakPesananKasir.getText());
        } catch (Exception e) {
            notInt = true;
        }
        long banyakPesananLong = 0;
        try {
            banyakPesananLong = inputBanyakPesananKasir.getText().equalsIgnoreCase("") ? 0 : Long.valueOf(inputBanyakPesananKasir.getText());
        } catch (Exception e) {
        }
        if (banyakPesananLong > Integer.MAX_VALUE) {
            labelTotalHargaKasir.setText("Mohon Masukan Banyak Pesanan Yang Masuk Akal");
        } else if (notInt) {
            labelTotalHargaKasir.setText("Mohon Hanya Masukkan Angka Pada Banyak Pesanan");
        } else {
            Locale indo = new Locale("id", "ID");
            NumberFormat indoFormat = NumberFormat.getCurrencyInstance(indo);
            String totalHarga = indoFormat.format(banyakPesanan * Integer.valueOf(Util.hargaDariNamaPesananReturnInt(Util.namaPesanan("" + comboBoxIdPesananKasir.getSelectedIndex()))) );
            labelTotalHargaKasir.setText(totalHarga.substring(0, (totalHarga.length() - 3)));
        }
    }

    // SAAT TOMBOL ADD DI KLIK MAKA AKAN DILAKUKAN DI BAWAH INI
    private void addButtonToDapurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonToDapurActionPerformed
        // ambil inputan mulai dari nama sampe catatan
        String nama = inputNamaKasir.getText();
        String namaPesanan = Util.namaPesanan("" + comboBoxIdPesananKasir.getSelectedIndex());
        String metodePembayaran = Util.metodePembaaran("" + comboBoxJenisBayarKasir.getSelectedIndex());
        String makanDi = Util.makanDi("" + comboBoxMakanKasir.getSelectedIndex());
        String catatan = inputCatatanSingkatKasir.getText();
        String banyakPesanan = inputBanyakPesananKasir.getText();

        if (nama.equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(rootPane, "Nama Mohon Diisi", "Error", HEIGHT);
//        else if (catatan.equalsIgnoreCase(""))
//            JOptionPane.showMessageDialog(rootPane, "Catatan Mohon Diisi", "Error", HEIGHT);
        else if (validasiInputanBanyak())
            JOptionPane.showMessageDialog(rootPane, "Mohon Untuk Mengisi Inputan Banyak Pesanan Dengan Benar", "Error", HEIGHT);
        else if (catatan.length() > 20)
            JOptionPane.showMessageDialog(rootPane, "Banyak Karakter Pada Catatan Jangan Lebih Dari 20", "Error", HEIGHT);
        else {
            // make date in utc 
            Date now = new Date();
            String time = now.getTime() + "";

            // ubah data di atas jadi array of string
            String[] newRow = new String[]{nama, namaPesanan, metodePembayaran, makanDi, banyakPesanan, catatan, time};

            // input newRow ke pesanan yang sifatnya global
            pesanan.endQueue(newRow);

            // newRow tadi tampilin di tabel pada Dapur
            DefaultTableModel model = (DefaultTableModel) Dapur.dapur.dapurTabel.getModel();
            model.addRow(newRow);

            // kosongin inputan
            inputNamaKasir.setText("");
            comboBoxIdPesananKasir.setSelectedIndex(0);
            comboBoxJenisBayarKasir.setSelectedIndex(0);
            comboBoxMakanKasir.setSelectedIndex(0);
            inputCatatanSingkatKasir.setText("");
            inputBanyakPesananKasir.setText("1");
            
            // jalankan tampilan harga
            tampilkanTotalHarga();

            // tampilan data berhasil di add pada dapur
            JOptionPane.showMessageDialog(rootPane, "Data Berhasil Masuk Ke Dapur", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_addButtonToDapurActionPerformed

    private void comboBoxIdPesananKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxIdPesananKasirActionPerformed
        // Tampilkan Harga di kanan dari comboBox nama Pesanan
        labelHargaKasir.setText("Rp" + Util.hargaDariNamaPesanan(Util.namaPesanan("" + comboBoxIdPesananKasir.getSelectedIndex())));
        tampilkanTotalHarga();
    }//GEN-LAST:event_comboBoxIdPesananKasirActionPerformed

    private void inputCatatanSingkatKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCatatanSingkatKasirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCatatanSingkatKasirActionPerformed

    private void inputBanyakPesananKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBanyakPesananKasirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputBanyakPesananKasirActionPerformed

    private void inputBanyakPesananKasirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputBanyakPesananKasirKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputBanyakPesananKasirKeyPressed

    private void inputBanyakPesananKasirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputBanyakPesananKasirKeyReleased
        tampilkanTotalHarga();
    }//GEN-LAST:event_inputBanyakPesananKasirKeyReleased

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
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kasir().setVisible(true);
                new Dapur().setVisible(true);
                new Database().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButtonToDapur;
    private javax.swing.JComboBox<String> comboBoxIdPesananKasir;
    private javax.swing.JComboBox<String> comboBoxJenisBayarKasir;
    private javax.swing.JComboBox<String> comboBoxMakanKasir;
    private javax.swing.JTextField inputBanyakPesananKasir;
    private javax.swing.JTextField inputCatatanSingkatKasir;
    private javax.swing.JLabel inputIdPesananKasir;
    private javax.swing.JTextField inputNamaKasir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labelCatatanKasir;
    private javax.swing.JLabel labelHargaKasir;
    private javax.swing.JLabel labelJenisBayarKasir;
    private javax.swing.JLabel labelMakanKasir;
    private javax.swing.JLabel labelNamaKasir;
    private javax.swing.JLabel labelTotalHargaKasir;
    // End of variables declaration//GEN-END:variables
}
