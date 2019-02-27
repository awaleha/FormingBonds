import java.awt.*;
import java.awt.geom.Ellipse2D;

/*
 * Created by laurenmarsillo on 2017-03-17.
 */
public class Element {

    int electrons;
    String name;
    String symbol;
    String group;
    boolean metal;
    Ellipse2D.Double outerring;

    public Element(int electrons, String name, String symbol, String group, boolean metal, Ellipse2D.Double outerring){
        this.electrons = electrons;
        this.name = name;
        this.symbol = symbol;
        this.group = group;
        this.metal = metal;
        this.outerring = outerring;
    }

    public String getName() {
        return name;
    }
    public int getElectrons(){
        return electrons;
    }

    public String getGroup(){
        return group;
    }

    public boolean isMetal() {
        return metal;
    }

    public String getSymbol(){
        return symbol;
    }

    public int getOuterElectrons(){
        if (electrons <= 2)
        {
            return electrons;
        }
        else if (electrons > 2 && electrons <= 10)
        {
            return electrons - 2;
        }
        int e = electrons - 2;
        while (e > 8)
        {
            e = e - 8;
        }
        return e;
    }

    public String toString(){
        return "Element: " + name + " ; Symbol: " + symbol + " ; Group: " + group + " ; Electrons: " + electrons;
    }

    

}


