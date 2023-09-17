interface MyInterface{
    public void method1();
    public void method2();
}

class Demo implements MyInterface{
    public void method1(){
        System.out.println("First Method Implemented");
    }

    public void method2(){
        System.out.println("Second method Implemented");
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.method1();
        obj.method2();
    }
}