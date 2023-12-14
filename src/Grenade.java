public class Grenade {
    float x, y, len, xs, ys, targetx, targety;
    int damage, timer;

    public Grenade(float x, float y, float len, float xs, float ys, int damage, float targetx, float targety, int timer){
        this.x = x; this.y = y; this.len = len; this.xs = xs; this.ys = ys; this.damage = damage;
        this.targetx = targetx; this.targety = targety; this.timer = timer;
    }

    public void move(){
        if (x <= targetx && y != targety){
            x+=xs;
            y+=ys;
        }
        timer--;
    }

    public boolean inNadeBound(float zombx, float zomby){
        if (Math.abs(dist(x, y, zombx, zomby)) <= len) {
            return true;
        }else if (Math.abs(dist(x, y, zombx+100, zomby)) <= len) {
            return true;
        }else if (Math.abs(dist(x, y, zombx, zomby+80)) <= len) {
            return true;
        }else if (Math.abs(dist(x, y, zombx+100, zomby+80)) <= len) {
            return true;
        }
        return false;
    }

    public double dist(float x, float y, float x2, float y2){
        return Math.abs(Math.sqrt(((x2-x)*(x2-x)) + ((y2-y)*(y2-y))));
    }
}