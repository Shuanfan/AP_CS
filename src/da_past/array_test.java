package da_past;

public class array_test {
    public static void main(String[] args) {
        int[][] map = new int[3][4];
        int n = 17;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = n;
                n = n+1;
            }
        }
        System.out.println();
    }
}
