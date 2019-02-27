import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * Creates the GraphElements according to the MouseListener class and ActionListeners classes
 * @author laurenmarsillo 500689959
 *
 */
public class GraphElementComponent extends JComponent{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<GraphElement> shapes;
	JPanel panel;
	JPanel panel2;
	JButton rButton;
	JButton eButton;
	JButton edButton;
	JButton lButton;
	JLabel label;
	JTextField input;
	ActionListener mRect;
	ActionListener mElip;
	ActionListener mEdge;
	ActionListener mLabel;
	int drawshape;
	
	/**
	 * Constructor for the GraphElementComponent
	 * Declares the ActionListeners, panel, and buttons
	 * Adds the ActionListeners to the buttons and the buttons to the panel
	 */
	public GraphElementComponent(){
		shapes = new ArrayList<GraphElement>();
		rButton = new JButton("Rectangle");
		eButton = new JButton("Ellipse");
		edButton = new JButton("Edge");
		lButton = new JButton("Label");
		input = new JTextField(10);
		label = new JLabel();
		panel = new JPanel();
		panel.setSize(900,900);
		panel.add(rButton);
		panel.add(eButton);
		panel.add(edButton);
		panel.add(lButton);
		panel.add(input);
		add(label);
		panel.setVisible(true);
		mRect = new makeRectangle();
	    rButton.addActionListener(mRect);
	    mElip = new makeEllipse();
	    eButton.addActionListener(mElip);
	    mEdge = new makeEdge();
	    edButton.addActionListener(mEdge);
	    mLabel = new makeLabel();
	    lButton.addActionListener(mLabel);
	}
	
	/**
	 * Implements MouseListener and specifies what each mouse function does
	 */
	class MPressListener implements MouseListener {
		int x = 0;
		int y = 0;
		int x2 = 0;
		int y2 = 0;
		
		/**
		 * Starts the edge GraphElement when the mouse is pressed down
		 * @param e listens for the mouse press
		 */
		public void mousePressed(MouseEvent e) {
			if (drawshape == 2){
				x = e.getX();
				y = e.getY();
			}
		}
		/**
		 * Ends the GraphElement edge when the mouse is released
		 * @param e listens for the mouse release
		 */
		public void mouseReleased(MouseEvent e) {
			if (drawshape == 2){
				x2 = e.getX();
				y2 = e.getY();
				GraphElement edge = new Edge(x, y, x2, y2);
				shapes.add(edge);
				repaint();
				drawshape = 4;
			}
		}	
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		/**
		 * Creates RectangleNode and EllipseNode when mouse is clicked
		 * @param e listens when the mouse is clicked
		 */
		public void mouseClicked(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			if (drawshape == 0){
				GraphElement rectangle = new RectangleNode(x,y);
				shapes.add(rectangle);
				repaint();
				drawshape = 4;
			}
			else if (drawshape == 1){
				GraphElement elip = new EllipseNode(x,y);
				shapes.add(elip);
				repaint();
				drawshape = 4;
			}		
			if (e.isMetaDown()){			
				for (GraphElement element : shapes){
					if(x >= element.getXPos() && x <= element.getXPos()+100 && y >= element.getYPos() && y <= element.getYPos()+50 ){
						shapes.remove(element);
						break;
					}
				}
			}
			repaint();
		}
	}
	
	/**
	 * Creates a MouseListener when the ActionListener is called.
	 * Used to create the rectangle
	 */
	class makeRectangle implements ActionListener{
        public void actionPerformed(ActionEvent event){
	       	MouseListener drawRect = new MPressListener();
	  	    addMouseListener(drawRect);
	  	    drawshape = 0;
	    }
	} 
	
	/**
	 * Creates a MouseListener when the ActionListener is called.
	 * Used to create the Ellipse
	 */
	class makeEllipse implements ActionListener{
	    public void actionPerformed(ActionEvent event){
	      	MouseListener drawElip = new MPressListener();
	      	addMouseListener(drawElip);
	  	    drawshape = 1;
	    }
	}
	
	/**
	 * Creates a MouseListener when the ActionListener is called.
	 * Used to create the edge
	 */
    class makeEdge implements ActionListener{
    	public void actionPerformed(ActionEvent event){
	       	MouseListener drawEdge = new MPressListener();
	  	    addMouseListener(drawEdge);
	  	    drawshape = 2;
	    }
    }
    
    /**
     *Creates an ActionListener for the Label button
     */
    class makeLabel implements ActionListener{
    	public void actionPerformed(ActionEvent event){
    		label.setLocation(400,0);
    		String text = input.getText();
    		label.setText(text);
	    }
    }
    
    /**
     * Paints the GraphComponents in the shapes arraylist
     * @param g constructs the Graphics object for drawing the GraphElements
     */
	public void paintComponent (Graphics g){
		Graphics2D g2 = (Graphics2D) g;
	    for(GraphElement element : shapes)
	    	element.draw(g2);
	}
}
