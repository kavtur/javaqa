package by.issoft.train;

public class Train {

    private Carriage[] carriages;

    public Train(Carriage head) {
        carriages = new Carriage[1];
        carriages[0] = head;
    }

    public void chain(Carriage carriage) {

        Carriage[] newCarriages = new Carriage[carriages.length + 1];
        for(int i=0; i< carriages.length; i++) {
            newCarriages[i] = carriages[i];
        }

        newCarriages[newCarriages.length - 1] = carriage;

        carriages = newCarriages;
    }

    public Carriage unchain() {
        Carriage[] newCarriages = new Carriage[carriages.length - 1];
        for(int i=0; i< carriages.length -1; i++) {
            newCarriages[i] = carriages[i];
        }

        Carriage tail = carriages[carriages.length -1];
        carriages = newCarriages;

        return tail;
    }

    public void print() {
        System.out.println("Train:");
        for(int i=0; i< carriages.length; i++) {
            System.out.println(carriages[i].getNum());

        }
    }

}
