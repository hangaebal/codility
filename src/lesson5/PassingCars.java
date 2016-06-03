package lesson5;

/**
 A non-empty zero-indexed array A consisting of N integers is given.
 The consecutive elements of array A represent consecutive cars on a road.

 Array A contains only 0s and/or 1s:
 0 represents a car traveling east,
 1 represents a car traveling west.

 The goal is to count passing cars. We say that a pair of cars (P, Q), where 0 ≤ P < Q < N,
 is passing when P is traveling to the east and Q is traveling to the west.

 For example, consider array A such that:
 A[0] = 0
 A[1] = 1
 A[2] = 0
 A[3] = 1
 A[4] = 1
 We have five pairs of passing cars: (0, 1), (0, 3), (0, 4), (2, 3), (2, 4).

 Write a function:
 class Solution { public int solution(int[] A); }
 that, given a non-empty zero-indexed array A of N integers, returns the number of pairs of passing cars.
 The function should return −1 if the number of pairs of passing cars exceeds 1,000,000,000.

 For example, given:
 A[0] = 0
 A[1] = 1
 A[2] = 0
 A[3] = 1
 A[4] = 1
 the function should return 5, as explained above.

 Assume that:
 N is an integer within the range [1..100,000];
 each element of array A is an integer that can have one of the following values: 0, 1.

 Complexity:
 expected worst-case time complexity is O(N);
 expected worst-case space complexity is O(1),
 beyond input storage (not counting the storage required for input arguments).

 Elements of input arrays can be modified.

 =======================================================================================

 N개의 정수로 구성된 비어있지 않은 배열 A가 주어진다.
 배열 A의 연속된 요소는 길 위의 연속된 자동차를 나타낸다.

 배열 A는 0,1 만 포함한다:
 - 0 은 자동차가 동쪽으로 이동중임을 나타내고,
 - 1 은 자동차가 서쪽으로 이동중임을 나타낸다.

 목표는 통과하는 자동차를 세는것이다.
 자동차 한 쌍(P,Q)은 0 ≤ P < Q < N이고 P는 동쪽으로 이동하고 Q 는 서쪽으로 이동하며 통과할 때를 말한다.

 예를 들어 배열 A가 다음과 같다고 하면:
 A[0] = 0
 A[1] = 1
 A[2] = 0
 A[3] = 1
 A[4] = 1
 우리는 통과하는 차 중에 다섯 쌍을 가지고 있다 : (0, 1), (0, 3), (0, 4), (2, 3), (2, 4).

 함수 작성:
 class Solution { public int solution(int[] A); }
 정수 N개의 비어있지 않은 배열 A가 주어지고, 통과하는 차의 쌍 수를 리턴한다.

 통과하는 차의 쌍 수가 1,000,000,000를 초과하면 함수는 -1을 리턴해야 한다.

 예를들어 다음과 같이 주어진다면:
 A[0] = 0
 A[1] = 1
 A[2] = 0
 A[3] = 1
 A[4] = 1
 위에서 설명한대로 함수는 5를 리턴해야 한다.

 가정:
 - N은 [1..100,000] 범위의 정수이다.
 - 배열 A의 각 요소는 0, 1 중 하나의 값만을 가질 수 있다.

 복잡도:
 - 최악의 시간복잡도는 O(N);
 - 최악의 공간복잡도는 O(1), 입력 값 제외

 배열의 요소는 수정할 수 있다.

 */
public class PassingCars {
	//{1,1,1,1,0,0,0};
	//{0,1,0,1,1};
	//{0};
	//{1};
	//{1,1,1,1,1};
	//{0,0,0,0,0};
	//{0,0,0,1,1,1,1};
	//{1,1,1,0,0,0,0};
	public static int[] A = {0,0,0,0,0,1,1,1,1,1};

	public static int solution(int[] A) {
		int N = A.length;
		int zeroCnt = 0;
		long pairs = 0;

		for (int i = 0; i < N; i++) {
			if (A[i] == 0) {
				pairs -= zeroCnt;
				pairs += N - (i + 1);

				zeroCnt++;
			}
		}

		if (pairs > 1000000000) {
			return -1;
		}

		return (int) pairs;
	}

	public static void main(String[] args) {
		int result = solution(A);
		System.out.println(result);
	}
}
