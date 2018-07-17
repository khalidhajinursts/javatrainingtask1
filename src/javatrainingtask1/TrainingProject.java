package javatrainingtask1;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.util.*;

public class TrainingProject {

	public static void main(String[] args) {
		TempFrame frame = new TempFrame();
		frame.setTitle("Training Potject");
		frame.setVisible(true);
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class TempFrame extends JFrame implements ActionListener {
	
	private JTextField input, output;
	private JRadioButton Palindrom, reverse, count;
	private JButton enterBtn;
	private JPanel panel1, panel2;
	private ButtonGroup tempGroup;
	
	
	// first Panel for buttons and input
	public TempFrame() {
		panel1 = new JPanel();
		// seconf panel for output
		panel2 = new JPanel();
		// GridLayout for Panel1
		panel1.setLayout(new GridLayout(2, 4));
		panel2.setLayout(new GridLayout(3, 2));
		JLabel Header = new JLabel("Welcome to my frist program");
		tempGroup = new ButtonGroup();
		Palindrom = new JRadioButton("Palindrom");
		Palindrom.addActionListener(this);
		tempGroup.add(Palindrom);
		reverse = new JRadioButton("reverse");
		reverse.addActionListener(this);
		tempGroup.add(reverse);
		count = new JRadioButton("count");
		count.addActionListener(this);
		tempGroup.add(count);
		reverse.setSelected(true);
		
		enterBtn = new JButton("Enter");
		enterBtn.addActionListener(this);
		
		tempGroup.add(enterBtn);
		input = new JTextField("333444");
		input.addActionListener(this);
		panel1.add(Header);
		panel1.add(input);
		panel1.add(enterBtn);

		panel1.add(Palindrom);
		panel1.add(reverse);
		panel1.add(count);
		output = new JTextField("  ");
		output.addActionListener(this);
		panel2.add(output);
		Container contentPane = getContentPane();
		contentPane.add(panel1, "North");
		contentPane.add(panel2, "Center");

	}

	public void actionPerformed(ActionEvent e) {
		//determine if the enterBtn is selected
		Object o = e.getSource();
		String s = o.getClass().toString();
		
		if (e.getSource() == enterBtn) {
			
			//is reverse selected?
			if (reverse.isSelected()) {
				String Treverse = "";
				String Original = input.getText();

				int length = Original.length();

				for (int i = length - 1; i >= 0; i--) {
					Treverse = Treverse + Original.charAt(i);
					output.setText(Treverse);
				}
			}

			else if (Palindrom.isSelected()) {
					
					String Treverse = "";
					String Original = input.getText();
					int length = Original.length();
					 

					for (int i = length - 1; i >= 0; i--) {
						Treverse = Treverse + Original.charAt(i);
					}
					if (Original.equals(Treverse)) 
					{
						output.setText("Palindrom");
					} else {
						output.setText("Not Palindrom");
					}
				}
			

			else if (count.isSelected()) {
					String tempcount = input.getText();
					int countamount = tempcount.length();
					String countString = String.valueOf(countamount);

					output.setText(countString);
				}
			}

		}

	}



