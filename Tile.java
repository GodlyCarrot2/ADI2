public class Tile {
    private int x;
    private int y;
    private int color;

    public Tile() {
        int x = 0;
        int y = 0;
        int color = 0;
    }

    public Tile(int a, int b, int c) {
        x = a;
        y = b;
        color = c;
    }

    public int getX() {
        return x;
    }

    public int getColor() {
        return color;
    }

    public int getY() {
        return y;
    }

    public void setX(int a) {
        x = a;
    }

    public void setY(int b) {
        y = b;
    }

    public void setColor(int c) {
        color = c;
    }
}
