package HellManager;

/**
 * Created by tieorange on 22/04/16.
 */
public class PunishmentTool {
    private String name;
    private int damage;
    private TortureDepartment tortureDepartment;

    public PunishmentTool(String name, int damage, TortureDepartment tortureDepartment) {
        this.name = name;
        this.damage = damage;
        setTortureDepartment(tortureDepartment);
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public TortureDepartment getTortureDepartment() {
        return tortureDepartment;
    }

    public void setTortureDepartment(TortureDepartment tortureDepartment) {
        if (this.tortureDepartment != tortureDepartment) {
            if (this.tortureDepartment != null) {
                this.tortureDepartment.removePunishmentTool(this);
            }
            this.tortureDepartment = tortureDepartment;
            this.tortureDepartment.addPunishmentTool(this);
        }
    }
}
