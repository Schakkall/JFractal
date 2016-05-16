package JavaFractal.Main;

import JavaFractal.GUI.Printer;
import JavaFractal.JFractal;

public class Main {

	public static void main(String[] args) throws Exception {
		JFractal myFractal = new JFractal(".\\res\\fractal.pl");	
		
		final Printer screen = new Printer(myFractal.getSolutionAsASetOfLines(7));
		screen.setVisible(true);
		
		System.out.println(myFractal.getGoal());
	}

}
