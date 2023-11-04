import java.awt.BorderLayout;


import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.User;
import dao.UserDao;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SignUpForm extends JFrame {
	
	public String emailPattern ="^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
	public String MobileNumberPattern="^[0-9]*$";

	private JPanel contentPane;
	private JTextField txtname;
	private JTextField txtemail;
	private JTextField txtMobile;
	private JTextField txtaddress;
	private JTextField txtpassword;
	private JTextField txtquestion;
	private JTextField txtanswer;
	private JButton btnlsave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpForm frame = new SignUpForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public void clear() {
		txtname.setText("");
		txtemail.setText("");
		txtMobile.setText("");
		txtaddress.setText("");
		txtpassword.setText("");
		txtquestion.setText("");
		txtanswer.setText("");
		btnlsave.setEnabled(false);
		
	}
	
	public void validateField() {
		 String name=txtname.getText();
		 String email=txtemail.getText();
		 String mobile=txtMobile.getText();
		 String address=txtaddress.getText();
		 String password=txtpassword.getText();
		 String question=txtquestion.getText();
		 String answer=txtanswer.getText();
		 if(!name.equals("")&& email.matches(emailPattern)&& mobile.matches( MobileNumberPattern)&& mobile.length()==10 && !address.equals("")&& !password.equals("")&&!question.equals("")&& !answer.equals(""))
		     btnlsave.setEnabled(false);
		 else
			 btnlsave.setEnabled(true);
		 
	}
	public SignUpForm() {
		
		
	
		
		 
		 
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200,800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbltitle = new JLabel("Cafe Corner System");
		lbltitle.setBackground(Color.BLACK);
		lbltitle.setForeground(Color.BLACK);
		lbltitle.setFont(new Font("Tahoma", Font.BOLD, 40));
		lbltitle.setBounds(99, 0, 668, 110);
		contentPane.add(lbltitle);
		
		JLabel lblNewLabel = new JLabel("Signup");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(473, 85, 113, 55);
		contentPane.add(lblNewLabel);
		
		JLabel lblname = new JLabel("Name");
		lblname.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblname.setBounds(216, 171, 160, 14);
		contentPane.add(lblname);
		
		JLabel lblemail = new JLabel("Email");
		lblemail.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblemail.setBounds(216, 214, 160, 14);
		contentPane.add(lblemail);
		
		JLabel lblmobile = new JLabel("Mobile No");
		lblmobile.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblmobile.setBounds(216, 263, 160, 14);
		contentPane.add(lblmobile);
		
		JLabel lbladdress = new JLabel("Address");
		lbladdress.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbladdress.setBounds(216, 312, 160, 14);
		contentPane.add(lbladdress);
		
		JLabel lblpassword = new JLabel("Password");
		lblpassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblpassword.setBounds(216, 360, 160, 14);
		contentPane.add(lblpassword);
		
		JLabel lblquestion = new JLabel("Security Question");
		lblquestion.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblquestion.setBounds(216, 409, 160, 29);
		contentPane.add(lblquestion);
		
		JLabel lblanswer = new JLabel("Answer");
		lblanswer.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblanswer.setBounds(216, 467, 160, 14);
		contentPane.add(lblanswer);
		
		txtname = new JTextField();
		txtname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validateField();
			}
		});
		txtname.setBounds(395, 171, 369, 20);
		contentPane.add(txtname);
		txtname.setColumns(10);
		
		txtemail = new JTextField();
		txtemail.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validateField();
			}
		});
		txtemail.setColumns(10);
		txtemail.setBounds(395, 208, 369, 20);
		contentPane.add(txtemail);
		
		txtMobile = new JTextField();
		txtMobile.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validateField();
			}
		});
		txtMobile.setColumns(10);
		txtMobile.setBounds(395, 263, 369, 20);
		contentPane.add(txtMobile);
		
		txtaddress = new JTextField();
		txtaddress.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validateField();
			}
		});
		txtaddress.setColumns(10);
		txtaddress.setBounds(395, 312, 369, 20);
		contentPane.add(txtaddress);
		
		txtpassword = new JPasswordField();
		txtpassword.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validateField();
			}
		});
		txtpassword.setColumns(10);
		txtpassword.setBounds(395, 360, 369, 20);
		contentPane.add(txtpassword);
		
		txtquestion = new JTextField();
		txtquestion.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validateField();
			}
		});
		txtquestion.setColumns(10);
		txtquestion.setBounds(395, 416, 369, 20);
		contentPane.add(txtquestion);
		
		txtanswer = new JTextField();
		txtanswer.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validateField();
			}
		});
		txtanswer.setColumns(10);
		txtanswer.setBounds(395, 461, 369, 20);
		contentPane.add(txtanswer);
		
		JButton btnlclear = new JButton("Clear");
		btnlclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clear();
				
			}
		});
		btnlclear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnlclear.setBounds(497, 517, 89, 23);
		contentPane.add(btnlclear);
		
		JButton btnlsave = new JButton("Save");
		btnlsave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				User user=new User();
				user.setName(txtname.getText());
				user.setEmail(txtemail.getText());
				user.setMobilenumber(txtMobile.getText());
				user.setAddress(txtaddress.getText());
				user.setPassword(txtpassword.getText());
				user.setSecurityquestion(txtquestion.getText());
				user.setAnswer(txtanswer.getText());
				UserDao.save(user);
				clear();
				
				
			}
		});
		btnlsave.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnlsave.setBounds(369, 517, 89, 23);
		contentPane.add(btnlsave);
		
		JButton btnlexit = new JButton("Exit");
		btnlexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null, "Do you want really want to Close Application","Select",JOptionPane.YES_NO_OPTION);
				if(a==0) {
					System.exit(0);
				}
			}
		});
		btnlexit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnlexit.setBounds(606, 517, 89, 23);
		contentPane.add(btnlexit);
		
		JButton btnllogin = new JButton("Login");
		btnllogin.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnllogin.setBounds(722, 517, 89, 23);
		contentPane.add(btnllogin);
		
		
	}
}
