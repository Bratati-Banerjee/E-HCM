package main;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class simulations extends javax.swing.JFrame {
  private int docid ;
   
    /**
     * Creates new form Home
     */
    public simulations( int docid) {
        initComponents();
        this.docid=docid;
      DefaultTableModel model = new DefaultTableModel(new String[]{"appid", "docid", "pid","pmail","date"}, 0);

        Connection conn = null;
try {
    // db parameters
    String url       = "jdbc:mysql://localhost:3306/e-healthcare";
    String user      = "root";
    String p = "";
	
    // create a connection to the database
    Class.forName("com.mysql.jdbc.Driver"); 

    conn = (Connection) DriverManager.getConnection(url, user, p);
 
       Statement stm=(Statement) conn.createStatement();
                               
       String sql ="select * from appointement where docid ='"+this.docid+"'";
       ResultSet rs= stm.executeQuery(sql);
       
    while(rs.next())
{   int a = rs.getInt("appid");
    int d = rs.getInt("docid");
    String pm = rs.getString("pmail");
    String pp = rs.getString("pid");
    String date = rs.getString("date");
     model.addRow(new Object[]{a, d, pp,pm,date});
    table3.setModel(model);

}
       
} catch(SQLException e) {
   System.out.println(e.getMessage());
}       catch (ClassNotFoundException ex) {        
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }    
        
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        table3 = new javax.swing.JTable();
        button4 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(860, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(854, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(45, 118, 232));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Healthcare Management System");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, -1, 30));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("E-HealthCare ");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/navigation.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 90, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/doctors.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        button2.setActionCommand("Logout");
        button2.setBackground(new java.awt.Color(255, 255, 255));
        button2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        button2.setForeground(new java.awt.Color(45, 118, 232));
        button2.setLabel("Logout");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel2.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 60, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, -1));

        button3.setActionCommand("Refresh");
        button3.setBackground(new java.awt.Color(45, 118, 232));
        button3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setLabel("Refresh");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        jPanel1.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 120, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("<html> Upcoming appointements :  </html>");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, -1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        table2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ide", "name", "category", "number", "idroom", "price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table2.setGridColor(new java.awt.Color(255, 255, 255));
        table2.setRowHeight(22);
        jScrollPane1.setViewportView(table2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, -1, 150));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        table3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Date id", "patient e-mail", "patient id", "doctor id", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table3.setGridColor(new java.awt.Color(255, 255, 255));
        table3.setRowHeight(22);
        jScrollPane2.setViewportView(table3);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, 150));

        button4.setBackground(new java.awt.Color(255, 153, 0));
        button4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        button4.setForeground(new java.awt.Color(255, 255, 255));
        button4.setLabel("prescription");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel1.add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    int xx,xy;
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);  
    }//GEN-LAST:event_jPanel2MouseDragged

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
 this.dispose();
        new Home().show();  
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
  DefaultTableModel model = new DefaultTableModel(new String[]{"ide", "name", "category","number","idroom","price"}, 0);

        Connection conn = null;
try {
    // db parameters
    String url       = "jdbc:mysql://localhost:3306/e-healthcare";
    String user      = "root";
    String p = "";
	
    // create a connection to the database
    Class.forName("com.mysql.jdbc.Driver"); 

    conn = (Connection) DriverManager.getConnection(url, user, p);
 
       Statement stm=(Statement) conn.createStatement();
                               
       String sql ="select * from equipment ";
       ResultSet rs= stm.executeQuery(sql);
       
    while(rs.next())
{   int ide = rs.getInt("ide");
    int n = rs.getInt("number");
    String c = rs.getString("category");
    String name = rs.getString("name");
    int idroom = rs.getInt("idroom");
        int price = rs.getInt("price");

     model.addRow(new Object[]{ide, name, c,n,idroom,price});
    table2.setModel(model);

}
       
} catch(SQLException e) {
   System.out.println(e.getMessage());
}       catch (ClassNotFoundException ex) {        
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }    

    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
          DefaultTableModel dm = (DefaultTableModel)table3.getModel();
          DefaultTableModel dm1 = (DefaultTableModel)table2.getModel();
    int selectIndex1 = table2.getSelectedRow();

    int selectIndex = table3.getSelectedRow();
        java.sql.Connection conn = null;
        try {
            // db parameters
            String url       = "jdbc:mysql://localhost:3306/e-healthcare";
            String user      = "root";
            String p = "";

            // create a connection to the database
            Class.forName("com.mysql.jdbc.Driver");

            conn = (java.sql.Connection) DriverManager.getConnection(url, user, p);
               java.sql.Statement stm=(java.sql.Statement) conn.createStatement();
              
                String pid =  dm.getValueAt(selectIndex,1).toString();
                String docid =  dm.getValueAt(selectIndex, 2).toString() ;
                String appid = dm.getValueAt(selectIndex, 0).toString();
                String roomid = dm1.getValueAt(selectIndex1, 4).toString();
                int number = (int) dm1.getValueAt(selectIndex1, 3);
                int price = (int) dm1.getValueAt(selectIndex1, 5);

                System.out.print(pid);
                System.out.print(appid);
                                System.out.print(docid);
                                                System.out.print(roomid);

                float pricing = price*number;
                
       String sql ="INSERT INTO treatement (pid,docid,appid,roomid, pricing) VALUES ('"+pid+"','"+docid+"', '"+appid+"', '"+roomid+"', '"+pricing+"')";
            
                 stm.executeUpdate(sql);  
           
            JOptionPane.showMessageDialog(this, "Prescription Assigned!");
        
        } catch (SQLException ex) {
            Logger.getLogger(managedoc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(managedoc.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_button4ActionPerformed
 public void setColor(JPanel panel)
 {
     panel.setBackground(new java.awt.Color(197, 197, 197));
 }
 
 public void resetColor(JPanel panel)
 {
     panel.setBackground(new java.awt.Color(240,240,240));
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(simulations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(simulations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(simulations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(simulations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new simulations(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table2;
    private javax.swing.JTable table3;
    // End of variables declaration//GEN-END:variables

    void show(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}