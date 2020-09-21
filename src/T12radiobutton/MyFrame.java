package T12radiobutton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener{
	JRadioButton nasiButton;
	JRadioButton ikanButton;
	JRadioButton sayurButton;
	JRadioButton susuButton;
	JRadioButton buahButton;
	JLabel label;
	JButton resetButton;
	public MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		nasiButton = new JRadioButton("nasi");
		ikanButton = new JRadioButton("ikan");
		sayurButton = new JRadioButton("sayur");
		susuButton = new JRadioButton("susu");
		buahButton = new JRadioButton("buah");
		
		nasiButton.addActionListener(this);
		ikanButton.addActionListener(this);
		sayurButton.addActionListener(this);
		susuButton.addActionListener(this);
		buahButton.addActionListener(this);
		
		ImageIcon originalIcon = new ImageIcon("res/Animals_png_small/Ant.png");
		Image originalImage = originalIcon.getImage();
		Image resizedImage = originalImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		
		ImageIcon semutIcon = new ImageIcon(resizedImage);
		
		nasiButton.setIcon(semutIcon);
		
		ButtonGroup grup = new ButtonGroup();
		grup.add(nasiButton);
		grup.add(ikanButton);
		grup.add(sayurButton);
		grup.add(susuButton);
		grup.add(buahButton);
		
		label = new JLabel("tidak ada yang terpilih");
		resetButton = new JButton("reset");
		resetButton.setFocusable(false);
		resetButton.setBackground(Color.LIGHT_GRAY);
		resetButton.addActionListener(this);
		
		this.add(nasiButton);
		this.add(ikanButton);
		this.add(sayurButton);
		this.add(susuButton);
		this.add(buahButton);
		this.add(label);
		this.add(resetButton);
		
		
		
		this.pack();
		this.setVisible(true);
		this.setSize(new Dimension(200,200));
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stubx
		if (e.getSource()==nasiButton) {
			label.setText("anda memilih nasi");
		}
		else if (e.getSource()==ikanButton) {
			label.setText("anda memilih ikan");
			
		}
		else if (e.getSource()==sayurButton) {
			label.setText("anda memilih sayur");
			
		}
		else if (e.getSource()==susuButton) {
			label.setText("anda memilih susu");
			
		}
		else if (e.getSource()==buahButton) {
			label.setText("anda memilih buah");
			
		}
		else if(e.getSource() == resetButton) {
			label.setText("tidak ada yang terpilih");
		}
		
		
	}
	
}
