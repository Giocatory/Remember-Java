import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TypesInJava tj = new TypesInJava();

        tj.showTypes();

        ArrayList<String> types_arr =  tj.get_types_in_java();
        System.out.println(String.join(", ", types_arr));
    }
}