package javatrainingtask1;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;




public class TrainingProject {
    	
    public static void main(String[] args)
    {
    	TempFrame frame= new TempFrame();
    	frame.setTitle("Training Potject");
    	frame.setVisible(true);
    	
    }
    	
        
    }
    class TempFrame extends JFrame implements ActionListener
    {
    	// first Panel for buttons and input
    	public TempFrame() {
    	JPanel panel1= new JPanel();
    	// seconf panel for output
    	JPanel panel2=new JPanel();
    	//GridLayout for Panel1
    	panel1.setLayout( new GridLayout(1,2));
    	panel2.setLayout( new GridLayout(3,2));
    	ButtonGroup tempGroup = new ButtonGroup();
    	JRadioButton Palindrom = new JRadioButton("Palindrom");
    	Palindrom.addActionListener(this);
    	tempGroup.add(Palindrom);
    	JRadioButton reverse= new JRadioButton("reverse");
    	reverse.addActionListener(this);
    	tempGroup.add(reverse);
    	JRadioButton count = new JRadioButton("count");
    	count.addActionListener(this);
    	tempGroup.add(count);
    	Palindrom.setSelected(true);
    	JButton Enter = new JButton("Enter");
    	Enter.addActionListener(this);
    	tempGroup.add(Enter);
    	JTextField input = new JTextField();
    	panel1.add(input);
    	panel1.add(Enter);
    	
    	panel1.add(Palindrom);
    	panel1.add(reverse);
    	panel1.add(count);
    	JTextField output = new JTextField();
    	panel2.add(output);
    	Container contentPane = getContentPane();
    	contentPane.add(panel1, "North");
    	contentPane.add(panel2, "Center");
    	
    	
    	
    	}
    
    public void actionPerformed( ActionEvent e)
    	
    {
    	if (e.getSource()== Enter)
    	{
    		if( reverse.isSelected() )
    		{
    			String Treverse = null;
    			String Original= input.getText();
    			
    			int length= Original.length();
    			
    			for(int i= length-1; i>0; i--)
    			{
    				 Treverse = Treverse + Original.charAt(i);
    				 output.setText(Treverse);
    			}
    				
    			
    		}
    	}
    	
    }
    
    private JTextField input, output;
    private JRadioButton Palindrom, reverse, count;
    private JButton Enter;
    private JPanel panel1, panle2;
    private ButtonGroup tempGaroup;
  }


