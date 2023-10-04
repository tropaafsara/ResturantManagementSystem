package restaurant;



import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet; 
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Orders extends javax.swing.JFrame {

    
     String url="jdbc:sqlserver://localhost:1433;databaseName=restaurantmManagement";
              String user = "sa";
             String password = "123";
   JFrame f;
    
    public Orders() {
        initComponents();
    }

    String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
       
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        table = new javax.swing.JComboBox<>();
        price = new javax.swing.JTextField();
        order_type = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        menuI = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cphone = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        View = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderT = new javax.swing.JTable();
        jInput1 = new javax.swing.JTextField();
        jEnter1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setPreferredSize(new java.awt.Dimension(1887, 976));

        jPanel1.setBackground(new java.awt.Color(217, 30, 24));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SELECT ITEM");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PRICE");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("QUANTITY");

        cname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ORDER TYPE");

        table.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Table" }));
        table.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tableMouseMoved(evt);
            }
        });
        table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableActionPerformed(evt);
            }
        });

        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });

        order_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dine In", "Takeaway" }));
        order_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_typeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TABLE");

        menuI.setMaximumRowCount(4);
        menuI.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                menuIMouseMoved(evt);
            }
        });
        menuI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CUSTOMER NAME");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PHONE NUMBER");

        cphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cphoneActionPerformed(evt);
            }
        });

        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cname, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(206, 206, 206))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(menuI, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(order_type, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(cphone, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(table, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menuI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(table, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(order_type, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cphone, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 196, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(192, 57, 43));
        jPanel4.setPreferredSize(new java.awt.Dimension(314, 61));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ORDER DETAILS");

        update.setBackground(new java.awt.Color(0, 0, 0));
        update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(0, 0, 0));
        delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(0, 0, 0));
        add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        View.setBackground(new java.awt.Color(0, 0, 0));
        View.setForeground(new java.awt.Color(255, 255, 255));
        View.setText("View");
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(192, 192, 192)
                .addComponent(View, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(update)
                .addGap(55, 55, 55)
                .addComponent(delete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(View, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        orderT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "OrderId", "Item Name", "Price", "Quantity", "TableNo", "OrderType", "Customer name", "Customer Phone", "Total Amount"
            }
        ));
        jScrollPane1.setViewportView(orderT);

        jInput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInput1ActionPerformed(evt);
            }
        });

        jEnter1.setText("Enter");
        jEnter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEnter1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jEnter1)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1095, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jEnter1))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1085, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
      
         
          try{
              
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
              String url="jdbc:sqlserver://localhost:1433;databaseName=restaurantmManagement";
              String user = "sa";
             String password = "123";
            //Connection connection = DriverManager.getConnection(url);
            String cost=quantity.getText();
            float pric=Float.parseFloat(cost);
            String q= quantity.getText();
            int qu=Integer.valueOf(q);
            String pho=cphone.getText();
            
            
            int a= Integer.parseInt(price.getText());
            int b= Integer.parseInt(quantity.getText());
            int r=a*b;
            String s=Integer.toString(r);
            
            
            
            
            Connection connection = DriverManager.getConnection(url,user,password);
        String sql =  "insert into ORDERS_DETAILS(ITEM, PRICE, QUANTITY,TABLENO,ORDER_TYPE, CNAME,CPHONE,TOTAL_AMOUNT)values(?,?,?,?,?,?,?,?)";
 
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setString(1, menuI.getSelectedItem().toString()); 
        pst.setString(2, price.getText());
        pst.setString(3, quantity.getText());
        pst.setString(4, table.getSelectedItem().toString());
           pst.setString(5, order_type.getSelectedItem().toString());                  
        pst.setString(6, cname.getText());
        
        pst.setString(7, cphone.getText());
         pst.setString(8,s);
        
      
       
        //JOptionPane.showMessageDialog(null,"Inserted Successfully !!!!!!");
         int rows =pst.executeUpdate();
                   //statement.close();
               
                  
                  if(rows>0){
               
        DefaultTableModel db=(DefaultTableModel)orderT.getModel();
           
              Statement st=connection.createStatement();
             ResultSet rs=st.executeQuery("SELECT * FROM ORDERS_DETAILS");
             orderT.setModel(DbUtils.resultSetToTableModel(rs));
           price.setText("");
           quantity.setText("");
             cname.setText("");
             cphone.setText("");
                 }
             
          }
          catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
                  
                  
                  

    }//GEN-LAST:event_addActionPerformed

    private void cnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnameActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tableActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void order_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_order_typeActionPerformed

    private void menuIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuIActionPerformed

    private void cphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cphoneActionPerformed

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    private void menuIMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuIMouseMoved
     
        
        try{
       Connection connection = DriverManager.getConnection(url,user,password);
           Statement st=connection.createStatement();
            ResultSet rs=st.executeQuery("SELECT menuName from menu where menuStatus='Available'");
            while(rs.next()){
            String name=rs.getString("menuName");
            menuI.addItem(name);
            }
       
       }
       catch(SQLException e){
       JOptionPane.showMessageDialog(f,"Try again","Message",JOptionPane.OK_OPTION);
       }        
        
    }//GEN-LAST:event_menuIMouseMoved

    private void tableMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseMoved
        // TODO add your handling code here:
        try{
       Connection connection = DriverManager.getConnection(url,user,password);
           Statement st=connection.createStatement();
            ResultSet rs=st.executeQuery("SELECT tableno from booked");
            while(rs.next()){
            String name=rs.getString("tableno");
           
            table.addItem(name);
            }
       
       }
       catch(SQLException e){
       JOptionPane.showMessageDialog(f,"Try again","Message",JOptionPane.OK_OPTION);}
    }//GEN-LAST:event_tableMouseMoved

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        Dashboard D=new Dashboard();
        D.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        // TODO add your handling code here:
           DefaultTableModel db=(DefaultTableModel)orderT.getModel();
             try{
                 Connection connection = DriverManager.getConnection(url,user,password);
              Statement st=connection.createStatement();
             ResultSet rs=st.executeQuery("SELECT * FROM ORDERS_DETAILS");
              orderT.setModel(DbUtils.resultSetToTableModel(rs));}
             catch(SQLException e){
JOptionPane.showMessageDialog(f," Unsuccessful.Try again","Message",JOptionPane.OK_OPTION);
}
    }//GEN-LAST:event_ViewActionPerformed

    private void jEnter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEnter1ActionPerformed
        String input1=jInput1.getText();
        
        
         try{
                 Connection connection = DriverManager.getConnection(url,user,password);
              Statement stmt=connection.createStatement();
              
              if(input1.equals("A")){
                String query5="SELECT tableno FROM booked WHERE status='Available' ORDER BY tableno";
                  ResultSet rs=stmt.executeQuery(query5);  
                  orderT.setModel(DbUtils.resultSetToTableModel(rs));
                  jInput1.setText("");}
              
              else if(input1.equals("U")){
                String query5="SELECT tableno FROM booked WHERE status='Unavailable' ORDER BY tableno";
                  ResultSet rs=stmt.executeQuery(query5);  
                 orderT.setModel(DbUtils.resultSetToTableModel(rs));
                  jInput1.setText("");}
              else if(input1.equals("Dine In")){
                String query5="SELECT * FROM ORDERS_DETAILS WHERE ORDER_TYPE='Dine In' ORDER BY ORDERS_ID";
                  ResultSet rs=stmt.executeQuery(query5);  
                 orderT.setModel(DbUtils.resultSetToTableModel(rs));
                  jInput1.setText("");}
              else if(input1.equals("Takeaway")){
                String query5="SELECT * FROM ORDERS_DETAILS WHERE ORDER_TYPE='Takeaway' ORDER BY ORDERS_ID";
                  ResultSet rs=stmt.executeQuery(query5);  
                 orderT.setModel(DbUtils.resultSetToTableModel(rs));
                  jInput1.setText("");}
              
             else if(input1.equals(jInput1)){
                String query5="SELECT * FROM ORDERS_DETAILS WHERE CPHONE = ?";
                  ResultSet rs=stmt.executeQuery(query5);  
                  orderT.setModel(DbUtils.resultSetToTableModel(rs));
                  jInput1.setText("");}
          
    }
          
            
       
             catch(SQLException e){
JOptionPane.showMessageDialog(f," Unsuccessful.Try again","Message",JOptionPane.OK_OPTION);
 jInput1.setText("");
}
    }//GEN-LAST:event_jEnter1ActionPerformed

    private void jInput1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInput1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jInput1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Orders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton View;
    private javax.swing.JButton add;
    private javax.swing.JTextField cname;
    private javax.swing.JTextField cphone;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jEnter1;
    private javax.swing.JTextField jInput1;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> menuI;
    private javax.swing.JTable orderT;
    private javax.swing.JComboBox<String> order_type;
    private javax.swing.JTextField price;
    private javax.swing.JTextField quantity;
    private javax.swing.JComboBox<String> table;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
