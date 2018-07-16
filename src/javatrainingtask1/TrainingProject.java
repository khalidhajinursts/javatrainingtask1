package javatrainingtask1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JRadioButton;




public class TrainingProject extends JFrame {

    private static void TraingingProject() {
        //Create and set up the window.
        JFrame frame = new JFrame("TrainingPorject");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 200);
        frame.getContentPane().setLayout(new FlowLayout());
        JTextField InPutField = new JTextField();
        frame.getContentPane().add(InPutField);
        InPutField.setPreferredSize(new Dimension(100, 40) );
        JButton btn = new JButton("Enter");
        btn.setPreferredSize(new Dimension(100, 40) );
        frame.getContentPane().add(btn);
      
        JRadioButton btnPalindrome = new JRadioButton("Palindrome");
        frame.getContentPane().add(btnPalindrome);
        JRadioButton btnReverse = new JRadioButton("reverse");
        frame.getContentPane().add(btnReverse);
        JRadioButton btnCount = new JRadioButton("count");
        frame.getContentPane().add(btnCount);
        
 
       
 
      
        //Display the window.
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                TraingingProject();
            }
        });
    }
}

