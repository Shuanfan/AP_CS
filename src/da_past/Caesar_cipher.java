package da_past;

import java.util.Scanner;

public class Caesar_cipher {
    public static void main(String[] args) {
        System.out.println("Pls input words");
        Scanner sc = new Scanner(System.in);
        String i = sc.next();
         caesarCipher c1 = new caesarCipher();
        String r = c1.encode(i);
        c1.Decode(r);
    }
}

class caesarCipher {

    int shift = -2;

    public String encode(String s){
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int n = c+shift;
            if(n < 'A'){
                n = n+26;
            } else if(n>'Z') {
                n = n-26;
            }else {
                n = n;
            }
            c = (char)n;
            result = result+c;

        }
        System.out.println(result);
        return result;
    }

    public void Decode(String s){
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int n = c-shift;
            if(n < 'A'){
                n = n-26;
            } else if(n>'Z') {
                n = n+26;
            }else {
                n = n;
            }
            c = (char)n;
            result = result+c;

        }
        System.out.println(result);
    }
}