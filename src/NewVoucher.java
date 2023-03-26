
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lahiru
 */
public class NewVoucher extends javax.swing.JFrame {

    /**
     * Creates new form NewVoucher
     */
    
   
    public  NewVoucher() {
        initComponents();
    }
    
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
             message.setText(jTextField3.getText()+ " has requested for a RS." +jTextField4.getText() +" Voucher." );
             return message;
         } catch (Exception ex) {
             Logger.getLogger(mail.class.getName()).log(Level.SEVERE, null, ex);
         }
        System.out.println(jTextField3.getText());
  return null;     
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Voucher");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("UID :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 80, 60, 30);

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel3.setText("Apply For a Voucher");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 20, 190, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Submit");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(130, 260, 80, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Cancel");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(240, 260, 80, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("DATE :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 190, 70, 40);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(300, 320, 73, 30);

        dateChooserCombo1.setCalendarPreferredSize(new java.awt.Dimension(300, 250));
        jPanel1.add(dateChooserCombo1);
        dateChooserCombo1.setBounds(130, 200, 160, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("AMOUNT :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 140, 70, 30);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(130, 80, 160, 30);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(130, 140, 160, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 470, 460);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int result=JOptionPane.showConfirmDialog(null,"Are You Sure ? ","",JOptionPane.YES_NO_OPTION);
       if(result==0){
           jTextField3.setText("");
           jTextField3.setText("");
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setVisible(false);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            PreparedStatement ps=null;
            ResultSet rs=null;
           
            
            String a=jTextField3.getText();
            String b=jTextField4.getText();
            String c = dateChooserCombo1.getText();
            
            
            if(a.equals("") || b.equals("")){
              JOptionPane.showMessageDialog(this, "Fill All Fields Correctly !");
              jTextField3.setText("");
              jTextField4.setText("");
              ps.close();
                
            }
           
            String query2="SELECT UID FROM employee WHERE UID= ? ";
            ps=db.con().prepareStatement(query2);
            ps.setString(1,a );
           // ps.setString(2,d );
            rs=ps.executeQuery();
            
            
            if(rs.next()){
                
            String Query= "INSERT INTO v1(UID ,Amount,Date) VALUES (?,?,?) ";
            ps=db.con().prepareStatement(Query);
            ps.setString(1,a);
            ps.setString(2,b);
            ps.setString(3,c);
            ps.execute();
            
//            String Query2= "INSERT INTO voucher2(UID ,Amount) VALUES (?,?) ";
//            ps=db.con().prepareStatement(Query2);
//            ps.setString(1,a);
//            ps.setString(2,b);
//            ps.execute();
            
//            jTextField3.setText("");
//            jTextField4.setText("");
            JOptionPane.showMessageDialog(this, " Your Voucher has been Submitted");
//            jTextField3.setText("");
//            jTextField4.setText("");
           
             
             try { 
                 
              sendMail2("Laaahiru948@gmail.com");
              //JOptionPane.showMessageDialog(this,"Email has been sent !");
        } catch (Exception ex) {
            Logger.getLogger(NewVoucher.class.getName()).log(Level.SEVERE, null, ex);
        }
            jTextField3.setText("");
            jTextField4.setText("");
        }
             else{
                 JOptionPane.showMessageDialog(this,"Invalid User Name !");
                 jTextField3.setText("");
                 jTextField4.setText("");
             }
             
                    } catch (SQLException ex) {
            Logger.getLogger(NewVoucher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            java.util.logging.Logger.getLogger(NewVoucher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewVoucher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewVoucher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewVoucher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewVoucher().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
