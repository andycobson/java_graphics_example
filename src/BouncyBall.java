import java.awt.*;

public class BouncyBall {
    pvector ball;
    private int r;
    pvector vel;

    BouncyBall(float x, float y){
        ball = new pvector(x, y);
        vel = new pvector(3,2.3f);
        r = 5;
    }

    public void draw(Graphics g){
        g.setColor(Color.white);
        g.fillOval((int)ball.x, (int)ball.y, r, r);
    }

    public void update(){
        ball.add(vel);
        if (ball.x + 5 > PanelDefines.SCREEN_WIDTH || ball.x < 0){
            vel.x *= -1;
        }
        if (ball.y + 5 > PanelDefines.SCREEN_HEIGHT || ball.y < 0) {
            vel.y *= -1;
        }
    }
}
