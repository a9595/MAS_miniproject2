package HellManager;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by tieorange on 21/04/16.
 */
public class TortureDepartment {
    private String name;
    private Set<SufferingProcess> sufferingProcesses = new HashSet<>(); // with an attribute
    private Map<String, Torturer> torturersMap = new HashMap<>(); // qualified

    public TortureDepartment(String name) {
        setName(name);
    }

    public Torturer getTorturer(String id) {
        if (id != null) {
            return torturersMap.get(id);
        } else {
            throw new RuntimeException("id is NULL");
        }
    }

    public void addTorturer(Torturer newTorturer) {
        if (newTorturer == null) {
            throw new RuntimeException("Torturer is NULL");
        } else {
            if (!torturersMap.containsKey(newTorturer.getId())) {
                torturersMap.put(newTorturer.getId(), newTorturer);
                newTorturer.setTortureDepartment(this);
            } else {
                throw new RuntimeException("Torturer is already in this TortureDepartment");
            }
        }
    }

    public void removeTorturer(String id) {
        if (id == null) {
            throw new IllegalArgumentException("id is NULL");
        } else {
            torturersMap.remove(id);
        }
    }

    public Set<SufferingProcess> getSufferingProcesses() {
        return sufferingProcesses;
    }

    public void addSufferingProcess(SufferingProcess sufferingProcess) {
        if (sufferingProcess.getTortureDepartment() != this) {
            throw new IllegalArgumentException("SufferingProcess torture department is different");
        }

        if (!this.sufferingProcesses.contains(sufferingProcess)) {
            sufferingProcesses.add(sufferingProcess);
        } else {
            throw new IllegalArgumentException("This SufferingProcess is already added");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("name is NULL");
        } else {
            this.name = name;
        }
    }
}
