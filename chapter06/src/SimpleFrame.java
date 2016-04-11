/**
 * Created by udayanga on 4/11/16.
 */
import javax.swing.*;

public class SimpleFrame {
    public static void main(String[] args) {
        SimpleFrame1 frame= new SimpleFrame1();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
class SimpleFrame1 extends JFrame{
    public SimpleFrame1(){
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

    }
    public static final int DEFAULT_WIDTH=300;
    public static final int DEFAULT_HEIGHT=200;
}
