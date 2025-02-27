package ap2;

public class 순서쌍의개수 {
    
    public static void main(String[] args) {
        System.out.println(new 순서쌍의개수().solution(20));
        System.out.println(new 순서쌍의개수().solution(100));
    }

    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) { 
                answer += (i * i == n) ? 1 : 2;
            }
        }
        return answer;
    }

}
