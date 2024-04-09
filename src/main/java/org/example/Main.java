package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Main {

    public static <T> int findItem(List<T> list, T itemToFind) {
        Optional<Integer> foundIndex = IntStream.range(0, list.size())
                .filter(i -> list.get(i).equals(itemToFind))
                .boxed()
                .findFirst();
        return foundIndex.orElse(-1);
    }

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("robot", "dreams", "java", "test");

        String item = "robot";
        int resultIndex = findItem(stringList, item);
        if (resultIndex != -1) {
            System.out.println("Item found: " + item);
        } else {
            System.out.println("Item not found");
        }
    }

}
