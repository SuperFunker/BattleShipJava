package View;
import javax.swing.*;

public class PlayerDetails extends JFrame{
    JFrame f;
    public PlayerDetails(){
        JButton b = new JButton("Test Button");
        b.setSize(200,30);

        add(b);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,200);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setVisible(true);
    }
}
