public class MethodOverloading2 {
    void sum(int a, int b){
        System.out.println(a+b);
    }
    void sum(double a, double b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        MethodOverloading2 obj = new MethodOverloading2();

        obj.sum(10,55);
        obj.sum(55.0, 58.88);
    }
}
