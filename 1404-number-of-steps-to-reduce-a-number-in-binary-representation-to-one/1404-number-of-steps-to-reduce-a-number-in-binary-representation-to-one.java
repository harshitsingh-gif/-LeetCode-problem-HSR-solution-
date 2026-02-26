class Solution {
    public int numSteps(String s) {
        int steps = 0;
        int carry = 0;
        
        // Traverse from right to left (ignore MSB)
        for (int i = s.length() - 1; i > 0; i--) {
            int bit = s.charAt(i) - '0';
            
            if (bit + carry == 1) {
                // odd number → add 1 then divide by 2
                steps += 2;
                carry = 1;
            } else {
                // even number → divide by 2
                steps += 1;
            }
        }
        
        // If carry remains at MSB, add one extra step
        return steps + carry;
    }
}