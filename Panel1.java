import javax.swing.*;
import java.awt.*;

public class Panel1 {

    public static void main(String[] args) {
        Panel1 gui = new Panel1();
        gui.los();
    }

    public void los() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        JButton button = new JButton("hau drauf");
        JButton button2 = new JButton("Lukas");
        JButton button3 = new JButton("wie jetzt?");

        panel.add(button);
        panel.add(button2);
        panel.add(button3);

        frame.add(BorderLayout.EAST, panel);
        frame.setSize(250, 200);
        frame.setVisible(true);

    }

}