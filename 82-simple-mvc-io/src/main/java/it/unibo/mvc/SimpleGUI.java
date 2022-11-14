package it.unibo.mvc;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.BorderLayout;

/**
 * A very simple program using a graphical interface.
 * 
 */
public final class SimpleGUI {

    private final JFrame frame;

    public SimpleGUI(){
        frame = new JFrame();
        frame.setTitle("My first Java graphical interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        final JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        final JTextArea area = new JTextArea();
        final JButton save = new JButton();
        panel.add(area, BorderLayout.AFTER_LAST_LINE);
        panel.add(save, BorderLayout.SOUTH);

        final Controller c = new Controller();

        
    }

    public static void main(final String... args) {
        new SimpleGUI();
     }

}
