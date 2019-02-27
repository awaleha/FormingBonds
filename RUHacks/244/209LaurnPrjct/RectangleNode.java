import java.awt.Graphics2D;
import java.awt.Rectangle;
/**
 * Creates the RectangleNode class
 * @author laurenmarsillo 500689959
 *
 */
public class RectangleNode extends GraphElement{
	
	private int xPos;
	private int yPos;
	Rectangle rect;
	
	/**
	 * Constructor of RectangleNode
	 * @param x coordinate in the x direction of the rectangle
	 * @param y coordinate in the y direction of the rectangle
	 */
	public RectangleNode(int x, int y){
		xPos = x;
		yPos = y;
	}

	/**
	 * Draws the rectangle
	 * @param g2 renders the rectangle
	 */
	void draw(Graphics2D g2) {
		rect = new Rectangle(xPos, yPos, 100, 50);
		g2.draw(rect);
	}
	
	/**
	 * Gets the x coordinate of the rectangle
	 * @return xPos the x coordinate
	 */
	public final double getXPos()
	{
	    return xPos;
	}
	
	/**
	 * Gets the y coordinate of the rectangle
	 * @return yPos the y coordinate
	 */
	public final double getYPos()
	{
	    return yPos;
	}

	/**
	 * Checks if the rectangle has been clicked
	 * @param x the x coordinate of the click
	 * @param y the y coordinate of the click 
	 */
	boolean isClicked(double x, double y) {
		if (rect.contains(x,y)){
			return true;
		}
		else {
			return false;
		}
	}

	boolean applyLabel() {
		// TODO Auto-generated method stub
		return true;
	}
    
    
}
