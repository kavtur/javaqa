package by.issoft.calculator.operation;

public enum Operator {
    SUM("+", new SumExecutor()),
    MULT("*", new MultExecutor()),
    MINUS("-", new MinusExecutor());

    Operator(String str, MathExecutor executor) {
        this.str = str;
        this.executor = executor;
    }

    private String str;
    private MathExecutor executor;

    public String getStr() {
        return str;
    }

    public static Operator of(String operator) {
        Operator[] values = Operator.values();
        for(int i=0; i< values.length; i++) {
            if(values[i].getStr().equals(operator)) {
                return values[i];
            }
        }
        throw new UnsupportedOperationException(operator + " is not supported");
    }

    public MathExecutor getExecutor() {
        return executor;
    }
}
