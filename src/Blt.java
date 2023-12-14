public class Blt{
    float x,y ,xSpeed,ySpeed;
    int damage;

    public Blt(float x, float y, float xs, float ys, int damage){
        this.x=x; this.xSpeed=xs; this.y=y; this.ySpeed = ys; this.damage = damage;
    }

    public void move(){
        x+=xSpeed;
        y+=ySpeed;
    }

    public boolean zombCollision(float zombx, float zomby){
        return ((x + 35 >= zombx && x <= zombx + 100) && (y + 15 >= zomby && y <= zomby + 80));
    }

    public boolean zombBltCollision(int zombGun, float zombBltx, float zombBlty){
        if (zombGun > 0 && zombGun < 6) {
            return (x + 35 >= zombBltx && zombBltx + 35 >= x && y + 15 >= zombBlty && y <= zombBlty + 15);
        }
        if (zombGun == 6) {
            return (x + 35 >= zombBltx && zombBltx + 50 >= x && y + 15 >= zombBlty && y <= zombBlty + 15);
        }
        return false;
    }
}