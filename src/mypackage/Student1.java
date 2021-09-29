import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Student123 {
    private int rollno;  // instance variable
    private String name;
    int marks[]; // declaration

    public Student123() {
        Scanner s = new Scanner(System.in);

        //****************************************
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //another way of taking input from the user: used when we want to read the data from the file
        //no specific datatype is specified
        //*****************************************

        System.out.println("enter the rollno:");
        rollno = s.nextInt();
        s.nextLine();   // This is written because when we press enter, this is stored in the next input.
        name = s.nextLine();
        marks = new int[5];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = s.nextInt();
        }
    }

    public static void display() {


        //forming an array of class:
        /*
        Student1 obj1 = new Student1();
        Student1 obj2 = new Student1();

        Student1[] arr1 = new Student1[2];
        arr1[0] = obj1;
        arr1[1] = obj2;
         */
        //but this is not a good way to initialize an array.

        //so we can do this:
        Student123 arr1[] = new Student123[2];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = new Student123();
        }



        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i].rollno);
            System.out.println(arr1[i].name);
            for (int j = 0; j < arr1[i].marks.length; j++) {
                System.out.println(arr1[i].marks[j]);
            }
        }
    }
}
public class Student1 {
    public static void main(String[] args) {
        Student123.display();
    }

}