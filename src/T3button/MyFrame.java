package T3button;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;

    MyFrame() {

        ImageIcon img = new ImageIcon("coronavirus.png");

        button = new JButton();
        button.setBounds(50, 50, 200, 50);
        button.addActionListener(this);
        button.setText("odading");
        button.setFocusable(false);
        button.setBackground(Color.lightGray);
        button.setIcon(img);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(300, 300);
        this.setVisible(true);

        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource()==button){
            System.out.println("heloo");
            button.setEnabled(false);
        }

    }
}
