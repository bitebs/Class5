package classes;

public class Pen {

    private Colors color;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Pen(Colors color, int width) {
        this.color = color;
        this.width = width;
    }

    private int width = 0;

    public Pen(Colors color) {
        this.color = color;
    }


    public Colors getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color=" + color +
                ", width=" + width +
                '}';
    }
}
