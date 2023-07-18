package Classes_and_Objects;

public class Box {
    private double width;
    private double height;
    private double depth;

    // constructor
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public Box() {
        this.width = 1;
        this.height = 1;
        this.depth = 1;
    }

    // methods
    public double volume() {
        return width * height * depth;
    }

    public void setDimensions(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // overrides
    @Override
    public String toString() {
        return "Box [width=" + getWidth() + ", height=" + getHeight() + ", depth=" + getDepth() + "]";
    }

    // getters
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }
}

