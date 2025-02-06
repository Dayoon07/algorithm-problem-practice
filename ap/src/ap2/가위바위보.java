package ap2;

public class 가위바위보 {
    
    public static void main(String[] args) {
        System.out.println(new 가위바위보().solution("2"));
        System.out.println(new 가위바위보().solution("205"));
    }

    public String solution(String rsp) {
        String answer = "";
        char scissors = '2';
        char rock = '0';
        char paper = '5';
        
        for (int i = 0; i < rsp.length(); i++) {
            if (rsp.charAt(i) == scissors) {
                answer += rock;
            } else if (rsp.charAt(i) == rock) {
                answer += paper;
            } else if (rsp.charAt(i) == paper) {
                answer += scissors;
            }
        }
            
        return answer;
    }

}
