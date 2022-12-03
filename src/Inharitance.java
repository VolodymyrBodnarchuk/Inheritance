public class Inharitance {

    private String Name;
    private String Lname;
    private int Years;


    public Inharitance (String Name, String Lname, int year)
    {
        this.Name = Name;
        this.Lname = Lname;
        this.Years = year;
    }

    public void Display(){
        System.out.println("Name = " + this.Name + " Last name = " + this.Lname + " Year = " + this.Years);
    }

}
