import java.awt.Graphics2D;
import java.awt.geom.Line2D;
/**
 * Creates the Edge class
 * @author laurenmarsillo 500689959
 *
 */
public class Edge extends GraphElement{
	private double xPos;
	private double yPos;
	private double xEnd;
	private double yEnd;
	Line2D.Double line;
	
	/**
	 * Constructor for Edge
	 * @param x start of edge in the x coordinate
	 * @param y start of edge in the y coordinate
	 * @param x2 end of edge in the x coordinate
	 * @param y2 end of edge in the y coordinate
	 */
	public Edge(double x, double y, double x2, double y2){
		xPos = x;
		yPos = y;
		xEnd = x2;
		yEnd = y2;
	}
	
	/**
	 * Method for drawing Edge
	 * @param g2 renders the line
	 */
	void draw(Graphics2D g2) {
		line = new Line2D.Double(xPos, yPos, xEnd, yEnd);
		g2.draw(line);
	}

	
	boolean isClicked(double x, double y) {
		// TODO Auto-generated method stub
		return true;
	}

	
	boolean applyLabel() {
		// TODO Auto-generated method stub
		return false;
	}
}
