import javax.swing.JOptionPane;
public class RegisterScreen extends javax.swing.JFrame {
    Adminİslemleri islemler = new Adminİslemleri();
    public RegisterScreen() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtRegisterName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRegisterSurname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRegisterUsername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtRegisterTelephone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtRegisterEmail = new javax.swing.JTextField();
        jbuttonGeriDön = new javax.swing.JButton();
        jbuttonKayıtOl = new javax.swing.JButton();
        txtUserPassword = new javax.swing.JPasswordField();
        txtUserPasswordAgain = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admin Kayıt İşlemi");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 400, 50);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("İsim :");

        txtRegisterName.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        txtRegisterName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtRegisterName.setToolTipText("");
        txtRegisterName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        txtRegisterName.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        txtRegisterName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRegisterNameKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Soyisim:");

        txtRegisterSurname.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        txtRegisterSurname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtRegisterSurname.setToolTipText("");
        txtRegisterSurname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        txtRegisterSurname.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        txtRegisterSurname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRegisterSurnameKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Kullanıcı Adı :");

        txtRegisterUsername.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        txtRegisterUsername.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtRegisterUsername.setToolTipText("");
        txtRegisterUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        txtRegisterUsername.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        txtRegisterUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRegisterUsernameKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Şifre :");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Şifre Tekrarı :");

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Telefon : ");

        txtRegisterTelephone.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        txtRegisterTelephone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtRegisterTelephone.setToolTipText("");
        txtRegisterTelephone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        txtRegisterTelephone.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        txtRegisterTelephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRegisterTelephoneKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Email : ");

        txtRegisterEmail.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        txtRegisterEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtRegisterEmail.setToolTipText("");
        txtRegisterEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        txtRegisterEmail.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        txtRegisterEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRegisterEmailKeyPressed(evt);
            }
        });

        jbuttonGeriDön.setBackground(new java.awt.Color(255, 102, 102));
        jbuttonGeriDön.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jbuttonGeriDön.setForeground(new java.awt.Color(255, 255, 255));
        jbuttonGeriDön.setText("Geri Dön");
        jbuttonGeriDön.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jbuttonGeriDön.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonGeriDönActionPerformed(evt);
            }
        });

        jbuttonKayıtOl.setBackground(new java.awt.Color(0, 51, 255));
        jbuttonKayıtOl.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jbuttonKayıtOl.setForeground(new java.awt.Color(255, 255, 255));
        jbuttonKayıtOl.setText("Kayıt Ol");
        jbuttonKayıtOl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jbuttonKayıtOl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonKayıtOlActionPerformed(evt);
            }
        });

        txtUserPassword.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtUserPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUserPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        txtUserPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserPasswordKeyPressed(evt);
            }
        });

        txtUserPasswordAgain.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtUserPasswordAgain.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUserPasswordAgain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        txtUserPasswordAgain.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserPasswordAgainKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRegisterName)
                    .addComponent(txtRegisterSurname)
                    .addComponent(txtRegisterUsername)
                    .addComponent(txtRegisterTelephone)
                    .addComponent(txtRegisterEmail)
                    .addComponent(txtUserPassword)
                    .addComponent(txtUserPasswordAgain))
                .addGap(75, 75, 75))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jbuttonGeriDön, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jbuttonKayıtOl, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegisterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegisterSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegisterUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserPasswordAgain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegisterTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegisterEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbuttonGeriDön, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbuttonKayıtOl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 50, 400, 500);

        setSize(new java.awt.Dimension(414, 582));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbuttonGeriDönActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonGeriDönActionPerformed
        this.setVisible(false);
        new LoginScreen().setVisible(true);
    }//GEN-LAST:event_jbuttonGeriDönActionPerformed

    private void jbuttonKayıtOlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonKayıtOlActionPerformed
      String ad = txtRegisterName.getText();
      String soyad = txtRegisterSurname.getText();
      String username = txtRegisterUsername.getText();
      String password =new String(txtUserPassword.getPassword());
      String telefon = txtRegisterTelephone.getText();
      String email = txtRegisterEmail.getText();
      
      boolean girisbasarili =islemler.adminKontrol(username);
      if(ad.isEmpty()&& soyad.isEmpty() && username.isEmpty() && password.isEmpty() && telefon.isEmpty() && email.isEmpty()){
          JOptionPane.showMessageDialog(this,"Lütfen Boş Bilgi Bırakmayınız...","Admin Oluşturma Hatası", JOptionPane.ERROR_MESSAGE);
      }
      else if(girisbasarili){
          JOptionPane.showMessageDialog(this,"Girdiğiniz Kullanıcı Adı Kullanılmaktadır..","Admin Oluşturma Hatası", JOptionPane.ERROR_MESSAGE);
      }
      else{
         islemler.yoneticiEkle(ad, soyad, username, password, telefon, email); 
         JOptionPane.showMessageDialog(this,"Yeni Admin Başarıyla Eklendi","Admin Kayıt", JOptionPane.PLAIN_MESSAGE);
         this.setVisible(false);
         new LoginScreen().setVisible(true);
      }
         
        
    }//GEN-LAST:event_jbuttonKayıtOlActionPerformed

    private void txtRegisterNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegisterNameKeyPressed
       
    }//GEN-LAST:event_txtRegisterNameKeyPressed

    private void txtRegisterSurnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegisterSurnameKeyPressed
       
    }//GEN-LAST:event_txtRegisterSurnameKeyPressed

    private void txtRegisterUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegisterUsernameKeyPressed
        
    }//GEN-LAST:event_txtRegisterUsernameKeyPressed

    private void txtUserPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserPasswordKeyPressed
        
    }//GEN-LAST:event_txtUserPasswordKeyPressed

    private void txtUserPasswordAgainKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserPasswordAgainKeyPressed
        
    }//GEN-LAST:event_txtUserPasswordAgainKeyPressed

    private void txtRegisterTelephoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegisterTelephoneKeyPressed
        
    }//GEN-LAST:event_txtRegisterTelephoneKeyPressed

    private void txtRegisterEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegisterEmailKeyPressed
     
    }//GEN-LAST:event_txtRegisterEmailKeyPressed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterScreen().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbuttonGeriDön;
    private javax.swing.JButton jbuttonKayıtOl;
    private javax.swing.JTextField txtRegisterEmail;
    private javax.swing.JTextField txtRegisterName;
    private javax.swing.JTextField txtRegisterSurname;
    private javax.swing.JTextField txtRegisterTelephone;
    private javax.swing.JTextField txtRegisterUsername;
    private javax.swing.JPasswordField txtUserPassword;
    private javax.swing.JPasswordField txtUserPasswordAgain;
    // End of variables declaration//GEN-END:variables
}
