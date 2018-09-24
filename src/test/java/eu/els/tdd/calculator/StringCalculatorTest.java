package eu.els.tdd.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {


    private StringCalculator calculator;

    @Before
    public void setUp() {
        this.calculator = new StringCalculator();
    }

    @Test
    public void
    GIVEN_numbers_is_null_WHEN_add_THEN_sum_is_0() {
        // GIVEN
        String numbers = null;

        // WHEN
        int sum = this.calculator.add(numbers);

        //THEN
        assertEquals(0, sum);
    }

    @Test
    public void given_numbers_is_empty_WHEN_add_THEN_sum_is_0() {
        // GIVEN
        String numbers = "";

        // WHEN
        int sum = this.calculator.add(numbers);

        //THEN
        assertEquals(0, sum);
    }

    @Test
    public void
    GIVEN_number_is_1_comma_2_WHEN_add_THEN_sum_is_three() {
        // GIVEN
        String numbers = "1,2";

        // WHEN
        int sum = this.calculator.add(numbers);

        //THEN
        assertEquals(3, sum);
    }

    @Test
    public void
    GIVEN_number_is_1_WHEN_add_THEN_sum_is_1() {
        // GIVEN
        String numbers = "1";

        // WHEN
        int sum = this.calculator.add(numbers);

        //THEN
        assertEquals(1, sum);
    }

    @Test
    public void
    GIVEN_numbers_contains_invalid_number_WHEN_add_THEN_ignore_invalid_numbers() {
        // GIVEN
        String numbers = "1,32,a,4,aza:,2";

        // WHEN
        int sum = this.calculator.add(numbers);

        // THEN
        assertEquals(39, sum);
    }

    @Test
    public void
    GIVEN_number_contains_consecutive_commas_WHEN_add_THEN_ignore_consecutive_commas() {
        // GIVEN
        String numbers = "1,32,a,,4,aza:,2,,,";

        // WHEN
        int sum = this.calculator.add(numbers);

        // THEN
        assertEquals(39, sum);
    }

}
