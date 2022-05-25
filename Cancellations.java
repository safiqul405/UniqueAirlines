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
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class Cancellations extends javax.swing.JFrame {

    DefaultTableModel defaultTableModel = new DefaultTableModel();
    
    public Cancellations() {
        initComponents();
        GetPassTicket();
        DisplayCancelation() ;
        FCode.setEditable(false);
        
        Object columns[] = {"CId","TicketId","Code","Date"};
        defaultTableModel.setColumnIdentifiers(columns);
        CTable.setModel(defaultTableModel);
        
        
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tid = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        cbBack = new javax.swing.JButton();
        cbReset = new javax.swing.JButton();
        cbBook = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CTable = new javax.swing.JTable();
        FCode = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CDate = new com.toedter.calendar.JDateChooser();
        jProgressBar1 = new javax.swing.JProgressBar();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel3.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Bangladesh Unique Airlines");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Cancellation List");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Cancell Date");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Ticket ID");

        tid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tid.setForeground(new java.awt.Color(0, 0, 153));
        tid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tidActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText("Tickets Cancellation");

        cbBack.setBackground(new java.awt.Color(153, 255, 0));
        cbBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbBack.setText("Back");
        cbBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbBackMouseClicked(evt);
            }
        });

        cbReset.setBackground(new java.awt.Color(153, 255, 255));
        cbReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbReset.setText("Reset");
        cbReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbResetMouseClicked(evt);
            }
        });

        cbBook.setBackground(new java.awt.Color(255, 0, 0));
        cbBook.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbBook.setText("Cancel");
        cbBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbBookMouseClicked(evt);
            }
        });

        CTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CId", "TicketId", "Code", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        CTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(CTable);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Fligths Code");

        jProgressBar1.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tid, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(cbBook, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FCode, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbReset)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbBack, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(CDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(FCode, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBook, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbReset, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 612, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null;
    ResultSet Rs1 = null;
    Statement St = null;
    
    private void GetPassTicket(){
           String sql = "select * from tickettable";
        try {
            PreparedStatement Add = AirlinesConnection.getConnection().prepareStatement(sql); 
            Rs = Add.executeQuery(sql);  
            while (Rs.next()) {                
                String TI = String.valueOf(Rs.getInt("TId"));
                tid.addItem(TI);
            } 
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void GetFCode(){
           String sql = "select * from tickettable where TId="+tid.getSelectedItem().toString();
        try {
            PreparedStatement Add = AirlinesConnection.getConnection().prepareStatement(sql); 
            Rs = Add.executeQuery(sql);  
            if (Rs.next()) {
               FCode.setText(Rs.getString("code"));
            } 
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    int CId=0;
    
            private void DisplayCancelation() {
       String sql = "select CId,TicketId,Code,Date from cancellation";
                try {
            PreparedStatement ps = AirlinesConnection.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Object columnData[] = new Object[5];
            while (rs.next()) {
                columnData[0] = rs.getInt("CId");
                columnData[1] = rs.getInt("TicketId");
                columnData[2] = rs.getString("Code");
                columnData[3] = rs.getString("Date");
                defaultTableModel.addRow(columnData);
            }
            
            //           
            CTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = CTable.getSelectedRow();   
                int tid = Integer.parseInt((CTable.getValueAt(row, 0).toString()));
                String FCode = (CTable.getValueAt(row, 1).toString());
                String CDate = (CTable.getValueAt(row, 2).toString());
            }
        });
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void tidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tidActionPerformed
        GetFCode();
    }//GEN-LAST:event_tidActionPerformed

    private void cbBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbBackMouseClicked
        this.setVisible(false);
        new MainForm().setVisible(true);
    }//GEN-LAST:event_cbBackMouseClicked

    private void cbResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbResetMouseClicked
        FCode.setText("");
    }//GEN-LAST:event_cbResetMouseClicked

//    private void cancels(){
//                String sql = "Delete from flighttable where id =?" ;
//        try {
//            PreparedStatement stmt = AirlinesConnection.getConnection().prepareStatement(sql);
//            stmt.execute();
//            JOptionPane.showMessageDialog(null, "Passenger  has been deleted");
//            //defaultTableModel.getDataVector().removeAllElements();
//            //defaultTableModel.fireTableDataChanged();
//            //loadData();
//            AirlinesConnection.getConnection().close();
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Passenger id  not found");
//        } 
//    }
//    }
    
    private void CTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CTableMouseClicked
        
        
    }//GEN-LAST:event_CTableMouseClicked

    private void cbBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbBookMouseClicked
        if (FCode.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else {      
        }try {
            //countCan();
            String sql = "INSERT INTO cancellation (TicketId,Code,Date) VALUES (?,?,?)";
            PreparedStatement add = AirlinesConnection.getConnection().prepareStatement(sql);
            //Add.setInt(1, CId);
            add.setInt(1, Integer.valueOf(tid.getSelectedItem().toString()));
            add.setString(2, FCode.getText());
             add.setDate(3, new Date(System.currentTimeMillis()));
           // add.setString(3,CDate.getDate().toString());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Ticket Cancelled");
            con.close();
            DisplayCancelation();
           // Clear();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }   
    }//GEN-LAST:event_cbBookMouseClicked


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
            java.util.logging.Logger.getLogger(Cancellations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cancellations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cancellations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cancellations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cancellations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser CDate;
    private javax.swing.JTable CTable;
    private javax.swing.JTextField FCode;
    private javax.swing.JButton cbBack;
    private javax.swing.JButton cbBook;
    private javax.swing.JButton cbReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox tid;
    // End of variables declaration//GEN-END:variables
}
