package T8newwindow;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class NewWindow implements ActionListener{
    JFrame frame;
    JButton button;
    public NewWindow() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setSize(200,200);
        frame.setLayout(null);

        button = new JButton("back to main window");
        button.setOpaque(true);
        button.setBounds(10,10,200,50);
        button.setFocusable(false);
        button.addActionListener(this);
        frame.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            Launcher laucher = new Launcher();
        }

    }
}
