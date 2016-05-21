package lesson2;
/**
 * A zero-indexed array A consisting of N integers is given. Rotation of the array means that each element is shifted
 * right by one index, and the last element of the array is also moved to the first place.
 * <p>
 * For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]. The goal is to rotate array A K times;
 * that is, each element of A will be shifted to the right by K indexes.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int[] solution(int[] A, int K); }
 * <p>
 * that, given a zero-indexed array A consisting of N integers and an integer K, returns the array A rotated K times.
 * <p>
 * For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3, 8].
 * <p>
 * Assume that:
 * <p>
 * N and K are integers within the range [0..100];
 * each element of array A is an integer within the range [−1,000..1,000].
 * In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
 *
 * 0부터 시작하는 배열 A, 숫자 N
 * 배열 회전은 각 요소를 우측으로 K 번씩 밀고 마지막 요소는 맨 처음으로 옮기는걸 의미한다.
 * N, K는 0~100
 * 배열의 각 요소는 -1000 ~ 1000
 * 해결 중점은 정확도다. 퍼포먼스는 평가의 중점이 아니다.
 *
 */
public class CyclicRotation {
	static int[] A = {-3, 8, 9, 7, 6, 8, 9};
	static int K = 100;

	public int[] solution(int[] A, int K) {
		// write your code in Java SE 8
		int N = A.length;
		// K = 0, N <=1 대응
		if (N <= 1 || K == 0) {
			return A;
		}

		// K >= N 대응
		K = K % N;

		int[] result = new int[N];
		for (int i = 0; i < N; i++) {
			System.out.printf("%s ", A[i]);
			if (i+K < N) {
				result[i + K] = A[i];
			} else {
				result[i + K - N] = A[i];
			}
		}

		return result;
	}

	public static void main(String[] args) {
		CyclicRotation cyclicRotation = new CyclicRotation();

		int[] result = cyclicRotation.solution(A, K);
		System.out.print("\nresult : ");
		for (int i = 0; i < result.length; i++) {
			System.out.printf("%s ", result[i]);
		}
		System.out.println();
	}
}
