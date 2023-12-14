public class ZombBlt {
    float x, y, xSpeed;
    int damage, health;

    public ZombBlt(float x, float y, float xs, int damage, int health) {
        this.x = x; this.xSpeed = xs;this.y = y; this.damage = damage; this.health = health;
    }

    public void move() {
        x+=xSpeed;
    }

    public boolean hitPlayer(int zombGun, float py) {
        if(zombGun > 0 && zombGun < 6){
            return (x <= 100 && x+35 >= 50 && y + 15 >= py && y <= py + 100);
        }
        if(zombGun == 6){
            return (x <= 100 && x+50 >= 50 && y + 15 >= py && y <= py + 100);
        }
        return false;
    }
}