class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> temp = new ArrayList<>();
        for(int a : stones){
            temp.add(a);
        }
        Collections.sort(temp);

        while(temp.size() > 1){

            int b = temp.get(temp.size()-1);
            int a = temp.get(temp.size()-2);

            if(a == b){
                temp.remove(temp.size()-1);
                temp.remove(temp.size()-1);
            }else{
                temp.remove(temp.size()-2);
                temp.set(temp.size()-1, b-a);
                Collections.sort(temp);
            }
        }
        return temp.size()>0 ? temp.get(0):0;
    }
}
