package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;

public class aboutWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aboutWindow frame = new aboutWindow();
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
	public aboutWindow() {
		setTitle("About");
		setIconImage(Toolkit.getDefaultToolkit().getImage(aboutWindow.class.getResource("/javax/swing/plaf/metal/icons/ocean/question.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(250, 170);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("About");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(81, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Author:");
		lblNewLabel_1.setBounds(10, 34, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblMilesD = new JLabel("Miles D.");
		lblMilesD.setBounds(30, 51, 46, 14);
		contentPane.add(lblMilesD);
		
		JLabel lblSebastianD = new JLabel("Sebastian D.");
		lblSebastianD.setBounds(30, 67, 70, 14);
		contentPane.add(lblSebastianD);
	}

}
