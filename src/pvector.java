public class pvector {
    public float x;
    public float y;

    pvector(float x, float y){
        this.x = x;
        this.y = y;
    }

    void add(pvector p){
        this.x += p.x;
        this.y += p.y;
    }
}
