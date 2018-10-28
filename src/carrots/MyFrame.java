package carrots;
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;

public class MyFrame extends JFrame{
    public MyFrame(){

        super("My frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,600);

        JButton button = new JButton("Ok");
        button.addActionListener(new ActionListener() {   //można użyć tu wyrażenia lambda
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Click");

            }
        });



        JButton btn1 = new JButton("New button");
//        add(button);
//        add(btn1, BorderLayout.SOUTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,2));
        panel.add(button);
        panel.add(btn1);
        panel.add(new JLabel("Label"));

        add(panel);

        setVisible(true);

    }
}
