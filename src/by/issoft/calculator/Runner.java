package by.issoft.calculator;

import by.issoft.calculator.operation.Operator;

public class Runner {

    public static void main(String[] args) {

        double[] numbers = new double[args.length - 1];
        for (int i = 1; i < args.length; i++) {
            numbers[i - 1] = Double.parseDouble(args[i]);
        }

        Operator operator = Operator.of(args[0]);
        double result = operator.getExecutor().execute(numbers);

    }

}
