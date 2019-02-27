
import java.awt.BorderLayout;
import javax.swing.JFrame;
/**
 * 
 * @author laurenmarsillo 500689959
 *
 */
public class Viewer {
	private static JFrame frame;
	
	/**
	 * 
	 * @param args
	 * Main method to create the frame and adding the GraphElementComponent to the frame
	 */
    public static void main(String[] args) {
    	frame = new JFrame();
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,900);
        frame.setTitle("Testing");
        BorderLayout layout = new BorderLayout();
        frame.setLayout(layout);
        final GraphElementComponent comp = new GraphElementComponent();
        comp.setSize(900,900);
        frame.add(comp.panel,BorderLayout.NORTH);
        frame.add(comp,BorderLayout.CENTER);
        frame.add(comp.label);
        frame.setVisible(true);
        
    }  
    
}