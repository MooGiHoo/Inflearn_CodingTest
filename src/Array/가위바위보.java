package Array;

import java.util.*;
import java.io.*;


//가위 1, 바위 2, 보 3
//비김 D, 승자 적기
public class 가위바위보 {
    static String solution(int N, int[] A, int[] B) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++) {
            int A_sel = A[i];
            int B_sel = B[i];
            if(A_sel == B_sel) sb.append("D").append("\n"); //비김
            else if((A_sel==1&&B_sel==3)||(A_sel==2&&B_sel==1)||(A_sel==3&&B_sel==2)) sb.append("A").append("\n"); //A승리
            else sb.append("B").append("\n"); //B승리
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int A[] = new int[N];
        int B[] = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) A[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) B[i] = Integer.parseInt(st.nextToken());
        System.out.println(solution(N, A, B));        
    }
}
