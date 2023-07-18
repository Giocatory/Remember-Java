package Classes_and_Objects;

public class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box();
        box.setDimensions(10, 20, 30);
        System.out.println(box.volume()); // 6000.0
        System.out.println(box); // Box [width=10.0, height=20.0, depth=30.0]
    }
}
