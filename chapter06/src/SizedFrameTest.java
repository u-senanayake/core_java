import javax.swing.*;
import java.awt.*;

/**
 * Created by udayanga on 4/11/16.
 */
public class SizedFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                SizedFrame frame = new SizedFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

class SizedFrame extends JFrame{
    public SizedFrame(){
        Toolkit toolkit=Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int screenHeight=screenSize.height;
        int screemWidth = screenSize.width;

        setSize(screemWidth/2,screenHeight/2);
        setLocationByPlatform(true);

        Image img = toolkit.getImage("icon.gif");
        setIconImage(img);
        setTitle("Sized Frame");
    }
}