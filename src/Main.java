import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        var result = switch (n){
            case 1,3,5,7,9 -> "Even";
            case 2,4,6,8 -> "Odd";
            default -> "Invalid";
        };
        System.out.println(result);
    }
}