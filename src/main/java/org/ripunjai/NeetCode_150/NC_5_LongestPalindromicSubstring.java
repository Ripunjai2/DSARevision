package org.ripunjai.NeetCode_150;

public class NC_5_LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int res[] = new int[2];
        int max = 0;
        for(int i=0;i<s.length();i++){
            int temp[] = expand(s, i, i);
//            System.out.println("temp: " + temp[0] + " " + temp[1]);
            if((temp[1]-temp[0]+1)>max){
                max = temp[1]-temp[0]+1;
                res[0] = temp[0];
                res[1] = temp[1];
            }
        }
        for(int i=0;i<s.length()-1;i++){
            int temp[] = expand(s, i, i+1);
            if((temp[1]-temp[0]+1)>max){
                max = temp[1]-temp[0]+1;
                res[0] = temp[0];
                res[1] = temp[1];
            }
        }
        return s.substring(res[0], res[1]+1);
    }

    public int[] expand(String s, int left, int right){
        int arr[] = new int[]{0, 0};
        while(left>=0 && right< s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        arr[0] = left+1;
        arr[1] = right-1;
        return arr;
    }

    public static void main(String args[]){
        NC_5_LongestPalindromicSubstring obj = new NC_5_LongestPalindromicSubstring();
        String s = "babad";
        System.out.println("  ********   "+ s.substring(1, 4));
        System.out.println(obj.longestPalindrome(s));
    }
}
