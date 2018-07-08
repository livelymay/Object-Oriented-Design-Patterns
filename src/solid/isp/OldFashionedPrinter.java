package solid.isp;

/**
 * In case of a common interface we are forced to implement all methods. YAGNI FAILED
 */
public class OldFashionedPrinter implements Machine {
    @Override
    public void print(Document d) {

    }

    @Override
    public void fax(Document d) {

    }

    @Override
    public void scan(Document d) {

    }
}
