package String;

import java.util.*;
import java.io.*;

public class 특정_문자_뒤집기 {
    static String solution(String input) {
        String answer="";
        char[] chars = input.toCharArray();
        int lt = 0;
        int rt = chars.length-1;
        while(lt<rt) {
            char ltc = chars[lt];
            char rtc = chars[rt];
            if(!Character.isAlphabetic(ltc)) lt++;
            else if(!Character.isAlphabetic(rtc)) rt--;
            else {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(chars);
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solution(input));
    }
}
