package solid.dip;

import java.util.List;

public interface RelationshipBrowser {
    List<Person> findAllChildrenOf(String name);
}
