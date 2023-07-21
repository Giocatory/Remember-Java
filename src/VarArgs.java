public class VarArgs {

    public static void vaTestDots(int... args){
        System.out.println("Колличество аргументов: " + args.length);
        for(int i : args) System.out.print(i + " ");
        System.out.println();
    }

    public static void vaTestArr(int[] args){
        System.out.println("Колличество аргументов: " + args.length);
        for(int i : args) System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6 };
        vaTestDots(array);
//        Колличество аргументов: 6
//        1 2 3 4 5 6
        vaTestArr(array);
//        Колличество аргументов: 6
//        1 2 3 4 5 6
        vaTestDots(1, 2, 3, 4, 5);
//        Колличество аргументов: 5
//        1 2 3 4 5
//      vaTestArr(1, 2, 3, 4, 5);   ERROR
    }
}
