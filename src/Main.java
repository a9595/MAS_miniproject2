import HellManager.Sinner;
import HellManager.TortureDepartment;
import HellManager.Torturer;
import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.person.Person;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Fairy fairy = Fairy.create();
        Person person = fairy.person();

        TortureDepartment tortureDepartment = new TortureDepartment("Boiling in water");
        Sinner sinner = new Sinner(person.firstName(), person.lastName(), person.dateOfBirth());

        Torturer torturer = new Torturer(person.username(), tortureDepartment);
    }
}
