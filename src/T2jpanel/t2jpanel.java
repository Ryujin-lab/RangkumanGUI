package T2jpanel;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
public class t2jpanel {
    public static void main(String[] args) {

        JPanel panelRed = new JPanel();
        panelRed.setBackground(Color.red);
        panelRed.setBounds(0,0,250,250);
        panelRed.setLayout(null);


        JPanel panelBlue = new JPanel();
        panelBlue.setBackground(Color.blue);
        panelBlue.setBounds(250,0,500,500);
        panelBlue.setLayout(new BorderLayout());

        JPanel panelYellow = new JPanel();
        panelYellow.setBackground(Color.yellow);
        panelYellow.setBounds(0,250,250,250);

        ImageIcon img = new ImageIcon("coronavirus.png");

        JLabel label = new JLabel();
        label.setText("ini corona jamaq");
        label.setIcon(img);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0,0,200,200);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(700,700);
        frame.setVisible(true);
        frame.add(panelRed);
        frame.add(panelBlue);
        frame.add(panelYellow);
        panelRed.add(label);
        // panelRed.add(label);
        // panelYellow.add(label);
    }
}
