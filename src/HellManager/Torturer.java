package HellManager;

/**
 * Created by tieorange on 21/04/16.
 */
public class Torturer {
    private String id; // Qualified
    private TortureDepartment tortureDepartment;

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
}
