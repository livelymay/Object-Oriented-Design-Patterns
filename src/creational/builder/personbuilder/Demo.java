package creational.builder.personbuilder;

public class Demo {

    public static void main(String[] args) {
        EmployeeBuilder pb = new EmployeeBuilder();
        Person tom = pb.
                    withName("Tom").
                    worksAt("Developer").
                    build();

        System.out.println(tom);
    }
}
