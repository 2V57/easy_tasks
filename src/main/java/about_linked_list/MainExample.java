package about_linked_list;

import java.util.LinkedList;

public class MainExample {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();

        linkedList.add(new Person(36, "Vitalijus"));
        linkedList.add(new Person(35, "Veronika"));
        linkedList.add(new Person(1, "Leonidas"));
        linkedList.add(new Person(60, "Jhon"));

        System.out.println("Last element is " + linkedList.getLast().getName());
        System.out.println("First element is " + linkedList.getFirst().getName());

        //Add item to the beginning of the list!
        linkedList.push(new Person(20, "Alex"));

        linkedList.forEach(names -> System.out.println("Name is " + names.getName()));
    }
}
