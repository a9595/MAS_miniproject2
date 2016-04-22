package HellManager;

import java.util.UUID;

/**
 * Created by tieorange on 21/04/16.
 */
public class Torturer {
    private String id; // Qualified
    private TortureDepartment tortureDepartment;
    private String name;

    public Torturer(String name, TortureDepartment tortureDepartment) {
        setTortureDepartment(tortureDepartment);
        setName(name);
        UUID uuid = UUID.randomUUID();
        setId(uuid.toString());
    }

    public TortureDepartment getTortureDepartment() {
        return tortureDepartment;
    }

    public void setTortureDepartment(TortureDepartment tortureDepartment) {
        if (tortureDepartment == null) {
            throw new IllegalArgumentException("tortureDepartment is NULL");
        } else {
            this.tortureDepartment = tortureDepartment;
            tortureDepartment.addTorturer(this);
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null) {
            throw new IllegalArgumentException("id is NULL");
        } else {
            this.id = id;
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
