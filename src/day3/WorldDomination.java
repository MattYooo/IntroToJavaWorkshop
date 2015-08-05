package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String answer=JOptionPane.showInputDialog("do u now cod");
		// 2. If they say "yes", tell them they will rule the world.
		if(answer.equals("yee")){JOptionPane.showMessageDialog(null, "u gone rul wurld fur evr");}
		// 3. Otherwise, wish them good luck washing dishes.
		else {JOptionPane.showMessageDialog(null, "psh goood luck wushing dishes mayun");
			
		}
	}
}

