package mypackage;
class A{
    int n1;
    String name;
    A(){
        n1 = 12 ;
        name = "Rishabh";
    }
}
class B{
    int a1;
    int a2;
    B(){
        a1 = 56 ;
        a2 = 89 ;
    }

}
public class AAbc {
    public static void main(String[] args) {
        Object arr[] = new Object[5];
        arr[0] = new A();
        arr[1] = new B();

        for(Object res: arr){
            if (res instanceof A){
                //A tobj = (A)res;
                System.out.println(((A)res).name);
            }
        }
    }
}
