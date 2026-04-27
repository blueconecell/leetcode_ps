class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Node[] nodes = new Node[n];
        for(int i=0; i<n; i++){
            nodes[i] = new Node(nums[i],i);
        }
        Arrays.sort(nodes,(o1,o2)->o1.v-o2.v);
        // for(int i=0; i<n; i++){
        //     System.out.println(nodes[i].v);
        // }
        int left =0; 
        int right = n-1;
        int[] ans = {};

        while(left < right){
            int temp = nodes[left].v+nodes[right].v;
            if(temp == target){
                ans = new int[2];
                ans[0] = nodes[left].i;
                ans[1] = nodes[right].i;
                break;
            }else if(temp>target){
                right--;
            }else{
                left++;
            }
        }
        return ans;
    }
}

class Node{
    int v,i;
    public Node(int v, int i){
        this.v=v;
        this.i=i;
    }
}