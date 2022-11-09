import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class DistBFS {

    public static void main(String[] args) {
        int V = 7;
        int E = 8;

        ArrayList<Integer>[] adjlist = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adjlist[i] = new ArrayList<Integer>();
        }

        /*
			1 7
			2 6
			2 7
			3 4
			3 5
			3 6
			5 6
			5 7
         */
        
        adjlist[0].add(6);

        adjlist[1].add(5);
        adjlist[1].add(6);
        
        adjlist[2].add(3);
        adjlist[2].add(4);
        adjlist[2].add(5);

        adjlist[4].add(5);
        adjlist[4].add(6);
        adjlist[4].add(2);
        
        adjlist[5].add(1);
        adjlist[5].add(2);
        adjlist[5].add(4);
        
        adjlist[6].add(1);
        adjlist[6].add(4);

        LinkedList<Integer> queue = new LinkedList<Integer>();
//        boolean[] visited = new boolean[V];
        int[] dist = new int[V];
        for (int i = 0; i < V; i++) {
        	dist[i] = -1;
        }
        
        
        queue.add(0);
//        visited[0] = true;
        dist[0] = 0;

        while(!queue.isEmpty()) {
            int u = queue.pop();
            for (int i = 0; i < adjlist[u].size(); i++) {
                int v = adjlist[u].get(i);
//                if (!visited[v]) {
//                    visited[v] = true;
//                    queue.add(v);
//                }
                if (dist[v] == -1) {
                    dist[v] = dist[u] + 1;
                    queue.add(v);
                }
            }
        }

        for (int i = 0; i < dist.length; i++) {
            System.out.println(dist[i]);
        }











    }

}
