//TimeComplexity -- O(nlog)+O(nlogn)


class Solution {
    public boolean isNStraightHand(int[] hand, int gs) {
        if (hand.length % gs != 0)
            return false;
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for (int i = 0; i < hand.length; i++) {
            tm.put(hand[i], tm.getOrDefault(hand[i], 0) + 1);
        }

        while (tm.size() > 0) {
            int cur = tm.entrySet().iterator().next().getKey();
            for (int i = 0; i < gs; i++) {
                int card = cur + i;
                if (!tm.containsKey(card))
                    return false;
                tm.put(card, tm.get(card) - 1);
                if (tm.get(card) == 0)
                    tm.remove(card);
            }

        }
        return true;

    }
}
