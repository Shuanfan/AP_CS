package da_past;

public class class_bday {
    public static void main(String[] args) {
           bday b1 = new bday(2,18);
           bday b2 = new bday(5,2);
    }
}


class bday{
    private int month;
    private int day;

    bday(int month, int day){
        this.month = month;
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}