//package name:
package mypackage;//according to the convention the name of package is written in reverse order of name of the domain name of company
//(eg: com.glauniversity)
//To resolve the conflict of naming we use the concept of packages(just like folders).


//forming a class
class Student{

    private int rollno;  //instance variable
    private String name;

    //****************forming a constructor*****************
    //if the constructor is not formed by the user then the compiler forms the constructor automatically
    //if any constructor is formed by the user then it is not the responsibility of the compiler to form a constructor
    //By constructor we can also initialize the private instance variables.
    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }


    //forming a getter method:
    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }
}

public class Demo1{
    public static void main(String[] args) {
        Student obj1 = new Student(12,"Rishabh");
        System.out.println(obj1.getName());
        System.out.println(obj1.getRollno());
    }
}







//*************************************************************************
//public class Demo1 {//Default class is made public.
//    //first program
//    public static void main(String[] args) {
//        System.out.println("welcome class ");
//    }
//}
//*************************************************************************