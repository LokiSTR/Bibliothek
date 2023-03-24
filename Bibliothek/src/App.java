import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;

public class App extends Canvas {

    int x1;
    int y1;
    int x2;
    int y2;

    public static void main(String[] args) {

        App dr = new App(100, 100, 200, 200);
        JFrame frame = new JFrame("Eine Linie!");
        frame.add(dr);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(600, 600);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        g.drawLine(x1, y1, x2, y2);
    }

    App(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
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