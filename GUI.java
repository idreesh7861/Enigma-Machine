import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    int count = 0;
    JLabel label;
    public GUI(){

        JFrame frame = new JFrame();

        JButton button = new JButton("Click me");
        button.addActionListener(this);

        label = new JLabel("Number of clicks: " + count);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(10, 3));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("The Enigma Machine");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args){
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }
}
