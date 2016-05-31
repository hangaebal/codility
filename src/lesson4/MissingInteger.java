package lesson4;

import java.util.Arrays;

/**
 Write a function:
 class Solution { public int solution(int[] A); }
 that, given a non-empty zero-indexed array A of N integers,
 returns the minimal positive integer (greater than 0) that does not occur in A.

 For example, given:
 A[0] = 1
 A[1] = 3
 A[2] = 6
 A[3] = 4
 A[4] = 1
 A[5] = 2
 the function should return 5.

 Assume that:
 N is an integer within the range [1..100,000];
 each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].

 Complexity:
 expected worst-case time complexity is O(N);
 expected worst-case space complexity is O(N),
 beyond input storage (not counting the storage required for input arguments).
 Elements of input arrays can be modified.

 ============================================================================================================

 함수 작성:
 class Solution { public int solution(int[] A); }
 N개의 정수로 구성된 배열 A가 주어지고, A에 없는 가장 작은 양수 (0보다 큰)를 리턴한다.

 예를들어
 A[0] = 1
 A[1] = 3
 A[2] = 6
 A[3] = 4
 A[4] = 1
 A[5] = 2
 가 주어지면 함수는 5를 리턴해야 한다.

 가정:
 N 은 [1..100,000] 범위의 정수
 배열 A의 각 요소는  [−2,147,483,648..2,147,483,647] 범위의 정수

 복잡도:
 최악의 시간복잡도는 O(N);
 최악의 공간복잡도는 O(N) (입력 공간 제외)
 배열의 요소들은 수정될 수 있다.

 */
public class MissingInteger {
	public static int[] A = {1,3,-6,4,1,-2,5,-3,-1};
	//public static int[] A = {-2147483648,2147483647};

	public static int solution(int[] A) {
		int N = A.length;
		int max = 0;

		// 오름차순 정렬
		Arrays.sort(A);

		// 최소값이 1보다 크거나(=1보다 큰 양수로만 구성), 최대값이 1보다 작으면(=음수로만 구성) 1 리턴
		if (A[0] > 1 || A[N - 1] < 1) {
			return 1;
		}

		for (int i = 0; i < N; i++) {
			// 양수만 체크
			if (A[i] > 0) {
				if (A[i] > max + 1) {
					// 이전 최대값과 1 이상 차이나는 경우 (=건너 뜀)
					// 건너 뛴 값 리턴
					return max + 1;
				}

				// 해당 값을 최대값으로 설정
				max = A[i];
			}
		}

		// 비어있는 값이 없는 경우 최대값 +1 리턴
		return A[N - 1] + 1;
	}

	public static void main(String[] args) {
		int result = solution(A);
		System.out.println(result);
	}

}
