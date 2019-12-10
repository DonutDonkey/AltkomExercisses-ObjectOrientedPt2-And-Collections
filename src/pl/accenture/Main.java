package pl.accenture;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //7. with 11

        List<Dog> dogList = Arrays.asList(
                new Dog("Dog name"),
                new DogOrigin("DogOrigin name", "Dog origin"),
                new DogRace("DogRace name", "DogRace origin", "Dog race"));

        var genericExtendClass = new GenericExtendClass();

        dogList.forEach(dog -> genericExtendClass.writeDog(dog));

        //11

        GenericClass<Integer> myInteger = new GenericClass<>();
        myInteger.setT(10);
        System.out.println(myInteger.getT());
//        myInteger.setT("some String"); -- error

        var myGeneric = new GenericClass();
        myGeneric.setT(10);
        System.out.println(myGeneric.getT());
        myGeneric.setT("some string");
        System.out.println(myGeneric.getT());

        //Collections test

        List<Person> personList = Arrays.asList(
                new Person("Andrzej",  Sex.male, 20),
                new Person("Blarzej",  Sex.male, 12),
                new Person("Colonel",  Sex.female, 20),
                new Person("Andrzej",  Sex.female, 12)
        );

        personList.stream()
                .filter(Person.isAdultFemale)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        personList.stream()
                .filter(Person.isAdultMale)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}

enum Sex{
    male, female
}
class Person{
    String name;

    Sex sex;
    public Sex getSex() { return sex; }

    int age;
    public int getAge() { return age; }

    public Person(String name, Sex sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

    static public Predicate<Person> isAdultMale   = p -> p.getAge() > 18 && p.getSex().equals(Sex.male);
    static public Predicate<Person> isAdultFemale = p -> p.getAge() > 18 && p.getSex().equals(Sex.female);
}
