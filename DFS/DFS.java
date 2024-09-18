package DFS;

import java.util.Stack;

public class DFS {

    // Based on Lecture
    public static void DFS(int u, int[][] A, int n) {
        // Initialize visit tracking array and stack
        int[] visited = new int[8];
        Stack<Integer> stk = new Stack<>();
        stk.push(u);

        // Visit start vertex u
        System.out.print(u + ", ");
        visited[u] = 1;  // Visited vertex u

        // Initial Adjacent vertex
        int v = 0;

        while (!stk.isEmpty()) {
            while (v < n) {
                if (A[u][v] == 1 && visited[v] == 0) {
                    stk.push(u); // Suspend exploring current vertex u
                    u = v;  // Update current vertex as the next adjacent vertex

                    // Visit current vertex u
                    System.out.print(u + ", ");
                    visited[u] = 1;
                    v = -1;  // Increment will make this 0
                }
                v++;
            }
            v = u;  // Can set v = 0 but setting v = u is better
            u = stk.pop();  // Return to previous suspended vertex
        }
    }

    // Simpler and adds elements to stack from end
    public static void dfs(int u, int[][] A, int n) {
        int[] visited = new int[8];
        Stack<Integer> stk = new Stack<>();
        stk.push(u);

        while (!stk.isEmpty()) {
            u = stk.pop();

            if (visited[u] != 1) {
                System.out.print(u + ", ");
                visited[u] = 1;

                for (int v = n - 1; v >= 0; v--) {
                    if (A[u][v] == 1 && visited[v] == 0) {
                        stk.push(v);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        int[][] A = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 0, 1, 0, 0, 0, 0},
                {0, 1, 1, 0, 1, 1, 0, 0},
                {0, 1, 0, 1, 0, 1, 0, 0},
                {0, 0, 0, 1, 1, 0, 1, 1},
                {0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0}
        };

        int u = 5;
        System.out.print("DFS Vertex: " + u + " -> ");
        DFS(u, A, 8);
        System.out.println();

        System.out.print("dfs Vertex: " + u + " -> ");
        dfs(u, A, 8);
        System.out.println();
    }
}
