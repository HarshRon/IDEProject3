public class SeniorEmployee extends Employee
{
   SeniorEmployee(String name, int age, int id, String gender,double years,){
   super(id,salary);
   this.territory = territory;
   }
   private int elevatorPin;
   private boolean boardMem;

   public int getElevatorPin()
   {
      return elevatorPin;
   }
   public void setElevatorPin(int elevatorPin)
   {
      this.elevatorPin = elevatorPin;
   }

   public boolean isBoardMem() {
      if (boardMem == true)
              System.out.println("You are a special person!");
      return boardMem;
   }
}
