package T9optionpane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class OptionPane {
	public static void main(String[] args) {
//		JOptionPane.showMessageDialog(null, "this some useles machine", "title1", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "this some useles machine", "title1", JOptionPane.ERROR_MESSAGE);
//		JOptionPane.showMessageDialog(null, "this some useles machine", "title1", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "this some useles machine", "title1", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "this some useles machine", "title1", JOptionPane.INFORMATION_MESSAGE);
	
//		System.out.println(JOptionPane.showConfirmDialog(null, "asu kabeh", "confirm messange", JOptionPane.YES_NO_CANCEL_OPTION));
		
//		String name = JOptionPane.showInputDialog("input your name");
//		System.out.println(name);
		ImageIcon icon= new ImageIcon("coronavirus.png");
		String [] response = {"satu", "dua", "tiga", "empat"};
		
		System.out.println(JOptionPane.showOptionDialog(null, "apa ni?", 
				"pesan rahasia dong", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, 
				icon, response, 0));
		
	}
}
