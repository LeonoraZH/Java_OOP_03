class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person otherPerson) {
        if (this.age < otherPerson.age) {
            return -1;
        } else if (this.age > otherPerson.age) {
            return 1;
        } else {
            return this.name.compareTo(otherPerson.name);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", 30);
        Person person2 = new Person("Alice", 25);
        Person person3 = new Person("Bob", 35);

        System.out.println(person1.compareTo(person2));
        System.out.println(person2.compareTo(person3));
        System.out.println(person1.compareTo(person3));
    }
}
