package ch09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Mme extends JFrame {
    JLabel la = new JLabel("마우스를 올리세요");
    Container c;
    public Mme() {
        setTitle("Mme");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        c = getContentPane();
        c.setLayout(new FlowLayout());

        la.setSize(50,50);

        la.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                la.setText("컴퓨터공학과");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                la.setText("동명대학교");
            }
        });

        c.add(la);
    }
    public static void main(String[] args) {
        new Mme();
    }
}
