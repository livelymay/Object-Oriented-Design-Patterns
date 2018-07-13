package solid.dip;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

// A low level module
public class Relationships implements RelationshipBrowser {
    private List<Triplet<Person, Relationship, Person>> relations = new ArrayList<>();

    public List<Triplet<Person, Relationship, Person>> getRelations() {
        return relations;
    }

    public void addParentAndChild(Person parent, Person child) {
        relations.add(new Triplet<>(parent, Relationship.PARENT, child));
        relations.add(new Triplet<>(child, Relationship.CHILD, parent));
    }

    @Override
    public List<Person> findAllChildrenOf(String name) {
        return relations.
                stream().
                filter(x -> Objects.equals(x.getFirst().name, name) && x.getSecond() == Relationship.PARENT).
                map(Triplet::getThird).
                collect(Collectors.toList());
    }
}
