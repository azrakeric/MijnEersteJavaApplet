//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Tekenen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRect(20, 20, 100, 50);
        g.drawLine(150,200,200,100);
        g.drawLine(200,100,250,200);
        g.drawLine(150,200,250,200);


}
}