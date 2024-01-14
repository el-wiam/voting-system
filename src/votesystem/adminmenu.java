
package votesystem;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;


public class adminmenu extends javax.swing.JFrame {
    
    String path2 = null;

    public adminmenu() {
        initComponents();
        setTitle("ADMIN home ");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        addbtn = new javax.swing.JButton();
        rsltbtn = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        full_name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        party = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        imageee = new javax.swing.JLabel();
        upload = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        rsltimg = new javax.swing.JLabel();
        rsltname = new javax.swing.JTextField();
        rsltparty = new javax.swing.JTextField();
        rsltvotes = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listtable = new javax.swing.JTable();
        deletebtn = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();
        export = new javax.swing.JButton();
        listbtn = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logoooooo-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel7.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("welcome admin");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logoooooo-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addbtn.setBackground(new java.awt.Color(0, 102, 102));
        addbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("add a condidate");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        rsltbtn.setBackground(new java.awt.Color(0, 102, 102));
        rsltbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rsltbtn.setForeground(new java.awt.Color(255, 255, 255));
        rsltbtn.setText("check results");
        rsltbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsltbtnActionPerformed(evt);
            }
        });

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("full name");

        jLabel2.setText("email");

        jLabel4.setText("image");

        jLabel5.setText("party");

        jLabel6.setText("username");

        jLabel8.setText("password");

        full_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                full_nameActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(255, 153, 51));
        add.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        imageee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        upload.setBackground(new java.awt.Color(255, 255, 255));
        upload.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        upload.setForeground(new java.awt.Color(0, 102, 102));
        upload.setText("upload");
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(add)
                .addGap(76, 76, 76))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(party, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(full_name, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(36, 36, 36)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(115, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(44, 151, Short.MAX_VALUE)
                        .addComponent(imageee, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(upload)
                        .addGap(32, 32, 32))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(full_name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(imageee, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(upload))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(party, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(76, 76, 76)
                        .addComponent(add)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        imageee.getAccessibleContext().setAccessibleName("imagee");

        jTabbedPane1.addTab("add a condidate", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("full name");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("party");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("number of votes");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 102));
        jLabel15.setText("image");

        rsltimg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 3, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 153, 0));
        jLabel17.setText("results of the election");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rsltname, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rsltvotes, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(57, 57, 57)
                                .addComponent(rsltimg, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(27, 27, 27)
                                .addComponent(rsltparty, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addGap(255, 255, 255)))
                .addGap(38, 38, 38))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel17)
                .addGap(61, 61, 61)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(rsltname, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rsltparty, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(rsltvotes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel15))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(rsltimg, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("check result", jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));

        listtable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        listtable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        listtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "full name", "email", "party", "username", "password", "image"
            }
        ));
        listtable.setIntercellSpacing(new java.awt.Dimension(1, 3));
        jScrollPane1.setViewportView(listtable);

        deletebtn.setBackground(new java.awt.Color(0, 102, 102));
        deletebtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn.setText("delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        editbtn.setBackground(new java.awt.Color(0, 102, 102));
        editbtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        editbtn.setForeground(new java.awt.Color(255, 255, 255));
        editbtn.setText("Edit");
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });

        export.setBackground(new java.awt.Color(0, 102, 102));
        export.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        export.setForeground(new java.awt.Color(255, 255, 255));
        export.setText("export");
        export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(export)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deletebtn)
                .addGap(199, 199, 199)
                .addComponent(editbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletebtn)
                    .addComponent(editbtn)
                    .addComponent(export))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("check condidate", jPanel9);

        listbtn.setBackground(new java.awt.Color(0, 102, 102));
        listbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        listbtn.setForeground(new java.awt.Color(255, 255, 255));
        listbtn.setText("condidate list ");
        listbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listbtnActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(255, 153, 0));
        logout.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(0, 102, 102));
        logout.setText("logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logout)
                    .addComponent(rsltbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(rsltbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(listbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logout)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listbtnActionPerformed
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(2);
         try {
        // Set up a database connection
        Connection connection = DriverManager.getConnection("jdbc:MySQL://localhost:3306/vote", "root", "");

        // Create SQL query to select data from the "condidates" table
        String query = "SELECT full_name, email, partie, username, password, nbdevotes FROM condidates";
        PreparedStatement preparedStatement = connection.prepareStatement(query);

        // Execute the query
        ResultSet resultSet = preparedStatement.executeQuery();

        // Create a DefaultTableModel to hold the data for the JTable
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Full Name");
        model.addColumn("Email");
        model.addColumn("Party");
        model.addColumn("Username");
        model.addColumn("Password");
        model.addColumn("number of votes");

        // Populate the table model with the retrieved data
        while (resultSet.next()) {
            String fullName = resultSet.getString("full_name");
            String email = resultSet.getString("email");
            String party = resultSet.getString("partie");
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            String nbvotes = resultSet.getString("nbdevotes");


            // Add a row to the table model
            model.addRow(new Object[]{fullName, email, party, username, password, nbvotes});
        }

        // Set the table model to the JTable
        listtable.setModel(model);

        // Close the connection, statement, and result set
        resultSet.close();
        preparedStatement.close();
        connection.close();

    } catch (SQLException e) {
        // Handle any SQL errors
        e.printStackTrace();
    }
    }//GEN-LAST:event_listbtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_addbtnActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        
        String fullNameValue = full_name.getText();
        String emailValue = email.getText();
        String partyValue = party.getText();
        String usernameValue = username.getText();
        String passwordValue = password.getText();
    
        
         try {
            // Set up a database connection
            Connection connection = DriverManager.getConnection("jdbc:MySQL://localhost:3306/vote", "root", "");

            // Create SQL query to insert data into the "candidates" table
            String query = "INSERT INTO condidates (full_name, email, partie, username, password,  image) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            // Set values for the prepared statement
            preparedStatement.setString(1, fullNameValue);
            preparedStatement.setString(2, emailValue);
            preparedStatement.setString(3, partyValue);
            preparedStatement.setString(4, usernameValue);
            preparedStatement.setString(5, passwordValue);
            InputStream is = new FileInputStream(new File(path2));
            preparedStatement.setBlob(6, is);
            

            // Execute the query
            preparedStatement.execute();

            // Close the connection and statement
            preparedStatement.close();
            connection.close();
            
            full_name.setText("");
            email.setText("");
            party.setText("");
            username.setText("");
            password.setText("");
            imageee.setIcon(null);
            

            // Display a success message or perform any other actions if needed
            System.out.println("Candidate added successfully!");

        }catch (SQLException e) {
            // Handle any SQL errors
            e.printStackTrace();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(adminmenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Handle other exceptions
        
    
        
    }//GEN-LAST:event_addActionPerformed

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
        // TODO add your handling code here:
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.showOpenDialog(null);
    File file = fileChooser.getSelectedFile();
    
    try {
        if (file != null) {
            String path = file.getAbsolutePath();
            BufferedImage bi = ImageIO.read(file);
            Image img = bi.getScaledInstance(146, 154, Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            imageee.setIcon(icon);
            path2 = path;// Assuming jLabel9 is the label where you want to display the image
        } else {
            // Handle case when no file is selected
            System.out.println("No file selected");
        }
    } catch (IOException ex) {
        ex.printStackTrace(); // Handle the exception appropriately in your application
    }
        
        
    }//GEN-LAST:event_uploadActionPerformed

    private void full_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_full_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_full_nameActionPerformed

    private void rsltbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsltbtnActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
        
         try {
        
        Connection connection = DriverManager.getConnection("jdbc:MySQL://localhost:3306/vote", "root", "");

        String query = "SELECT full_name, partie, nbdevotes, image FROM condidates ORDER BY nbdevotes DESC LIMIT 1";
        PreparedStatement preparedStatement = connection.prepareStatement(query);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            String fullName = resultSet.getString("full_name");
            String party = resultSet.getString("partie");
            int nbVotes = resultSet.getInt("nbdevotes");
            
            Blob imageBlob = resultSet.getBlob("image");
            byte[] imageData = imageBlob.getBytes(1, (int) imageBlob.length());
            ImageIcon imageIcon = new ImageIcon(imageData);
            Image img = imageIcon.getImage().getScaledInstance(146, 154, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(img);

            rsltname.setText(fullName);
            rsltparty.setText(party);
            rsltvotes.setText(Integer.toString(nbVotes));
            rsltimg.setIcon(scaledIcon);
        } else {
            rsltname.setText("");
            rsltparty.setText("");
            rsltvotes.setText("");
            rsltimg.setIcon(null);
        }

        resultSet.close();
        preparedStatement.close();
        connection.close();

    } catch (SQLException e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_rsltbtnActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        Login1 LoginFrame = new Login1();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); 
        this.dispose();   
    }//GEN-LAST:event_logoutActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
        //select a row from the table
    int selectedRow = listtable.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a candidate to delete.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String candidateFullName = (String) listtable.getValueAt(selectedRow, 0);

    try {

        Connection connection = DriverManager.getConnection("jdbc:MySQL://localhost:3306/vote", "root", "");

        
        String selectIdQuery = "SELECT id FROM condidates WHERE full_name = ?";
        try (PreparedStatement idStatement = connection.prepareStatement(selectIdQuery)) {
   
            idStatement.setString(1, candidateFullName);
            ResultSet idResultSet = idStatement.executeQuery();

            if (idResultSet.next()) {
                // Candidate ID found
                int candidateId = idResultSet.getInt("id");
                String deleteQuery = "DELETE FROM condidates WHERE id = ?";
                try (PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery)) {
                    deleteStatement.setInt(1, candidateId);
                    deleteStatement.executeUpdate();
                }

                // Close the result set for the ID
                idResultSet.close();
                
                DefaultTableModel model = (DefaultTableModel) listtable.getModel();
                model.removeRow(selectedRow);

              
                System.out.println("Candidate deleted successfully!");
            } else {
               
                System.out.println("Candidate not found for the given full name.");
            }
        }
        connection.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
        // TODO add your handling code here:  
    int selectedRow = listtable.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a candidate to edit.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    String candidateFullName = (String) listtable.getValueAt(selectedRow, 0);

    try {
        Connection connection = DriverManager.getConnection("jdbc:MySQL://localhost:3306/vote", "root", "");
        String selectIdQuery = "SELECT id FROM condidates WHERE full_name = ?";
        try (PreparedStatement idStatement = connection.prepareStatement(selectIdQuery)) {
            idStatement.setString(1, candidateFullName);
            ResultSet idResultSet = idStatement.executeQuery();

            if (idResultSet.next()) {
                // Candidate ID found
                int candidateId = idResultSet.getInt("id");
                editcondidate editc = new editcondidate(candidateId);
                editc.setVisible(true);
                editc.pack();
                editc.setLocationRelativeTo(null);
                //this.dispose(); 

                // Close the result set for the ID
                idResultSet.close();
                
                DefaultTableModel model = (DefaultTableModel) listtable.getModel();
                System.out.println("Candidate edited successfully!");
            } else {
               
                System.out.println("Candidate not found for the given full name.");
            }
        }
        connection.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
         
        
    }//GEN-LAST:event_editbtnActionPerformed

    private void exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportActionPerformed
         // Use JFileChooser to let the user choose the directory and file name
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("choose a directory to save ur file");
    
    
    int userSelection = fileChooser.showSaveDialog(this);
    
    if (userSelection == JFileChooser.APPROVE_OPTION) {
        
        File fileToSave = fileChooser.getSelectedFile();
        
        // Append ".csv" extension if not present
        if (!fileToSave.getAbsolutePath().endsWith(".csv")) {
            fileToSave = new File(fileToSave.getAbsolutePath() + ".csv");
        }

        try (FileWriter writer = new FileWriter(fileToSave)) {
            TableModel model = listtable.getModel();
            TableColumnModel columnModel = listtable.getColumnModel();

            // Write column headers
            for (int col = 0; col < columnModel.getColumnCount(); col++) {
                writer.append(columnModel.getColumn(col).getHeaderValue().toString());
                if (col < columnModel.getColumnCount() - 1) {
                    writer.append(",");
                } else {
                    writer.append("\n");
                }
            }

            // Write data
            for (int row = 0; row < model.getRowCount(); row++) {
                for (int col = 0; col < model.getColumnCount(); col++) {
                    writer.append(model.getValueAt(row, col).toString());
                    if (col < model.getColumnCount() - 1) {
                        writer.append(",");
                    } else {
                        writer.append("\n");
                    }
                }
            }

            JOptionPane.showMessageDialog(this, "Table data exported to CSV successfully!");

        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error exporting table data to CSV!");
        }
    }
    
    }//GEN-LAST:event_exportActionPerformed

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
            java.util.logging.Logger.getLogger(adminmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton addbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton editbtn;
    private javax.swing.JTextField email;
    private javax.swing.JButton export;
    private javax.swing.JTextField full_name;
    private javax.swing.JLabel imageee;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton listbtn;
    private javax.swing.JTable listtable;
    private javax.swing.JButton logout;
    private javax.swing.JTextField party;
    private javax.swing.JTextField password;
    private javax.swing.JButton rsltbtn;
    private javax.swing.JLabel rsltimg;
    private javax.swing.JTextField rsltname;
    private javax.swing.JTextField rsltparty;
    private javax.swing.JTextField rsltvotes;
    private javax.swing.JButton upload;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
