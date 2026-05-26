public class Ball {
   private int x = 120;
    int y = 350;
    int xDir = -1;// left side
    int yDir = -2; // up side

    int size = 20;// diameter of ball

   private public void move() {
        x += xDir;
        y += yDir; // atate move krbe location change hbe
    }

    public void reverseX() {
        xDir = -xDir; // akhn right side e jbe
    }

    public void reverseY() {
        yDir = -yDir; // akhn down e jbe
    }
}
