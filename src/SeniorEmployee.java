public class SeniorEmployee extends Employee
{
   //constructor using super to eliminate repetitive variables
   SeniorEmployee(String name, int age, int id, String gender,double years,int employeeCount,String certifications, int elevatorPin){
   super(name,age,id,gender,years);
   this.employeeCount = employeeCount;
   this.certifications = certifications;
   this.elevatorPin = elevatorPin;
   }
   private int elevatorPin;
   private int employeeCount;
   private String certifications;
//setters and getters
   public int getElevatorPin()
   {
      return elevatorPin;
   }
   public void setElevatorPin(int elevatorPin)
   {
      this.elevatorPin = elevatorPin;
   }

   public int getEmployeeCount(){ return employeeCount;}
   public void setEmployeeCount(int employeeCount){this.employeeCount = employeeCount;}

   public String getCertifications() { return certifications;}
   public void setCertifications(String certifications){this.certifications = certifications;}
@Override
//overrides parent class and adds child class variables to print out
   public String toString(){
      return super.toString() + "\n" +"Employees:  "+ employeeCount + "\n" +"Highest Achievement:  "+ certifications + "\n" +"Elevator Pin:  "+ elevatorPin;
   }





   }

