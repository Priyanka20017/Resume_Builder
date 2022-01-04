package CV;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Window.Type;

public class About {

	JFrame frmAbout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About window = new About();
					window.frmAbout.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public About() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAbout = new JFrame();
		frmAbout.setType(Type.UTILITY);
		frmAbout.setTitle("About");
		frmAbout.getContentPane().setBackground(new Color(250, 250, 210));
		frmAbout.setBounds(400, 100, 450, 247);
		frmAbout.getContentPane().setLayout(null);
		
		JLabel lblAboutApp = new JLabel("About App");
		lblAboutApp.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAboutApp.setBounds(166, 11, 137, 43);
		frmAbout.getContentPane().add(lblAboutApp);
		
		JTextArea txtrH = new JTextArea();
		txtrH.setEditable(false);
		txtrH.setBackground(new Color(250, 250, 210));
		txtrH.setText("ID : 025-18-11129");
		txtrH.setBounds(21, 65, 403, 33);
		frmAbout.getContentPane().add(txtrH);
		
		JTextArea txtrOopLabProject = new JTextArea();
		txtrOopLabProject.setEditable(false);
		txtrOopLabProject.setBackground(new Color(250, 250, 210));
		txtrOopLabProject.setText("Java lab Project: Resume Builder");
		txtrOopLabProject.setBounds(21, 98, 403, 22);
		frmAbout.getContentPane().add(txtrOopLabProject);
		
		JTextArea txtrUserNameIqra = new JTextArea();
		txtrUserNameIqra.setEditable(false);
		txtrUserNameIqra.setBackground(new Color(250, 250, 210));
		txtrUserNameIqra.setText("User Name: Priyanka ");
		txtrUserNameIqra.setBounds(21, 131, 380, 27);
		frmAbout.getContentPane().add(txtrUserNameIqra);
		
		JTextArea txtrPasswordIqra = new JTextArea();
		txtrPasswordIqra.setEditable(false);
		txtrPasswordIqra.setBackground(new Color(250, 250, 210));
		txtrPasswordIqra.setText("Password: priyanka08");
		txtrPasswordIqra.setBounds(21, 166, 391, 33);
		frmAbout.getContentPane().add(txtrPasswordIqra);
	}
}
