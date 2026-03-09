import java.util.Scanner;
class Solution {
    public int scoreOfString(String s) {
        int score =0;
        for(int i=1;i<s.length();i++){
            int diff=Math.abs(s.charAt(i)-s.charAt(i-1));
            score+=diff;
        }
        return score;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String s=s.nextLine();
        int result=scoreOfString(s);
        System.out.println(+result);
    }
}