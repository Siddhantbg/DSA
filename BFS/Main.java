package BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    //static when objects (instances) of the class are not required or used
    public static void BFS(int vtx, int[][] A, int n) {
        Queue<Integer> Q = new LinkedList<>();
        boolean[] visited = new boolean[n + 1]; // Boolean array to track visited vertices

        // Initial
        System.out.print(vtx + ", ");
        visited[vtx] = true;
        Q.add(vtx);

        // Explore
        while (!Q.isEmpty()) {
            int u = Q.poll(); // Vertex u for exploring

            for (int v = 1; v <= n; v++) { // Adjacent vertices of vertex u
                if (A[u][v] == 1 && !visited[v]) { // Adjacent vertex and not visited
                    System.out.print(v + ", ");
                    visited[v] = true;
                    Q.add(v);
                }
            }
        }
        System.out.println(); // To move to the next line after traversal
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int n = scanner.nextInt();

        // Adjacency matrix input
        int[][] A = new int[n + 1][n + 1]; // Matrix size n+1 to index vertices starting from 1

        System.out.println("Enter the adjacency matrix:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                A[i][j] = scanner.nextInt(); // Reading matrix elements
            }
        }

        System.out.print("Enter the starting vertex for BFS: ");
        int startVertex = scanner.nextInt();

        if (startVertex < 1 || startVertex > n) {
            System.out.println("Invalid vertex! Please enter a valid vertex.");
        } else {
            System.out.println("BFS starting from vertex " + startVertex + " -> ");
            BFS(startVertex, A, n);
        }

        scanner.close();
    }
}
