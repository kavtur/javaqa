package by.issoft.a;


public class A {

    public static void main(String[] args) {

//        DayBusinessLogic dayBusinessLogic = new DayBusinessLogic();
//
//        Day monday1 = Day.MONDAY;
//        Day monday2 = Day.MONDAY;
//
//        dayBusinessLogic.doLogic(monday);

//        User userDima = new User();
//        userDima.setName("Dima");




    }
}


class DayBusinessLogic {

    public static final int MONDAY = 1;

    void doLogic(Day2 dayOfWeek) {

        int dayNum = dayOfWeek.getDayNum();
    }

}

enum Operator {
    PLUS("+"), MINUS("-");

    private String str;

    Operator(String str) {
        this.str = str;
    }
}


//class Day {
//
//    public static final Day MONDAY = new Day(1, "Понедельник");
//    public static final Day TUESDAY = new Day(2, "Вт");
//
//    private Day(int dayNum, String ruTranslation) {
//
//        this.dayNum = dayNum;
//        this.ruTranslation = ruTranslation;
//    }
//
//    private final int dayNum;
//    private final String ruTranslation;
//
//}

enum Day2 {
    MONDAY(1, "Понедельник"),
    TUESDAY(2, "Вт");

    private Day2(int dayNum, String ruTranslation) {
        this.dayNum = dayNum;
        this.ruTranslation = ruTranslation;
    }

    private final int dayNum;
    private final String ruTranslation;

    public int getDayNum() {
        return dayNum;
    }

    public String getRuTranslation() {
        return ruTranslation;
    }
}

