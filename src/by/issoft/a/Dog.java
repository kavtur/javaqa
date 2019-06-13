package by.issoft.a;

public class Dog {

    private final String name;
    private int x;
    private int y;

    public Dog(String name) {
        this.name = name;
    }


    //direction: LEFT, RIGHT
    public void goX(Direction direction) {
        if(direction.equals(Direction.LEFT)) {
            x = x - 1;
        } else if(direction.equals(Direction.RIGHT)) {
            x = x + 1;
        } else {
            throw new UnsupportedOperationException(direction + " is not supported yet");
        }
        System.out.println(name + ": I am going " + direction);
    }

    public void whereAreYou() {
        System.out.println(name + ": I am at [" + x + "," + y + "]" );
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
