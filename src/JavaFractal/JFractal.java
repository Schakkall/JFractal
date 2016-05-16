package JavaFractal; 

import java.io.FileInputStream;
import alice.tuprolog.*;
import java.util.ArrayList;

public class JFractal {
	
	private Prolog engine;
	private Theory theory;
	private Term   goal;
		
	public JFractal(String theoryPath) throws Exception {
		this.engine = new Prolog();
		
		FileInputStream theoryStream = new FileInputStream(theoryPath);
		this.theory	= new Theory(theoryStream);
		
		this.engine.setTheory(theory);
	}
	
	private Term setGoal(int depth) {
		return this.goal = new Struct("fractal", new Int(depth), new Var("X"));
	}
	
	public String getGoal() {
		return this.goal.toString();
	}
		
	public String getSolutionAsAString(int depth) throws Exception {
		SolveInfo info = this.engine.solve(this.setGoal(depth));
		return (info.isSuccess()) ? this.bindClear(info.toString())  : null; 
	}
	
	public ArrayList<Line> getSolutionAsASetOfLines(int depth) throws Exception {
		SolveInfo info = this.engine.solve(this.setGoal(depth));
		
		if (!info.isSuccess())
			return null;
		
		ArrayList<Line> lines = new ArrayList<Line>();
		
		String aux = this.bindClear(info.toString());
		String[] partsOfAux = aux.split("],");

		for (int i = 0; i < partsOfAux.length; i++) {
			lines.add(new Line(partsOfAux[i].replace("[", "").replace("]", "")));
		}
		
		return lines;
	}
	
	private String bindClear(String bind) {
		return bind.substring(9);
	}
	
}
