package da_past;

public class finding_names {
    public static void main(String[] args) {
        String s = "James Morrison, B.A.S";
        int n = s.indexOf(",");
        if (n != -1) {
            String t = s.substring(n + 2);
            System.out.println(t);
        } else {
            System.out.println("N/A");
        }
    }
}