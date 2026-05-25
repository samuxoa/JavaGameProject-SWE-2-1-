public class Paddle {
    int x = 310;
    int y = 550;
    int width = 100;// paddle r length
    int height = 10; // paddle r betdh

    public void moveLeft() {
        if (x > 10) {
            x -= 20; // padle bame e shortese
        }
    }

    public void moveRight() {
        if (x < 580) {
            x += 20;// paddle dane shortese
        }
    }
    // akhne 580 die jate boarder e touch nh kre ata ensure kra hoise
}
