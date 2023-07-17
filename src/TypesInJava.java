import java.util.ArrayList;

public class TypesInJava {
    /**
     * java types
     */
    private final ArrayList<String> arrayList = new ArrayList<String>();

    public TypesInJava() {
        arrayList.add("byte");
        arrayList.add("short");
        arrayList.add("int");
        arrayList.add("long");
        arrayList.add("float");
        arrayList.add("double");
        arrayList.add("boolean");
        arrayList.add("char");
        arrayList.add("String");
        arrayList.add("Object");
    }

    public void showTypes() {
        for (String type : arrayList) {
            System.out.println(type);
        }
    }

    public ArrayList<String> get_types_in_java() {
        return arrayList;
    }
}
