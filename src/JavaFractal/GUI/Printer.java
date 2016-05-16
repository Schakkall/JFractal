package JavaFractal.GUI;

import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import javax.swing.JFrame;

import JavaFractal.Line;

public class Printer extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Line> lines;
	
	public Printer(ArrayList<Line> lines) {
		super();
		this.lines = lines;
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(800,600);
	    this.setResizable(false);   
		this.setLocationRelativeTo(null);
	}

	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		if (this.lines != null)
			for (Line line : this.lines){
				g2d.draw(new Line2D.Double(line.getX1(), line.getY1(), line.getX2(), line.getY2()));
			}
		
		g2d.dispose();
	}
	
}
