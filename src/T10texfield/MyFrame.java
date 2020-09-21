package T10texfield;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;	
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	JTextField textField;
	JButton button;
	public MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		textField= new JTextField();
		textField.setPreferredSize(new Dimension(200,40));
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textField.setForeground(Color.green);
		textField.setBackground(Color.darkGray);
		
		button = new JButton("oke");
		button.setPreferredSize(new Dimension(60,40));
		button.setBackground(Color.LIGHT_GRAY);
		button.setFocusable(false);
		button.addActionListener(this);
		
		this.add(button);
		this.add(textField);
		this.pack();
		this.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource()==button) {
			System.out.println(textField.getText());
			button.setEnabled(false);
			textField.setEditable(false);
		}
		
	}

}
