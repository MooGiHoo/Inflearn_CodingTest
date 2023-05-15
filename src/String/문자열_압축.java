package String;

import java.util.*;
import java.io.*;

public class 문자열_압축 {
    static String solution(String input) {
        input += " ";
        String answer = "";
        int cnt = 1;
        for(int i=1; i<input.length(); i++) {
            char ch = input.charAt(i);
            if(ch == input.charAt(i-1)) cnt++;
            else {
                answer += input.charAt(i-1) + "" + cnt;
                cnt = 1;
            }
        }
        answer = answer.replace("1", "");
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solution(input));
    }
}



