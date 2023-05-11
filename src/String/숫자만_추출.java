package String;

import java.util.*;
import java.io.*;

public class 숫자만_추출 {
    static int solution(String input) {
        int answer = 0;
        String tmp = input.replaceAll("[^0-9]","");
        if(tmp.charAt(0)=='0') answer = Integer.parseInt(tmp.substring(1));
        else answer = Integer.parseInt(tmp);
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solution(input));
    }
}
