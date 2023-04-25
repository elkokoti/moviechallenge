public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Person person = new Person(); //default constructor

      Person person2 = new Person("Una", "Dos", 89);

        System.out.println(person2);

        person.setFName("Alma");
        person.setLName("Redolla");
        person.setAge(55);
        person.setDirector(true);
        person.setLActor(false);
        System.out.println("Welcome! I am " + person.getFName() + " " + person.getLName());

        System.out.println(person.toString());

        Movie film = new Movie(); //default constructor
        Movie film2 = new Movie("The Matrix", 2010, true);

        film2.setLMaleActor("Connor Loco");
        film2.setLFemaleActor("Jennifer Claire");
        film2.setMoney(55000.78);
        film2.setNumOscar(5);

        System.out.println(film2);
    }
}