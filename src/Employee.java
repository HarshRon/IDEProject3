public class Employee
   //parent class
{
//   Employee(int id, double salary){
//   this.id = id;
//   this.salary = salary;
//   }
   Employee(String name,int age, int id, String gender, double years){
      this.name = name;
      this.age = age;
      this.id = id;
      this.gender = gender;
      this.years = years;
   }
   private int age;
   private String name;
   private String gender;
   private int id;
   private double years;

   public int getAge() {return age;}
   public void setAge(int age){this.age = age;}
   public String getName() { return name;}
   public void setName(String name){this.name = name;}
   public String getGender() { return gender;}
   public void setGender(String gender){this.gender = gender;}


   public int getId()
   {
      return id;
   }
   public double getSalary()
   {
      return years;
   }
   public void setId(int idNum)
   {
      id = idNum;
   }
   public void setYears(double years)
   {
      this.years = years;
   }

   public String toString(){
      return ("Employee:  " + name + "\n"+"Age:  "+age + "\n"+"Pin:  "+ id + "\n" +"Gender:  "+ gender + "\n" +"Tenure:  "+ years);
   }
}

