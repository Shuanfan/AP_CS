package da_past;

public class Box {

    public static void main(String[] args) {
        double number = -1;




        robot r1 = new robot("M01", 500);
        robot r2 = new robot("M02", 250);
        for (int i = 0; i < 5; i++) {
            if(Math.random()<0.5 && r1.battery>=0) {
                r1.battery = r1.battery - 100;

            }
            r1.show();
        }

    }

}
class robot{

    static String model = "M1";
    String id;
    int battery;

    robot(String id, int battery){
        this.battery = battery;
        this.id = id;
    }

    void show(){
        System.out.println(model + " " + id + " " + battery);
    }

}