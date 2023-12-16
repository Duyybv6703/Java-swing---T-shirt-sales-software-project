
package banaonam.view;

import banaonam.model.nhanvien;
import banaonam.model.taikhoan;
import banaonam.model.taikhoandoimk;
import banaonam.sevice.nhanvienservice;
import banaonam.sevice.taikhoanservice;

import com.sun.mail.imap.IMAPMessage;
import java.util.Properties;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.*;
import javax.activation.*;
import javax.mail.internet.*;
import javax.swing.JOptionPane;


public class quenmatkhau extends javax.swing.JFrame {

    String otp = random();
    String taikhoan = "";
    taikhoanservice sertk = new taikhoanservice();

   
    public quenmatkhau() {
        initComponents();
        andoimk(false);
        anotp(false);
        setSize(590, 390);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pDoimk = new javax.swing.JPanel();
        btndoimk = new javax.swing.JButton();
        txtmatkhauxacnhan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtmatkhaumoi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbltaikhoan = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtNhapgmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pOTP = new javax.swing.JPanel();
        guiOTP1 = new javax.swing.JButton();
        txtOTP1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pDoimk.setBackground(new java.awt.Color(153, 255, 255));
        pDoimk.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pDoimk.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btndoimk.setText("gửi");
        btndoimk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndoimkActionPerformed(evt);
            }
        });
        pDoimk.add(btndoimk, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 124, -1, -1));
        pDoimk.add(txtmatkhauxacnhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 96, 257, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel1.setText("nhập mã Otp:");
        pDoimk.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, -1));
        pDoimk.add(txtmatkhaumoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 61, 257, -1));

        jLabel6.setText("tài khoản của bạn:");
        pDoimk.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 33, -1, -1));

        jLabel7.setText("mật khẩu mới :");
        pDoimk.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 64, -1, -1));

        jLabel8.setText("xác nhận mật khẩu:");
        pDoimk.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 99, -1, -1));

        lbltaikhoan.setText("jLabel9");
        pDoimk.add(lbltaikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 33, -1, -1));

        jPanel2.add(pDoimk, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 390, 150));

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("gửi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 37, -1, -1));
        jPanel4.add(txtNhapgmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 190, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel3.setText("nhập gmail đã đăng ký");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 190, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 390, 100));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setText("quên mật khẩu");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 51, 51));
        jPanel6.setForeground(new java.awt.Color(255, 51, 51));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("x");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 20, 20));

        pOTP.setBackground(new java.awt.Color(153, 255, 255));
        pOTP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pOTP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        guiOTP1.setText("gửi");
        guiOTP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guiOTP1ActionPerformed(evt);
            }
        });
        pOTP.add(guiOTP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 35, -1, -1));
        pOTP.add(txtOTP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 190, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel5.setText("nhập mã Otp:");
        pOTP.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 3, -1, -1));

        jPanel2.add(pOTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 390, 80));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        nhanvienservice sernv = new nhanvienservice();

        boolean check = false;

        for (taikhoandoimk object : sernv.laygmail()) {
            if (object.getGmail().equals(txtNhapgmail.getText())) {
                check = true;
                taikhoan = object.getTaikhoan();
                lbltaikhoan.setText(taikhoan);
                anotp(true);
            }
        }
        if (check == false) {
            JOptionPane.showMessageDialog(this, "gmail không tồn tại ");
            return;
        }
        String sub = "quên mật khẩu : ";
        String mess = "mã otp :" + " " + otp;
        String tk = "conbotthoiok@gmail.com";
        String mk = "v j b p n z x v m c s r e j n n";
        guimail("anhttph40973@fpt.edu.vn", sub, mess, tk, mk);
        JOptionPane.showMessageDialog(this, "mã đã được gửi đến gmail");


    }//GEN-LAST:event_jButton1ActionPerformed

    private void btndoimkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndoimkActionPerformed
        boolean check = true;
        if (txtmatkhaumoi.getText().isBlank() || txtmatkhaumoi.getText().isBlank() || txtmatkhauxacnhan.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "không để trống ");
            return;
        }
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher x = p.matcher(txtmatkhaumoi.getText());
        Matcher y = p.matcher(txtmatkhauxacnhan.getText());

        boolean b = x.find();
        boolean a = y.find();

        if (b || a) {
            check = false;
        }
        if (check == false) {
            JOptionPane.showMessageDialog(this, "không được chứa ký tự đặc biệt");
            return;
        }

        if (txtmatkhaumoi.getText().equals(txtmatkhauxacnhan.getText())) {

            taikhoan tk = laydulieu();
            if (sertk.doimktaikhoan(tk) != null) {
                JOptionPane.showMessageDialog(this, "đổi thành công");
                setVisible(false);
                new DangNhapJFrame().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "đổi thất bại , có lỗi sẩy ra");
            }

        } else {
            JOptionPane.showMessageDialog(this, "mật khẩu xác nhận không giống với mật khẩu mới");
            return;
        }

    }//GEN-LAST:event_btndoimkActionPerformed

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jPanel6MouseClicked

    private void guiOTP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiOTP1ActionPerformed
        if (txtOTP1.getText().equalsIgnoreCase(otp)) {
            taikhoan = txtNhapgmail.getText();
            andoimk(true);
            JOptionPane.showMessageDialog(this, "xác nhận thành công");

        } else {
            JOptionPane.showMessageDialog(this, "mã otp không chính xác");
        }    // TODO add your handling code here:
    }//GEN-LAST:event_guiOTP1ActionPerformed

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
            java.util.logging.Logger.getLogger(quenmatkhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quenmatkhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quenmatkhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quenmatkhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quenmatkhau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndoimk;
    private javax.swing.JButton guiOTP1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbltaikhoan;
    private javax.swing.JPanel pDoimk;
    private javax.swing.JPanel pOTP;
    private javax.swing.JTextField txtNhapgmail;
    private javax.swing.JTextField txtOTP1;
    private javax.swing.JTextField txtmatkhaumoi;
    private javax.swing.JTextField txtmatkhauxacnhan;
    // End of variables declaration//GEN-END:variables

    public void guimail(String to, String sub, String msg, String tk, String mk) {
        Properties ppts = new Properties();

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(tk, mk);
            }
        });
        try {
            MimeMessage massage = new MimeMessage(session);
            massage.setFrom(new InternetAddress(tk));
            massage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            massage.setSubject(sub);
            massage.setContent(msg, "text/html");
            Transport.send(massage);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String random() {
        String randomString;
        int length = 6;
        Random rd = new Random();
        String characters = "0123456789";
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = rd.nextInt(characters.length());
            char randomChar = characters.charAt(index);
            sb.append(randomChar);

        }
        randomString = sb.toString();

        return randomString;
    }

    public void anotp(boolean an) {
        pOTP.setVisible(an);
    }

    public void andoimk(boolean an) {
        pDoimk.setVisible(an);
    }

    public taikhoan laydulieu() {
        taikhoan tk = new taikhoan();
        tk.setTenTK(lbltaikhoan.getText());
        tk.setMatKhau(txtmatkhaumoi.getText());
        return tk;
    }
}
