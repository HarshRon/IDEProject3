import java.util.Scanner; // needed for inputs
public class Main {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Hello");
//    Employee newEmployee = new Employee(4667, 210000);
//    System.out.println(newEmployee.getId() +" "+ newEmployee.getSalary());
//    EmployeeWithTerritory secondEmployee = new EmployeeWithTerritory(8543, 210,500);
//    System.out.println(secondEmployee.getId() + " "+ secondEmployee.getSalary()+" "+ secondEmployee.getTerritory());
       String name = kb.nextLine();
        SeniorEmployee first = new SeniorEmployee(name,22,4667,"Male",2, 3,"Goat", 4667);
        System.out.println(first.getName());

    }
}
