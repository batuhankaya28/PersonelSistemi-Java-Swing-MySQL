
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class PersonelBilgisi extends javax.swing.JFrame {
    DefaultTableModel model;
    Adminİslemleri islemler = new Adminİslemleri();
    
    public PersonelBilgisi() {
        initComponents();
        model = (DefaultTableModel)calisan_tablosu.getModel();
        calisanGoruntule();
    }
    
    public void calisanGoruntule(){
        model.setRowCount(0);
        
        ArrayList<Employee> calisanlar = new ArrayList<Employee>();
        calisanlar = islemler.calisanlariGetir();
        
        if(calisanlar!= null){
            for(Employee employee : calisanlar){
                Object[] eklenecek = {
                    employee.getId(),
                    employee.getName(),
                    employee.getSurname(),
                    employee.getAge(),
                    employee.getMarialStatus(),
                    employee.getJob(),
                    employee.getSalary(),
                    employee.getPhoneNumber(),
                    employee.getEmail()
            };
            model.addRow(eklenecek);
        }
    }
   
}    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        calisan_tablosu = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jbuttonPersonelBilgiGeriDön = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        arama_cubugu = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jbuttonPersonelEkle = new javax.swing.JButton();
        jbuttonPersonelGüncelle = new javax.swing.JButton();
        jbuttonPersonelSil = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        calisan_tablosu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        calisan_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "İd", "İsim", "Soyisim", "Yaş", "Medeni Durum", "Meslek", "Maaş", "Telefon No.", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        calisan_tablosu.setSelectionBackground(new java.awt.Color(204, 0, 204));
        jScrollPane1.setViewportView(calisan_tablosu);
        if (calisan_tablosu.getColumnModel().getColumnCount() > 0) {
            calisan_tablosu.getColumnModel().getColumn(0).setResizable(false);
            calisan_tablosu.getColumnModel().getColumn(1).setResizable(false);
            calisan_tablosu.getColumnModel().getColumn(2).setResizable(false);
            calisan_tablosu.getColumnModel().getColumn(3).setResizable(false);
            calisan_tablosu.getColumnModel().getColumn(4).setResizable(false);
            calisan_tablosu.getColumnModel().getColumn(5).setResizable(false);
            calisan_tablosu.getColumnModel().getColumn(6).setResizable(false);
            calisan_tablosu.getColumnModel().getColumn(7).setResizable(false);
            calisan_tablosu.getColumnModel().getColumn(8).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(3, 61, 960, 430);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jbuttonPersonelBilgiGeriDön.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbuttonPersonelBilgiGeriDön.setForeground(new java.awt.Color(153, 0, 153));
        jbuttonPersonelBilgiGeriDön.setText("Geri Dön");
        jbuttonPersonelBilgiGeriDön.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153), 2));
        jbuttonPersonelBilgiGeriDön.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonPersonelBilgiGeriDönActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\kayab\\Downloads\\search-engine.png")); // NOI18N

        arama_cubugu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        arama_cubugu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153)));
        arama_cubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuguKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jbuttonPersonelBilgiGeriDön, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 164, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 437, Short.MAX_VALUE)
                .addComponent(jbuttonPersonelBilgiGeriDön, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 360, 530);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jbuttonPersonelEkle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbuttonPersonelEkle.setForeground(new java.awt.Color(153, 0, 153));
        jbuttonPersonelEkle.setIcon(new javax.swing.ImageIcon("C:\\Users\\kayab\\Downloads\\plus.png")); // NOI18N
        jbuttonPersonelEkle.setText("Personel Ekle");
        jbuttonPersonelEkle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153), 2));
        jbuttonPersonelEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonPersonelEkleActionPerformed(evt);
            }
        });

        jbuttonPersonelGüncelle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbuttonPersonelGüncelle.setForeground(new java.awt.Color(153, 0, 153));
        jbuttonPersonelGüncelle.setIcon(new javax.swing.ImageIcon("C:\\Users\\kayab\\Downloads\\refresh.png")); // NOI18N
        jbuttonPersonelGüncelle.setText("Personel Güncelle");
        jbuttonPersonelGüncelle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153), 2));
        jbuttonPersonelGüncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonPersonelGüncelleActionPerformed(evt);
            }
        });

        jbuttonPersonelSil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbuttonPersonelSil.setForeground(new java.awt.Color(153, 0, 153));
        jbuttonPersonelSil.setIcon(new javax.swing.ImageIcon("C:\\Users\\kayab\\Downloads\\remove.png")); // NOI18N
        jbuttonPersonelSil.setText("Personel Sil");
        jbuttonPersonelSil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153), 2));
        jbuttonPersonelSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonPersonelSilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addComponent(jbuttonPersonelSil, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbuttonPersonelGüncelle)
                .addGap(18, 18, 18)
                .addComponent(jbuttonPersonelEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbuttonPersonelSil, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbuttonPersonelGüncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbuttonPersonelEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(360, 0, 600, 110);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(360, 200, 600, 330);

        setSize(new java.awt.Dimension(977, 567));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbuttonPersonelBilgiGeriDönActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonPersonelBilgiGeriDönActionPerformed
        this.setVisible(false);
        new LoginScreen().setVisible(true);
    }//GEN-LAST:event_jbuttonPersonelBilgiGeriDönActionPerformed

    private void jbuttonPersonelGüncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonPersonelGüncelleActionPerformed
        this.setVisible(false);
        new PersonelGuncelle().setVisible(true);
    }//GEN-LAST:event_jbuttonPersonelGüncelleActionPerformed
    
    public void dinamikAra(String ara){
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        calisan_tablosu.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(ara));
    }
    
    private void arama_cubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuguKeyReleased
        String ara = arama_cubugu.getText();
        dinamikAra(ara);
        
    }//GEN-LAST:event_arama_cubuguKeyReleased

    private void jbuttonPersonelEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonPersonelEkleActionPerformed
        this.setVisible(false);
        new PersonelEkle().setVisible(true);
    }//GEN-LAST:event_jbuttonPersonelEkleActionPerformed

    private void jbuttonPersonelSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonPersonelSilActionPerformed
       int selectedrow = calisan_tablosu.getSelectedRow();
       
       if(selectedrow == -1){
           if(model.getRowCount() == 0){
               JOptionPane.showMessageDialog(this,"Silinecek Personel Bilgisi Bulunamadı.","Silme Hatası", JOptionPane.ERROR_MESSAGE);
           }
           else{
              JOptionPane.showMessageDialog(this,"Lütfen Silinecek Bir Çalışan Seçin...","Silme Hatası", JOptionPane.ERROR_MESSAGE); 
           }
       }
       else{
           int id = (int)model.getValueAt(selectedrow, 0);
           islemler.calisanSil(id);
           calisanGoruntule();
           JOptionPane.showMessageDialog(this,"Personel Başarıyla Silindi..","Personel Silme", JOptionPane.PLAIN_MESSAGE);
       }
    }//GEN-LAST:event_jbuttonPersonelSilActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonelBilgisi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arama_cubugu;
    private javax.swing.JTable calisan_tablosu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbuttonPersonelBilgiGeriDön;
    private javax.swing.JButton jbuttonPersonelEkle;
    private javax.swing.JButton jbuttonPersonelGüncelle;
    private javax.swing.JButton jbuttonPersonelSil;
    // End of variables declaration//GEN-END:variables


}
