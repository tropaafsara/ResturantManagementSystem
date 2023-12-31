/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
public class table2 extends javax.swing.JFrame {

     JFrame f;
     ResultSet rs;
     String url="jdbc:sqlserver://localhost:1433;databaseName=restaurantmManagement";
              String user = "sa";
             String password = "123";
    public table2() {
        initComponents();
        show_user();
    }
    public ArrayList<User> userList(){
        ArrayList<User> usersList = new ArrayList<>();
         try{
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             //String url="jdbc:sqlserver://localhost:1433;databaseName=restaurent;user=sa;password=123";
            Connection con = DriverManager.getConnection(url,user,password);
            String query1="SELECT * FROM booked";
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(query1);
            User user;
            while(rs.next()){
                user=new User(rs.getInt("tableid"), rs.getInt("tableno"), rs.getInt("chair"), rs.getString("floor"), rs.getString("status"));
                usersList.add(user);
            }
         }
         catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
         return usersList;
    }
    
     public void show_user(){
        ArrayList<User> list = userList();
        DefaultTableModel model = (DefaultTableModel)jTable_Display_User.getModel();
        Object[] row = new Object[5];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).gettableid();
            row[1]=list.get(i).gettableno();
            row[2]=list.get(i).getchair();
            row[3]=list.get(i).getfloor();
            row[4]=list.get(i).getstatus();
            
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        table = new javax.swing.JComboBox<>();
        chairs = new javax.swing.JComboBox<>();
        floor = new javax.swing.JComboBox<>();
        family = new javax.swing.JComboBox<>();
        idT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        confirm = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_User = new javax.swing.JTable();
        jEnter1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jInput2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(217, 30, 24));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("No of chairs");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TABLE");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Status");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CUSTOMER NAME");

        table.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14" }));

        chairs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));

        floor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "#FLOOR1", "#FLOOR2" }));

        family.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Unavailable" }));

        jLabel5.setText("tableId");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(family, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 144, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(table, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chairs, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(floor, 0, 237, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(45, 45, 45))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(idT, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(table, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chairs, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(floor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(family, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 399, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(192, 57, 43));
        jPanel4.setPreferredSize(new java.awt.Dimension(314, 61));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ORDER DETAILS");

        confirm.setBackground(new java.awt.Color(51, 0, 51));
        confirm.setForeground(new java.awt.Color(255, 255, 255));
        confirm.setText("Confirm");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(51, 0, 0));
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete1.setBackground(new java.awt.Color(51, 0, 51));
        delete1.setForeground(new java.awt.Color(255, 255, 255));
        delete1.setText("delete");
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(248, 248, 248)
                .addComponent(confirm)
                .addGap(62, 62, 62)
                .addComponent(update)
                .addGap(70, 70, 70)
                .addComponent(delete1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTable_Display_User.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TableId", "TableNo", "No of  chairs", "Floor", "Status"
            }
        ));
        jTable_Display_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_UserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display_User);

        jEnter1.setText("Enter");
        jEnter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEnter1ActionPerformed(evt);
            }
        });

        jInput2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInput2ActionPerformed(evt);
            }
        });
        jScrollPane2.setViewportView(jInput2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(227, 227, 227)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(290, 290, 290)
                                .addComponent(jEnter1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1132, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jEnter1)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        try{
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //String url="jdbc:sqlserver://localhost:1433;databaseName=restaurent;user=sa;password=123";
            Connection con = DriverManager.getConnection(url,user,password);
            String query = "insert into booked(tableno, chair, floor, status)values(?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);

            String tableno,chair,floors,status;
            tableno=table.getSelectedItem().toString();
            pst.setString(1, tableno);
            chair=chairs.getSelectedItem().toString();
            pst.setString(2, chair);
            floors=floor.getSelectedItem().toString();
            pst.setString(3, floors);
            status=family.getSelectedItem().toString();
            pst.setString(4, status);
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable_Display_User.getModel();
            model.setRowCount(0);
            show_user();

            JOptionPane.showMessageDialog(null, "Inserted Sucessfully!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_confirmActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try{
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //String url="jdbc:sqlserver://localhost:1433;databaseName=restaurent;user=sa;password=123456789";
            Connection con = DriverManager.getConnection(url,user,password);
            int row=jTable_Display_User.getSelectedRow();
            String value=idT.getText();
            String query = "UPDATE booked SET tableno=?,chair=?,floor=?,status=? where tableid="+value+" ";
            PreparedStatement pst = con.prepareStatement(query);

            String tableno,chair,floors,status;
            tableno=table.getSelectedItem().toString();
            pst.setString(1, tableno);
            chair=chairs.getSelectedItem().toString();
            pst.setString(2, chair);
            floors=floor.getSelectedItem().toString();
            pst.setString(3, floors);
            status=family.getSelectedItem().toString();
            pst.setString(4, status);
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable_Display_User.getModel();
            model.setRowCount(0);
            show_user();

            JOptionPane.showMessageDialog(null, "updated Sucessfully!");

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
        try{
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //String url="jdbc:sqlserver://localhost:1433;databaseName=restaurent;user=sa;password=123456789";
            Connection con = DriverManager.getConnection(url,user,password);
            int row=jTable_Display_User.getSelectedRow();
            String value=(jTable_Display_User.getModel().getValueAt(row,0).toString());
            String query = "DELETE FROM booked  where tableid='"+value+"' ";
            PreparedStatement pst = con.prepareStatement(query);

            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable_Display_User.getModel();
            model.setRowCount(0);
            show_user();

            JOptionPane.showMessageDialog(null, "deleted Sucessfully!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_delete1ActionPerformed

    private void jTable_Display_UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Display_UserMouseClicked

        int i = jTable_Display_User.getSelectedRow();
        TableModel model =jTable_Display_User.getModel();
        String status = model.getValueAt(i,4).toString();
        switch(status){
            case "Family":
            family.setSelectedIndex(0);
            break;
            case "Friends":
            family.setSelectedIndex(1);
            break;
            case "Relatives":
            family.setSelectedIndex(2);
            break;
            case "Others":
            family.setSelectedIndex(3);
            break;

        }
        String floors = model.getValueAt(i,3).toString();
        switch(floors){
            case "#FLOOR1":
            floor.setSelectedIndex(0);
            break;
            case "#FLOOR2":
            floor.setSelectedIndex(1);
            break;
        }
        String chair = model.getValueAt(i,2).toString();
        switch(chair){
            case "1":
            chairs.setSelectedIndex(0);
            break;
            case "2":
            chairs.setSelectedIndex(1);
            break;
            case "3":
            chairs.setSelectedIndex(2);
            break;
            case "4":
            chairs.setSelectedIndex(3);
            break;
            case "5":
            chairs.setSelectedIndex(4);
            break;
            case "6":
            chairs.setSelectedIndex(5);
            break;
            case "7":
            chairs.setSelectedIndex(6);
            break;
            case "8":
            chairs.setSelectedIndex(7);
            break;

        }

        String tables = model.getValueAt(i,1).toString();
        switch(tables){
            case "1":
            table.setSelectedIndex(0);
            break;
            case "2":
            table.setSelectedIndex(1);
            break;
            case "3":
            table.setSelectedIndex(2);
            break;
            case "4":
            table.setSelectedIndex(3);
            break;
            case "5":
            table.setSelectedIndex(4);
            break;
            case "6":
            table.setSelectedIndex(5);
            break;
            case "7":
            table.setSelectedIndex(6);
            break;
            case "8":
            table.setSelectedIndex(7);
            break;
            case "9":
            table.setSelectedIndex(8);
            break;
            case "10":
            table.setSelectedIndex(9);
            break;
            case "11":
            table.setSelectedIndex(10);
            break;
            case "12":
            table.setSelectedIndex(11);
            break;
            case "13":
            table.setSelectedIndex(12);
            break;
            case "14":
            table.setSelectedIndex(13);
            break;

        }

    }//GEN-LAST:event_jTable_Display_UserMouseClicked

    private void jInput2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInput2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jInput2ActionPerformed

    private void jEnter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEnter1ActionPerformed
        String input1=jInput2.getText();

        try{
            Connection connection = DriverManager.getConnection(url,user,password);
            Statement stmt=connection.createStatement();

            if(input1.equals("A")){
                String query5="SELECT tableno FROM booked WHERE status='Available' ORDER BY tableno";
                ResultSet rs=stmt.executeQuery(query5);
                jTable_Display_User.setModel(DbUtils.resultSetToTableModel(rs));
                jInput2.setText("");}

            else if(input1.equals("U")){
                String query5="SELECT tableno FROM booked WHERE status='Unavailable' ORDER BY tableno";
                ResultSet rs=stmt.executeQuery(query5);
                jTable_Display_User.setModel(DbUtils.resultSetToTableModel(rs));
                jInput2.setText("");}
            

        }

        catch(SQLException e){
            JOptionPane.showMessageDialog(f," Unsuccessful.Try again","Message",JOptionPane.OK_OPTION);
            jInput2.setText("");
        }
    }//GEN-LAST:event_jEnter1ActionPerformed

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
            java.util.logging.Logger.getLogger(table2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(table2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(table2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(table2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new table2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> chairs;
    private javax.swing.JButton confirm;
    private javax.swing.JButton delete1;
    private javax.swing.JComboBox<String> family;
    private javax.swing.JComboBox<String> floor;
    private javax.swing.JTextField idT;
    private javax.swing.JButton jEnter1;
    private javax.swing.JTextField jInput2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Display_User;
    private javax.swing.JComboBox<String> table;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
