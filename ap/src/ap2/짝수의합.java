package ap2;

public class 짝수의합 {

    public static void main(String[] args) {
        System.out.println(new 짝수의합().solution(10));
        System.out.println(new 짝수의합().solution(4));
    }

    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i += 2) {
            answer += i;
        }
        return answer;
    }

}
