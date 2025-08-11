package about_linked_list.for_each_eaxample;

import about_linked_list.Person;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MainForEachExample {
    public static void main(String[] args) {
        List<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person(36, "Vitalijus"));
        linkedList.add(new Person(35, "Veronika"));
        linkedList.add(new Person(1, "Leonidas"));
        linkedList.add(new Person(60, "Jhon"));

        linkedList.forEach(name -> System.out.println("Name is " + name.getName() + ". Age: " + name.getAge()));

        linkedList.removeIf(nameDelete -> nameDelete.getName().equals("Jhon"));

        linkedList.forEach(name -> System.out.println("Name is " + name.getName()));
        System.out.println("subList");

        linkedList.subList(0,2).forEach(name -> System.out.println("Name is " + name.getName()));

        System.out.println("Method sort!");
        linkedList.sort(Comparator.comparing(Person::getName));
        linkedList.forEach(names -> System.out.println("Name " + names.getName()));

        System.out.println("Method contains!");
        System.out.println(linkedList.contains(new Person(34, "Vitalijus")) + " - Vitalijus!");
    }
}
