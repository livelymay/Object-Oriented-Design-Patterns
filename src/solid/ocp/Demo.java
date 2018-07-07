package solid.ocp;

import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products = Arrays.asList(apple, tree, house);

        ProductFilter pf = new ProductFilter();

        System.out.println("Green Products (OLD):");
        pf.filterByColor(products, Color.GREEN).
                forEach(p -> System.out.println(" - " + p.name + " is green"));

        BetterFilter bf = new BetterFilter();
        System.out.println("Green Products (NEW):");
        bf.filter(products, new ColorSpecification(Color.GREEN)).
                forEach(p -> System.out.println(" - " + p.name + " is green"));

        System.out.println("Large Blue Items:");
        bf.filter(products,
                new AndSpecification<>(
                        new ColorSpecification(Color.BLUE),
                        new SizeSpecification(Size.LARGE))).
                forEach(p -> System.out.println(" - " + p.name + " is large and blue"));
    }
}
