package Array;

import java.util.*;
import java.io.*;

public class 피보나치_수열 {
    static String solution(int input) {
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[input];
        arr[0] = 1;
        arr[1] = 1;
        sb.append(arr[0]).append(" ");
        sb.append(arr[1]).append(" ");
        for(int i=2; i<input; i++) {
            arr[i] = arr[i-1] + arr[i-2];
            sb.append(arr[i]).append(' ');
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        System.out.println(solution(input));
    }
}
