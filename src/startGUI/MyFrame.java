package startGUI;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
public class MyFrame extends JFrame{
	public MyFrame() {
		this.setTitle("JFrame title goes here"); //sets title of frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit from application
		this.setResizable(false); //prevent frame from being resized
		this.setSize(420,420);
		this.setVisible(true); 
		this.setLayout(null);

		ImageIcon image = new ImageIcon("logo.png");
		this.setIconImage(image.getImage()); 
		this.getContentPane().setBackground(Color.white); //change color of background

		Border border = BorderFactory.createLineBorder(Color.blue,3);
		
		JLabel label = new JLabel();
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setText("kampret anjg");
		label.setForeground(Color.BLUE);
		// font:
		label.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		// border
		label.setBorder(border);
		//alignment :
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(0,0,200,200);
		label.setBackground(Color.cyan);
		label.setOpaque(true);
		this.add(label);

		image = new ImageIcon("coronavirus.png");
		label.setIcon(image);
	}

}
