package String;

import java.util.Scanner;

public class 대소문자_변환 {
    public static String solution(String input){
        String answer = "";
        for(char x : input.toCharArray()){
            if(x-97>=0){
                answer += Character.toUpperCase(x);
            }
            else{
                answer += Character.toLowerCase(x);
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.print(solution(input));
    }
}

/*
소문자 a 97
대문자 A 65

알파벳 - 97 >=0 ? 소문자.upper
		   <0 대문자.lower




*/