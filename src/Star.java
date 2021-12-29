import java.awt.*;
import java.util.Random;

public class Star {
    public float x;
    float y;
    float z;
    static Random rand;

    float pz;

    public Star(){
        rand = new Random();
        x = rand.nextInt(PanelDefines.SCREEN_WIDTH * 2) - PanelDefines.SCREEN_WIDTH; // -width to width
        y = rand.nextInt(PanelDefines.SCREEN_HEIGHT * 2) - PanelDefines.SCREEN_HEIGHT; // -height to height
        z = rand.nextInt(PanelDefines.SCREEN_WIDTH);
        pz = z;
    }

    public void update(){
        z = z - 10;
        if (z < 1){
            z = PanelDefines.SCREEN_WIDTH;
            x = rand.nextInt(PanelDefines.SCREEN_WIDTH * 2) - PanelDefines.SCREEN_WIDTH;
            y = rand.nextInt(PanelDefines.SCREEN_HEIGHT * 2) - PanelDefines.SCREEN_HEIGHT;
            pz= z;
        }
    }

    public void draw(Graphics g){
        g.setColor(Color.white);

        float sx = PanelDefines.map(x / z, 0, 1, 0, PanelDefines.SCREEN_WIDTH);
        float sy = PanelDefines.map(y / z, 0, 1, 0, PanelDefines.SCREEN_HEIGHT);

        float r = PanelDefines.map(z, 0 , PanelDefines.SCREEN_WIDTH, 16, 0);

        //g.fillOval((int)sx, (int)sy, (int)r, (int)r);

        float px = PanelDefines.map(x / pz, 0, 1, 0, PanelDefines.SCREEN_WIDTH);
        float py = PanelDefines.map(y / pz, 0, 1, 0, PanelDefines.SCREEN_HEIGHT);

        pz = z;
        g.drawLine((int) px, (int) py, (int) sx, (int) sy);

    }
}
