public class SeniorEmployee extends Employee
{
   SeniorEmployee(String name, int age, int id, String gender,double years,int employeeCount,String certifications, int elevatorPin){
   super(name,age,id,gender,years);
   this.employeeCount = employeeCount;
   this.certifications = certifications;
   this.elevatorPin = elevatorPin;
   }
   private int elevatorPin;
   private int employeeCount;
   private String certifications;

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



   }

