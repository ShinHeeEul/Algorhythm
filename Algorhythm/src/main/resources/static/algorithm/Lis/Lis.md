# LIS(Longest Increasing Subsequence) : 최장 증가 부분 수열
- 어떠한 수열에서 오름차순으로 증가하는 가장 긴 부분수열을 찾는 것

## dp를 이용한 방법
- 정확한 LIS를 구할 때 사용
- 시간 복잡도 : O(N ^ 2)
1) k의 앞 순서에 있는 모든 원소들 중 값이 k보다 작은 원소에 대해, 각각의 원소에서 끝나는 최장 증가 수열의 길이를 알고 있으면 구할 수 있음.
2) dp[i] = i번째 인덱스에서 끝나는 최장 증가 수열의 길이

## 이분 탐색을 이용한 방법
- 정확한 LIS가 아닌 길이만 구할 때 사용
- 시간 복잡도 : O(NlogN)
1) 배열을 하나 더 두고 원래 수열에서의 각 원소에 대해 LIS 배열 내에서의 위치를 찾음.
2) 기존 배열을 탐색
2) 현재 수가 배열의 마지막 값보다 크다면 LIS 내 배열에 추가
3) 현재 수가 배열의 마지막 값보다 작다면 이분 탐색을 통해 들어갈 위치를 찾고 교체.
    1) 이분 탐색 시, start = 0, end = 현재 위치이며 start < end동안 반복 -> end 값으로 교체