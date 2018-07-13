package solid.dip;

// A high level module
public class Research {

    public Research(RelationshipBrowser browser) {
        browser.
                findAllChildrenOf("John").
                forEach(ch -> System.out.println(
                        "John has a child called " + ch.name
                ));

    }
}
