class Solution {
    public int numberOfStableArrays(int zero, int one, int limit) {
        int MOD = 1_000_000_007;

        long[][] dp0 = new long[zero + 1][one + 1];
        long[][] dp1 = new long[zero + 1][one + 1];

        long[][] pref0 = new long[zero + 1][one + 1];
        long[][] pref1 = new long[zero + 1][one + 1];

        for (int i = 0; i <= zero; i++) {
            for (int j = 0; j <= one; j++) {

                if (i == 0 && j == 0) continue;

                // End with 0
                if (i > 0) {
                    int l = Math.max(0, i - limit);
                    int r = i - 1;

                    long val = pref1[r][j];
                    if (l > 0) val = (val - pref1[l - 1][j] + MOD) % MOD;

                    if (j == 0 && i <= limit) val = 1;

                    dp0[i][j] = val % MOD;
                }

                // End with 1
                if (j > 0) {
                    int l = Math.max(0, j - limit);
                    int r = j - 1;

                    long val = pref0[i][r];
                    if (l > 0) val = (val - pref0[i][l - 1] + MOD) % MOD;

                    if (i == 0 && j <= limit) val = 1;

                    dp1[i][j] = val % MOD;
                }

                pref0[i][j] = ((j > 0 ? pref0[i][j - 1] : 0) + dp0[i][j]) % MOD;
                pref1[i][j] = ((i > 0 ? pref1[i - 1][j] : 0) + dp1[i][j]) % MOD;
            }
        }

        return (int)((dp0[zero][one] + dp1[zero][one]) % MOD);
    }
}