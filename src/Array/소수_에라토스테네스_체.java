package Array;

import java.util.*;
import java.io.*;

public class 소수_에라토스테네스_체 {
    static int solution(int input) {
        int answer = 0;
        int[] arr = new int[input+1];
        arr[1] = 1;
        for(int i=2; i<=input; i++) {
            if(arr[i]==0) {
                answer++;
                for(int j=i; j<=input; j+=i) {
                    arr[j] = 1;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        System.out.println(solution(input));
    }
}
