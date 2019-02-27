
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class GraphComp extends JComponent{
    JPanel sidePanel;
    JButton hButt;
    GridLayout experimentLayout;
    JButton liButt;
    JButton beButt;
    JButton naButt;
    JButton mgButt;
    JButton kButt;
    JButton caButt;
    JButton rbButt;
    JButton srButt;
    JButton csButt;
    JButton baButt;
    JButton frButt;
    JButton raButt;
    JButton oButt;
    JButton sButt;
    JButton seButt;
    JButton teButt;
    JButton fButt;
    JButton clButt;
    JButton brButt;
    JButton iButt;
    JButton atButt;
    JLabel flavour;
    JPanel textPanel;
    JPanel drawPanel;
    JMenuBar optionBar;
    ArrayList<Element> elements;

    int drawElem;

    public GraphComp(){
        experimentLayout = new GridLayout(0,2);
        textPanel = new JPanel();
        drawPanel = new JPanel();
        elements = new ArrayList<Element>();
        textPanel.setLayout(new BorderLayout());

        flavour = new JLabel("<html> Fun Fact!:  <br> <br>  ");
        flavour.setBorder(BorderFactory.createLineBorder(Color.black));
        textPanel.add(flavour);

        hButt = new JButton("H");
        liButt = new JButton("Li");
        beButt = new JButton("Be");
        naButt = new JButton("Na");
        mgButt = new JButton("Mg");
        kButt = new JButton("K");
        caButt = new JButton("Ca");
        rbButt = new JButton("Rb");
        srButt = new JButton("Sr");
        csButt = new JButton("Cs");
        baButt = new JButton("Ba");
        frButt = new JButton("Fr");
        raButt = new JButton("Ra");
        oButt = new JButton("O");
        sButt = new JButton("S");
        seButt = new JButton("Se");
        teButt = new JButton("Te");
        fButt = new JButton("F");
        clButt = new JButton("Cl");
        brButt = new JButton("Br");
        iButt = new JButton("I");
        atButt = new JButton("At");
        sidePanel = new JPanel();

        drawPanel.setSize(900,900);
        sidePanel.setSize(100,500);
        sidePanel.setLayout(experimentLayout);

        sidePanel.add(liButt);
        sidePanel.add(beButt);
        sidePanel.add(naButt);
        sidePanel.add(mgButt);
        sidePanel.add(kButt);
        sidePanel.add(caButt);
        sidePanel.add(rbButt);
        sidePanel.add(srButt);
        sidePanel.add(csButt);
        sidePanel.add(baButt);
        sidePanel.add(frButt);
        sidePanel.add(raButt);
        sidePanel.add(oButt);
        sidePanel.add(sButt);
        sidePanel.add(seButt);
        sidePanel.add(teButt);
        sidePanel.add(fButt);
        sidePanel.add(clButt);
        sidePanel.add(brButt);
        sidePanel.add(iButt);
        sidePanel.add(atButt);
        sidePanel.add(hButt);
        hButt.addActionListener(new makeHydrogen());
        clButt.addActionListener(new makeChlorine());

    }

    class mpressListener implements MouseListener{
        int x = 0;
        int y = 0;

        public void mousePressed(MouseEvent e){}
        public void mouseReleased(MouseEvent e){}
        public void mouseEntered(MouseEvent e){}
        public void mouseExited(MouseEvent e){}
        public void mouseClicked(MouseEvent e){
            x = e.getX();
            y = e.getY();

            if (drawElem == 1){
                Element hydrogen = new Element(1, "Hydrogen", "H", "Other nonmetals", false, new Ellipse2D.Double(x - 50, y - 50, 100, 100));
                elements.add(hydrogen);
                repaint();
            }

            if (drawElem == 17){
                Element chlorine = new Element(17, "Chlorine", "Cl", "Halogens", false, new Ellipse2D.Double(x - 50, y - 50, 100, 100));
                elements.add(chlorine);
                repaint();
            }

        }
    }

    class makeHydrogen implements ActionListener {
        public void actionPerformed(ActionEvent event){
            MouseListener drawH = new mpressListener();
            addMouseListener(drawH);
            drawElem = 1;
        }
    }

    class makeChlorine implements ActionListener {
        public void actionPerformed(ActionEvent event){
            MouseListener drawcl = new mpressListener();
            addMouseListener(drawcl);
            drawElem = 17;
        }
    }

    public void paintComponent( Graphics g )
    {
        Graphics2D g2 = (Graphics2D) g;
        for(Element i : elements)
            i.draw(g2);

    }
}