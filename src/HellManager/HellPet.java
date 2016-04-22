package HellManager;

/**
 * Created by tieorange on 22/04/16.
 */
public class HellPet {
    private String name;
    private HellPetColor color;
    private Torturer torturer;

    public HellPet(String name, HellPetColor color, Torturer torturer) {
        setName(name);
        setColor(color);
        setTorturer(torturer);
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

    public HellPetColor getColor() {
        return color;
    }

    public void setColor(HellPetColor color) {
        if (color == null) {
            throw new IllegalArgumentException("color is NULL");
        } else {
            this.color = color;
        }
    }

    public Torturer getTorturer() {
        return torturer;
    }

    public void setTorturer(Torturer torturer) {
        if (torturer != null) {
            if (this.torturer != torturer) {
                this.torturer = torturer;
                torturer.setHellPet(this);
            }
        } else {
            throw new IllegalArgumentException("torturer is NULL");
        }
    }
}
