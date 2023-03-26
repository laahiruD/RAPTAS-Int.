
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import net.proteanit.sql.DbUtils;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lahiru
 */
public class PayForVouchers extends javax.swing.JFrame {

    /**
     * Creates new form PayForVouchers
     */
    public PayForVouchers() {
        initComponents();
        DisplayTable();
    }

     //Sending an Acceptable emil
        
         public  void sendMail(String recepient) throws Exception{
    
          
     Properties properties = new Properties();
    
  properties.put("mail.smtp.auth", "true");
  properties.put("mail.smtp.starttls.enable", "true");
  properties.put("mail.smtp.host","smtp.gmail.com");
  properties.put("mail.smtp.port", "587");
  
    String myAccount="lahirudissanayake948@gmail.com";
    String password ="12178110";
    
    
  Session session =Session.getInstance(properties,new Authenticator(){
        @Override
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(myAccount, password);
        }
     
  });
  
   Message message = prepareMessage(session,myAccount,recepient); 
  
   Transport.send(message);
     System.out.println("E-mail sent ");
     JOptionPane.showMessageDialog(this,"Email Sent");
 }

    private  Message prepareMessage(Session session, String myAccount,String recepient) {
      
    
         Message message = new MimeMessage(session);
         try {
             message.setFrom(new InternetAddress(myAccount));
             
             message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
             message.setSubject("A new voucher");
             message.setText(jTextField2.getText()+ " has requested for a RS." +jTextField3.getText() +" Voucher Which is accebtable." );
             return message;
         } catch (Exception ex) {
             Logger.getLogger(mail.class.getName()).log(Level.SEVERE, null, ex);
         }
     
  return null;     
    }
    
    // End of Acceptable Email 
    
    
    //Sending an  not acceptable emil
        
         public  void sendMail2(String recepient) throws Exception{
    
          
     Properties properties = new Properties();
    
  properties.put("mail.smtp.auth", "true");
  properties.put("mail.smtp.starttls.enable", "true");
  properties.put("mail.smtp.host","smtp.gmail.com");
  properties.put("mail.smtp.port", "587");
  
    String myAccount="lahirudissanayake948@gmail.com";
    String password ="12178110";
    
    
  Session session =Session.getInstance(properties,new Authenticator(){
        @Override
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(myAccount, password);
        }
     
  });
  
   Message message = prepareMessage2(session,myAccount,recepient); 
  
   Transport.send(message);
     System.out.println("E-mail sent ");
     JOptionPane.showMessageDialog(this,"Email Sent");
 }

    private  Message prepareMessage2(Session session, String myAccount,String recepient) {
      
    
         Message message = new MimeMessage(session);
         try {
             message.setFrom(new InternetAddress(myAccount));
             
             message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
             message.setSubject("A new voucher");
             message.setText(jTextField2.getText()+ " has requested for a RS." +jTextField3.getText() +" Voucher Which is not accebtable." );
             return message;
         } catch (Exception ex) {
             Logger.getLogger(mail.class.getName()).log(Level.SEVERE, null, ex);
         }
     
  return null;     
    }
    
    // End of not acceptable Email 
    
    public void DisplayTable(){
        PreparedStatement  ps= null;
        ResultSet rs=null;
        
        String query ="SELECT * FROM v1";
        try {
            ps=db.con().prepareStatement(query);
            rs=ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (SQLException ex) {
            Logger.getLogger(PayForVouchers.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 36)); // NOI18N
        jLabel1.setText("Accept Vouchers");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 10, 300, 52);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VID", "UID", "Amount", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 70, 470, 240);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(720, 370, 120, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("VID :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(580, 100, 30, 15);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Acceptable");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(590, 300, 110, 40);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Not Acceptable");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(720, 300, 120, 40);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(660, 90, 180, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("UID :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(580, 140, 30, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Amount :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(580, 170, 60, 30);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(660, 130, 180, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(660, 170, 180, 30);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(590, 370, 110, 40);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("Voucher History");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(90, 350, 140, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Date :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(580, 200, 60, 40);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(660, 210, 180, 30);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setText("Salary Details");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(290, 350, 130, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      try {
            PreparedStatement ps= null;
            ResultSet  rs=null;
            String a= jTextField1.getText();
            String b= jTextField2.getText();
            String c= jTextField3.getText();
            String d= jTextField4.getText();
            
            String query="insert into voucher (VID,UID,Status,Amount,Date) values (?,?,?,?,?)";
            ps=db.con().prepareStatement(query);
            ps.setString(1,a);
            ps.setString(2,b);
            ps.setString(3,"Not Acceptable");
            ps.setString(4,c);
            ps.setString(5,d);
            
            
            ps.execute();
            
            JOptionPane.showMessageDialog(this, "DONE");
            
            try {
                JOptionPane.showMessageDialog(this,"Sending Email");
                sendMail2("Laaahiru948@gmail.com");
            } catch (Exception ex) {
                Logger.getLogger(PayForVouchers.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           
       
        } catch (SQLException ex) {
            Logger.getLogger(PayForVouchers.class.getName()).log(Level.SEVERE, null, ex);
      }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        
        
        try {
            PreparedStatement ps= null;
            ResultSet  rs=null;
            String a= jTextField1.getText();
            String b= jTextField2.getText();
            String c= jTextField3.getText();
            String d= jTextField4.getText();
            
            String query="insert into voucher (VID,UID,Amount,Status,Date) values (?,?,?,?,?)";
            ps=db.con().prepareStatement(query);
            ps.setString(1,a);
            ps.setString(2,b);
            ps.setString(3,c);
            ps.setString(4,"Acceptable");
            ps.setString(5,d);
            
            ps.execute();
            JOptionPane.showMessageDialog(this, "DONE");
            try {
                JOptionPane.showMessageDialog(this,"Sending Email");
                sendMail("Laaahiru948@gmail.com");
            } catch (Exception ex) {
                Logger.getLogger(PayForVouchers.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(PayForVouchers.class.getName()).log(Level.SEVERE, null, ex);
        }
        

     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
       int selectedRowIndex = jTable1.getSelectedRow();
       
       jTextField1.setText(model.getValueAt(selectedRowIndex, 1).toString());
       jTextField2.setText(model.getValueAt(selectedRowIndex, 0).toString());
       jTextField3 .setText(model.getValueAt(selectedRowIndex, 2).toString());
       jTextField4 .setText(model.getValueAt(selectedRowIndex, 3).toString());
       
       
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         jTextField1.setText("");
         jTextField2.setText("");
         jTextField3.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     VoucherH a = new VoucherH();
       a.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        SalaryDetails sd =new SalaryDetails();
        sd.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(PayForVouchers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PayForVouchers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PayForVouchers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PayForVouchers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PayForVouchers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
