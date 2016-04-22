import HellManager.*;
import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.person.Person;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Fairy fairy = Fairy.create();
        Person person = fairy.person();

        TortureDepartment tortureDepartment = new TortureDepartment("Boiling in hot water");
        Torturer torturer = new Torturer(person.username(), tortureDepartment);
        PunishmentTool punishmentTool = new PunishmentTool("Boiling pot", 67, tortureDepartment);

        Sinner sinner = new Sinner(person.firstName(), person.lastName(), person.dateOfBirth());
        sinner.addSin("Killing");
        sinner.addSin("Pride");
        sinner.addSin("Greed");

        sinner.removeSin("Pride");
        int size = sinner.getSinsNames().size();

        SufferingProcess sufferingProcess = new SufferingProcess(new Date(), new Date(), tortureDepartment, sinner);

        String torturerName = tortureDepartment.getTorturerById(torturer.getId()).getName();
        System.out.println(torturerName);


    }

}
