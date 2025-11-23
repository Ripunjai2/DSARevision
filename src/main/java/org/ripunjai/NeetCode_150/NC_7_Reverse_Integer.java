package org.ripunjai.NeetCode_150;

public class NC_7_Reverse_Integer {
        public int reverse(int x) {
            int n = x;
            long res = 0;
            n=x;

            while(n!=0){
                int rem = n%10;
                res = res * 10 + rem;
                // System.out.println(res);
                n = n/10;
            }
            if(res>Integer.MAX_VALUE || res < Integer.MIN_VALUE){
                return 0;
            }
            return (int)res;
        }

        public static void main(String[] args) {
            NC_7_Reverse_Integer obj = new NC_7_Reverse_Integer();
            int x = -123;
            System.out.println(obj.reverse(x));
        }
}
