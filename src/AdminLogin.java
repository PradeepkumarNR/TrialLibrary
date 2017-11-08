import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;

public class AdminLogin extends JFrame {
	static AdminLogin frame;
	private JTextField textfieled;
	private JPasswordField passwordfield;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				try {
					frame = new AdminLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}

		});
	}

	public AdminLogin() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel labelAdminLoginForm = new JLabel("Admin Login Form");
		labelAdminLoginForm.setForeground(Color.GRAY);
		labelAdminLoginForm.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JLabel labelEnterName = new JLabel("Enter name:");

		JLabel labelEnterPassword = new JLabel("Enter Password:");

		textfieled = new JTextField();
		textfieled.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textfieled.getText();
				String password = String.valueOf(passwordfield.getPassword());
				if (name.equals("admin") && password.equals("admin123")) {
					AdminSuccess.main(new String[] {});
					frame.dispose();
				} else {
					JOptionPane.showMessageDialog(AdminLogin.this, "Sorry "
							+ "User name or Password is not matching",
							password, JOptionPane.ERROR_MESSAGE);
					textfieled.setText("");
					passwordfield.setText("");
				}

			}
		});

		passwordfield = new JPasswordField();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().
										addGap(124).
										addComponent(labelAdminLoginForm))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(19)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(labelEnterName)
												.addComponent(labelEnterPassword))
								.addGap(47)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(passwordfield)
										.addComponent(textfieled, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))))
						.addContainerGap(107, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
						.addContainerGap(187, Short.MAX_VALUE)
						.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addGap(151))

		);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addComponent(labelAdminLoginForm)
						.addGap(26)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(labelEnterName)
								.addComponent(textfieled, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE))
						.addGap(28)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(labelEnterPassword)
								.addComponent(passwordfield, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(80, Short.MAX_VALUE)));

	}

}
