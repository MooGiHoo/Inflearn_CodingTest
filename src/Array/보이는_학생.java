package Array;

import java.util.*;
import java.io.*;

public class 보이는_학생 {
    static int solution(int[] arr) {
        int answer = 0;
        int max = 0;
        for(int x : arr) {
            if(max<x) {
                answer++;
                max = x;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) arr[i] = Integer.parseInt(st.nextToken());
        System.out.println(solution(arr));
    }
}
