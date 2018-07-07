package solid.srp;

import java.io.IOException;

/**
 * Saving the Journal Entries(Separate Class) using logic defined in Persistence(Separate Class)
 */
public class Demo {

    public static void main(String[] args) throws IOException {
        Journal j = new Journal();

        j.addEntry("First Day");
        j.addEntry("Second Day");

        System.out.println(j);

        Persistence p = new Persistence();
        String filename = "/home/varunu28/IdeaProjects/DesignPatterns/journal.txt";

        p.save(filename, j, true);

        Runtime.getRuntime().exec("subl " + filename);
    }
}
