public class Zomb{
    float x,y,xSpeed;
    int health, gun, fireCounter, xBarrier = 0;

    public Zomb(float x, float y, float xs, int h, int gun){
        this.x=x; this.y=y; this.xSpeed=xs; this.health = h; this.gun = gun;
    }

    public void move(){
        x -= xSpeed;
    }

    public boolean knifeCollision(float py){
        return x <= 280 && x + 100 >= 50 && py + 50 >= y && py + 50 <= y + 80;
    }

}