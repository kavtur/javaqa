package by.issoft.train;

public class Runner {

    public static void main(String[] args) {

        Train train = new Train(new Carriage("1"));
        train.chain(new Carriage("2"));
        train.chain(new Carriage("3"));

        train.print();

        train.unchain();
        train.unchain();
        train.unchain();
        train.unchain();
        train.unchain();
    }
}
