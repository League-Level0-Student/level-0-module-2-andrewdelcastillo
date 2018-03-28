import javax.swing.JOptionPane;

public class WordReapeater {
	public static void main(String[] args) {
		
String word = JOptionPane.showInputDialog("Enter a Word");
	String num = JOptionPane.showInputDialog("Enter a number");
	int num1 = Integer.parseInt(word);
	for(int i = num1; num1 < 0; i++ ) 
	System.out.println(word);
	}
}
