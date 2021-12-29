public class PanelDefines {
    static final int SCREEN_WIDTH = 800;
    static final int SCREEN_HEIGHT = 800;

    public static float map(float var, float start1, float stop1, float start2, float stop2){
        return (var - start1) / (stop1 - start1) * (stop2 - start2) + start2;
    }
}
