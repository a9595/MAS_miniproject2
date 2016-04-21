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
    private Set<TortureDepartmentSinner> tortureDepartmentSinners = new HashSet<>(); // with an attribute
    private Map<String, SeniorTorturer> torturersMap = new HashMap<>(); // qualified

}
