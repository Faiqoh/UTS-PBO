/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Faiqoh
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
        setJam();
        setTanggal();
    }

        String nol_jam = "";
        String nol_menit = "";
        String nol_detik = "";
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tid = new javax.swing.JTextField();
        tnamaksr = new javax.swing.JTextField();
        tbnyk = new javax.swing.JTextField();
        tbrg = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tgl = new com.toedter.calendar.JDateChooser();
        tharga = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tdiskon = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnsave = new javax.swing.JButton();
        btnprint = new javax.swing.JButton();
        btnrefresh = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbldata = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        ttotal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tanggal = new javax.swing.JLabel();
        ljam = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));
        jPanel5.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("ISIAN DATA BARANG");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(50, 0, 160, 40);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 110, 290, 40);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Nama Kasir");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(20, 80, 100, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Id Barang");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(20, 140, 150, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Banyak Barang");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(20, 260, 110, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Harga Barang");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(20, 330, 110, 30);
        jPanel3.add(tid);
        tid.setBounds(20, 170, 250, 30);
        jPanel3.add(tnamaksr);
        tnamaksr.setBounds(20, 110, 250, 30);
        jPanel3.add(tbnyk);
        tbnyk.setBounds(20, 290, 250, 30);
        jPanel3.add(tbrg);
        tbrg.setBounds(20, 230, 250, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Nama Barang");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(20, 200, 120, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Tanggal Transaksi");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(20, 10, 120, 30);
        jPanel3.add(tgl);
        tgl.setBounds(20, 40, 250, 30);
        jPanel3.add(tharga);
        tharga.setBounds(20, 360, 250, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Diskon");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(20, 390, 110, 30);
        jPanel3.add(tdiskon);
        tdiskon.setBounds(20, 420, 250, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 160, 290, 570);

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setLayout(null);

        btnsave.setText("SAVE");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel4.add(btnsave);
        btnsave.setBounds(10, 10, 80, 30);

        btnprint.setText("PRINT");
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });
        jPanel4.add(btnprint);
        btnprint.setBounds(370, 10, 70, 30);

        btnrefresh.setText("REFRESH");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });
        jPanel4.add(btnrefresh);
        btnrefresh.setBounds(240, 10, 100, 30);

        btnclear.setText("CLEAR");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel4.add(btnclear);
        btnclear.setBounds(120, 10, 90, 30);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(300, 110, 600, 50);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(null);

        tbldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tanggal", "Nama Kasir", "Id Barang", "Nama Barang", "Banyak Barang", "Harga", "Diskon", "Jumlah Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbldata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbldataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbldata);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(0, 90, 600, 300);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("TOTAL HARGA");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(20, 10, 130, 60);

        ttotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(ttotal);
        ttotal.setBounds(150, 20, 310, 60);

        jButton1.setText("TOTAL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(480, 30, 80, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(300, 170, 600, 560);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SWALAYAN MAJU MAKMUR");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 490, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Jl. Mangga no. 534 Malang");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 60, 160, 15);

        tanggal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tanggal.setForeground(new java.awt.Color(255, 255, 255));
        tanggal.setText("Tanggal");
        jPanel1.add(tanggal);
        tanggal.setBounds(720, 20, 90, 30);

        ljam.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ljam.setForeground(new java.awt.Color(255, 255, 255));
        ljam.setText("Jam");
        jPanel1.add(ljam);
        ljam.setBounds(720, 50, 90, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 100);

        setBounds(0, 0, 915, 657);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tanggal = dateFormat.format(tgl.getDate());
        
        if("".equals(tnamaksr.getText()) || "".equals(tid.getText()) ||
            "".equals(tbrg.getText()) || "".equals(tbnyk.getText()) ||
            "".equals(tharga.getText()) || "".equals(tdiskon.getText())
            ){
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        }else{
            String SQL = "INSERT INTO tb_toko(tanggal,nama_kasir,id_barang,nama_barang,banyak_barang,harga_barang,diskon)"
            + "VALUES ('"+tanggal
            +"','"+tnamaksr.getText()      
            +"','"+tid.getText()
            +"','"+tbrg.getText()
            +"','"+tbnyk.getText()
            +"','"+tharga.getText()
            +"','"+tdiskon.getText()+"')";
            int status = KoneksiDB.execute(SQL);
            if(status == 1){
                JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan", "SUKSES", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            }else{
                JOptionPane.showMessageDialog(this, "Data Gagal Ditambahkan", "ERROR", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Daftar Barang Toko Buku Abadi");
        MessageFormat footer = new MessageFormat("Page {0,number,integer}    ");
        try{
            tbldata.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
        } catch (java.awt.print.PrinterException e){
            System.err.format("Cannot print %s%n", e.getMessage());
        }
    }//GEN-LAST:event_btnprintActionPerformed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        // TODO add your handling code here:
        selectData();
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        tnamaksr.setText("");
        tid.setText("");
        tbrg.setText("");
        tbnyk.setText("");
        tharga.setText("");
        tdiskon.setText("");
        tgl.setCalendar(null);
    }//GEN-LAST:event_btnclearActionPerformed

    private void tbldataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldataMouseClicked
        // TODO add your handling code here:
        int baris = tbldata.getSelectedRow();
        if (baris != -1) {
            SimpleDateFormat date=new SimpleDateFormat("yyyy-MM-dd");
            Date dateFormat=null;
            try {
                dateFormat=date.parse(tbldata.getValueAt(baris, 0).toString());
            } catch (ParseException ex) {

            }
            tgl.setDate(dateFormat);
            tnamaksr.setText(tbldata.getValueAt(baris, 1).toString());
            tid.setText(tbldata.getValueAt(baris, 2).toString());
            tbrg.setText(tbldata.getValueAt(baris, 3).toString());            
            tbnyk.setText(tbldata.getValueAt(baris, 4).toString());
            tharga.setText(tbldata.getValueAt(baris, 5).toString());
            tdiskon.setText(tbldata.getValueAt(baris, 6).toString());
            ttotal.setText(tbldata.getValueAt(baris, 7).toString());
        }
    }//GEN-LAST:event_tbldataMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int harga = Integer.parseInt(String.valueOf(tharga.getText()));
        int dis = Integer.parseInt(String.valueOf(tdiskon.getText()));
        int bnyk = Integer.parseInt(String.valueOf(tbnyk.getText()));
        int ttlharga = harga*bnyk;
        int diskon = ttlharga*dis/100;
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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }
    public void setTanggal(){
        java.util.Date skrg = new java.util.Date();
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat("dd/MM/yyyy");
        tanggal.setText(kal.format(skrg));
    }
    
    public void setJam(){
        ActionListener taskPerformer = new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                Date dt = new Date();
                int nilai_jam = dt.getHours();
                int nilai_menit = dt.getMinutes();
                int nilai_detik = dt.getSeconds();
                if (nilai_jam <= 9 ) {
                    nol_jam = "0";
                }
                if (nilai_menit <= 9 ) {
                    nol_menit = "";
                }
                if (nilai_detik <= 9) {
                    nol_detik = "";
                }
                
                String jam = nol_jam + Integer.toString(nilai_jam);
                String menit = nol_menit + Integer.toString(nilai_menit);
                String detik = nol_detik + Integer.toString(nilai_detik);
                ljam.setText("Jam "+ jam + ":" + menit + ":" + detik);
            }
        };
        new Timer(100, taskPerformer).start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnprint;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel ljam;
    private javax.swing.JLabel tanggal;
    private javax.swing.JTable tbldata;
    private javax.swing.JTextField tbnyk;
    private javax.swing.JTextField tbrg;
    private javax.swing.JTextField tdiskon;
    private com.toedter.calendar.JDateChooser tgl;
    private javax.swing.JTextField tharga;
    private javax.swing.JTextField tid;
    private javax.swing.JTextField tnamaksr;
    private javax.swing.JTextField ttotal;
    // End of variables declaration//GEN-END:variables

    private void selectData() {
        String kolom[] = {"tanggal","nama_kasir","id_barang","nama_barang","banyak_barang","harga_barang","diskon"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String sql = "SELECT * FROM tb_toko";
        ResultSet rs = KoneksiDB.executeQuery(sql);
        try{
            while(rs.next()){
                String tanggal = rs.getString(1);
                String nama_kasir = rs.getString(2);
                String id_barang = rs.getString(3);
                String nama_barang = rs.getString(4);
                String banyak_barang = rs.getString(5);
                String harga_barang = rs.getString(6);
                String diskon = rs.getString(7);
                String data[] = {tanggal,nama_kasir,id_barang,nama_barang,banyak_barang,harga_barang,diskon};
                dtm.addRow(data);
            }
        }catch(SQLException ex){
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        tbldata.setModel(dtm);
    }
}