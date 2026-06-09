class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        for(int i=0; i<100; i++) {
             answer = slice * i;
            if(answer >= n) {
                answer = i;
                break;
            }
            
        }
        return answer;
    }
}