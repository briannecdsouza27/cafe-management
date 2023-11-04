import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EXP11 {

	private JFrame frame;
	private JLabel loginpage,username,password;
	private JTextField tusername;
	private JPasswordField tpassword;
	private JLabel lblNewLabel;
	private JLabel lbltitle;
	private JButton btnlogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EXP11 window = new EXP11();
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
	public EXP11() {
		initialize();
		try {
		btnlogin.setEnabled(false);
	}catch(Exception ee) {
		System.out.println(ee);
	}
	}
	public void clear() {
		tusername.setText("");
		tpassword.setText("");
		btnlogin.setEnabled(false);
		
	}
	
	public void validateField() {
		String username=tusername.getText();
		String password=tpassword.getText();
		if(!username.equals("")&&!password.equals("")) {
			btnlogin.setEnabled(true);
		}
		else {
			btnlogin.setEnabled(false);
		}
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 600, 600);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		username=new JLabel("Username:");
		username.setForeground(Color.BLACK);
		username.setBounds(156, 159, 124, 54);
		username.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(username);
		
		tusername=new JTextField();
		tusername.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				
			}
		});
		tusername.setBounds(290, 177, 164, 22);
		frame.getContentPane().add(tusername);
		
		password=new JLabel("Password:");
		password.setForeground(Color.BLACK);
		password.setBounds(156, 247, 124, 54);
		password.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(password);
		
		tpassword=new JPasswordField();
		tpassword.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(tpassword.getText().length()>0) {
					btnlogin.setEnabled(true);
				}else {
					btnlogin.setEnabled(false);
				}
			}
		});
		tpassword.setBounds(290, 265, 164, 22);
		frame.getContentPane().add(tpassword);
		
		JButton btnlogin = new JButton("LOGIN");
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/signup","root","");
					Statement stmt=con.createStatement();
					@SuppressWarnings("deprecation")
					String sql="Select * From signuptable where name='"+tusername.getText()+"' and password='"+tpassword.getText().toString()+"'";
					ResultSet rs=stmt.executeQuery(sql);
					if(rs.next()) {
						JOptionPane.showMessageDialog(null,"Login Successfull");
					setVisible(false);
					
					new Home().setVisible(true);
					
					
					}
						else
						{
							JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
							tusername.setText(null);
							tpassword.setText(null);
								
					con.close();
					}
				}catch(Exception ee) 
				{System.out.print(ee);}
			}	
				
			
		});
		btnlogin.setBounds(449, 330, 89, 23);
		btnlogin.setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().add(btnlogin);
		
		JButton btnNewButton = new JButton("SIGNUP");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				
				Registerpage t=new Registerpage();
				t.setVisible(true);
				
				}catch(Exception p) {
					
				}
			}
		});
		
		btnNewButton.setBounds(182, 330, 89, 23);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().add(btnNewButton);
		
		JButton btnlexit = new JButton("EXIT");
		btnlexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null, "Do you want really want to Close Application","Select",JOptionPane.YES_NO_OPTION);
				if(a==0) {
					System.exit(0);
				}
			}
		});
		btnlexit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnlexit.setBounds(307, 331, 89, 23);
		frame.getContentPane().add(btnlexit);
		
		JButton btnlclear = new JButton("CLEAR");
		btnlclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clear();
			}
		});
		btnlclear.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnlclear.setBounds(307, 390, 89, 23);
		frame.getContentPane().add(btnlclear);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
