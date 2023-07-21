package Classes_and_Objects;

public final class Box {
    private double width;
    private double height;
    private double depth;

    // constructors
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

    public Box(double length){
        this.width = length;
        this.height = length;
        this.depth = length;
    }

    public Box(Box box) {
        this.width = box.width;
        this.height = box.height;
        this.depth = box.depth;
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

    public boolean equalTo(@org.jetbrains.annotations.NotNull Box box) {
        return box.getWidth() == this.getWidth() && box.getHeight() == this.getHeight() && box.getDepth() == this.getDepth();
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

