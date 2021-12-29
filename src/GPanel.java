import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GPanel extends JPanel implements ActionListener {
    static final int DELAY = 10;
    boolean running = false;
    //BouncyBall ball;
    Star[] stars = new Star[800];
    Timer timer;

    GPanel() {
        this.setPreferredSize(new Dimension(PanelDefines.SCREEN_WIDTH, PanelDefines.SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);

        for(int i = 0; i < stars.length; i++){
            stars[i] = new Star();
        }
        init();
    }

    public void init(){
        running = true;
        timer = new Timer(DELAY, this);
        timer.start();
        //ball = new BouncyBall(300, 300);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g){
        //ball.draw(g);
        g.translate(PanelDefines.SCREEN_WIDTH / 2, PanelDefines.SCREEN_HEIGHT / 2);
        for(int i = 0; i < stars.length; i++){
            stars[i].update();
            stars[i].draw(g);
        }
        update();
    }

    public void update(){
        //ball.update();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(running){
            update();
        }
        repaint();
    }
}
