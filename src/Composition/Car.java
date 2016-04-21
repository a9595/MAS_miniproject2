package Composition;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by tieorange on 20/04/16.
 */
public class Car {
    private Set<Part> parts = new HashSet<>();

    public void createPart(String name) {
        parts.add(new Part(name));
    }

    public void removePart(String name) {
        if (name != null) {
            for (Part part : parts) {
                if (part.getName().equals(name))
                    parts.remove(part);
            }
        }
    }

    private class Part {
        private String name;

        public Part(String name) {
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
