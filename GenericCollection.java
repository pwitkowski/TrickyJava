import java.util.*;

class GenericCollection {
    public static void main(String[] args) {
        List list = new ArrayList();
        List<String> strings = list;
        list.add("1");
        list.add(1);
        list.add(new Object());

        for (String string : strings) {
            System.out.println(string);
        }
    }
}