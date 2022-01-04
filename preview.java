package CV;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.LineBorder;

public class preview extends JFrame {

	private JPanel contentPane;
	public JProgressBar progressBar;
	public JLabel label;
	private JLabel label_1;
	public JLabel lblWelcome;
	public JPanel panel;
	private JLabel lblLoading;

	public preview() {
		setUndecorated(true);
		setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 562, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(0, -11, 603, 515);
		contentPane.add(panel);
		panel.setLayout(null);
		
		progressBar = new JProgressBar();
		progressBar.setBorder(new LineBorder(Color.DARK_GRAY));
		progressBar.setForeground(new Color(0, 255, 127));
		progressBar.setBackground(new Color(32,32,32));
		progressBar.setBounds(23, 427, 519, 23);
		panel.add(progressBar);
		
		label = new JLabel("0%");
		label.setForeground(new Color(0, 206, 209));
		label.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(270, 373, 48, 32);
		panel.add(label);
		

		Icon icon2 = new ImageIcon(this.getClass().getResource("/pro.gif"));
		label_1 = new JLabel(icon2);
		label_1.setBounds(10, 110, 529, 223);
		panel.add(label_1);
		
		lblWelcome = new JLabel("Welcome to Resume Builder");
		lblWelcome.setForeground(new Color(255, 255, 255));
		lblWelcome.setFont(new Font("Times New Roman", Font.BOLD, 36));
		lblWelcome.setBounds(47, 44, 492, 42);
		panel.add(lblWelcome);
		
		lblLoading = new JLabel("Loading.....");
		lblLoading.setForeground(Color.CYAN);
		lblLoading.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblLoading.setBounds(269, 344, 72, 23);
		panel.add(lblLoading);
		
	}
}
