import javax.swing.*;

public class GFrame extends JFrame {

    GFrame(){
        this.add(new GPanel());
        this.setTitle("Graphics");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}
