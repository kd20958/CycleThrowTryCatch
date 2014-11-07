/**
 * 
 * @author Kevin
 * 
 */
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Cycle {
	static double numberOfWheels; // initialize values
	static double weight;	
	
	public Cycle(double numberOfWheels,  double weight) { //constructor
		this.numberOfWheels=numberOfWheels;
		this.weight=weight;
	}
	
	public String toString() { // to string
		return "Cycle [numberOfWheels=" + numberOfWheels + ", weight=" + weight + "]";
	}

	public static void main(String[] args) throws ValueMismatch {
		// TODO Auto-generated method stub	
		JTextField NumberOfWheels = new JTextField(10); // Jpanel and Jtextfield set up
		JTextField Weight = new JTextField(10); 
		JLabel label = new JLabel("Enter integer numerator and denominator to find the quotient.");
		JPanel panel = new JPanel();

		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // panel layout
		panel.add(label);
		panel.add(NumberOfWheels);
		panel.add(Weight);
		
		JOptionPane.showMessageDialog(null, panel); //prompt user to enter the number of wheels and weight
		
		try { //try catch methods
			setData(NumberOfWheels.getText(),Weight.getText());
			}
		catch(Exception ValueMismatch) {
			throw new ValueMismatch("Values cannot be less than or equal to zero");
		}
		
		Cycle c = new Cycle(numberOfWheels, weight); // new cycle
		System.out.println(c.toString());
	}
	
	public static void setData(String NumberOfWheels, String Weight) throws ValueMismatch {
				numberOfWheels = Double.parseDouble(NumberOfWheels); // sets values
				weight = Double.parseDouble(Weight);
				
				if (numberOfWheels<=0 || weight<=0) //throw when the value <= 0
					throw new ValueMismatch("Values cannot be less than or equal to zero");
				}			
			
		}	
		
