import javax.swing.JOptionPane;
public class RandomGuessMatch 
{
	public static void main (String [] args)
	{
		int random = 1+(int)(Math.random()*5);
		

		String input = JOptionPane.showInputDialog(null, "Please enter your number from 1 to 5");
		int userNumber = Integer.parseInt(input);
		
		int difference = random-userNumber;
		JOptionPane.showMessageDialog(null, "The difference is " +difference);
		
		boolean isEqual = (random==userNumber);
		JOptionPane.showMessageDialog(null, "Your guess was " +isEqual);
		
		
	}
}
