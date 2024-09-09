Input Example:

Number of vertices (n): 4

Adjacency matrix:

0 1 1 0
1 0 1 1
1 1 0 0
0 1 0 0

Starting vertex for BFS: 1


Adjacency Matrix Representation:

    1  2  3  4
1 [ 0  1  1  0 ]
2 [ 1  0  1  1 ]
3 [ 1  1  0  0 ]
4 [ 0  1  0  0 ]

This means:

Vertex 1 is connected to 2 and 3.
Vertex 2 is connected to 1, 3, and 4.
Vertex 3 is connected to 1 and 2.
Vertex 4 is connected to 2.

Step-by-Step Dry Run:

Step 1: Initialization

n = 4 (number of vertices).
A is the adjacency matrix entered by the user.
startVertex = 1 (starting from vertex 1).
visited[] is initialized to {false, false, false, false, false} (for n + 1 vertices).
BFS starts by marking vertex 1 as visited (visited[1] = true) and adding it to the queue.
Queue: [1]
Output so far: 1,

Step 2: Begin BFS (Main Loop)

Iteration 1: Process vertex 1 (first in the queue).

Queue: [] (vertex 1 is dequeued).
Explore adjacent vertices of vertex 1:
Vertex 1 to vertex 1 (A[1][1] = 0) → not adjacent.
Vertex 1 to vertex 2 (A[1][2] = 1 and visited[2] = false) → add vertex 2 to queue and mark as visited.
Queue: [2]
Output so far: 1, 2,
Visited: {false, true, true, false, false}
Vertex 1 to vertex 3 (A[1][3] = 1 and visited[3] = false) → add vertex 3 to queue and mark as visited.
Queue: [2, 3]
Output so far: 1, 2, 3,
Visited: {false, true, true, true, false}
Vertex 1 to vertex 4 (A[1][4] = 0) → not adjacent.
Step 3: Continue BFS

Iteration 2: Process vertex 2 (first in the queue).

Queue: [3] (vertex 2 is dequeued).
Explore adjacent vertices of vertex 2:
Vertex 2 to vertex 1 (A[2][1] = 1 but visited[1] = true) → already visited.
Vertex 2 to vertex 2 (A[2][2] = 0) → not adjacent.
Vertex 2 to vertex 3 (A[2][3] = 1 but visited[3] = true) → already visited.
Vertex 2 to vertex 4 (A[2][4] = 1 and visited[4] = false) → add vertex 4 to queue and mark as visited.
Queue: [3, 4]
Output so far: 1, 2, 3, 4,
Visited: {false, true, true, true, true}
Step 4: Continue BFS

Iteration 3: Process vertex 3 (first in the queue).
Queue: [4] (vertex 3 is dequeued).
Explore adjacent vertices of vertex 3:
Vertex 3 to vertex 1 (A[3][1] = 1 but visited[1] = true) → already visited.
Vertex 3 to vertex 2 (A[3][2] = 1 but visited[2] = true) → already visited.
Vertex 3 to vertex 3 (A[3][3] = 0) → not adjacent.
Vertex 3 to vertex 4 (A[3][4] = 0) → not adjacent.
Queue remains unchanged: [4].
Step 5: Continue BFS

Iteration 4: Process vertex 4 (first in the queue).
Queue: [] (vertex 4 is dequeued).
Explore adjacent vertices of vertex 4:
Vertex 4 to vertex 1 (A[4][1] = 0) → not adjacent.
Vertex 4 to vertex 2 (A[4][2] = 1 but visited[2] = true) → already visited.
Vertex 4 to vertex 3 (A[4][3] = 0) → not adjacent.
Vertex 4 to vertex 4 (A[4][4] = 0) → not adjacent.
Step 6: Queue is Empty

The BFS traversal is complete because the queue is now empty.
Final Output:
The BFS traversal starting from vertex 1 visits vertices in the order:
1, 2, 3, 4,

Summary of the Dry Run:
Start at vertex 1 → visit 2, 3.
Process vertex 2 → visit 4.
Process vertex 3 → no new vertices to visit.
Process vertex 4 → no new vertices to visit.
End BFS (queue is empty).






