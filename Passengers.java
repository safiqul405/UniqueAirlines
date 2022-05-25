
package UniqueAirlines;

import java.awt.HeadlessException;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class Passengers extends javax.swing.JFrame {

    DefaultTableModel defaultTableModel = new DefaultTableModel();

    public Passengers() {
        initComponents();
        Object columns[] = {"PId", "Name", "Nationality", "Gender", "Passport", "Phone", "Address"};
        defaultTableModel.setColumnIdentifiers(columns);
        PTable.setModel(defaultTableModel);
        loadData();
    }

    public void loadData() {
        String sql = "select PId, Name, Nationality, Gender, Passport, Phone, Address from passengertable";
        try {
            PreparedStatement ps = AirlinesConnection.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Object columnData[] = new Object[7];
            while (rs.next()) {
                columnData[0] = rs.getInt("PId");
                columnData[1] = rs.getString("Name");
                columnData[2] = rs.getString("Nationality");
                columnData[3] = rs.getString("Gender");
                columnData[4] = rs.getString("Passport");
                columnData[5] = rs.getString("Phone");
                columnData[6] = rs.getString("Address");
                defaultTableModel.addRow(columnData);
            }
            int row = PTable.getSelectedRow();              //em
            PTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int pid = Integer.parseInt((PTable.getValueAt(row, 0).toString()));
                String Pname = (PTable.getValueAt(row, 1).toString());
                String Pnation = (PTable.getValueAt(row, 2).toString());
                String pgenaer = (PTable.getValueAt(row, 3).toString());
                String ppass = (PTable.getValueAt(row, 4).toString());
                String pphone = (PTable.getValueAt(row, 5).toString());
                String padd = (PTable.getValueAt(row, 6).toString());

                PName.setText(Pname);
                PNationality.setSelectedIndex(0);
                PGender.setSelectedIndex(0);
                PPassport.setText(ppass);
                PPhone.setText(pphone);
                PAddress.setText(padd);
            }
        });
        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PName = new javax.swing.JTextField();
        PGender = new javax.swing.JComboBox();
        PNationality = new javax.swing.JComboBox();
        PPhone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pbSave = new javax.swing.JButton();
        pbBack = new javax.swing.JButton();
        pbDelete = new javax.swing.JButton();
        pbEdit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        PTable = new javax.swing.JTable();
        PPassport = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        PAddress = new javax.swing.JTextField();
        jProgressBar1 = new javax.swing.JProgressBar();
        pbMain = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        pid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Bangladesh Unique Airlines");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText(" Passengers  List");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Passenger Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Gender");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Phone");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Nationality");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Passport Number");

        PGender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PGender.setForeground(new java.awt.Color(0, 0, 153));
        PGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Common" }));
        PGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PGenderActionPerformed(evt);
            }
        });

        PNationality.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PNationality.setForeground(new java.awt.Color(0, 0, 153));
        PNationality.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bangladesh", "India", "Pakstan", "Napal" }));
        PNationality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PNationalityActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText("Manage  Passengers");

        pbSave.setBackground(new java.awt.Color(0, 255, 0));
        pbSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pbSave.setText("Save");
        pbSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pbSaveMouseClicked(evt);
            }
        });
        pbSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pbSaveActionPerformed(evt);
            }
        });

        pbBack.setBackground(new java.awt.Color(0, 255, 0));
        pbBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pbBack.setText("Reset");
        pbBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pbBackActionPerformed(evt);
            }
        });

        pbDelete.setBackground(new java.awt.Color(0, 255, 0));
        pbDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pbDelete.setText("Delete");
        pbDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pbDeleteMouseClicked(evt);
            }
        });
        pbDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pbDeleteActionPerformed(evt);
            }
        });

        pbEdit.setBackground(new java.awt.Color(0, 255, 0));
        pbEdit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pbEdit.setText("Edit");
        pbEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pbEditMouseClicked(evt);
            }
        });
        pbEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pbEditActionPerformed(evt);
            }
        });

        PTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "PId", "Name", "Nationality", "Gender", "Passport", "Phone", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        PTable.setRowHeight(25);
        PTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(PTable);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Address");

        pbMain.setBackground(new java.awt.Color(255, 0, 0));
        pbMain.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pbMain.setText("Back");
        pbMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pbMainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                        .addComponent(PName)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(160, 160, 160)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(PNationality, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(50, 50, 50)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(PGender, 0, 96, Short.MAX_VALUE))
                                    .addGap(43, 43, 43)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PPassport)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(80, 80, 80)
                                    .addComponent(pbSave, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(63, 63, 63)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pbEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                        .addComponent(pid))
                                    .addGap(65, 65, 65)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pbDelete)
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(26, 26, 26)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PPhone)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                                .addComponent(pbBack, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pbMain, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(19, 36, Short.MAX_VALUE))
            .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PPassport, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PGender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PNationality, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pbDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pbEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pbSave, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pbBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pbMain, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null;
    Statement St = null;
    private void PGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PGenderActionPerformed

    private void PNationalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PNationalityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PNationalityActionPerformed
    int PId = 0;
    private void pbSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pbSaveMouseClicked
        if (PName.getText().isEmpty() || PPassport.getText().isEmpty() || PPhone.getText().isEmpty() || PAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else {
            try {
            String sql = "INSERT INTO passengertable (Name,Nationality,Gender,Passport,Phone,Address) VALUES (?, ?,?,?,?,?)";
            PreparedStatement add = AirlinesConnection.getConnection().prepareStatement(sql);
           // Add.setInt(1, PId);
            add.setString(1, PName.getText());
            add.setString(2, PNationality.getSelectedItem().toString());
            add.setString(3, PGender.getSelectedItem().toString());
            add.setString(4, PPassport.getText());
            add.setString(5, PPhone.getText());
            add.setString(6, PAddress.getText());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Passenger Added");
            con.close();
            } catch (Exception e) {
                //JOptionPane.showMessageDialog(this, e);
            }
        }       
        
    }//GEN-LAST:event_pbSaveMouseClicked

    private void pbSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pbSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pbSaveActionPerformed

    private void pbBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pbBackActionPerformed
        
        //pid.setText("");
        PName.setText("");
        PNationality.setSelectedIndex(0);
        PGender.setSelectedIndex(0);
        PPassport.setText("");
        PPhone.setText("");
        PAddress.setText("");
    }//GEN-LAST:event_pbBackActionPerformed

    private void pbMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pbMainActionPerformed
        this.setVisible(false);
        new MainForm().setVisible(true);
    }//GEN-LAST:event_pbMainActionPerformed

    private void PTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PTableMouseClicked
        DefaultTableModel d1 = (DefaultTableModel)PTable.getModel();
        int row = PTable.getSelectedRow();
        pid.setText(d1.getValueAt(row, 0).toString());
        PName.setText(d1.getValueAt(row, 1).toString());
        PNationality.setSelectedItem(d1.getValueAt(row, 2).toString());
        PGender.setSelectedItem(d1.getValueAt(row, 3).toString());
        PPassport.setText(d1.getValueAt(row, 4).toString());
        PPhone.setText(d1.getValueAt(row, 5).toString());
        PAddress.setText(d1.getValueAt(row, 6).toString());
    }//GEN-LAST:event_PTableMouseClicked

    
    int key;

    private void pbEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pbEditActionPerformed
        String searchField = id.getText();
        String sql = "update passengertable set Name = ?, Nationality = ?, Gender = ?, Passport = ?, Phone = ?, Address =? where PId =?";
        try {
            PreparedStatement add = AirlinesConnection.getConnection().prepareStatement(sql); 
                add.setString(1, PName.getText());
                add.setString(2, PNationality.getSelectedItem().toString());
                add.setString(3, PGender.getSelectedItem().toString());
                add.setString(4, PPassport.getText());
                add.setString(5, PPhone.getText());         //ok
                add.setString(6, PAddress.getText());
                add.setString(7, pid.getText());
                add.executeUpdate();
                defaultTableModel.getDataVector().removeAllElements();
                defaultTableModel.fireTableDataChanged();

                JOptionPane.showMessageDialog(null, "Data Updated");
        } catch (HeadlessException | SQLException e) {
            //JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_pbEditActionPerformed

    private void pbEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pbEditMouseClicked

    }//GEN-LAST:event_pbEditMouseClicked

    private void pbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pbDeleteActionPerformed
        String searchField = id.getText();
        String sql = "Delete from passengertable where PId ='" + searchField + "'";
        try { 
            PreparedStatement stmt = AirlinesConnection.getConnection().prepareStatement(sql);
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Passenger " + searchField + " has been deleted");
            defaultTableModel.getDataVector().removeAllElements();
            defaultTableModel.fireTableDataChanged();
            loadData();
            AirlinesConnection.getConnection().close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Passenger id " + searchField + " not found");
        }
    }//GEN-LAST:event_pbDeleteActionPerformed

    private void pbDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pbDeleteMouseClicked

    }//GEN-LAST:event_pbDeleteMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Passengers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PAddress;
    private javax.swing.JComboBox PGender;
    private javax.swing.JTextField PName;
    private javax.swing.JComboBox PNationality;
    private javax.swing.JTextField PPassport;
    private javax.swing.JTextField PPhone;
    private javax.swing.JTable PTable;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton pbBack;
    private javax.swing.JButton pbDelete;
    private javax.swing.JButton pbEdit;
    private javax.swing.JButton pbMain;
    private javax.swing.JButton pbSave;
    private javax.swing.JTextField pid;
    // End of variables declaration//GEN-END:variables
}
