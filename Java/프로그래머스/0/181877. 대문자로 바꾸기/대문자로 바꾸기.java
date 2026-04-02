class Solution {
    public String solution(String myString) {
        String answer = "";
    
        for(int i = 0; i<myString.length(); i++) {
            char temp = myString.charAt(i);
            if(Character.isLowerCase(temp) || Character.isUpperCase(temp)) {
                   answer += Character.toUpperCase(temp);
            }
            else {
                 answer += temp;
            }
        }
        return answer;
    }
}