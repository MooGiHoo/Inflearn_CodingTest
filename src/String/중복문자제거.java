package String;

import java.util.*;
import java.io.*;

public class 중복문자제거 {
    static String solution(String input) {
        String answer = "";
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character c : input.toCharArray()) {
            if(!map.containsKey(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
                answer += c;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solution(input));
    }
}
