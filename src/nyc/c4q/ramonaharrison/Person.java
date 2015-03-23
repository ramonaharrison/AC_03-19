package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 *
 * Author  Gregory Gundersen
 * Date    March 2015
 *
 * This class represents a person with a name and age.
 */

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public int getAge() {
        return this.age;
    }

    public static void greet() {
        System.out.println("I'm speaking for all Persons");
    }

    public static void main(String[] args) {
        Person fred = new Person("Fred", 28);
        //bob.setName("John");

        //fred.setName(null);

        System.out.println(fred.toString());



    }
}
