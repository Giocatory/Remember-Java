package Classes_and_Objects;

public class BoxDemo {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.setDimensions(10, 20, 30);
        System.out.println(box1.volume()); // 6000.0
        System.out.println(box1); // Box [width=10.0, height=20.0, depth=30.0]

        Box box2 = new Box(20);
        System.out.println(box2.volume()); // 8000.0
        System.out.println(box2); // Box [width=20.0, height=20.0, depth=20.0]
        
        Box box3 = new Box(10, 20, 30);

        System.out.println("box1 == box2 => " + box1.equalTo(box2)); // false
        System.out.println("box1 == box3 => " + box1.equalTo(box3)); // true

        Box box4 = new Box(box2);
        System.out.println("box4 == box2 => " + box4.equalTo(box2)); // true
    }
}
