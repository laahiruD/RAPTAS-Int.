


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lahiru
 */
public class db {
  public static Connection con(){
      
      Connection con=null;
      
      try {
          Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vouchermanagement","root","");
      } catch (Exception e) {
          
      }
      
      return con;
      
      
}
    
  

   

}
