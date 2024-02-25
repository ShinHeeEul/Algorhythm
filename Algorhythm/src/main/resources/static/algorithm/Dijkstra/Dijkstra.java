import java.util.PriorityQueue;

class Dijkstra {
    class Node implements Comparable<Node> {
        int index;
        int cost;

        public Node(int index, int cost) {
            this.index = index;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    static ArrayList<Node>[] graph;

    public void Dijkstra(int n, int start) {
        //todo: Write Here
    }
}