package extra;

import javax.swing.JOptionPane;

public class Piday {
	public static void main(String[] args) {
		String pi= "3141592653";
		int d = pi.length();
	System.out.println(pi.charAt(0));
	System.out.println(pi.charAt(1));
	System.out.println(pi.charAt(2));
		
		for(int i = 3; i < pi.length(); i++) {
			System.out.println(pi.charAt(i));
		String ans = JOptionPane.showInputDialog("What is the next digit of Pi?");
		if(ans.equals(pi.charAt(i)+"")) {
			System.out.println(pi.charAt(i));
		JOptionPane.showInputDialog("Good Job. Now whats the next digit of Pi.");
		
		}
		
		
		}
	
	}

}
