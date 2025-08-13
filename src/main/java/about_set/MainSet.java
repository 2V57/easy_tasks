package about_set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();

        System.out.println("Add method");
        stringSet.add("Vitalijus");
        stringSet.add("Veronika");
        stringSet.add("Vitalijus");

        stringSet.forEach(System.out::println);
        System.out.println("remove method");
        Set<String> names = new HashSet<>(Set.of("Vitalijus", "Veronika", "Leonidas"));
        names.remove("Veronika");
        names.forEach(System.out::println);

        System.out.println("Method contain!");
        System.out.println("Vitalijus is - " + names.contains("Vitalijus"));
        System.out.println("Veronika is - " + names.contains("Veronika"));

        System.out.println("Method size!");
        System.out.println("Set size is - " + names.size());

        System.out.println("Method isEmpty");
        Set<String> surnames = new HashSet<>();
        System.out.println("Surname is empty " + surnames.isEmpty());
        surnames.add("Surname");
        System.out.println("Surname is empty " + surnames.isEmpty());

        System.out.println("Method clear");
        surnames.clear();
        System.out.println("Set - surname is empty - " + surnames.isEmpty());

        System.out.println("Method AllAdd");
        surnames.addAll(List.of("first", "second","third"));
        surnames.forEach(System.out::println);

        System.out.println("Method retainAll");
        surnames.retainAll(List.of("first","third"));
        surnames.forEach(System.out::println);

        System.out.println("Method removeAll");
        surnames.add("second");
        surnames.removeAll(List.of("first", "second"));
        surnames.forEach(System.out::println);
    }
}
