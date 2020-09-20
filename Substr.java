package ch09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.security.Key;

public class Substr extends JFrame {
    JLabel la = new JLabel("Hello World");
    Container c;
    public Substr(){
        setTitle("Hello World");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        c = getContentPane();
        la.setSize(50,20);
        c.add(la);
        c.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                String s = la.getText();
                int cntl = 0;
                int cntr = s.length();
                int KeyCode = e.getKeyCode();

                if(KeyCode == KeyEvent.VK_LEFT){
                    cntl++;
                    la.setText(s.substring(cntl)+s.substring(0,cntl));
                }
                else if(KeyCode == KeyEvent.VK_RIGHT){
                    cntr--;
                    la.setText(s.substring(cntr)+s.substring(0,cntr));
                }
            }
        });
        c.setFocusable(true);
        c.requestFocus();
    }
    public static void main(String[] args) {
    new Substr();
    }
}
