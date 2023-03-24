import java.awt.Canvas;
//Wenn von Canvas geerbt wird wird immer paint() aufgerufen, weil das in Canvas definiert ist
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

import javax.swing.JFrame;

public class App extends Canvas {


    public static void main(String[] args) {

        App dr = new App();
        JFrame frame = new JFrame("Eine Linie!");
        frame.add(dr);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(600, 800);
    }

    private void drawSlide(int x1, int y1, int Xlength, int Ylength, Graphics g){
        
        g.drawString("Rutsche", x1 + 20, y1 + 20);
        
        g.drawLine(x1, y1, x1 + Xlength, y1);
        g.drawLine(x1, y1 + Ylength, x1 + Xlength, y1 + Ylength);
        g.drawLine(x1, y1, x1, y1 + Ylength);
        g.drawLine(x1 + Xlength, y1, x1 + Xlength, y1 + Ylength);

        g.drawOval(x1 + 10, y1 + Ylength - 130, 120, 120);
    
        g.drawLine(x1 + 220, y1 + 50, x1 + 260, y1 + 100);
        g.drawLine(x1 + 260, y1 + 100, x1 + 140, y1 + 150);
        g.drawLine(x1 + 140, y1 + 150, x1 + 100, y1 + 100);
        g.drawLine(x1 + 100, y1 + 100, x1 + 220, y1 + 50);
    
    }



/*
    private void drawSlide(Graphics g){
        g.drawLine(50, 50, 150, 50);
        g.drawLine(50, 100, 150, 100);
        g.drawLine(50, 50, 50, 100);
        g.drawLine(150, 50, 150, 100);
    }
    */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawSlide(100, 100, 300, 200, g);
        drawSlide(100, 400, 300, 200, g);
        
// amelie am montag 19        g.drawLine(100, 100, 200, 200);
    }


}


/*
import controller.MainController;

public class App {
    public static void main(String[] args) throws Exception {
//        new MainController();
    }
}
*/