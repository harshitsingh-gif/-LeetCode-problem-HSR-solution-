class Solution {

    static class TrieNode {
        TrieNode[] child = new TrieNode[2];
    }

    public int findMaximumXOR(int[] nums) {
        TrieNode root = new TrieNode();

        // Insert all numbers into Trie
        for (int num : nums) {
            insert(root, num);
        }

        int maxXor = 0;

        // Find maximum XOR for each number
        for (int num : nums) {
            maxXor = Math.max(maxXor, getMaxXor(root, num));
        }

        return maxXor;
    }

    private void insert(TrieNode root, int num) {
        TrieNode curr = root;

        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;

            if (curr.child[bit] == null) {
                curr.child[bit] = new TrieNode();
            }

            curr = curr.child[bit];
        }
    }

    private int getMaxXor(TrieNode root, int num) {
        TrieNode curr = root;
        int xor = 0;

        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;

            // Opposite bit gives 1 in XOR
            int opposite = 1 - bit;

            if (curr.child[opposite] != null) {
                xor |= (1 << i);
                curr = curr.child[opposite];
            } else {
                curr = curr.child[bit];
            }
        }

        return xor;
    }
}