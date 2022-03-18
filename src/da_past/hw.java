package da_past;

class Seats {

    private boolean[][] seats;

    public Seats(int m, int n) {
    seats = new boolean[m][n];
    }

    public boolean order(int r, int c) {
        if(r<0 || c<0 || r>= seats.length || c>= seats[0].length){
            return false;
        }

        if(seats[r][c] == true){
            return false;
        }
        seats[r][c] = true;
        return true;
    }

    public int getRowAvaNum(int r) {
        int number = 0 ;
        for (int i = 0; i < seats[r].length; i++) {
            if(seats[r][i]==false){
                number = number +1;
            }
        }
        return number;
    }

    public int getColAvaNum(int c) {
        int number = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i][c]==false){
                number = number +1;
            }
        }
        return number;
    }

}


class Test{
    public static void main(String[] args){

        // da_past.Test
        Seats s1 = new Seats( 3,4) ;
        boolean b = s1.order(-1,-2) ; // false
        System.out.println(b);
        b =s1.order(4,4) ; // false
        System.out.println(b);
        b = s1.order(0,1) ; // true
        System.out.println(b);
        b =s1.order(1,1) ; // true
        System.out.println(b);
        b =s1.order(1,2) ; // true
        System.out.println(b);
        b =s1.order(0,1) ; // false
        System.out.println(b);
        int k = s1.getRowAvaNum(1) ;// k:2
        System.out.println(k);
        int m = s1.getColAvaNum(1) ;// m:1
        System.out.println(m);
    }
}