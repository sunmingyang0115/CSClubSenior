
import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class SimpleBFS {

    public static void main(String[] args) {
        int V = 6;
        int E = 6;

        ArrayList<Integer>[] adjlist = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adjlist[i] = new ArrayList<Integer>();
        }

        adjlist[0].add(1);
        adjlist[0].add(2);
        adjlist[0].add(4);

        adjlist[1].add(0);
        adjlist[1].add(4);

        adjlist[2].add(4);
        adjlist[2].add(0);

        adjlist[4].add(1);
        adjlist[4].add(2);

        LinkedList<Integer> queue = new LinkedList<Integer>();
        boolean[] visited = new boolean[V];

        queue.add(0);
        visited[0] = true;

        while(!queue.isEmpty()) {
            int u = queue.pop();
            for (int i = 0; i < adjlist[u].size(); i++) {
                int v = adjlist[u].get(i);
                if (!visited[v]) {
                    visited[v] = true;
                    queue.add(v);
                }
            }
        }

        for (int i = 0; i < visited.length; i++) {
            System.out.println(visited[i]);
        }











    }

}
