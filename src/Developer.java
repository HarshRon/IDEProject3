public class Developer extends Employee {

    Developer(String name,int age, int id, String gender, double years,int progLanguages,String favLanguage, int contributions){
        super(name,age,id,gender,years);
        this.progLanguages = progLanguages;
        this.favLanguage = favLanguage;
        this.contributions = contributions;
    }

    private int progLanguages;
    private String favLanguage;
    private int contributions;

    public int getProgLanguages() {return progLanguages;}
    public void setProgLanguages(int progLanguages) {this.progLanguages = progLanguages;}

    public int getContributions() {return contributions;}
    public void setContributions(int contributions) {this.contributions = contributions;}

    public String getFavLanguage() { return favLanguage;}
    public void setFavLanguage(String favLanguage){this.favLanguage = favLanguage;}
    @Override
    public String toString(){
        return super.toString() + "\n" + progLanguages + "\n" + contributions + "\n" + favLanguage;
    }



}
