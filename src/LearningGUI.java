import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class LearningGUI extends JFrame implements ActionListener {
    public static double a ,b;

    // Create JLabels
    JLabel label =new JLabel("Please enter two numbers.");

    // Create JPanels
    JPanel panel1 = new JPanel();

    // Create basic button saying Calculate
    JButton button= new JButton("Calculate");

    // Enter TextFields
    JTextField Text1= new JTextField();
    JTextField Text2= new JTextField();

    // Create our other panels
    JPanel panel2 = new JPanel();
    JPanel panel3= new JPanel();

    // Create the last panel
    JPanel finalpanel = new JPanel();
    public LearningGUI(){
        button.addActionListener(this);
        panel1.add(label);
        panel2.add(Text1);
        panel2.add(Text2);
        panel2.setLayout(new GridLayout(1,2));
        panel3.add(button);
        finalpanel.setLayout(new GridLayout(3,1));
        finalpanel.add(panel1);
        finalpanel.add(panel2);
        finalpanel.add(panel3);
        add(finalpanel);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            JOptionPane.showMessageDialog(null,"The total of the two numbers is "+ Calculation()+ "now that you can continue with other calculations");
        }


    }
    public double Calculation(){
        a=Double.parseDouble(Text1.getText());
        b=Double.parseDouble(Text2.getText());

        return a+b;
    }
}