package io.problems.general_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PredicateDemo {
    private static List<Integer> numbers = new ArrayList<>();

    static {
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
    }

    public static Optional<Integer> filterNumber(Integer givenNumber) {
        Predicate<? super Integer> isEqualPredicate = number -> number == givenNumber;
        Optional<Integer> filteredNumber = numbers
                .stream()
                .filter(isEqualPredicate)
                .findFirst();
        return filteredNumber;
    }

    public static void main(String[] args) {
        Optional<Integer> integer = filterNumber(29);
        if(integer.isPresent()) {
            System.out.println(integer.get());
        }
        else {
            System.out.println("Not found");
        }
    }
}
