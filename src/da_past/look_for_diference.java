package da_past;

public class look_for_diference {
    public static void main1(String[] args) {
        String test = "life_is_good";
        if(test.charAt(0) <= 'Z' && test.charAt(0) >= 'A'){
            System.out.println("It is PascalCase");
        } else if(test.indexOf("_" )>-1){
            System.out.println("Snake_Case");
        } else {
            System.out.println("It's camelCase");
        }
    }

    public static void main(String[] args){
        String test = "life_is_good";
        String[] s = test.split("_");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
