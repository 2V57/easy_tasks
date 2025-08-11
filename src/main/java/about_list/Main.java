package about_list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Vitalijus");
        names.add("Veronika");

        names.forEach(System.out::println);

        names.add(1, "Leonidas");

        names.forEach(System.out::println);

        System.out.println(names.get(1));

        names.set(0, "Vitalij");
        names.forEach(System.out::println);

        names.remove(2);
        names.forEach(System.out::println);

        names.remove("Leonidas");
        names.forEach(System.out::println);

        System.out.println("List of the size is " + names.size());

        System.out.println(names.contains("Vitalij"));

        System.out.println("-----------");
        names.add("Veronika");
        names.add("Leonidas");

        //"The indexOf method returns the index of the first occurrence of element o, or -1 if the element is not found."
        System.out.println("Leonidas is index - " + names.indexOf("Leonidas"));
        System.out.println("Povilas is index - " + names.indexOf("Povilas"));

        System.out.println(names.isEmpty());

        List<String> surnames = new ArrayList<>();
        System.out.println(surnames.isEmpty());

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);

        int count = numbers.getFirst();
        System.out.println(count);

        numbers.add(null);
        try{
            int count2 = numbers.getLast();
            System.out.println(count2);
        }catch (NullPointerException e){
            System.out.println("count is null!");
        }

    }
}
