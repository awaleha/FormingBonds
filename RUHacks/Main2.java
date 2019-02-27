
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by laurenmarsillo on 2017-03-17.
 */
public class Main2 extends JFrame{
    static JButton hButt;
    static GridLayout experimentLayout;
    static JButton liButt;
    static JButton beButt;
    static JButton naButt;
    static JButton mgButt;
    static JButton kButt;
    static JButton caButt;
    static JButton rbButt;
    static JButton srButt;
    static JButton csButt;
    static JButton baButt;
    static JButton frButt;
    static JButton raButt;
    static JButton oButt;
    static JButton sButt;
    static JButton seButt;
    static JButton teButt;
    static JButton fButt;
    static JButton clButt;
    static JButton brButt;
    static JButton iButt;
    static JButton atButt;
    static JLabel flavour;
    static JPanel textPanel;
    static JPanel drawPanel;
    static JMenuBar optionBar;
    static JMenu options;

    

    public static void main(String args[])
    {
        new Main2().setVisible(true);
        new Main2(true).setVisible(true);
        System.out.println("yup");

    }

    private Main2(){ //Main Frame
        textPanel = new JPanel();
        drawPanel = new JPanel();
        optionBar = new JMenuBar();
        options = new JMenu("Options");
        optionBar.add(options);
        
        textPanel.setLayout(new BorderLayout());
        setSize(800, 800);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        flavour = new JLabel("<html> Fun Fact!:  <br> <br>  ");
        flavour.setBorder(BorderFactory.createLineBorder(Color.black));
        textPanel.add(flavour);
        drawPanel.setLayout(new BorderLayout());
        drawPanel.add(optionBar, BorderLayout.NORTH);
        drawPanel.setBackground(Color.blue);
        add(drawPanel, BorderLayout.CENTER);
        add(textPanel, BorderLayout.SOUTH);
        
    }

    private Main2(boolean x){ //Side Frame for Buttons
        experimentLayout = new GridLayout(0,2);
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
        JPanel panelButtons = new JPanel();
        panelButtons.setSize(200,400);

        panelButtons.setLayout(experimentLayout);

        panelButtons.add(hButt);
        panelButtons.add(liButt);
        panelButtons.add(beButt);
        panelButtons.add(naButt);
        panelButtons.add(mgButt);
        panelButtons.add(kButt);
        panelButtons.add(caButt);
        panelButtons.add(rbButt);
        panelButtons.add(srButt);
        panelButtons.add(csButt);
        panelButtons.add(baButt);
        panelButtons.add(frButt);
        panelButtons.add(raButt);
        panelButtons.add(oButt);
        panelButtons.add(sButt);
        panelButtons.add(seButt);
        panelButtons.add(teButt);
        panelButtons.add(fButt);
        panelButtons.add(clButt);
        panelButtons.add(brButt);
        panelButtons.add(iButt);
        panelButtons.add(atButt);
        add(panelButtons);
        setTitle("Elements");
        setSize(100, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
