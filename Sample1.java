
package CV;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sample1 {

 	JFrame frmSample;
	JTextField name;
	JTextField father;
	JTextField phone;
	JTextField email1;
	JTextField homeaddress;
	JTextField gpro;
	JTextField ggrade;
	JTextField gy;
	JTextField ipro;
	JTextField igrade;
	JTextField iy;
	JTextField mpro;
	JTextField mgrade;
	JTextField my;
	JTextField C1;
	JTextField C2;
	JTextField C3;
	JTextField D1;
	JTextField D2;
	JTextField D3;
	JTextField Y1;
	JTextField Y2;
	JTextField Y3;
	JTextField C4;
	JTextField D4;
	JTextField Y4;
	JTextField s1;
	JTextField s2;
	JTextField s3;
	JTextField s4;
	JTextField l1;
	JTextField l3;
	JTextField l2;
	JTextField l4;
	JTextField S1;
	 JTextField S2;
	 JLabel finalphoto;
	 private JLabel lblDob;
	 JTextField Dob;
	 private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sample1 window = new Sample1();
					window.frmSample.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sample1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		@SuppressWarnings("unused")
		Resume_Builder rb=new Resume_Builder();
		
		frmSample = new JFrame();
		frmSample.setBackground(Color.DARK_GRAY);
		frmSample.getContentPane().setBackground(new Color(255, 255, 255));
		frmSample.setType(Type.UTILITY);
		frmSample.setTitle("Sample 1");
		ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/icon.png"));
		frmSample.setIconImage(icon1.getImage());
		frmSample.setBounds(200,0, 713, 798);
		frmSample.getContentPane().setLayout(null);
		
		final JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 23, 697, 736);
		frmSample.getContentPane().add(panel);
		panel.setLayout(null);
		
		name = new JTextField();
		name.setForeground(new Color(50, 105, 225));
		name.setText("        ABC");
		name.setFont(new Font("Arial", Font.BOLD, 34));
		JButton btnView = new JButton("Print");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					@SuppressWarnings("rawtypes")
					Print p = new Print();
					p.print(panel);
			}
		});
		btnView.setBounds(40, 0, 89, 23);
		frmSample.getContentPane().add(btnView);
		name.setBorder(new LineBorder(new Color(255, 255, 255)));
		name.setBounds(40, 21, 406, 48);
		panel.add(name);
		name.setColumns(10);
		
		JLabel lblSo = new JLabel("S.O:");
		lblSo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSo.setBounds(10, 80, 46, 23);
		panel.add(lblSo);
		
		father = new JTextField();
		father.setBorder(new LineBorder(Color.WHITE));
		father.setBounds(50, 83, 199, 20);
		panel.add(father);
		father.setColumns(10);
		
		JLabel phonelogo = new JLabel("");

		phonelogo.setBounds(24, 134, 25, 31);
		Image img1 = new ImageIcon(this.getClass().getResource("/phone.png")).getImage();
		phonelogo.setIcon(new ImageIcon(img1));
		panel.add(phonelogo);
		
		phone = new JTextField();
		phone.setBorder(new LineBorder(Color.WHITE));
		phone.setBounds(48, 142, 201, 20);
		panel.add(phone);
		phone.setColumns(10);
		
		JLabel mail = new JLabel("");

		mail.setBounds(20, 165, 32, 31);
		Image img2 = new ImageIcon(this.getClass().getResource("/mail.png")).getImage();
		mail.setIcon(new ImageIcon(img2));
		panel.add(mail);
		
		JLabel address = new JLabel("");

		address.setBounds(24, 195, 25, 31);
		Image img3 = new ImageIcon(this.getClass().getResource("/address.png")).getImage();
		address.setIcon(new ImageIcon(img3));
		panel.add(address);
		
		email1 = new JTextField();
		email1.setBorder(new LineBorder(Color.WHITE));
		email1.setForeground(new Color(30, 144, 255));
		email1.setBounds(50, 168, 258, 20);
		panel.add(email1);
		email1.setColumns(10);
		
		homeaddress = new JTextField();
		homeaddress.setBorder(new LineBorder(Color.WHITE));
		homeaddress.setBounds(50, 195, 327, 20);
		panel.add(homeaddress);
		homeaddress.setColumns(10);
		
		JLabel label_2 = new JLabel("");
		label_2.setBorder(new LineBorder(new Color(255, 0, 0), 3));
		label_2.setBounds(10, 250, 676, 4);
		panel.add(label_2);
		
		JLabel lblObjectives = new JLabel("OBJECTIVES:");
		lblObjectives.setFont(new Font("Arial", Font.BOLD, 30));
		lblObjectives.setForeground(Color.BLUE);
		lblObjectives.setBackground(Color.WHITE);
		lblObjectives.setBounds(50, 215, 327, 31);
		panel.add(lblObjectives);
		
		JLabel lblOrganizedAndMotivated = new JLabel("Organized and motivated employee able to apply time management and organizational skills in");
		lblOrganizedAndMotivated.setFont(new Font("Arial", Font.PLAIN, 14));
		lblOrganizedAndMotivated.setBounds(50, 265, 636, 23);
		panel.add(lblOrganizedAndMotivated);
		
		JLabel lblAndOrganizationalSkills = new JLabel("various environments. Seeking to join Acme Corp as an administrative assistant to help ensure");
		lblAndOrganizationalSkills.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAndOrganizationalSkills.setBounds(50, 288, 615, 23);
		panel.add(lblAndOrganizationalSkills);
		
		JLabel lblSeekingToJoin = new JLabel("good internal communications and budget management.");
		lblSeekingToJoin.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSeekingToJoin.setBounds(50, 314, 615, 23);
		panel.add(lblSeekingToJoin);
		
		JLabel label_3 = new JLabel("");
		label_3.setBorder(new LineBorder(new Color(255, 0, 0), 3));
		label_3.setBounds(10, 379, 676, 4);
		panel.add(label_3);
		
		JLabel lblAcademicQualification = new JLabel("ACADEMIC QUALIFICATION:");
		lblAcademicQualification.setForeground(Color.BLUE);
		lblAcademicQualification.setFont(new Font("Arial", Font.BOLD, 30));
		lblAcademicQualification.setBackground(Color.WHITE);
		lblAcademicQualification.setBounds(50, 337, 421, 31);
		panel.add(lblAcademicQualification);
		
		JLabel lblProgram = new JLabel("Program:");
		lblProgram.setFont(new Font("Arial", Font.BOLD, 13));
		lblProgram.setBounds(20, 414, 72, 14);
		panel.add(lblProgram);
		
		JLabel lblGrade = new JLabel("Grade:");
		lblGrade.setFont(new Font("Arial", Font.BOLD, 13));
		lblGrade.setBounds(20, 439, 72, 14);
		panel.add(lblGrade);
		
		JLabel lblPassingYear = new JLabel("Passing Year:");
		lblPassingYear.setFont(new Font("Arial", Font.BOLD, 13));
		lblPassingYear.setBounds(20, 466, 94, 14);
		panel.add(lblPassingYear);
		
		JLabel lblGraduation = new JLabel("Graduation:");
		lblGraduation.setForeground(Color.RED);
		lblGraduation.setFont(new Font("Arial", Font.BOLD, 14));
		lblGraduation.setBounds(116, 387, 94, 23);
		panel.add(lblGraduation);
		
		gpro = new JTextField();
		gpro.setBorder(new LineBorder(Color.WHITE));
		gpro.setBounds(119, 412, 127, 20);
		panel.add(gpro);
		gpro.setColumns(10);
		
		ggrade = new JTextField();
		ggrade.setBorder(new LineBorder(Color.WHITE));
		ggrade.setColumns(10);
		ggrade.setBounds(119, 437, 127, 20);
		panel.add(ggrade);
		
		gy = new JTextField();
		gy.setBorder(new LineBorder(Color.WHITE));
		gy.setColumns(10);
		gy.setBounds(119, 464, 127, 20);
		panel.add(gy);
		
		JLabel lblIntermediate = new JLabel("Intermediate:");
		lblIntermediate.setForeground(Color.RED);
		lblIntermediate.setFont(new Font("Arial", Font.BOLD, 14));
		lblIntermediate.setBounds(306, 387, 94, 23);
		panel.add(lblIntermediate);
		
		ipro = new JTextField();
		ipro.setBorder(new LineBorder(Color.WHITE));
		ipro.setColumns(10);
		ipro.setBounds(309, 412, 127, 20);
		panel.add(ipro);
		
		igrade = new JTextField();
		igrade.setBorder(new LineBorder(Color.WHITE));
		igrade.setColumns(10);
		igrade.setBounds(309, 437, 127, 20);
		panel.add(igrade);
		
		iy = new JTextField();
		iy.setBorder(new LineBorder(Color.WHITE));
		iy.setColumns(10);
		iy.setBounds(309, 464, 127, 20);
		panel.add(iy);
		
		JLabel lblMatriculation = new JLabel("Matriculation:");
		lblMatriculation.setForeground(Color.RED);
		lblMatriculation.setFont(new Font("Arial", Font.BOLD, 14));
		lblMatriculation.setBounds(505, 387, 111, 23);
		panel.add(lblMatriculation);
		
		mpro = new JTextField();
		mpro.setBorder(new LineBorder(Color.WHITE));
		mpro.setColumns(10);
		mpro.setBounds(508, 412, 127, 20);
		panel.add(mpro);
		
		mgrade = new JTextField();
		mgrade.setBorder(new LineBorder(Color.WHITE));
		mgrade.setColumns(10);
		mgrade.setBounds(508, 437, 127, 20);
		panel.add(mgrade);
		
		my = new JTextField();
		my.setBorder(new LineBorder(Color.WHITE));
		my.setColumns(10);
		my.setBounds(508, 464, 127, 20);
		panel.add(my);
		
		JLabel lblExperience = new JLabel("EXPERIENCE:");
		lblExperience.setForeground(Color.BLUE);
		lblExperience.setFont(new Font("Arial", Font.BOLD, 30));
		lblExperience.setBackground(Color.WHITE);
		lblExperience.setBounds(50, 495, 210, 31);
		panel.add(lblExperience);
		
		JLabel lblSkills = new JLabel("SKILLS:");
		lblSkills.setForeground(Color.BLUE);
		lblSkills.setFont(new Font("Arial", Font.BOLD, 30));
		lblSkills.setBackground(Color.WHITE);
		lblSkills.setBounds(476, 495, 210, 31);
		panel.add(lblSkills);
		
		C1 = new JTextField();
		C1.setBorder(new LineBorder(Color.WHITE));
		C1.setColumns(10);
		C1.setBounds(24, 524, 151, 20);
		panel.add(C1);
		
		C2 = new JTextField();
		C2.setBorder(new LineBorder(Color.WHITE));
		C2.setColumns(10);
		C2.setBounds(24, 549, 151, 20);
		panel.add(C2);
		
		C3 = new JTextField();
		C3.setBorder(new LineBorder(Color.WHITE));
		C3.setColumns(10);
		C3.setBounds(24, 576, 151, 20);
		panel.add(C3);
		
		D1 = new JTextField();
		D1.setBorder(new LineBorder(Color.WHITE));
		D1.setColumns(10);
		D1.setBounds(185, 524, 127, 20);
		panel.add(D1);
		
		D2 = new JTextField();
		D2.setBorder(new LineBorder(Color.WHITE));
		D2.setColumns(10);
		D2.setBounds(185, 549, 127, 20);
		panel.add(D2);
		
		D3 = new JTextField();
		D3.setBorder(new LineBorder(Color.WHITE));
		D3.setColumns(10);
		D3.setBounds(185, 576, 127, 20);
		panel.add(D3);
		
		Y1 = new JTextField();
		Y1.setBorder(new LineBorder(Color.WHITE));
		Y1.setColumns(10);
		Y1.setBounds(319, 524, 127, 20);
		panel.add(Y1);
		
		Y2 = new JTextField();
		Y2.setBorder(new LineBorder(Color.WHITE));
		Y2.setColumns(10);
		Y2.setBounds(319, 549, 127, 20);
		panel.add(Y2);
		
		Y3 = new JTextField();
		Y3.setBorder(new LineBorder(Color.WHITE));
		Y3.setColumns(10);
		Y3.setBounds(319, 576, 127, 20);
		panel.add(Y3);
		
		C4 = new JTextField();
		C4.setBorder(new LineBorder(Color.WHITE));
		C4.setColumns(10);
		C4.setBounds(24, 600, 151, 20);
		panel.add(C4);
		
		D4 = new JTextField();
		D4.setBorder(new LineBorder(Color.WHITE));
		D4.setColumns(10);
		D4.setBounds(185, 600, 127, 20);
		panel.add(D4);
		
		Y4 = new JTextField();
		Y4.setBorder(new LineBorder(Color.WHITE));
		Y4.setColumns(10);
		Y4.setBounds(319, 600, 127, 20);
		panel.add(Y4);
		
		s1 = new JTextField();
		s1.setBorder(new LineBorder(Color.WHITE));
		s1.setColumns(10);
		s1.setBounds(486, 524, 179, 20);
		panel.add(s1);
		
		s2 = new JTextField();
		s2.setBorder(new LineBorder(Color.WHITE));
		s2.setColumns(10);
		s2.setBounds(486, 549, 179, 20);
		panel.add(s2);
		
		s3 = new JTextField();
		s3.setBorder(new LineBorder(Color.WHITE));
		s3.setColumns(10);
		s3.setBounds(486, 576, 179, 20);
		panel.add(s3);
		
		s4 = new JTextField();
		s4.setBorder(new LineBorder(Color.WHITE));
		s4.setColumns(10);
		s4.setBounds(486, 600, 179, 20);
		panel.add(s4);
		
		JLabel lblLanguages = new JLabel("LANGUAGES:");
		lblLanguages.setForeground(Color.BLUE);
		lblLanguages.setFont(new Font("Arial", Font.BOLD, 30));
		lblLanguages.setBackground(Color.WHITE);
		lblLanguages.setBounds(24, 631, 210, 31);
		panel.add(lblLanguages);
		
		JLabel lblSports = new JLabel("SPORTS:");
		lblSports.setForeground(Color.BLUE);
		lblSports.setFont(new Font("Arial", Font.BOLD, 30));
		lblSports.setBackground(Color.WHITE);
		lblSports.setBounds(476, 631, 210, 31);
		panel.add(lblSports);
		
		l1 = new JTextField();
		l1.setBorder(new LineBorder(Color.WHITE));
		l1.setColumns(10);
		l1.setBounds(24, 668, 127, 20);
		panel.add(l1);
		
		l3 = new JTextField();
		l3.setBorder(new LineBorder(Color.WHITE));
		l3.setColumns(10);
		l3.setBounds(24, 693, 127, 20);
		panel.add(l3);
		
		l2 = new JTextField();
		l2.setBorder(new LineBorder(Color.WHITE));
		l2.setColumns(10);
		l2.setBounds(158, 668, 127, 20);
		panel.add(l2);
		
		l4 = new JTextField();
		l4.setBorder(new LineBorder(Color.WHITE));
		l4.setColumns(10);
		l4.setBounds(158, 693, 127, 20);
		panel.add(l4);
		
		S1 = new JTextField();
		S1.setBorder(new LineBorder(Color.WHITE));
		S1.setColumns(10);
		S1.setBounds(489, 668, 176, 20);
		panel.add(S1);
		
		S2 = new JTextField();
		S2.setBorder(new LineBorder(Color.WHITE));
		S2.setColumns(10);
		S2.setBounds(489, 693, 176, 20);
		panel.add(S2);
		
		finalphoto = new JLabel("");
		finalphoto.setBounds(476, 21, 189, 187);
		panel.add(finalphoto);
		
		lblDob = new JLabel("D.O.B");
		lblDob.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDob.setBounds(10, 114, 37, 14);
		panel.add(lblDob);
		
		Dob = new JTextField();
		Dob.setColumns(10);
		Dob.setBorder(new LineBorder(Color.WHITE));
		Dob.setBounds(50, 111, 199, 20);
		panel.add(Dob);
		Resume_Builder r = new Resume_Builder();
		label = new JLabel("");
		label.setBounds(476, 28, 189, 187);
		if(r.temp1==1) {
			Image img21 = new ImageIcon(this.getClass().getResource("/360_F_323309190_FwaLnwQ0tfL6TZbtvrja2rWXeVp6okGu.jpg")).getImage();
			label.setIcon(new ImageIcon(img21));
		}
		panel.add(label);

	}
}
