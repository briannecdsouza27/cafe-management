package dao;
import javax.swing.JOptionPane;


import model.User;

public class UserDao {
	public static void save(User user) {
		String query="insert into user(name,email,mobilenumber,address,password,securityquestion,answer,status) values('"+user.getName()+"','"+user.getEmail()+"','"+user.getMobilenumber()+"','"+user.getAddress()+"','"+user.getPassword()+"','"+user.getSecurityquestion()+"','"+user.getAnswer()+"','false')";
		DbOperation.setDataorDelete(query, "Registered Successfully! Wait for Admin Approval!");
		
	}
   public static void LoginForm(String username,String password) {
	   User user=null;
	   try {}
	   catch(Exception e) {
		   JOptionPane.showMessageDialog(null, e);
	   }
   }
}
