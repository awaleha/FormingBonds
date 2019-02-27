import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
/**
 * Creates the EllipseNode Class
 * @author laurenmarsillo 500689959
 *
 */
public class EllipseNode extends GraphElement{
	
	private double xPos;
	private double yPos;
	Ellipse2D.Double elip;
	/**
	 * Constructor for EllipseNode
	 * @param x coordinate in the x direction of the ellipse
	 * @param y coordinate in the y direction of the ellipse
	 */
	public EllipseNode(int x, int y){
		xPos = x;
		yPos = y;
	}

	/**
	 * Draws the Ellipse
	 * @param g2 renders the ellipse
	 */
	void draw(Graphics2D g2) {
		elip = new Ellipse2D.Double(xPos, yPos, 100, 50);
		g2.draw(elip);
	}
	
	/**
	 * Gets the x coordinate of the ellipse
	 * @return xPos the x coordinate
	 */
	public final double getXPos()
	{
	    return xPos;
	}
	
	/**
	 * Gets the y coordinate of the ellipse
	 * @return yPos the y coordinate
	 */
	public final double getYPos()
	{
	    return yPos;
	}

	/**
	 * Checks if the ellipse has been clicked
	 * @param x the x coordinate of the click
	 * @param y the y coordinate of the click 
	 */
	boolean isClicked(double x, double y) {
		if (elip.contains(x,y)){
			return true;
		}
		else{
			return false;
		}
	}

	boolean applyLabel() {
		// TODO Auto-generated method stub
		return true;
	}
}
