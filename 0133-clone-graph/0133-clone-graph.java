/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null)return null;
        HashMap<Node,Node> visited = new HashMap<>();
        visited.put(node, new Node(node.val));
        ArrayDeque<Node> q = new ArrayDeque<>();
        q.offer(node);

        while(!q.isEmpty()){
            Node cur = q.poll();
            for(Node next: cur.neighbors){
                if(!visited.containsKey(next)){
                    visited.put(next, new Node(next.val));
                    q.offer(next);
                }
                visited.get(cur).neighbors.add(visited.get(next));
            }
        }
        return visited.get(node);
        
    }
}