package T4BorderLayout;
import javax.swing.*;
import java.awt.*;
public class t4borderlayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(700,700);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout(10,15));

        JPanel[] panel = new JPanel[5];
        panel[0] = new JPanel();
        panel[1] = new JPanel();
        panel[2] = new JPanel();
        panel[3] = new JPanel();
        panel[4] = new JPanel();
        
        

        panel[0].setBackground(Color.red);
        panel[1].setBackground(Color.green);
        panel[2].setBackground(Color.yellow);
        panel[3].setBackground(Color.magenta);
        panel[4].setBackground(Color.blue);

        for (int i = 0; i<5; i++){
            panel[i].setPreferredSize(new Dimension(100,100));
        }
        
        panel[4].setSize(new Dimension(300,300));

        frame.add(panel[0], BorderLayout.NORTH);
        frame.add(panel[1], BorderLayout.SOUTH);
        frame.add(panel[2], BorderLayout.WEST);
        frame.add(panel[3], BorderLayout.EAST);
        frame.add(panel[4], BorderLayout.CENTER);
    }
}
