
import java.awt.Image;
import java.io.BufferedInputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public final class Dept extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;
   private final String dept;
   private final String database;
    @SuppressWarnings("PackageVisibleField")
   Blob image;

    public Dept(String s) {
        initComponents();
        dept=s;
        database=s.toLowerCase();
        InitValue();
    }
    public void InitValue()
    {
        jLabel4.setText("Welcome to Department of "+dept+"");
 
            String quer;
                ResultSet rs; 
                DatabaseConnect db=new DatabaseConnect("management");
                quer="SELECT * FROM depts WHERE name='"+dept+"'";
                BufferedInputStream is;
                
                try {
                    rs=db.exeQuerry(quer);
                    while(rs.next())
                    {
                      image=rs.getBlob("image"); 
                    jTextArea1.setText(rs.getString("about"));
                    
                    
                    }
                            is = new BufferedInputStream(image.getBinaryStream());
                            Image raw = ImageIO.read(is);
                            Image icon=raw.getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(),Image.SCALE_SMOOTH);
                            ImageIcon ico=new ImageIcon(icon);
                            jLabel1.setIcon(ico);
                            
                            
                    db.close();
                } catch (Exception ex) {
                    Logger.getLogger(Welcm.class.getName()).log(Level.SEVERE, null, ex);
                }  
                   
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton19 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Department");
        setResizable(false);

        jLabel4.setBackground(new java.awt.Color(204, 255, 255));
        jLabel4.setFont(new java.awt.Font("OCR A Extended", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rr/images/back.png"))); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rr/images/116990-matte-blue-and-white-square-icon-business-key7.png"))); // NOI18N
        jButton5.setText("Login");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rr/images/delete.png"))); // NOI18N
        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setAutoscrolls(false);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        jButton1.setText("First Year List");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        jButton2.setText("Second Year List");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        jButton3.setText("Third Year List");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton8.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rr/images/administrator-icon.png"))); // NOI18N
        jButton8.setText("Faculties");
        jButton8.setPreferredSize(new java.awt.Dimension(89, 34));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton26.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        jButton26.setText("Dept. Notices");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        jButton9.setText("College Notices");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(jButton26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Faculty/Student Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel18.setText("Faculty Username");

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTextField2.setMinimumSize(new java.awt.Dimension(6, 21));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(204, 204, 204));
        jButton19.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jButton19.setForeground(new java.awt.Color(102, 0, 0));
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rr/images/search.png"))); // NOI18N
        jButton19.setText("Search");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel9.setText("Student Register No");

        jButton7.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(102, 0, 0));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rr/images/search.png"))); // NOI18N
        jButton7.setText("Search");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel9))
                .addGap(24, 24, 24)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(jButton19)))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jButton7)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String quer,quer1;
        quer="SELECT roll_no AS ROLL_NO,reg_no AS REGISTER_NO,fn as NAME,"
                + "ln AS LAST_NAME,mob AS CONTACT,email AS EMAIL FROM std_prof WHERE sem='sem5'";
        quer1="SELECT roll_no AS ROLL_NO,reg_no AS REGISTER_NO,fn as NAME,"
                + "ln AS LAST_NAME,mob AS CONTACT,email AS EMAIL FROM std_prof WHERE sem='sem6'";
        DatabaseConnect db=new DatabaseConnect(database);
        SemStudentList s=new SemStudentList();
        ResultSet rs,rs1;
        try {
            rs=db.exeQuerry(quer1); 
            if(rs.next())
            {
                rs=db.exeQuerry(quer1);
                SemStudentList.jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            }
            else
            {
            rs1=db.exeQuerry(quer);
            SemStudentList.jTable1.setModel(DbUtils.resultSetToTableModel(rs1));
            }  
            }
        catch (Exception ex) {
            Logger.getLogger(Dept.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            s.setVisible(true);
            s.setLocationRelativeTo(null);
            s.setAlwaysOnTop(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    Welcm w=new Welcm();
    w.setVisible(true);
    w.setLocationRelativeTo(null);
    this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String quer,quer1;
        quer1="SELECT roll_no AS ROLL_NO,reg_no AS REGISTER_NO,fn as NAME,"
                + "ln AS LAST_NAME,mob AS CONTACT,email AS EMAIL FROM std_prof WHERE sem='sem1'";
        quer="SELECT roll_no AS ROLL_NO,reg_no AS REGISTER_NO,fn as NAME,"
                + "ln AS LAST_NAME,mob AS CONTACT,email AS EMAIL FROM std_prof WHERE sem='sem2'";
        DatabaseConnect db=new DatabaseConnect(database);
        SemStudentList s=new SemStudentList();
        ResultSet rs,rs1;
        try {
            rs=db.exeQuerry(quer1); 
            if(rs.next())
            {
                rs=db.exeQuerry(quer1);
                SemStudentList.jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            }
            else
            {
            rs1=db.exeQuerry(quer);
            SemStudentList.jTable1.setModel(DbUtils.resultSetToTableModel(rs1));
            }  
            }
        
        catch (Exception ex) {
            Logger.getLogger(Dept.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            s.setVisible(true);
            s.setLocationRelativeTo(null);
            s.setAlwaysOnTop(true);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    Login l=new Login(database);
    l.setVisible(true);
    l.setLocationRelativeTo(null);
    this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(1);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        new ListAllFaculty(database).setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String quer,quer1;
        quer="SELECT roll_no AS ROLL_NO,reg_no AS REGISTER_NO,fn as NAME,"
                + "ln AS LAST_NAME,mob AS CONTACT,email AS EMAIL FROM std_prof WHERE sem='sem3'";
        quer1="SELECT roll_no AS ROLL_NO,reg_no AS REGISTER_NO,fn as NAME,"
                + "ln AS LAST_NAME,mob AS CONTACT,email AS EMAIL FROM std_prof WHERE sem='sem4'";
        DatabaseConnect db=new DatabaseConnect(database);
        SemStudentList s=new SemStudentList();
        
        ResultSet rs,rs1;
        try {
            rs=db.exeQuerry(quer1); 
            if(rs.next())
            {
                rs=db.exeQuerry(quer1);
                SemStudentList.jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            }
            else
            {
            rs1=db.exeQuerry(quer);
            SemStudentList.jTable1.setModel(DbUtils.resultSetToTableModel(rs1));
            }  
            }
        catch (Exception ex) {
            Logger.getLogger(Dept.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            s.setVisible(true);
            s.setLocationRelativeTo(null);
            s.setAlwaysOnTop(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed

        DatabaseConnect db=new DatabaseConnect(database);
        ResultSet rd;
        try {

            rd=db.exeQuerry("SELECT Notice FROM dept_notice");
            ListAllDept d=new ListAllDept();
            ListAllDept.jTable1.setModel(DbUtils.resultSetToTableModel(rd));
            ListAllDept.jPanel2.setName("Department Notice");
            d.setVisible(true);
            d.setLocationRelativeTo(null);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Notice Board is Empty");
        }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       DatabaseConnect db=new DatabaseConnect("management");
        ResultSet rd;
        try {

            rd=db.exeQuerry("SELECT Notice FROM college_notice");
            ListAllDept d=new ListAllDept();
            ListAllDept.jPanel2.setName("College Notice");
            ListAllDept.jTable1.setModel(DbUtils.resultSetToTableModel(rd));
            d.setVisible(true);
            d.setLocationRelativeTo(null);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Empty Notice Board");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        String search,quer;

        search=jTextField2.getText();
        ResultSet rr;
        quer="Select * From faculty_prof WHERE user='"+search+"'";
        ViewFaculty v=new ViewFaculty();
        DatabaseConnect db=new DatabaseConnect(database);
        try {
            rr=db.exeQuerry(quer);
            if(rr.next())
            {

                ViewFaculty.jLabel3.setText(rr.getString("Name"));
                ViewFaculty.jLabel21.setText(rr.getString("fname"));
                ViewFaculty.jLabel23.setText(rr.getString("lname"));
                ViewFaculty.jLabel16.setText(rr.getString("dob"));
                ViewFaculty.jLabel40.setText(rr.getString("age"));
                ViewFaculty.jLabel8.setText(rr.getString("gender"));
                ViewFaculty.jLabel30.setText(rr.getString("qual"));
                ViewFaculty.jLabel25.setText(rr.getString("ad_qual"));
                ViewFaculty.jLabel38.setText(rr.getString("exp"));
                ViewFaculty.jLabel31.setText(rr.getString("joindate"));
                ViewFaculty.jLabel33.setText(rr.getString("con1"));
                ViewFaculty.jLabel35.setText(rr.getString("con2"));
                ViewFaculty.jLabel4.setText(rr.getString("email"));
                ViewFaculty.jTextPane1.setText(rr.getString("address1"));
                ViewFaculty.jTextPane2.setText(rr.getString("address2"));
                ViewFaculty.jLabel10.setText(rr.getString("city"));
                ViewFaculty.jLabel18.setText(rr.getString("state"));
                ViewFaculty.jLabel37.setText(rr.getString("country"));
                v.setVisible(true);
                v.setLocationRelativeTo(null);

            }
            else
            {
                JOptionPane.showMessageDialog(null,"Faculty Not found in the database");
            }

        } catch (Exception ex) {
            Logger.getLogger(Dept.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String search,quer;
        search=jTextField1.getText();
        ResultSet rs1;
        quer="SELECT fn,ln,date,add1,age,mob,email FROM std_prof WHERE reg_no='"+search+"'";
        ViewStudent v=new ViewStudent();
        DatabaseConnect db=new DatabaseConnect(database);
        try {
            rs1=db.exeQuerry(quer);
            if(rs1.next())
            {
                rs1=db.exeQuerry(quer);
                while(rs1.next())
                {
                    String name=rs1.getString("fn");
                    ViewStudent.jLabel7.setText(name);
                    ViewStudent.jLabel8.setText(rs1.getString("ln"));
                    ViewStudent.jLabel9.setText(rs1.getString("date"));
                    ViewStudent.jLabel10.setText(rs1.getString("add1"));
                    ViewStudent.jLabel14.setText(rs1.getString("age"));
                    ViewStudent.jLabel11.setText(rs1.getString("mob"));
                    ViewStudent.jLabel12.setText(rs1.getString("email"));
                    ViewStudent.jLabel16.setText("reg_no");
                    ViewStudent.jPanel1.setName("Profile View of "+name+"");
                }

                v.setVisible(true);
                v.setLocationRelativeTo(null);

            }
            else
            {
                JOptionPane.showMessageDialog(null,"Student Not found in the database");
            }

        } catch (Exception ex) {
            Logger.getLogger(Dept.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Dept("ComputerScience").setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
