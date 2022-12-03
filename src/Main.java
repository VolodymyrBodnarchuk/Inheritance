public class Main {
    public static void main(String[] args) {
        Human Vova = new Human("Volodymyr", "Bodnarchuk", 18);
        Vova.Display();
    }
}

class Human extends Inharitance{

    public Human(String Name, String Lname, int year) {
        super(Name, Lname, year);
    }
}