class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int x : nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        int[] arr = new int[map.size()];
        int index = 0;

        for(int x :map.keySet()){
            arr[index] = x;
            index++;
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(map.get(arr[j])>map.get(arr[i])){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i] = arr[i];
        }
        return result;
    }
}
