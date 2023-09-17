// Use of inheritance // 
public class Employee {
    float salary = 40000;
}

class Programmer extends Employee{
    float bonus = 1873;
    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programmer salary is: "+p.salary);
        System.out.println("Bonus of Programmer is: "+p.bonus);
        System.out.println("Full Salary including bonus = "+(p.bonus+p.salary));
    }
}
