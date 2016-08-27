
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class AddDepartment extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;
    private FileInputStream fis;
    private File pic;
    private Connection conn = null;
    private Statement stmt;
    private PreparedStatement ps;
    private ResultSet rs;
    public AddDepartment() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Department", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Light", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("About Department");

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setText("Select Image");

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rr/images/pg1.png"))); // NOI18N
        jButton3.setText("Select Image");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setText("Image size must be < 500KB");
        jTextField2.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 119, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rr/images/db.png"))); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rr/images/delete.png"))); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextField2.setText("");
        JFileChooser picchooser = new JFileChooser();
        String path;
        
        picchooser.setDialogTitle("Select Image");
        picchooser.showOpenDialog(null);
        pic=picchooser.getSelectedFile();        
        path= pic.getAbsolutePath();
       File image = new File(path);
        try {
            fis = new FileInputStream(image);
            jTextField2.setText(path);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AddFaculty.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    int s;
    String quer,quer2,faculty_login,faculty_prof,dname,about,dept_notice,class_held,feedback,std_prof ,sub_faculty,sub_sem;
    dname=jTextField1.getText();
    about=jTextArea1.getText();
    faculty_login="CREATE TABLE `faculty_login` (\n" +
"  `user_id` varchar(45) NOT NULL,\n" +
"  `password` varchar(45) DEFAULT NULL,\n" +
"  `last_seen` varchar(45) DEFAULT NULL,\n" +
"  PRIMARY KEY (`user_id`),\n" +
"  UNIQUE KEY `user_id_UNIQUE` (`user_id`)\n" +
") ENGINE=InnoDB DEFAULT CHARSET=latin1";
    
    faculty_prof="CREATE TABLE `faculty_prof` (\n" +
"  `user` varchar(20) NOT NULL,\n" +
"  `Name` varchar(45) NOT NULL,\n" +
"  `fname` varchar(45) DEFAULT NULL,\n" +
"  `lname` varchar(45) DEFAULT NULL,\n" +
"  `address1` varchar(90) NOT NULL,\n" +
"  `address2` varchar(90) DEFAULT NULL,\n" +
"  `email` varchar(45) DEFAULT NULL,\n" +
"  `dob` varchar(20) DEFAULT NULL,\n" +
"  `joindate` varchar(20) DEFAULT NULL,\n" +
"  `pic` longblob,\n" +
"  `country` varchar(45) DEFAULT NULL,\n" +
"  `state` varchar(45) DEFAULT NULL,\n" +
"  `gender` varchar(6) NOT NULL,\n" +
"  `qual` varchar(45) DEFAULT NULL,\n" +
"  `ad_qual` varchar(45) DEFAULT NULL,\n" +
"  `exp` varchar(45) DEFAULT NULL,\n" +
"  `city` varchar(45) DEFAULT NULL,\n" +
"  `con1` varchar(45) DEFAULT NULL,\n" +
"  `con2` varchar(45) DEFAULT NULL,\n" +
"  `age` varchar(45) DEFAULT NULL,\n" +
"  PRIMARY KEY (`user`),\n" +
"  UNIQUE KEY `user_UNIQUE` (`user`)\n" +
") ENGINE=InnoDB DEFAULT CHARSET=latin1";
    
    dept_notice="CREATE TABLE `dept_notice` (\n" +
"  `SNo` int(11) NOT NULL AUTO_INCREMENT,\n" +
"  `Notice` varchar(450) DEFAULT NULL,\n" +
"  PRIMARY KEY (`SNo`)\n" +
") ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1";
    
    class_held="CREATE TABLE `class_held` (\n" +
"  `subject` varchar(45) NOT NULL,\n" +
"  `ch` int(11) DEFAULT NULL,\n" +
"  PRIMARY KEY (`subject`),\n" +
"  UNIQUE KEY `subject_UNIQUE` (`subject`)\n" +
") ENGINE=InnoDB DEFAULT CHARSET=latin1";
    
    feedback="CREATE TABLE `feedback` (\n" +
"  `name` varchar(45) NOT NULL,\n" +
"  `reg` varchar(45) DEFAULT NULL,\n" +
"  `msg` varchar(450) DEFAULT NULL,\n" +
"  PRIMARY KEY (`name`)\n" +
") ENGINE=InnoDB DEFAULT CHARSET=latin1";
    
    std_prof="CREATE TABLE `std_prof` (\n" +
"  `reg_no` varchar(45) NOT NULL DEFAULT '',\n" +
"  `fn` varchar(45) DEFAULT NULL,\n" +
"  `mn` varchar(45) DEFAULT NULL,\n" +
"  `ln` varchar(45) DEFAULT NULL,\n" +
"  `date` varchar(45) DEFAULT NULL,\n" +
"  `sex` varchar(45) DEFAULT NULL,\n" +
"  `roll_no` varchar(45) NOT NULL DEFAULT '',\n" +
"  `last_school` varchar(45) DEFAULT NULL,\n" +
"  `aggregate` varchar(45) DEFAULT NULL,\n" +
"  `mob` varchar(45) DEFAULT NULL,\n" +
"  `home` varchar(45) DEFAULT NULL,\n" +
"  `email` varchar(45) DEFAULT NULL,\n" +
"  `city` varchar(45) DEFAULT NULL,\n" +
"  `state` varchar(45) DEFAULT NULL,\n" +
"  `country` varchar(45) DEFAULT NULL,\n" +
"  `add1` varchar(45) DEFAULT NULL,\n" +
"  `add2` varchar(45) DEFAULT NULL,\n" +
"  `age` varchar(45) DEFAULT NULL,\n" +
"  `sem` varchar(45) DEFAULT NULL,\n" +
"  `pass` varchar(45) DEFAULT NULL,\n" +
"  PRIMARY KEY (`reg_no`),\n" +
"  UNIQUE KEY `reg_no_UNIQUE` (`reg_no`)\n" +
") ENGINE=InnoDB DEFAULT CHARSET=latin1";
    
    sub_faculty="CREATE TABLE `sub_faculty` (\n" +
"  `fac_name` varchar(45) DEFAULT NULL,\n" +
"  UNIQUE KEY `fac_name_UNIQUE` (`fac_name`)\n" +
") ENGINE=InnoDB DEFAULT CHARSET=latin1";
    
    sub_sem="CREATE TABLE `sub_sem` (\n" +
"  `sem1` varchar(25) DEFAULT NULL,\n" +
"  `sem2` varchar(45) DEFAULT NULL,\n" +
"  `sem3` varchar(45) DEFAULT NULL,\n" +
"  `sem4` varchar(45) DEFAULT NULL,\n" +
"  `sem5` varchar(45) DEFAULT NULL,\n" +
"  `sem6` varchar(45) DEFAULT NULL,\n" +
"  UNIQUE KEY `sem1_UNIQUE` (`sem1`),\n" +
"  UNIQUE KEY `sem6_UNIQUE` (`sem6`),\n" +
"  UNIQUE KEY `sem5_UNIQUE` (`sem5`),\n" +
"  UNIQUE KEY `sem4_UNIQUE` (`sem4`),\n" +
"  UNIQUE KEY `sem3_UNIQUE` (`sem3`),\n" +
"  UNIQUE KEY `sem2_UNIQUE` (`sem2`)\n" +
") ENGINE=InnoDB DEFAULT CHARSET=latin1";
    
   
    quer="INSERT INTO depts(name,about,image) VALUES(?,?,?)";
    quer2="CREATE DATABASE `"+dname+"` /*!40100 DEFAULT CHARACTER SET latin1 */";
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
      
            conn = DriverManager.getConnection("jdbc:mysql://localhost/management","root","vinguru");
            ps = conn.prepareStatement(quer);
            ps.setString(1, dname);
            ps.setString(2,about);
            ps.setBinaryStream(3, (InputStream)fis,(int)(pic.length()));
            s=ps.executeUpdate();
            ps.close();
            conn.close();
            JOptionPane.showMessageDialog(null,"Department Registered Successfully");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException ex) {
            Logger.getLogger(AddDepartment.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
      
            conn = DriverManager.getConnection("jdbc:mysql://localhost","root","vinguru");
            ps = conn.prepareStatement(quer2);
            int a=ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Database For Department is Created");
            }   catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException ex) {
            Logger.getLogger(AddDepartment.class.getName()).log(Level.SEVERE, null, ex);
            }
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
      
            conn = DriverManager.getConnection("jdbc:mysql://localhost/"+dname+"","root","vinguru");
            ps = conn.prepareStatement(faculty_login);
            int b=ps.executeUpdate();
            ps.close();
            ps = conn.prepareStatement(faculty_prof);
            int c=ps.executeUpdate();
            ps.close();
            ps = conn.prepareStatement(dept_notice);
            int d=ps.executeUpdate();
            ps.close();
            ps = conn.prepareStatement(class_held);
            int e=ps.executeUpdate();
            ps.close();
            ps = conn.prepareStatement(feedback);
            int f=ps.executeUpdate();
            ps.close();
            ps = conn.prepareStatement(std_prof);
            int g=ps.executeUpdate();
            ps.close();
            ps = conn.prepareStatement(sub_faculty);
            int h=ps.executeUpdate();
            ps.close();
            ps = conn.prepareStatement(sub_sem);
            int i=ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null,"Database is readyfor use");
            jTextField1.setText("");
            jTextArea1.setText("");
            jTextField2.setText("");
            }   catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException ex) {
            Logger.getLogger(AddDepartment.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(AddFaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDepartment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
