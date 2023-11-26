public class LazyEmployee extends Employee{

    LazyEmployee(String name,int age, int id, String gender, double years,int coffeeBreaks, String commonExcuse, int deadlinesIgnored) {
        super(name,age,id,gender,years);
        this.coffeeBreaks = coffeeBreaks;
        this.commonExcuse = commonExcuse;
        this.deadlinesIgnored = deadlinesIgnored;
    }
    private int coffeeBreaks;
    private String commonExcuse;
    private int deadlinesIgnored;

    public int getCoffeeBreaks() {return coffeeBreaks;}
    public void setCoffeeBreaks(int coffeeBreaks) {this.coffeeBreaks = coffeeBreaks;}

    public String getCommonExcuse() { return commonExcuse;}
    public void setCommonExcuse(String commonExcuse){this.commonExcuse = commonExcuse;}

    public int getDeadlinesIgnored() {return deadlinesIgnored;}
    public void setDeadlinesIgnored(int deadlinesIgnored) {this.deadlinesIgnored = deadlinesIgnored;}

    @Override
    //overrides parent class and adds child class variables to print out
    public String toString(){
        return super.toString() + "\n" +"Daily Breaks:  "+ coffeeBreaks + "\n" +"Common Excuse:  "+ commonExcuse + "\n" +"Deadlines Ignored:  "+ deadlinesIgnored;
    }
}
