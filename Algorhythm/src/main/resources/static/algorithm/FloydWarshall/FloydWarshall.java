public class FloydWarshall {

    public static void floydWarshall() {
        int[][] D = new int[N][N];

        //갈 수 없는 경로 확인
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(i == j) continue;
                if(D[i][j] == 0) D[i][j] = Integer.MAX_VALUE;
            }
        }

        //플로이드 워셜
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(i == j) continue; //출발지와 경유지가 같으면 다음 탐색

                for(int k = 0; k < N; k++) {
                    if(i == k || j == k) continue; //출발지와 도착지가 같거나 도착지가 경유지면 다음 탐색
                    D[j][k] = Math.min(D[j][i] + D[i][k], D[j][k]); // 경유하거나 직접가거나 더 짧은 경로로 대체
                }
            }
        }
    }
}