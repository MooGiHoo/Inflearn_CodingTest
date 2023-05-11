package String;

import java.util.*;
import java.io.*;

public class 회문_문자열 {
    static String solution(String input) {
        String answer = "YES";
        input = input.toLowerCase();
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        if(!sb.toString().equals(input)) return "NO";
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solution(input));
    }
}
