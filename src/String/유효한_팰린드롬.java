package String;

import java.util.*;
import java.io.*;

public class 유효한_팰린드롬 {
    static String solution(String input) {
        String answer = "YES";
        String tmp = input.replaceAll("[^a-zA-Z]","").toLowerCase();
        StringBuilder sb = new StringBuilder(tmp);
        sb.reverse();
        if(!tmp.equals(sb.toString())) return "NO";
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solution(input));
    }
}
