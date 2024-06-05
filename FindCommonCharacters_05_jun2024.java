//Time Complexity-O(n+n^2)=> O(n^2)
//Space Complexity - O(26+26)=> O(1)


class Solution {
    public List<String> commonChars(String[] words) {
        int[] freq = new int[26];
        String cwf = words[0];
        for (char ch : cwf.toCharArray()) {
            int index = ch - 'a';
            freq[index]++;

        }

        for (int i = 1; i < words.length; i++) {
            int[] crr = new int[26];
            String cur = words[i];
            for (char ch : cur.toCharArray()) {
                int index = ch - 'a';
                crr[index]++;
            }

            for (int j = 0; j < 26; j++) {
                freq[j] = Math.min(freq[j], crr[j]);
            }
        }
        List<String> ll = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                int cnt = freq[i];
                char c = (char) (i + 97);
                while (cnt > 0) {
                    ll.add("" + c);
                    cnt--;

                }
            }

        }

        return ll;

    }
}
