package HellManager;

import org.joda.time.DateTime;

import java.util.*;

/**
 * Created by tieorange on 21/04/16.
 */
public class Sinner {
    private Set<Sin> sinsSet = new HashSet<>(); // Composition
    private SufferingProcess sufferingProcess; // with attribute
    private String firstName;
    private String lastName;
    private DateTime birthDate;

    public Sinner(String firstName, String lastName, DateTime birthDate) {
        setFirstName(firstName);
        setLastName(lastName);
        setBirthDate(birthDate);
    }


    //region methods
    public void addSin(String name) {
        if (name != null) {
            sinsSet.add(new Sin(name));
        } else {
            throw new IllegalArgumentException("Name should not be null");
        }
    }

    public void removeSin(String name) {
        if (name != null) {
            for (Sin sin : sinsSet) {
                if (sin.getName().equals(name))
                    sinsSet.remove(sin);
            }
        } else {
            throw new IllegalArgumentException("Name should not be null");
        }
    }
    //endregion


    //region Getter $ setters
    public List<String> getSinsNames() {
        List<String> sinsNames = new ArrayList<>();
        for (Sin sin : sinsSet) {
            sinsNames.add(sin.getName());
        }
        return sinsNames;
    }

    public SufferingProcess getSufferingProcess() {
        return sufferingProcess;
    }

    public void setSufferingProcess(SufferingProcess sufferingProcess) {
        if (sufferingProcess == null) {
            throw new IllegalArgumentException("SufferingProcess is NULL");
        }
        if (sufferingProcess.getSinner() != this) {
            throw new IllegalArgumentException("SufferingProcess sinner is different");
        } else {
            this.sufferingProcess = sufferingProcess;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) {
            throw new IllegalArgumentException("firstName is NULL");
        } else {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) {
            throw new IllegalArgumentException("lastName is NULL");
        } else {
            this.lastName = lastName;
        }
    }

    public DateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(DateTime birthDate) {
        if (birthDate == null) {
            throw new IllegalArgumentException("birthDate is NULL");
        } else {
            this.birthDate = birthDate;
        }
    }
    //endregion

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

