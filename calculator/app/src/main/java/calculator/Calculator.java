package calculator;

public class Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.divide(10, 3);
     }
   
    public Number divide(int int1, int int2) {
        if (int1 % int2 == 0) {
            return int1 / int2;
        }
        float sum = Float.valueOf(int1) / Float.valueOf(int2);
        return Math.round(sum * 1000.0) / 1000.0;
    }

    public Integer add(Integer int1, Integer int2) {
        Integer sum = int1 + int2;
        return sum;
    }

    public Integer multiply(Integer int1, Integer int2) {
        Integer sum = int1 * int2;
        return sum;
    }


    
}
