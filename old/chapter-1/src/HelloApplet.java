/**
 * Created by udayanga on 3/15/16.
 */

import java.awt.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.*;
import javax.swing.border.Border;

public class HelloApplet extends JApplet{
    public void init(){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                setLayout(new BorderLayout());
                JLabel label=new JLabel(getParameter("greeting"),SwingConstants.CENTER);
                label.setFont(new Font("Serif",Font.BOLD,18));
                add(label, BorderLayout.CENTER);

                JPanel panel=new JPanel();

                JButton cayButton =  new JButton("Cay Horstman");
                //cayButton.addActionListener(makeAction(""));

            }
        });
    }
}

