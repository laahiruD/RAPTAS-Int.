import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Session;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class mail {
    
 public static void sendMail(String recepient) throws Exception{
    
          
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
 }

    private static Message prepareMessage(Session session, String myAccount,String recepient) {
      
    
         Message message = new MimeMessage(session);
         try {
             message.setFrom(new InternetAddress(myAccount));
             
             message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
             message.setSubject("A new voucher");
             message.setText("aaaa");
             return message;
         } catch (Exception ex) {
             Logger.getLogger(mail.class.getName()).log(Level.SEVERE, null, ex);
         }
     
  return null;     
}
    
}
    
    

