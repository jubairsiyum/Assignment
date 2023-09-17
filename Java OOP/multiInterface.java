interface FirstInterface{
    public void myMethod();
}
interface SecondInterface{
    public void myOtherMethod();
    }

class Demo implements FirstInterface, SecondInterface{
    public void myMethod(){
        System.out.println("My Method");
    }
    public void myOtherMethod(){
        System.out.println("My Other method");
    }
}

    public class multiInterface{
    public static void main(String[] args) {
        Demo myObj = new Demo();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}