package Chapter6;


import java.awt.*;
import java.applet.*;


public class Chapter6Opdracht2 extends Applet {
    double a, b, c, d, uitkomst;





    public void init() {
        super.init();
        a = 200;
        b = 287;

        uitkomst = a - b;



    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);


    }


}
