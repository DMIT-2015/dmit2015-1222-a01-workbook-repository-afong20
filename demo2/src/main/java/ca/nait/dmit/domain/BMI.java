package ca.nait.dmit.domain;

import lombok.Data;

@Data
public class BMI {
    private int weight;
    private int height;

    public double bmi() {
        return (double) (703 * weight)/Math.pow(height,2);
    }

    public String bmiCategory() {
        double bmi = bmi();

        if(bmi > 30) {
            return "obese";
        }
        else if(bmi < 30 && bmi >= 25) {
            return "overweight";
        }
        else if(bmi < 25 && bmi >= 18) {
            return "normal";
        }
        else {
            return "underweight";
        }
    }
}
