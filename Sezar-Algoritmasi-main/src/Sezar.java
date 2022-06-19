
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Sezar extends javax.swing.JFrame {

    String alfabe = "ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ";
    int ks;


    public Sezar() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        sifrelenecekYazi = new javax.swing.JTextField();
        sifreliHali = new javax.swing.JTextField();
        sifreliYazi = new javax.swing.JTextField();
        sifresizHali = new javax.swing.JTextField();
        sifrele = new javax.swing.JButton();
        sifreyiCoz = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Basit Şifreleme");

        sifrelenecekYazi.setBackground(new java.awt.Color(255, 255, 255));
        sifrelenecekYazi.setForeground(new java.awt.Color(153, 153, 153));
        sifrelenecekYazi.setText("Şifrelenecek Yazı");
        sifrelenecekYazi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sifrelenecekYaziFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sifrelenecekYaziFocusLost(evt);
            }
        });

        sifreliHali.setBackground(new java.awt.Color(255, 255, 255));
        sifreliHali.setForeground(new java.awt.Color(153, 153, 153));
        sifreliHali.setText("Şifreli Hali");
        sifreliHali.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sifreliHaliFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sifreliHaliFocusLost(evt);
            }
        });

        sifreliYazi.setBackground(new java.awt.Color(255, 255, 255));
        sifreliYazi.setForeground(new java.awt.Color(153, 153, 153));
        sifreliYazi.setText("Şifreli Yazı");
        sifreliYazi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sifreliYaziFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sifreliYaziFocusLost(evt);
            }
        });

        sifresizHali.setBackground(new java.awt.Color(255, 255, 255));
        sifresizHali.setForeground(new java.awt.Color(153, 153, 153));
        sifresizHali.setText("Şifresiz Hali");
        sifresizHali.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sifresizHaliFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sifresizHaliFocusLost(evt);
            }
        });

        sifrele.setBackground(new java.awt.Color(0, 51, 255));
        sifrele.setForeground(new java.awt.Color(255, 255, 255));
        sifrele.setText("Şifrele");
        sifrele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreleActionPerformed(evt);
            }
        });

        sifreyiCoz.setBackground(new java.awt.Color(0, 51, 255));
        sifreyiCoz.setForeground(new java.awt.Color(255, 255, 255));
        sifreyiCoz.setText("Şifreyi Çöz");
        sifreyiCoz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreyiCozActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sifreliYazi)
                    .addComponent(sifrelenecekYazi, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sifreliHali, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifresizHali, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(sifrele, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(sifreyiCoz, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifrelenecekYazi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifreliHali, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(sifrele)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifreliYazi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifresizHali, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(sifreyiCoz)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String sifreli = "";
    private void sifreleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreleActionPerformed
        String sifre = "", metin = "", sifreli = "";
        int i, j, ks = 3, uzunluk;
        for (i = 0; i < 29; i++) {
            sifre += alfabe.charAt(i % 29);
        }
        sifreliHali.setText(sifre);
        metin = sifrelenecekYazi.getText();
        uzunluk = metin.length();

        for (i = 0; i < uzunluk; i++) {
            for (j = 0; j < 29; j++) {
                    if (metin.charAt(i) == alfabe.charAt(j)) {
                        sifreli += alfabe.charAt((j+ks)%29);
                    }
            }
        }
        sifreliHali.setText(sifreli);
    }//GEN-LAST:event_sifreleActionPerformed

    private void sifreyiCozActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreyiCozActionPerformed
        String sifre = "", metin = "", sifreli = "";
        int i, j, ks = 3, uzunluk;
        for (i = 0; i < 29; i++) {
            sifre += alfabe.charAt(i % 29);
        }
        sifresizHali.setText(sifre);
        metin = sifreliYazi.getText();
        uzunluk = metin.length();

        for (i = 0; i < uzunluk; i++) {
            for (j = 0; j < 29; j++) {
                    if (metin.charAt(i) == alfabe.charAt(j)) {
                        sifreli += alfabe.charAt((j-ks)%29);
                    }
            }
        }
        sifresizHali.setText(sifreli);
    }//GEN-LAST:event_sifreyiCozActionPerformed

    private void sifrelenecekYaziFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sifrelenecekYaziFocusGained
        if (sifrelenecekYazi.getText().equals("Şifrelenecek Yazı")) {
            sifrelenecekYazi.setText("");
            sifrelenecekYazi.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_sifrelenecekYaziFocusGained

    private void sifrelenecekYaziFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sifrelenecekYaziFocusLost
        if (sifrelenecekYazi.getText().equals("")) {
            sifrelenecekYazi.setText("Şifrelenecek Yazı");
            sifrelenecekYazi.setForeground(new Color(153, 153, 153));
        }    }//GEN-LAST:event_sifrelenecekYaziFocusLost

    private void sifreliHaliFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sifreliHaliFocusGained
        if (sifreliHali.getText().equals("Şifreli Hali")) {
            sifreliHali.setText("");
            sifreliHali.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_sifreliHaliFocusGained

    private void sifreliHaliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sifreliHaliFocusLost
        if (sifreliHali.getText().equals("")) {
            sifreliHali.setText("Şifreli Hali");
            sifreliHali.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_sifreliHaliFocusLost

    private void sifreliYaziFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sifreliYaziFocusGained
        if (sifreliYazi.getText().equals("Şifreli Yazı")) {
            sifreliYazi.setText("");
            sifreliYazi.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_sifreliYaziFocusGained

    private void sifreliYaziFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sifreliYaziFocusLost
        if (sifreliYazi.getText().equals("")) {
            sifreliYazi.setText("Şifreli Yazı");
            sifreliYazi.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_sifreliYaziFocusLost

    private void sifresizHaliFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sifresizHaliFocusGained
        if (sifresizHali.getText().equals("Şifresiz Hali")) {
            sifresizHali.setText("");
            sifresizHali.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_sifresizHaliFocusGained

    private void sifresizHaliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sifresizHaliFocusLost
        if (sifresizHali.getText().equals("")) {
            sifresizHali.setText("Şifresiz Hali");
            sifresizHali.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_sifresizHaliFocusLost

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
            java.util.logging.Logger.getLogger(Sezar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sezar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sezar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sezar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sezar().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton sifrele;
    private javax.swing.JTextField sifrelenecekYazi;
    private javax.swing.JTextField sifreliHali;
    private javax.swing.JTextField sifreliYazi;
    private javax.swing.JTextField sifresizHali;
    private javax.swing.JButton sifreyiCoz;
    // End of variables declaration//GEN-END:variables
}
