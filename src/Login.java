
import java.awt.Color;
import static java.awt.Color.gray;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.*;






/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lahiru
 */


  public class Login extends javax.swing.JFrame implements Runnable{
Thread th;
    //Connection con;


    public Login() {
        super("Login");
        initComponents();
        th=new Thread((Runnable)this);
                       
        
        //DB obj = new DB();
        //con = obj.getconnection();
    }

     
    public void serUploading(){
        setVisible(false);
        th.start();
    }
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(920, 590));
        setResizable(false);
        setSize(new java.awt.Dimension(850, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setMinimumSize(new java.awt.Dimension(5, 10));
        jPanel2.setPreferredSize(new java.awt.Dimension(5, 100));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(440, 170, 5, 300);

        jLabel1.setFont(new java.awt.Font("Thibus07STru", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 244, 244));
        jLabel1.setText("RAPTAS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 130, 230, 150);

        jLabel2.setBackground(new java.awt.Color(239, 239, 239));
        jLabel2.setFont(new java.awt.Font("Thibus07STru", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(241, 240, 240));
        jLabel2.setText("INTERNATIONAL");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 190, 340, 140);

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(570, 210, 200, 30);

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/u5.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(540, 210, 30, 30);

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/125.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(540, 270, 40, 30);

        jPasswordField1.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(102, 102, 102));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(570, 270, 200, 30);

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Log in");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(620, 360, 70, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/111.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 300, 140, 110);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Exit");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(820, 510, 80, 40);

        jLabel10.setFont(new java.awt.Font("Felix Titling", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 10, 110, 30);

        jLabel11.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 30, 100, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background_ISS_nologo.jpg"))); // NOI18N
        jLabel4.setMinimumSize(new java.awt.Dimension(920, 570));
        jLabel4.setPreferredSize(new java.awt.Dimension(920, 570));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 0, 920, 570);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(850, 0, 10, 10);

        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(610, 130, 70, 50);

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(580, 140, 100, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
       jButton1.setBackground(Color.white);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
         jButton1.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jButton1MouseExited

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        try {
            PreparedStatement ps=null;
            ResultSet rs= null;
            
            String a= jTextField1.getText();
            String b = String.valueOf(jPasswordField1.getPassword());
            
            String Query="select * from login2 where username=? AND password=?";
            ps=db.con().prepareStatement(Query);
            ps.setString(1, a);
            ps.setString(2, b);
            
            rs=ps.executeQuery();
            
            if(rs.next()){
                
            
            if(a.equals("admin") && b.equals("1111")){
                AdminWindow aw = new AdminWindow ();
                aw.setVisible(true);
                this.setVisible(false);
            }
            else if(a.equals("mngr") && b.equals("2222")){
                ManagerWindow mw = new ManagerWindow();
                mw.setVisible(true);
                this.setVisible(false);
            }
            else if(a.equals("actnt") && b.equals("3333")){
                AccountantWindow acw = new AccountantWindow();
                acw.setVisible(true);
                this.setVisible(false);
            }
            
                else{
                        EmployeeWindow ew= new EmployeeWindow();
                ew.setVisible(true);
                this.setVisible(false);
                
            }
            }
            else{
                JOptionPane.showMessageDialog(this,"Invalid User Name or password !");
            }
            jTextField1.setText("");
            jPasswordField1.setText("");
            
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String dte = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
        jLabel10.setText(dte);
        
        String tm = new SimpleDateFormat("hh:mm").format(Calendar.getInstance().getTime());
        jLabel11.setText(tm);
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        int result = JOptionPane.showConfirmDialog(this,"Are You Sure ?","",JOptionPane.YES_NO_OPTION);
        if(result==0){
        System.exit(0);
        }
        else{
            this.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
                new Login().setVisible(true);
            }
        });
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
