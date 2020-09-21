package T8newwindow;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Launcher implements ActionListener {
    JFrame frame ;
    JButton button;
    public Launcher() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setSize(200,200);
        frame.setLayout(null);

        button = new JButton("open new window");
        button.setOpaque(true);
        button.setBounds(10,10,180,20);
        button.setFocusable(false);
        button.addActionListener(this);
        frame.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource()==button){
            NewWindow window = new NewWindow();
        }

    }
}
