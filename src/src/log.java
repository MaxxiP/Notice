package src;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


public class log extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	static JProgressBar progressBar;
	static JProgressBar progressBar_1;
	private JButton btnNewButton;
	private JLabel lblNewLabel_2;
	private JTextField textField_2;
	private JScrollPane scroll;
	static JTextArea txtrLogsWillBe = new JTextArea();
	static String source_path;
	static String dest_path;
	private JPasswordField passwordField;
	private JTextField txtId;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					log frame = new log();
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
	public log() {
		setResizable(false);
		setUndecorated(true);
		setTitle("Notice me senpai");
		setIconImage(Toolkit.getDefaultToolkit().getImage(log.class.getResource("/javax/swing/plaf/metal/icons/ocean/collapsed.gif")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setBounds(106, 69, 147, 20);
		contentPane.add(passwordField);
		
		txtId = new JTextField();
		txtId.setHorizontalAlignment(SwingConstants.CENTER);
		txtId.setText("ID");
		txtId.setBounds(106, 39, 147, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Log In");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String puname = txtId.getText();
				@SuppressWarnings("deprecation")
				String ppaswd = passwordField.getText();
				if(puname.equals("") && ppaswd.equals("")) {
					mainWindow window_main =new mainWindow();
					window_main.setVisible(true);
					dispose();
				} else {
					JOptionPane.showMessageDialog(null,"Wrong Password / Username");
					txtId.setText("");
					passwordField.setText("");
					txtId.requestFocus();
				}
			}
		});
		
		btnNewButton_1.setIcon(new ImageIcon(log.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		btnNewButton_1.setBounds(119, 100, 120, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("About");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aboutWindow window_about =new aboutWindow();
				window_about.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(119, 185, 120, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Register");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(119, 151, 120, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Exit");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_4.setBounds(119, 219, 120, 23);
		contentPane.add(btnNewButton_4);
	}

	public void actionPerformed(ActionEvent e) {
	
	}
}
