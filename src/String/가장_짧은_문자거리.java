package String;

import java.util.*;
import java.io.*;

public class 가장_짧은_문자거리 {
    static String solution(String input1, char input2) {
        String answer = "";
        char[] chars = input1.toCharArray();
        int[] len = new int[chars.length];
        int distance = 1000;
        for(int i=0; i<chars.length; i++) {
            if(chars[i]==input2) distance = 0;
            len[i] = distance;
            distance++;
        }
        distance = 1000;
        for(int i=chars.length-1; i>=0; i--) {
            if(chars[i]==input2) distance = 0;
            len[i] = Integer.min(len[i], distance);
            distance++;
        }
        for(int x : len) answer += x + " ";
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String input1 = st.nextToken();
        char input2 = st.nextToken().charAt(0);
        System.out.println(solution(input1, input2));
    }
}
