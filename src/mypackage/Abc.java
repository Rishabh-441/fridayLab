package mypackage;

public class Abc {
    public static void main(String[] args) {
        Object obj[] = new Object[5];
        obj[0] = new Abc();
        System.out.println(obj[0]);
    }
}
