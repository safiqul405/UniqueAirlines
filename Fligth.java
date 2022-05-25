package UniqueAirlines;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class Fligth extends javax.swing.JFrame {
    
    DefaultTableModel defaultTableModel = new DefaultTableModel();
   
    public Fligth() {
        initComponents();
        
        List<Airplane> planes = new AirplaneDAO().getAll();
        System.err.println(planes.size());
        for (int i = 0; i < planes.size(); i++) {
            System.out.println(planes.get(i).getPlaneName());
            biman.addItem(planes.get(i).getPlaneCode());
        }
        
        Object columns[] = {"ID","Code","Source","Destination","Date","Biman","biman_code","biman_name","biman_total_seat","common_seat_price","business_seat_price","premium_seat_price"};
        defaultTableModel.setColumnIdentifiers(columns);
        FTable.setModel(defaultTableModel);
        loadData();
        
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
    }
//    private void GetAirplaneNae(){
//           String sql = "select * from airplane";
//        try {
//            PreparedStatement Add = AirlinesConnection.getConnection().prepareStatement(sql); 
//            Rs = Add.executeQuery(sql);  
//            while (Rs.next()) {                
//                String PId = String.valueOf(Rs.getString("plane_name"));
//                biman.addItem(PId);
//            } 
//        } catch (HeadlessException | SQLException e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
//    }
//    
    private void loadData() {
       String sql = "select id, Code,Source,Destination,Date,Biman,biman_code,biman_name,biman_total_seat,common_seat_price,business_seat_price,premium_seat_price from flighttable";
                try {
            PreparedStatement ps = AirlinesConnection.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Object columnData[] = new Object[12];
            while (rs.next()) {
                columnData[0] = rs.getInt("id");
                columnData[1] = rs.getString("Code");
                columnData[2] = rs.getString("Source");
                columnData[3] = rs.getString("Destination");
                columnData[4] = rs.getString("Date");
                columnData[5] = rs.getString("Biman");
                columnData[6] = rs.getString("biman_code");
                columnData[7] = rs.getString("biman_name");
                columnData[8] = rs.getInt("biman_total_seat");
                columnData[9] = rs.getDouble("common_seat_price");
                columnData[10] = rs.getDouble("business_seat_price");
                columnData[11] = rs.getDouble("premium_seat_price");
                defaultTableModel.addRow(columnData);
            }
            
                    int row = FTable.getSelectedRow();              //em
        FTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int pid = Integer.parseInt((FTable.getValueAt(row, 0).toString()));
                String Pname = (FTable.getValueAt(row, 1).toString());
                String Pnation = (FTable.getValueAt(row, 2).toString());
                String pgenaer = (FTable.getValueAt(row, 3).toString());
                String ppass = (FTable.getValueAt(row, 4).toString());
                String pphone = (FTable.getValueAt(row, 5).toString());
                String padd = (FTable.getValueAt(row, 6).toString());
            }
        });
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        FCode = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fbEdit = new javax.swing.JButton();
        fbBack = new javax.swing.JButton();
        fbDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        FTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        FSource = new javax.swing.JComboBox();
        FDestination = new javax.swing.JComboBox();
        FDate = new com.toedter.calendar.JDateChooser();
        fbSave = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        jProgressBar1 = new javax.swing.JProgressBar();
        biman = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

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
        jLabel5.setText("Fligths List");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Fligths Code");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Take of Date");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Source");

        FCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText("Manage Flights");

        fbEdit.setBackground(new java.awt.Color(255, 204, 204));
        fbEdit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fbEdit.setText("Edit");
        fbEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fbEditMouseClicked(evt);
            }
        });

        fbBack.setBackground(new java.awt.Color(255, 204, 204));
        fbBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fbBack.setText("Back");
        fbBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fbBackActionPerformed(evt);
            }
        });

        fbDelete.setBackground(new java.awt.Color(255, 204, 204));
        fbDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fbDelete.setText("Delete");
        fbDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fbDeleteMouseClicked(evt);
            }
        });
        fbDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fbDeleteActionPerformed(evt);
            }
        });

        FTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Code", "Source", "Destination", "Date", "Baman", "biman_name", "biman_code", "biman_total_seat", "comon_seat_price", "business_seat_price", "premium_seat_price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        FTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(FTable);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Destination");

        FSource.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FSource.setForeground(new java.awt.Color(0, 0, 153));
        FSource.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dhaka", "Sylete", "Rajshahi", "Borishal", "Chottrogram" }));
        FSource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FSourceActionPerformed(evt);
            }
        });

        FDestination.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FDestination.setForeground(new java.awt.Color(0, 51, 153));
        FDestination.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dhaka", "Sylete", "Rajshahi", "Borishal", "Chottrogram" }));

        fbSave.setBackground(new java.awt.Color(255, 204, 204));
        fbSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fbSave.setText("Save");
        fbSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fbSaveMouseClicked(evt);
            }
        });
        fbSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fbSaveActionPerformed(evt);
            }
        });

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        biman.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        biman.setForeground(new java.awt.Color(0, 51, 153));
        biman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bimanActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("Name of Plain");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(biman, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FCode)
                            .addComponent(FSource, 0, 136, Short.MAX_VALUE)
                            .addComponent(FDestination, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fbEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fbSave, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fbDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fbBack, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(331, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FCode, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fbSave, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FSource, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fbEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FDestination)
                    .addComponent(fbDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FDate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(biman)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fbBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
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
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null;
    Statement St = null;

    private void FSourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FSourceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FSourceActionPerformed

    private void fbBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fbBackActionPerformed
        this.setVisible(false);
        new MainForm().setVisible(true);
    }//GEN-LAST:event_fbBackActionPerformed

    private void fbSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fbSaveMouseClicked
        if (FCode.getText().isEmpty() || FDate.getDateFormatString().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else {

        }
        try {
            String sql = "INSERT INTO flighttable (Code,Source,Destination,Date,Biman,biman_code,biman_name,biman_total_seat,common_seat_price,business_seat_price,premium_seat_price)) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement add = AirlinesConnection.getConnection().prepareStatement(sql);
             
            Airplane plane = new AirplaneDAO().getByCode(biman.getSelectedItem().toString());
            add.setString(1, FCode.getText());
            add.setString(2, FSource.getSelectedItem().toString());
            add.setString(3, FDestination.getSelectedItem().toString());
            add.setDate(4, new Date(System.currentTimeMillis()));
            add.setString(5, biman.getSelectedItem().toString());
            add.setString(6, plane.getPlaneName());
            add.setString(7, plane.getPlaneCode());
            add.setInt(8, plane.getTotalSeats());
            add.setDouble(9, plane.getCommonSeatPrice());
            add.setDouble(10, plane.getBusinessSeatPrice());
            add.setDouble(11, plane.getPremiumSeatPrice());
            
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Flight Added");
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_fbSaveMouseClicked

    private void fbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fbDeleteActionPerformed
                    String searchField = id.getText();
            String sql = "Delete from flighttable where id ='" + searchField + "'";
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
    }//GEN-LAST:event_fbDeleteActionPerformed

    private void fbEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fbEditMouseClicked
        try {
            String sql = "update flighttable set id= ? Code = ?,Source = ?,Destination = ?,Date = ?,Biman = ? where id = ?";
            PreparedStatement add = AirlinesConnection.getConnection().prepareStatement(sql);
            String searchField = id.getText();
            add.setString(1, FCode.getText());
            add.setString(2, FSource.getSelectedItem().toString());
            add.setString(3, FDestination.getSelectedItem().toString());
            add.setString(4, FDate.getDate().toString());
            add.setString(5, biman.getSelectedItem().toString());
            add.setString(6, searchField);
            int row = add.executeUpdate();
            defaultTableModel.getDataVector().removeAllElements();
            defaultTableModel.fireTableDataChanged();
            
            JOptionPane.showMessageDialog(this, "Flight Updated");
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_fbEditMouseClicked

    private void fbSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fbSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fbSaveActionPerformed

    private void fbDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fbDeleteMouseClicked
        
                String searchField = id.getText();
        String sql = "Delete from flighttable where id ='" + searchField + "'";
        try {       //ok
            PreparedStatement stmt = AirlinesConnection.getConnection().prepareStatement(sql);
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Flight " + searchField + " has been deleted");
            defaultTableModel.getDataVector().removeAllElements();
            defaultTableModel.fireTableDataChanged();
            loadData();
            AirlinesConnection.getConnection().close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Flight id " + searchField + " not found");
        }
    }//GEN-LAST:event_fbDeleteMouseClicked

    private void FTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_FTableMouseClicked

    private void bimanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bimanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bimanActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fligth().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FCode;
    private com.toedter.calendar.JDateChooser FDate;
    private javax.swing.JComboBox FDestination;
    private javax.swing.JComboBox FSource;
    private javax.swing.JTable FTable;
    private javax.swing.JComboBox biman;
    private javax.swing.JButton fbBack;
    private javax.swing.JButton fbDelete;
    private javax.swing.JButton fbEdit;
    private javax.swing.JButton fbSave;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
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
    // End of variables declaration//GEN-END:variables


}
