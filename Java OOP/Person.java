public class Person {
    void message(){
        System.out.println("Class");
    }
}

    class Student extends Person{
        void message(){
            System.out.println("Welcome to JAVA");
        }

        void display(){
            message();
            super.message();
        }

        public static void main(String[] args) {
            Student s = new Student();
            s.display();
        }
    }

