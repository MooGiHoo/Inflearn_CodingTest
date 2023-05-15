package Array;

import java.util.*;
import java.io.*;

public class 큰_수_출력하기 {
    static String solution(int N, int[] arr) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++) {
            if(i==0) sb.append(arr[i]).append(" ");
            else {
                if(arr[i-1]<arr[i]) sb.append(arr[i]).append(" ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(N, arr));
    }
}
