package String;

import java.util.*;
import java.io.*;
public class 문장_속_단어 {
    static String solution(String input) {
        String answer = "";
        int num = 0;
        String[] str = input.split(" ");
        for(String x : str) {
            if(x.length()>num) {
                answer = x;
                num = x.length();
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.print(solution(input));
    }
}
