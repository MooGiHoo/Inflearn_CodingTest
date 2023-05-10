package String;

import java.io.*;
import java.util.*;

public class 문자찾기 {
    public static int solution(String input1, char input2) {
        int answer = 0;
        input1 = input1.toLowerCase();
        input2 = Character.toLowerCase(input2);
        for(char x : input1.toCharArray()) {
            if(x==input2) answer++;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1 = br.readLine();
        char input2 = br.readLine().charAt(0);
        System.out.print(solution(input1, input2));
    }
}
