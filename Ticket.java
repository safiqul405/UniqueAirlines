
package UniqueAirlines;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;


public class Ticket extends javax.swing.JFrame {

    DefaultTableModel defaultTableModel = new DefaultTableModel();
 
    public Ticket() {
        initComponents();
        GetPassenger();
        GetPassengerData();
        GetFlight();
         DisplayBooking();
         GetAirplane();
        
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        
        PassName.setEditable(false);
        PPassport.setEditable(false);
        PNation.setEditable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PassName = new javax.swing.JTextField();
        FId = new javax.swing.JComboBox();
        PPassport = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        bbBook = new javax.swing.JButton();
        bbBack = new javax.swing.JButton();
        bbReset = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        BTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        PassId = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        PNation = new javax.swing.JTextField();
        jProgressBar1 = new javax.swing.JProgressBar();
        PAmount = new javax.swing.JTextField();
        planeid = new javax.swing.JComboBox();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

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
        jLabel5.setText("Booking");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Passengers ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Select Plane");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Amount");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Passengers Name");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Passport Number");

        PassName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassNameActionPerformed(evt);
            }
        });

        FId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FId.setForeground(new java.awt.Color(0, 0, 153));
        FId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FIdActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText("Ticket  Booking  ");

        bbBook.setBackground(new java.awt.Color(0, 255, 204));
        bbBook.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bbBook.setText("Book");
        bbBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bbBookMouseClicked(evt);
            }
        });
        bbBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbBookActionPerformed(evt);
            }
        });

        bbBack.setBackground(new java.awt.Color(0, 255, 204));
        bbBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bbBack.setText("Back");
        bbBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bbBackMouseClicked(evt);
            }
        });
        bbBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbBackActionPerformed(evt);
            }
        });

        bbReset.setBackground(new java.awt.Color(0, 255, 204));
        bbReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bbReset.setText("Reset");
        bbReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bbResetMouseClicked(evt);
            }
        });
        bbReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbResetActionPerformed(evt);
            }
        });

        BTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "TId", "passId", "name", "code", "passport", "amount", "nationality"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(BTable);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Fligths Code Id");

        PassId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PassId.setForeground(new java.awt.Color(0, 0, 153));
        PassId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PassIdMouseClicked(evt);
            }
        });
        PassId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassIdActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("Nationality");

        PNation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PNation)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PassId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PassName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(FId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(bbBook, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(planeid, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(26, 26, 26)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bbReset)
                                .addGap(60, 60, 60)
                                .addComponent(bbBack, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                    .addComponent(PPassport))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(PAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PPassport, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(PAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(planeid, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FId)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(PassName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PassId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bbBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bbReset, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bbBook, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PNation, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null;
    ResultSet Rs1 = null;
    Statement St = null;
    
    private void GetPassenger(){
           String sql = "select * from passengertable";
        try {
            PreparedStatement Add = AirlinesConnection.getConnection().prepareStatement(sql); 
            Rs = Add.executeQuery(sql);  
            while (Rs.next()) {                
                String PId = String.valueOf(Rs.getInt("PId"));
                PassId.addItem(PId);
            } 
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
        private void GetFlight(){
           String sql = "select * from flighttable";
        try {
            PreparedStatement Add = AirlinesConnection.getConnection().prepareStatement(sql); 
            Rs = Add.executeQuery(sql);  
            while (Rs.next()) {                
                String fcodeid = String.valueOf(Rs.getInt("id"));
                FId.addItem(fcodeid);
                //PassId.addItem(PId);
            } 
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
        private void GetAirplane(){
           String sql = "select * from airplane";
        try {
            PreparedStatement Add = AirlinesConnection.getConnection().prepareStatement(sql); 
            Rs = Add.executeQuery(sql);  
            while (Rs.next()) {                
                String PId = String.valueOf(Rs.getInt("id"));
                planeid.addItem(PId);
            } 
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
         
    private void GetPassengerData(){
           String sql = "select * from passengertable";
        try {
            PreparedStatement Add = AirlinesConnection.getConnection().prepareStatement(sql); 
            Rs = Add.executeQuery(sql);  
            if (Rs.next()) {
               PassName.setText(Rs.getString("Name"));
              // PassGen.setText(Rs.getString("Gender"));
               PPassport.setText(Rs.getString("Passport"));    
               PNation.setText(Rs.getString("Nationality"));    
            } 
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void FIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FIdActionPerformed

    private void PassIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassIdActionPerformed
         GetPassenger();
    }//GEN-LAST:event_PassIdActionPerformed

    private void bbBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbBackActionPerformed
        this.setVisible(false);
        new MainForm().setVisible(true);
    }//GEN-LAST:event_bbBackActionPerformed

    private void PassNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassNameActionPerformed
    
        private void DisplayBooking() {
       String sql = "select TId ,passId,name ,code, gender,passport,amount,nationality from tickettable";
                try {
            PreparedStatement ps = AirlinesConnection.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Object columnData[] = new Object[7];
            while (rs.next()) {
                columnData[0] = rs.getInt("TId");
                columnData[1] = rs.getInt("passId");
                columnData[2] = rs.getString("name");
                columnData[3] = rs.getString("code");
                columnData[4]=rs.getString("passport");
                columnData[5]= rs.getInt("amount");
               columnData[6]= rs.getString("nationality");
                defaultTableModel.addRow(columnData);
            }
            
        int row = BTable.getSelectedRow();              //em
        BTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int PassId = Integer.parseInt((BTable.getValueAt(row, 0).toString()));
                String PassName = (BTable.getValueAt(row, 1).toString());
                String FId = (BTable.getValueAt(row, 2).toString());
                String PPassport = (BTable.getValueAt(row, 3).toString());
                String PAmount = (BTable.getValueAt(row, 4).toString());
                String PNation = (BTable.getValueAt(row, 5).toString());
            }
        });
        } catch (SQLException e) {
        }
    }

    int TId = 0;
    private void bbBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbBookMouseClicked
        if (PassId.getSelectedIndex()==-1 ||FId.getSelectedIndex()==-1 || PAmount.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else {
        }       
        try {
            String sql = "INSERT INTO tickettable(passId,name,code,passport,amount,nationality)  VALUES (?, ?,?,?,?,?)";
            PreparedStatement add = AirlinesConnection.getConnection().prepareStatement(sql);
            add.setInt(1, Integer.valueOf(PassId.getSelectedItem().toString()));
            add.setString(2, PassName.getText());
            add.setString(3, FId.getSelectedItem().toString());
            add.setString(4, PPassport.getText());
            add.setInt(5, Integer.valueOf(PAmount.getText()));
            add.setString(6, PNation.getText());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Ticket Added");
            new Seats().setVisible(true);
            
            con.close();
            DisplayBooking();
            Clear();
        } catch (Exception e) {
           // JOptionPane.showMessageDialog(this, e);
        } 
        
        
        
    }//GEN-LAST:event_bbBookMouseClicked

    private void PassIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassIdMouseClicked
        //GetPassenger();
    }//GEN-LAST:event_PassIdMouseClicked

    private void bbBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbBackMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bbBackMouseClicked
     private void Clear(){
        PassId.setSelectedIndex(-1);
        FId.setSelectedIndex(-1);
        PassName.setText("");
       // PassGen.setText("");
        PPassport.setText("");
        PAmount.setText("");
        PNation.setText("");
     }
    private void bbResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbResetMouseClicked
       Clear();
    }//GEN-LAST:event_bbResetMouseClicked

    private void bbResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bbResetActionPerformed

    private void bbBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bbBookActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ticket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BTable;
    private javax.swing.JComboBox FId;
    private javax.swing.JTextField PAmount;
    private javax.swing.JTextField PNation;
    private javax.swing.JTextField PPassport;
    private javax.swing.JComboBox PassId;
    private javax.swing.JTextField PassName;
    private javax.swing.JButton bbBack;
    private javax.swing.JButton bbBook;
    private javax.swing.JButton bbReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox planeid;
    // End of variables declaration//GEN-END:variables

 
}
