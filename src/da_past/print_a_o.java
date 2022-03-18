package da_past;

public class print_a_o {
    public static void main(String[] args) {
        String[][] table = new String[][]{
                {"A", "B", "C", "D", "E"},
                {"F", "G", "H", "I", "J"},
                {"K", "L", "M", "N", "O"}
        };


            for (int i = 0; i < table.length; i++) {
                for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]);
            }
                System.out.println();
        }
    }
}
