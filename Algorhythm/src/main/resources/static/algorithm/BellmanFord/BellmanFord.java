class BellmanFord {
    class Edge {
        int v; //나가는 노드
        int w; //들어오는 노드
        int cost;

        public Edge(int v, int w, int cost) {
            this.v = v;
            this.w = w;
            this.cost = cost;
        }
    }

    static ArrayList<Edge> graph;

    public boolean BellmanFord(int n, int m, int start) {
        //todo: Write Here
    }
}