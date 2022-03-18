package d0218;

import java.util.Random;

class MyMaze{

    int width ;
    int height ;
    boolean[][] maze ;
    int[][] numMaze ;
    Random r = new Random() ;

    public MyMaze(int w , int h){
        this.width = w ;
        this.height= h ;
        maze = new boolean[this.height][this.width] ;
        numMaze = new int[this.height][this.width] ;
        for (int i = 0; i < numMaze.length; i++) {
            for (int j = 0; j < numMaze[i].length; j++) {
                numMaze[i][j] = r.nextInt(100) ;
            }
        }
    }

    public void doSomething1(){
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if(numMaze[i][j]%2 == 0){
                    maze[i][j]=true;
                }
            }

        }

    }

    public void doSomething(){
        int big = -1;
        int bigx = -1;
        int bigy = -1;
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {

                if(big<numMaze[i][j]){
                    big = numMaze[i][j];
                    bigx = i;
                    bigy = j;
                }
            }
            }
        maze[bigx][bigy]=true;
    }

    public void showMaze(){

        for (int i = 0; i < maze.length; i++) {
            System.out.print(Color.WHITE);
            for (int j = 0; j < maze[i].length; j++) {
                String s = ""+numMaze[i][j] ;
                if(s.length()==1){
                    s=" "+s;
                }
                if( maze[i][j]==true){
                    System.out.print(Color.BRIGHT_BG_CYAN+" "+s+" ");
                }else{
                    System.out.print(Color.BRIGHT_BG_BLACK+" "+s+" ");
                }

            }
            System.out.println(Color.RESET);
        }

    }

    public static void main(String[] args) {

        int n = 7 + (int)(Math.random()*3)*2 ;
        MyMaze m1 = new MyMaze(n,n) ;
        m1.doSomething();
        m1.showMaze();

    }

}


class Color {

    public static final String RESET  = "\u001B[0m";

    public static final String BLACK  = "\u001B[30m";
    public static final String RED    = "\u001B[31m";
    public static final String GREEN  = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE   = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN   = "\u001B[36m";
    public static final String WHITE  = "\u001B[37m";

    public static final String BRIGHT_BLACK  = "\u001B[90m";
    public static final String BRIGHT_RED    = "\u001B[91m";
    public static final String BRIGHT_GREEN  = "\u001B[92m";
    public static final String BRIGHT_YELLOW = "\u001B[93m";
    public static final String BRIGHT_BLUE   = "\u001B[94m";
    public static final String BRIGHT_PURPLE = "\u001B[95m";
    public static final String BRIGHT_CYAN   = "\u001B[96m";
    public static final String BRIGHT_WHITE  = "\u001B[97m";

    public static final String[] FOREGROUNDS = {
            BLACK, RED, GREEN, YELLOW,
            BLUE, PURPLE, CYAN, WHITE,
            BRIGHT_BLACK, BRIGHT_RED, BRIGHT_GREEN, BRIGHT_YELLOW,
            BRIGHT_BLUE, BRIGHT_PURPLE, BRIGHT_CYAN, BRIGHT_WHITE
    };

    public static final String BG_BLACK  = "\u001B[40m";
    public static final String BG_RED    = "\u001B[41m";
    public static final String BG_GREEN  = "\u001B[42m";
    public static final String BG_YELLOW = "\u001B[43m";
    public static final String BG_BLUE   = "\u001B[44m";
    public static final String BG_PURPLE = "\u001B[45m";
    public static final String BG_CYAN   = "\u001B[46m";
    public static final String BG_WHITE  = "\u001B[47m";

    public static final String BRIGHT_BG_BLACK  = "\u001B[100m";
    public static final String BRIGHT_BG_RED    = "\u001B[101m";
    public static final String BRIGHT_BG_GREEN  = "\u001B[102m";
    public static final String BRIGHT_BG_YELLOW = "\u001B[103m";
    public static final String BRIGHT_BG_BLUE   = "\u001B[104m";
    public static final String BRIGHT_BG_PURPLE = "\u001B[105m";
    public static final String BRIGHT_BG_CYAN   = "\u001B[106m";
    public static final String BRIGHT_BG_WHITE  = "\u001B[107m";


}
