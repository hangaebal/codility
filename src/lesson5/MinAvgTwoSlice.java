package lesson5;

import java.util.Arrays;

/**
A non-empty zero-indexed array A consisting of N integers is given.
A pair of integers (P, Q), such that 0 ≤ P < Q < N, is called a slice of array A
(notice that the slice contains at least two elements).
The average of a slice (P, Q) is the sum of A[P] + A[P + 1] + ... + A[Q] divided by the length of the slice.
To be precise, the average equals (A[P] + A[P + 1] + ... + A[Q]) / (Q − P + 1).

For example, array A such that:
	A[0] = 4
	A[1] = 2
	A[2] = 2
	A[3] = 5
	A[4] = 1
	A[5] = 5
	A[6] = 8

contains the following example slices:
- slice (1, 2), whose average is (2 + 2) / 2 = 2;
- slice (3, 4), whose average is (5 + 1) / 2 = 3;
- slice (1, 4), whose average is (2 + 2 + 5 + 1) / 4 = 2.5.

The goal is to find the starting position of a slice whose average is minimal.

Write a function:
class Solution { public int solution(int[] A); }

that, given a non-empty zero-indexed array A consisting of N integers,
returns the starting position of the slice with the minimal average.
If there is more than one slice with a minimal average,
you should return the smallest starting position of such a slice.

For example, given array A such that:
	A[0] = 4
	A[1] = 2
	A[2] = 2
	A[3] = 5
	A[4] = 1
	A[5] = 5
	A[6] = 8

the function should return 1, as explained above.

Assume that:
- N is an integer within the range [2..100,000];
- each element of array A is an integer within the range [−10,000..10,000].

Complexity:
- expected worst-case time complexity is O(N);
- expected worst-case space complexity is O(N),
beyond input storage (not counting the storage required for input arguments).

Elements of input arrays can be modified.

=============================================================================

N개의 정수로 구성된 비어있지 않은 배열 A가 주어진다. 0 ≤ P < Q < N 인 정수 쌍(P, Q)은 배열 A의 'slice'라고 부른다.
(slice 는 최소 두 요소를 포함 한다는 것을 참고)
slice (P, Q)의 평균은 A[P] + A[P + 1] + ... + A[Q] 를 slice의 길이로 나눈 것이다.
정확하게는  (A[P] + A[P + 1] + ... + A[Q]) / (Q − P + 1) 이다.

예를 들어 배열 A가 다음과 같다면:
	A[0] = 4
	A[1] = 2
	A[2] = 2
	A[3] = 5
	A[4] = 1
	A[5] = 5
	A[6] = 8

다음과 같은 예시 slice를 포함한다.
- slice (1, 2), 평균은 (2 + 2) / 2 = 2;
- slice (3, 4), 평균은 (5 + 1) / 2 = 3;
- slice (1, 4), 평균은 (2 + 2 + 5 + 1) / 4 = 2.5.

목표는 평균이 최소인 slice 의 시작 지점을 찾는것이다.

함수 작성:
class Solution { public int solution(int[] A); }

N개의 정수로 구성된 비어있지 않은 배열 A가 주어지고, 최소 평균을 가지는 slice의 시작 지점을 리턴한다.
만약 최소 평균인 slice가 한 개 이상이라면, slice의 가장 작은 시작 지점을을 리턴해야 한다.

예를 들어 배열 A가 다음과 같다면:
	A[0] = 4
	A[1] = 2
	A[2] = 2
	A[3] = 5
	A[4] = 1
	A[5] = 5
	A[6] = 8

위에서 설명한대로 함수는 1을 리턴해야 한다.

가정:
- N은 [2..100,000] 사이의 정수
- 배열 A의 각 요소는 [−10,000..10,000] 사이의 정수

복잡도:
- 최악의 시간복잡도는 O(N);
- 최악의 공간복잡도는  O(N), (입력 공간 제외)
 */

public class MinAvgTwoSlice {
	//public static int[] A = {4,2,2,5,1,5,8};
	public static int[] A = {3,2,2,1,1,3,1,2,1,0,0};

	public static int solution2(int[] A) {
		int N = A.length;
		float aver2;
		float aver3;
		float averLast2;
		float min = Float.MAX_VALUE;
		int index = 0;

		for (int i = 0; i < N - 2; i++) {
			aver2 = (A[i] + A[i + 1]) / 2f;
			if (aver2 < min) {
				index = i;
				min = aver2;
			}

			aver3 = (A[i] + A[i + 1] + A[i + 2]) / 3f;
			if (aver3 < min) {
				index = i;
				min = aver3;
			}
		}

		averLast2 = (A[N - 1] + A[N - 2]) / 2f;
		if (averLast2 < min) {
			index = N - 2;
		}

		return index;
	}


	public static int solution(int[] A) {
		int N = A.length;
		int index = 0;
		int[] prefixSums = new int[N + 1];
		float min = Float.MAX_VALUE;
		float average = 0;

		for (int i = 0; i < N; i++) {
			// 인덱스별 누적 합계
			prefixSums[i + 1] = prefixSums[i] + A[i];
		}

		// n 은 slice length
		// length 2 or 3의 슬라이스에서 최소 평균이 나온다는 증명을 활용
		for (int n = 2; n <= 3; n++) {
			// i 는 slice index
			for (int i = 0; i < N - n + 1; i++) {
				average = (prefixSums[i + n] - prefixSums[i]) / (float) n;
				if (average < min) {
					min = average;
					index = i;
				}
			}
		}

		return index;
	}

	public static void main(String[] arg) {
		int result = solution(A);
		System.out.println(result);
	}

}
