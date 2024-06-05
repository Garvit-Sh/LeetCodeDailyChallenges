class Solution {
    List<Integer> al = new ArrayList<>();
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> mp: hm.entrySet()){
            if(mp.getValue()>1){
                al.add(mp.getKey());
            }
        }
        return al;
    }
}
