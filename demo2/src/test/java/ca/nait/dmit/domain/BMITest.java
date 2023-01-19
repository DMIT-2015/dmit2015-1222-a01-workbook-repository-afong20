package ca.nait.dmit.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BMITest {

    @ParameterizedTest(name = "height = {0}, weight = {1}, expected BMI = {2}")
    @CsvSource({
            "1,1,703",
            "2,2,351.5"
    })
    void bmi(int height, int weight, double expectedBMI) {
        BMI bmi1 = new BMI();

        bmi1.setWeight(weight);
        bmi1.setHeight(height);

        assertEquals(expectedBMI, bmi1.bmi());
    }

    @Test
    void bmiCategory() {
    }
}