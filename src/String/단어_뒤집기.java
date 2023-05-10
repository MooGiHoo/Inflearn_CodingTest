package String;


import java.util.*;
import java.io.*;


public class 단어_뒤집기 {
    static String solution(String input) {
        String answer = "";
        char[] chars = input.toCharArray();
        for(int i=chars.length-1; i>=0; i--) {
            answer += chars[i];
        }
        return answer;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            String input = br.readLine();
            System.out.println(solution(input));
        }
    }
}
