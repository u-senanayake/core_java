import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by udayanga on 4/12/16.
 */
public class PlatfTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                PlatfFrame frame = new PlatfFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
class PlatfFrame extends JFrame{
    public PlatfFrame(){
        setTitle("PlatfTest");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        buttonPanel = new JPanel();
        UIManager.LookAndFeelInfo[] infos=UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo info : infos)
                makeButton(info.getName(), info.getClassName());
        add(buttonPanel);
    }
    void makeButton(String name, final String platfName){
        JButton button = new JButton(name);
        buttonPanel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    UIManager.setLookAndFeel(platfName);
                    SwingUtilities.updateComponentTreeUI(PlatfFrame.this);
                }
                catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });
    }
    private JPanel buttonPanel;
    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;
}