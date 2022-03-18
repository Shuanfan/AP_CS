package da_past;

import java.util.Scanner;

 class Player {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Water[] waters = new Water[100];
        Truck truck = new Truck();
        // game loop
        while (true) {
            int myScore = in.nextInt();
            int enemyScore1 = in.nextInt();
            int enemyScore2 = in.nextInt();
            int myRage = in.nextInt();
            int enemyRage1 = in.nextInt();
            int enemyRage2 = in.nextInt();
            int unitCount = in.nextInt();
            for (int i = 0; i < unitCount; i++) {
                int unitId = in.nextInt();
                int unitType = in.nextInt();
                int player = in.nextInt();
                float mass = in.nextFloat();
                int radius = in.nextInt();
                int x = in.nextInt();
                int y = in.nextInt();
                int vx = in.nextInt();
                int vy = in.nextInt();
                int extra = in.nextInt();
                int extra2 = in.nextInt();

                if(unitType ==4){
                    Water w = new Water();
                    w.x = x;
                    w.y = y;
                    w.quantity = extra;
                    waters[unitId]=w;
                }
                if(unitType == 0 && player == 0){
                    truck.x = x;
                    truck.y = y;
                }
            }

            //finds top waters
            Water top = null ;
            for (int i = 0; i < waters.length; i++) {
                if(waters[i]!=null){
                    if(top == null || waters[i].quantity > top.quantity){
                        top = waters[i];
                    }
                }
            }



            truck.go(top.x, top.y, 300);
            System.out.println("WAIT");
            System.out.println("WAIT");
        }
    }
}

class Water{
    int x;
    int y;
    int quantity;
}
class Truck{
    int x;
    int y;
    void go(int dx, int dy, int t){
        int d1 = (x-dx);
        int d2 = (y-dy);
        double dist = Math.sqrt(d1*d1+d2*d2);
        if(dist > 1000){
            System.out.println(dx+" "+dy+" "+"300");
        }else{
            System.out.println(dx+" "+dy+" "+"100");
        }

    }
}