/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package orutaprivacy;

import inter.RandomKeyGen;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author RameshKumar
 */
public class dataownerlogin extends javax.swing.JFrame {
  /*  Connection con;
    String url;
    String driver;
    String db;*/
    String gkey;
    /**
     *
     */
    public dataownerlogin() {
        initComponents();
        gkey=(String.valueOf(RandomKeyGen.randomblock1(3)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pno_txt = new javax.swing.JTextField();
        fname_txt = new javax.swing.JTextField();
        lname_txt = new javax.swing.JTextField();
        uname_txt = new javax.swing.JTextField();
        pass_txt = new javax.swing.JTextField();
        bdate_txt = new javax.swing.JTextField();
        gender_txt = new javax.swing.JTextField();
        city_txt = new javax.swing.JTextField();
        submitimg = new javax.swing.JLabel();
        resetimg = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        backgroundimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 23)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Create your Cloud Account");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 680, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Gender");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 70, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Firstname");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 70, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Lastname");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 70, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Username");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 70, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 70, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Birthdate");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 70, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Phoneno");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 70, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("City");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 70, -1));

        pno_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pno_txtActionPerformed(evt);
            }
        });
        getContentPane().add(pno_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 150, 30));

        fname_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fname_txtActionPerformed(evt);
            }
        });
        getContentPane().add(fname_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 150, 30));
        getContentPane().add(lname_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 150, 30));

        uname_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uname_txtActionPerformed(evt);
            }
        });
        getContentPane().add(uname_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 150, 30));
        getContentPane().add(pass_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 150, 30));

        bdate_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdate_txtActionPerformed(evt);
            }
        });
        getContentPane().add(bdate_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 150, 30));

        gender_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gender_txtActionPerformed(evt);
            }
        });
        getContentPane().add(gender_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 150, 30));

        city_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                city_txtActionPerformed(evt);
            }
        });
        getContentPane().add(city_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 150, 30));

        submitimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inter/submitimag.png"))); // NOI18N
        submitimg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitimgMouseClicked(evt);
            }
        });
        getContentPane().add(submitimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 80, 30));

        resetimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inter/resetimg123.png"))); // NOI18N
        resetimg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetimgMouseClicked(evt);
            }
        });
        getContentPane().add(resetimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 90, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Oruta: Privacy-Preserving Public Auditing for Shared Data in the Cloud");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inter/backbtn.jpg"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 80, 30));

        backgroundimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/99.jpg"))); // NOI18N
        getContentPane().add(backgroundimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 550));

        pack();
    }// </editor-fold>                        

    private void submitimgMouseClicked(java.awt.event.MouseEvent evt) {                                       
        //new index().setVisible(true);
        try
        {
          Connection  con=null;
          String  url="jdbc:mysql://localhost:3306/";
           String driver="com.mysql.jdbc.Driver";
           String db="orutapreserving";
            String Firstname = fname_txt.getText();
            String Lastname = lname_txt.getText();
            String Username = uname_txt.getText();
            String Password = pass_txt.getText();
            String Birthdate = bdate_txt.getText();
            String Gender = gender_txt.getText();
            String City=city_txt.getText();
            String Phoneno = pno_txt.getText();
            Class.forName(driver);
            con=(Connection)DriverManager.getConnection(url+db, "root","");
            java.sql.Statement st = con.createStatement();
            String sql =  "INSERT INTO `formreg`(`Firstname`,`Lastname`,`Username`,`Password`,`Birthdate`,`Gender`,`City`,`Phoneno`,`groupkey`) VALUES ('"+Firstname+"','"+Lastname+"','"+Username+"','"+Password+"','"+Birthdate+"','"+Gender+"','"+City+"','"+Phoneno+"','"+gkey+"')";
            //System.out.println(sql);
            
            st.executeUpdate(sql);
            System.out.println("value inserted");
            
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
      new index().setVisible(true); 
      dispose();
        // TODO add your handling code here:
    }                                      

    private void bdate_txtActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void resetimgMouseClicked(java.awt.event.MouseEvent evt) {                                      
     fname_txt.setText("");
     lname_txt.setText("");
     uname_txt.setText("");
     pass_txt.setText("");
     bdate_txt.setText("");
     gender_txt.setText("");
     city_txt.setText("");
     pno_txt.setText("");
    
        // TODO add your handling code here:
    }                                     

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {                                      
        new index().setVisible(true);
        dispose();
        // TODO add your handling code here:
    }                                     

    private void fname_txtActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void gender_txtActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void pno_txtActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void city_txtActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void uname_txtActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

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
            java.util.logging.Logger.getLogger(regform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(regform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(regform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(regform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dataownerlogin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JLabel backgroundimg;
    private javax.swing.JTextField bdate_txt;
    private javax.swing.JTextField city_txt;
    private javax.swing.JTextField fname_txt;
    private javax.swing.JTextField gender_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lname_txt;
    private javax.swing.JTextField pass_txt;
    private javax.swing.JTextField pno_txt;
    private javax.swing.JLabel resetimg;
    private javax.swing.JLabel submitimg;
    private javax.swing.JTextField uname_txt;
    // End of variables declaration                   
}
