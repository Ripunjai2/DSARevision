package org.ripunjai.NeetCode_150;

public class NC_6_CoinChange2 {

    public int noOfWaysToMakeChange(int amount, int[] coins) {
        int [][]dp = new int[coins.length+1][amount+1];
        int m = coins.length;
        for(int i=0;i<=m;i++){
            dp[i][0] = 1;
        }
        for(int j=0;j<=amount;j++){
            dp[0][j] = 0;
        }
        for(int i=1;i<=m;i++){
            for(int j=1; j<=amount; j++){
                if(j-coins[i-1]>=0){
                    dp[i][j] = dp[i-1][j] + dp[i][j-coins[i-1]];
                }else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
             for(int j=0; j<=amount; j++){
                 System.out.print(dp[i][j] + " ");
             }
             System.out.println();
        }
        return dp[m][amount];
    }

    // Function to find the minimum number of coins to make change for a given amount
        public int change(int amount, int[] coins) {
            int [][]dp = new int[coins.length+1][amount+1];
            int m = coins.length;
            for(int i=0;i<=m;i++){
                dp[i][0] = 0;
            }
            for(int j=0;j<=amount;j++){
                dp[0][j] = 0;
            }
            for(int i=1;i<=m;i++){
                for(int j=1; j<=amount; j++){
                    if(j-coins[i-1]>=0){
                        if(dp[i-1][j]==0){
                            dp[i][j] = Math.max(dp[i-1][j], dp[i][j-coins[i-1]]+1);
                        }else{
                            dp[i][j] = Math.min(dp[i-1][j], dp[i][j-coins[i-1]]+1);
                        }
                    }else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
                for(int j=0; j<=amount; j++){
                    System.out.print(dp[i][j] + " ");
                }
                System.out.println();
            }
            return dp[m][amount];
        }

        public static void main(String[] args) {
            NC_6_CoinChange2 obj = new NC_6_CoinChange2();
            int amount = 5;
            int coins[] = {1,2,5};
            System.out.println("Min number of coins required to make change: " + obj.change(amount, coins));
            System.out.println("Number of ways to make change: " + obj.noOfWaysToMakeChange(amount, coins));

        }
    }
