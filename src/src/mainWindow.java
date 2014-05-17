package src;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Toolkit;


public class mainWindow extends JFrame {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public static void main(String[] args) {
}

JLabel welcome = new JLabel("Welcome to a New Frame");
JPanel panel = new JPanel();

mainWindow(){
super("Welcome");
setIconImage(Toolkit.getDefaultToolkit().getImage(mainWindow.class.getResource("/javax/swing/plaf/metal/icons/ocean/menu.gif")));
setSize(1024,720);
setResizable(false);
setLocationRelativeTo(null);
panel.setLayout (null); 

welcome.setBounds(70,50,150,60);

panel.add(welcome);

getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}

}