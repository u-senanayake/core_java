import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * Created by udayanga on 4/11/16.
 */
public class DrawingTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                DrawFrame frame= new DrawFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
class DrawFrame extends JFrame{
    public DrawFrame(){
        setTitle("Draw Test");
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
        DrawComponents components= new DrawComponents();
        add(components);

    }
    public static final int DEFAULT_WIDTH=400;
    public static final int DEFAULT_HEIGHT=400;
}
class DrawComponents extends JComponent{
    public void paintComponent(Graphics g){
        Graphics2D g2= (Graphics2D)g;
        g2.setColor(Color.red);
        double leftX=100;
        double topY=100;
        double width=200;
        double height =150;

        Rectangle2D rect = new Rectangle2D.Double(leftX, topY, width, height);
        g2.draw(rect);
    }
}