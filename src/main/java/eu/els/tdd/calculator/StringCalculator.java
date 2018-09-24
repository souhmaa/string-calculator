package eu.els.tdd.calculator;

import java.util.Arrays;

public class StringCalculator {

    public int add(String numbers) {
        if (isNullOrEmpty(numbers)) {
            return 0;
        }
        return splitAndCalculateSum(numbers);
    }

    private boolean isNullOrEmpty(String numbers) {
        return numbers == null || numbers.isEmpty();
    }

    private int splitAndCalculateSum(String numbers) {
        return Arrays.stream(numbers.split(","))
                .filter(this::isNumeric)
                .map(Integer::valueOf)
                .reduce(0, (nbr1, nbr2) -> nbr1 + nbr2);
    }

    private boolean isNumeric(String str) {
        return !str.isEmpty() && str.chars().allMatch(Character::isDigit);
    }

}
