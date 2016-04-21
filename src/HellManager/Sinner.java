package HellManager;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by tieorange on 21/04/16.
 */
public class Sinner {
    private Set<Sin> sinsSet = new HashSet<>(); // Composition
    private String firstName;
    private String lastName;
    private Date birthDate;

    public void addSin(String name) {
        sinsSet.add(new Sin(name));
    }

    public void removeSin(String name) {
        if (name != null) {
            for (Sin sin : sinsSet) {
                if (sin.getName().equals(name))
                    sinsSet.remove(sin);
            }
        }
    }

    private class Sin {
        private String name;

        public Sin(String name) {
            setName(name);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            if (name != null) {
                this.name = name;
            } else {
                throw new IllegalArgumentException("Name can't be null");
            }
        }
    }
}

