/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package orutaprivacy;

import com.dropbox.core.DbxException;
import com.dropbox.core.json.JsonReader;
import com.ecs.api.dropbox.FileUploader;
import com.ecs.api.util.AppConfiguration;
import static com.ecs.api.util.AppConfiguration.CONF_APP_AUTH;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import inter.RandomKeyGen;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JTextArea;

/**
 *
 * @author RameshKumar
 */
public class fileuploaders extends javax.swing.JFrame {
    
    
    String user="";
    String filename;
    File f;
    private AppConfiguration appConfig;
    private FileUploader fileUploader;
    String blk1;
    String blk2;
    String blk3;
    String blk4;
    String blk5;
    double m;
    String mvalue;

    /*

     //String jTextArea1;
     // String reader;

     /**
     * Creates new form fileuploaders
     */
    public fileuploaders() {
        initComponents();
        appConfig = new AppConfiguration();
        if (!appConfig.loadConfiguration()) {
            showAuthorizationError();
            this.dispose();
        }
        try {
            fileUploader = new FileUploader(appConfig.getSpecificProp(CONF_APP_AUTH));
        } catch (JsonReader.FileLoadException ex) {
            ex.printStackTrace();
        }
        
    }
     public fileuploaders(String user) {
        this.user=user;
        initComponents();
        txt_username.setText(user);
         appConfig = new AppConfiguration();
        if (!appConfig.loadConfiguration()) {
            showAuthorizationError();
            this.dispose();
        }
        try {
            fileUploader = new FileUploader(appConfig.getSpecificProp(CONF_APP_AUTH));
        } catch (JsonReader.FileLoadException ex) {
            ex.printStackTrace();
        }
    }
    
   
    /* public fileuploaders(String filename)
     {
     // this.filename=filename;
     initComponents();
     txt_filename.setText(filename);
     //uplfile.setText(jTextArea1);
        
     }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel19 = new javax.swing.JLabel();
        txtCloudPath = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_filename = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pkey_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        upldate_txt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        uplfile = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        lockimg = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        block1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        block2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        block3 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        block4 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        block5 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        time_txt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        backgroundimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setText("Cloud Path");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        txtCloudPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCloudPathActionPerformed(evt);
            }
        });
        getContentPane().add(txtCloudPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 129, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Ownername");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 80, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Upload File Using Ring Signature");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 910, -1));

        txt_username.setEditable(false);
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 129, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Filename");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        txt_filename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filenameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_filename, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 129, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Privatekey");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        pkey_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pkey_txtActionPerformed(evt);
            }
        });
        getContentPane().add(pkey_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 129, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Uploaddate");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 80, -1));

        upldate_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upldate_txtActionPerformed(evt);
            }
        });
        getContentPane().add(upldate_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 129, -1));

        uplfile.setColumns(20);
        uplfile.setRows(5);
        jScrollPane1.setViewportView(uplfile);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 235, 230));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel7.setText("FILE");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 30, -1));

        lockimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inter/VPC_Cloud_Lock-300x235.png"))); // NOI18N
        lockimg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lockimgMouseClicked(evt);
            }
        });
        getContentPane().add(lockimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 100, 70));

        block1.setColumns(20);
        block1.setRows(5);
        jScrollPane2.setViewportView(block1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 200, 70));

        block2.setColumns(20);
        block2.setRows(5);
        jScrollPane3.setViewportView(block2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, 200, 70));

        block3.setColumns(20);
        block3.setRows(5);
        jScrollPane4.setViewportView(block3);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 310, 200, 70));

        block4.setColumns(20);
        block4.setRows(5);
        jScrollPane5.setViewportView(block4);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 390, 200, 70));

        block5.setColumns(20);
        block5.setRows(5);
        jScrollPane6.setViewportView(block5);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 470, 200, 70));

        jLabel8.setText("Block1");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, -1, -1));

        jLabel12.setText("Block2");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 240, -1, -1));

        jLabel13.setText("Block3");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, -1, -1));

        jLabel14.setText("Block4");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, -1, -1));

        jLabel15.setText("Block5");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 500, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 255, 255));
        jLabel18.setText("Using Integrity And Privacy Threads");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 230, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 51));
        jLabel16.setText("usage efficiency");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 130, 20));
        getContentPane().add(time_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 130, 30));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, -1, 20));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, 20));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, -1, 20));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("Upload");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 390, 110, 20));

        backgroundimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inter/uploaimg12.png"))); // NOI18N
        getContentPane().add(backgroundimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void upldate_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upldate_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upldate_txtActionPerformed

    private void txt_filenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_filenameActionPerformed

    private void pkey_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pkey_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pkey_txtActionPerformed

    private void lockimgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lockimgMouseClicked
        pkey_txt.setText(String.valueOf(RandomKeyGen.randomAlpha(6)));
        // TODO add your handling code here:
    }//GEN-LAST:event_lockimgMouseClicked

    private void txtCloudPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCloudPathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCloudPathActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      blk1=(String.valueOf(RandomKeyGen.randomblock1(2)));
        blk2=(String.valueOf(RandomKeyGen.randomblock1(2)));
        blk3=(String.valueOf(RandomKeyGen.randomblock1(2)));
        blk4=(String.valueOf(RandomKeyGen.randomblock1(2)));
        blk5=(String.valueOf(RandomKeyGen.randomblock1(2)));
        System.out.println(blk1);
        System.out.println(blk2);
        System.out.println(blk3);
        System.out.println(blk4);
        System.out.println(blk5);
        JFileChooser chooser = new JFileChooser();
        int choos = chooser.showOpenDialog(null);
        f = chooser.getSelectedFile();
        long size=f.length();
        System.out.println(size+"file leanght");
        ////   M value calculation     //////////////
        m = size % 99 ;
        mvalue=Double.toString(m);
        System.out.println("percentage from randomkey"+mvalue);
        filename = f.getAbsolutePath();

        try {

            FileReader reader = new FileReader(filename);
            BufferedReader br = new BufferedReader(reader);
            System.out.println(br);
            uplfile.read(br,null);
            br.close();
            uplfile.requestFocus();
            Scanner scan = new Scanner(f);

            //Adding each line from file to a list
            ArrayList<String> lines = new ArrayList<String>();
            while (scan.hasNextLine()) {
                lines.add(scan.nextLine());
            }

            //Creating list of textarea
            ArrayList<JTextArea> blocks = new ArrayList<JTextArea>();
            blocks.add(block1);
            blocks.add(block2);
            blocks.add(block3);
            blocks.add(block4);
            blocks.add(block5);

            int number_of_lines = lines.size();
            int parts = 5;
            int lines_per_part = (int) Math.ceil(((double) number_of_lines) / parts);

            int counter = 0;
            JTextArea current_block = blocks.get(counter);

            for (int i = 1; i <= number_of_lines; i++) {
                String line = lines.get(i - 1);
                if (current_block.getText().isEmpty()) {
                    current_block.append(line);
                } else {
                    current_block.append("\n" + line);
                }
                if (i % lines_per_part == 0 && i != number_of_lines) {
                    counter++;
                    System.out.println(i + " " + counter);
                    current_block = blocks.get(counter);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
        txt_filename.setText(filename);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new DataOwner().setVisible(true);
        dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       txt_username.setText("");
        txt_filename.setText("");
        pkey_txt.setText("");
        upldate_txt.setText("");
        uplfile.setText("");
        block1.setText("");
        block2.setText("");
        block3.setText("");
        block4.setText("");
        block5.setText(""); // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        long startTime=System.currentTimeMillis();
        long total = 0;
      for (int i = 0; i < 10000000; i++) {
         total += i;
      }

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

        upldate_txt.setText(dateFormat.format(date));
        upldate_txt.setEnabled(false);
        String cloud_path = txtCloudPath.getText();
        if (!cloud_path.isEmpty()) {
            try {
                Connection con = null;
                String url = "jdbc:mysql://localhost:3306/";
                String driver = "com.mysql.jdbc.Driver";
                String db = "orutapreserving";
                //int autoGeneratedID = tableKeys.getInt(1);
                String Username = txt_username.getText();
                String Filename = txt_filename.getText();
               
                Filename = Filename.replace("\\", "\\\\");
                String Privatekey = pkey_txt.getText();
                String Upldate = upldate_txt.getText();
                String File = uplfile.getText();
                String Block1 = block1.getText();
                String Block2 = block2.getText();
                String Block3 = block3.getText();
                String Block4 = block4.getText();
                String Block5 = block5.getText();
                
                
                Class.forName(driver);
                con = (Connection) DriverManager.getConnection(url + db, "root", "");
                /*PreparedStatement pstmt = con.prepareStatement(
                 "INSERT INTO genes (sent, title) VALUES (?, ?)");
                 pstmt.setString(1, sent);
                 pstmt.setString(2, title);
                 pstmt.executeUpdate();*/

                PreparedStatement st = con.prepareStatement("INSERT INTO fileupload(Username,Filename,Privatekey,Upldate,File,Block1,Block2,Block3,Block4,Block5,rsignatureblock1,rsignatureblock2,rsignatureblock3,rsignatureblock4,rsignatureblock5,cloud_path,m_value) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                //st.setBinaryStream(6,File ,(int) filename.length());
                st.setString(1, Username);
                st.setString(2, Filename);
                
                st.setString(3, Privatekey);
                st.setString(4, Upldate);
                st.setString(5, File);
                st.setString(6, Block1);
                st.setString(7, Block2);
                st.setString(8, Block3);
                st.setString(9, Block4);
                st.setString(10, Block5);
                st.setString(11, blk1);
                st.setString(12, blk2);
                st.setString(13, blk3);
                st.setString(14, blk4);
                st.setString(15, blk5);
                System.out.println(f.getName());
                st.setString(16, cloud_path+"/"+f.getName());
                st.setString(17, mvalue);
                        
                int stats = st.executeUpdate();
                
                // File Uploaded to Cloud
                uploadtoCloud(cloud_path, f);
                
                
                System.out.println("values inserted : " + stats);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Cloud Path cannot be left Empty. Enter Cloud Path to Upload.", "Empty Cloud Path", JOptionPane.ERROR_MESSAGE);
        }
        long stopTime = System.currentTimeMillis();
      long elapsedTime = stopTime - startTime;
      String timecal="0."+elapsedTime+"/sec";
      System.out.println(timecal);
      time_txt.setText(timecal); // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //upload up=new upload();
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
            java.util.logging.Logger.getLogger(fileuploaders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fileuploaders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fileuploaders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fileuploaders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            // private String jTextArea1;
            public void run() {
                new fileuploaders().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundimg;
    private javax.swing.JTextArea block1;
    private javax.swing.JTextArea block2;
    private javax.swing.JTextArea block3;
    private javax.swing.JTextArea block4;
    private javax.swing.JTextArea block5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lockimg;
    private javax.swing.JTextField pkey_txt;
    private javax.swing.JTextField time_txt;
    private javax.swing.JTextField txtCloudPath;
    private javax.swing.JTextField txt_filename;
    private javax.swing.JTextField txt_username;
    private javax.swing.JTextField upldate_txt;
    private javax.swing.JTextArea uplfile;
    // End of variables declaration//GEN-END:variables

    private void uploadtoCloud(String cloud_path, File f) {
        if (f != null) {
            if (!cloud_path.isEmpty()) {
                try {
                    fileUploader.setPath(cloud_path);
                    if (fileUploader.checkValidPath()) {
                        String pathErr = fileUploader.checkPathErr(this.f.getName());
                        if (pathErr != null) {
                            showSomeError(pathErr);
                        }
                        if (fileUploader.uploadFile(f)) {
                            String message = "File Uploaded to Dropbox Successfully";
                            JOptionPane.showConfirmDialog(rootPane, message, "Error", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            showSomeError("File Uploading failed due to some reason");
                        }
                    } else {
                        showSomeError("Invalid DropBox Path : Provide Valid Path");
                    }
                } catch (DbxException ex) {
                    ex.printStackTrace();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else {
                showSomeError("Select Dropbox Path before Uploading!");
            }
        } else {
            showSomeError("Select File to Upload!");
        }
    }

    private void showAuthorizationError() {
        JOptionPane.showConfirmDialog(rootPane, "Authorization Error : Please Authorize the Application and the Proceed", "Authorization Error", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
    }

    private void showSomeError(String message) {
        JOptionPane.showConfirmDialog(rootPane, message, "Error", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
    }
}
