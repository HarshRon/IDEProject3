import java.util.Scanner; // needed for inputs
public class Main {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        //System.out.println("Hello");
        //parent class variables
        String name;
        int age;
        int id;
        String gender;
        double years;

        //seniorEmployee class variables
        int employeeCount;
        String certifications;
        int elevatorPin;

        //Developer class variables
        int progLanguages;
        String favLanguage;
        int contributions;

        //LazyEmployee class variables
        int coffeeBreaks;
        String commmonExcuse;
        int deadlinesIgnored;

        //beginning of program testing

//    Employee newEmployee = new Employee(4667, 210000);
//    System.out.println(newEmployee.getId() +" "+ newEmployee.getSalary());
//    EmployeeWithTerritory secondEmployee = new EmployeeWithTerritory(8543, 210,500);
//    System.out.println(secondEmployee.getId() + " "+ secondEmployee.getSalary()+" "+ secondEmployee.getTerritory());
      // String name = kb.nextLine();
        //SeniorEmployee first = new SeniorEmployee(name,22,4667,"Male",2, 3,"Goat", 4667);
       // System.out.println(first.getName());

        //formatting
        System.out.println("Welcome to Employee creator!");
        System.out.println("*****************************");
        System.out.print("What employee would you like to create? \nType 1,2,or 3 for your desired choice! \n1).Senior Employee \n2).Developer \n3).Lazy Employee?\n");
        //menu to pick employee and text options
        int choice = kb.nextInt();
        //Senior employee child class variables
        if(choice ==1){
            //Senior employee
            System.out.println("****** Senior Employee ******\n");
            System.out.println("What is your name?");
            kb.nextLine();
            name = kb.nextLine();
            System.out.println("How old are you?");
            age = kb.nextInt();
            System.out.println("Please type your 4-digit identification pin");
            id = kb.nextInt();
            System.out.println("What gender are you?");
            gender = kb.next();
            System.out.println("How many years have you worked at the company?");
            years = kb.nextDouble();
            System.out.println("How many employees work for you?");
            employeeCount = kb.nextInt();
            System.out.println("What is your highest academic achievement");
            kb.nextLine();
            certifications = kb.nextLine();
            System.out.println("Would your like your private elevator pin to be the same as your identification pin? (Yes/No)");
            String pinChoice = kb.next();
            if (pinChoice.equals("Yes"))
                elevatorPin = id;
            else{
                System.out.println("What would you like your elevator pin to be?");
                elevatorPin = kb.nextInt();
            }
            SeniorEmployee emp1 = new SeniorEmployee(name, age,id,gender,years,employeeCount,certifications,elevatorPin);

            System.out.println("****** Senior Employee Details ******");
            //hard coded ugly version
            //System.out.print(name + "\n"+age + "\n"+ id + "\n" + gender + "\n" + years + "\n" + employeeCount + "\n" + certifications + "\n" + elevatorPin);
            System.out.println(emp1.toString());
        //developer child class variables
        } else if (choice == 2) {
            //developer
            System.out.println("****** Developer ******");
            System.out.println("What is your name?");
            kb.nextLine();
            name = kb.nextLine();
            System.out.println("How old are you?");
            age = kb.nextInt();
            System.out.println("Please type your 4-digit identification pin");
            id = kb.nextInt();
            System.out.println("What gender are you?");
            gender = kb.next();
            System.out.println("How many years have you worked at the company?");
            years = kb.nextDouble();
            System.out.println("How many programming languages are you proficient with?");
            progLanguages = kb.nextInt();
            System.out.println("What is your favorite programming language?");
            kb.nextLine();
            favLanguage = kb.nextLine();
            System.out.println("How many code contributions did you have last month?");
            contributions = kb.nextInt();
            if(progLanguages < 2 && contributions < 10){
                System.out.println("****** !Warning! ******");
                System.out.println("How did you even get a job here? Do better before your next review!");
            }
            Developer emp2 = new Developer(name, age,id,gender,years,progLanguages,favLanguage,contributions);
            System.out.println("****** Developer Details ******");
            System.out.println(emp2.toString());
            //lazy employee child class variables
        } else if (choice ==3) {
            //lazy employee
            System.out.println("****** Lazy Employee ******");
            System.out.println("What is your name?");
            kb.nextLine();
            name = kb.nextLine();
            System.out.println("How old are you?");
            age = kb.nextInt();
            System.out.println("Please type your 4-digit identification pin");
            id = kb.nextInt();
            System.out.println("What gender are you?");
            gender = kb.next();
            System.out.println("How many years have you worked at the company?");
            years = kb.nextDouble();
            System.out.println("How many coffee breaks do you take in a day?");
            coffeeBreaks = kb.nextInt();
            System.out.println("What is your most common excuse?");
             kb.nextLine();
            commmonExcuse = kb.nextLine();
            System.out.println("How many deadlines have you ignored this week?");
            deadlinesIgnored = kb.nextInt();
            if (coffeeBreaks > 5 && years < 2) {
                System.out.println("****** !Warning! ******");
                System.out.println("You are too lazy! 1 more coffee break and you're fired bud!");
            }
            LazyEmployee emp3 = new LazyEmployee(name, age,id,gender,years,coffeeBreaks,commmonExcuse,deadlinesIgnored);

            System.out.println("****** Lazy Employee Details ******");
            System.out.println(emp3.toString());

        }
        else {
            System.out.println("That is not a valid option");
        }

    }
}
