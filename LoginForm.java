import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.*;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm {


	private JFrame frame;
	private JLabel loginpage,username,password,lblimage;
	private JTextField tusername;
	private JPasswordField tpassword;
	private JLabel lblNewLabel;
	private JLabel lbltitle;
	private JButton btnlogin;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm window = new LoginForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginForm() {
		initialize();
	}
	
	public void clear() {
		tusername.setText("");
		tpassword.setText("");
		btnlogin.setEnabled(false);
	}
	public void validateField() {
		String Username=tusername.getText();
		String password=tpassword.getText();
		if(!name.equals("")&&)
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(240, 240, 240));
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(0, 0, 1200,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lbltitle = new JLabel("JB'S Sweet Cafe Corner System");
		lbltitle.setLabelFor(frame);
		lbltitle.setBackground(Color.BLACK);
		lbltitle.setForeground(new Color(255, 255, 255));
		lbltitle.setFont(new Font("Tahoma", Font.BOLD, 40));
		lbltitle.setBounds(99, 0, 668, 110);
		frame.getContentPane().add(lbltitle);
		
		loginpage=new JLabel("LOGIN FORM");
		loginpage.setForeground(Color.WHITE);
		loginpage.setBounds(468, 159, 124, 54);
		loginpage.setHorizontalAlignment(SwingConstants.CENTER);
		loginpage.setBackground(Color.BLACK);
		loginpage.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(loginpage);
		
		username=new JLabel("Username:");
		username.setForeground(Color.WHITE);
		username.setBounds(356, 259, 124, 54);
		username.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(username);
		
		tusername=new JTextField();
		tusername.setBounds(490, 277, 164, 22);
		frame.getContentPane().add(tusername);
		
		password=new JLabel("Password:");
		password.setForeground(Color.WHITE);
		password.setBounds(356, 347, 124, 54);
		password.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(password);
		
		tpassword=new JPasswordField();
		tpassword.setBounds(490, 365, 164, 22);
		frame.getContentPane().add(tpassword);
		
		JButton btnlogin = new JButton("LOGIN");
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnlogin.setBounds(525, 478, 89, 23);
		btnlogin.setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().add(btnlogin);
		
		JButton btnclear = new JButton("CLEAR");
		btnclear.setBounds(259, 478, 89, 23);
		btnclear.setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().add(btnclear);
		
		JButton btnexit = new JButton("EXIT");
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a= JOptionPane.showConfirmDialog(null, "Do you really want to Close Application","Select",JOptionPane.YES_NO_OPTION);
				if(a==0) {
					System.exit(0);
				}
			}
		});
		btnexit.setBounds(658, 478, 89, 23);
		btnexit.setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().add(btnexit);
		
		JButton btnNewButton = new JButton("SIGNUP");
		btnNewButton.setBounds(391, 478, 89, 23);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().add(btnNewButton);
		
		
		
		lblimage = new JLabel("New label");
		lblimage.setIcon(new ImageIcon(LoginForm.class.getResource("/images/ezgif-3-df58dde173.jpg")));
		lblimage.setBounds(0, -24,1200,800);
		frame.getContentPane().add(lblimage); 
		
		
		
	
	}
}
