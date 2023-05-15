package String;
import java.util.*;
import java.io.*;



public class 암호 {
    static String solution(int len,String input) {
        String answer = "";
        int sub_len = input.length()/len;
        for(int i=0; i<len; i++) {
            String target = input.substring(0,sub_len);
            int tmp = Integer.parseInt(target.replace("#","1").replace("*","0"));
            int new_tmp =0;
            int place = 1;
            while(tmp>0) {
                int remain = tmp%10;
                new_tmp += remain*place;
                place *= 2;
                tmp /= 10;
            }
            input = input.substring(sub_len);
            answer += (char)new_tmp;
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String input = br.readLine();
        System.out.println(solution(len, input));
    }
}
