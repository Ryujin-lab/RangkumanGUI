package T13comboBox;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyFrame extends JFrame implements ActionListener{
	JComboBox comboBox;
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		String [] animals = {"cow", "birb","ant","fish","cat"};
		comboBox = new JComboBox(animals);
//		comboBox.setEditable(true);
		comboBox.addItem("horse");
		comboBox.insertItemAt("pig", 0);
		comboBox.removeItem("cat");
		comboBox.removeItemAt(2);
		comboBox.addActionListener(this);
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == comboBox) {
			System.out.println(comboBox.getSelectedItem());
//			System.out.println(comboBox.getItemCount());
		}
	}
}
