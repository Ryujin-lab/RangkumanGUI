package T11checkbox;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	JButton button;
	JCheckBox checkBox;
	ImageIcon trIcon;
	ImageIcon flIcon;
	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		trIcon = new ImageIcon("c2.png");
		flIcon = new ImageIcon("c1.png");
		
		checkBox= new JCheckBox();
		checkBox.setText("im not corona-chan");
		checkBox.setFocusable(false);
		
		checkBox.setIcon(flIcon);
		checkBox.setSelectedIcon(trIcon);
		
		
		button = new JButton("submit");
		button.addActionListener(this);
		
		this.add(checkBox);
		this.add(button);
		
		this.pack();
		this.setVisible(true);
		this.setSize(200,200);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource()==button) {
			System.out.println(checkBox.isSelected());
		}
	}
}
