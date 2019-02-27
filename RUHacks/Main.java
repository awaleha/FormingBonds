
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by laurenmarsillo on 2017-03-17.
 */
public class Main extends JFrame{

       /*
    ArrayList<JButton> buttons = new ArrayList<JButton>();

    buttons.add(JButton hButt = new JButton("H"));
    buttons.add(JButton liButt = new JButton("Li"));
    buttons.add(JButton beButt = new JButton("Be"));
    buttons.add(JButton naButt = new JButton("Na"));
    buttons.add(JButton mgButt = new JButton("Mg"));
    buttons.add(JButton kButt = new JButton("K"));
    buttons.add(JButton caButt = new JButton("Ca");
    buttons.add(JButton rbButt = new JButton("Rb"));
    */


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

    /*

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
*/

    public static void main(String args[])
    {
        new Main().setVisible(true);
        System.out.println("yup");

    }

    private Main(){
        setSize(1000, 800);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //setLayout(new BorderLayout());
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
        JPanel panelDisplay = new JPanel();
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
        //panel.add(experimentLayout);
    
        panelButtons.setBackground(Color.BLUE);

        //panelButtons.setLocation(500,500);
        add(panelButtons);
        //add(panelDisplay, BorderLayout.WEST);
    }

}
