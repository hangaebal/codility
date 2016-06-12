package lesson6;

import java.util.Arrays;

/**
A zero-indexed array A consisting of N integers is given.
A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:
	- A[P] + A[Q] > A[R],
	- A[Q] + A[R] > A[P],
	- A[R] + A[P] > A[Q].

For example, consider array A such that:
	A[0] = 10    A[1] = 2    A[2] = 5
	A[3] = 1     A[4] = 8    A[5] = 20
Triplet (0, 2, 4) is triangular.

Write a function:
	class Solution { public int solution(int[] A); }

that, given a zero-indexed array A consisting of N integers,
returns 1 if there exists a triangular triplet for this array and returns 0 otherwise.

For example, given array A such that:
	A[0] = 10    A[1] = 2    A[2] = 5
	A[3] = 1     A[4] = 8    A[5] = 20

the function should return 1, as explained above. Given array A such that:
	A[0] = 10    A[1] = 50    A[2] = 5
	A[3] = 1
the function should return 0.

Assume that:
	- N is an integer within the range [0..100,000];
	- each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].

Complexity:
	- expected worst-case time complexity is O(N*log(N));
	- expected worst-case space complexity is O(N),
	beyond input storage (not counting the storage required for input arguments).

Elements of input arrays can be modified.


====================================================================


정수 N개로 구성된 배열 A가 주어진다.
만약 3요소 (P, Q, R)가 0 ≤ P < Q < R < N 이고 다음과 같다면 'triangular' 라고 할 수 있다:
	- A[P] + A[Q] > A[R],
	- A[Q] + A[R] > A[P],
	- A[R] + A[P] > A[Q].

예를 들어 배열 A가 다음과 같다면:
	A[0] = 10    A[1] = 2    A[2] = 5
	A[3] = 1     A[4] = 8    A[5] = 20
세 요소 (0, 2, 4) 는 triangular 이다.

함수 작성:
	class Solution { public int solution(int[] A); }

정수 N개로 구성된 배열 A가 주어지고, triangular인 세 요소가 있다면 1을 리턴, 그렇지 않다면 0을 리턴한다.

예를 들어 배열 A가 다음과 같이 주어지면:
	A[0] = 10    A[1] = 2    A[2] = 5
	A[3] = 1     A[4] = 8    A[5] = 20

함수는 위에 설명한대로 1을 리턴해야한다. 주어진 배열 A 가 다음과 같다면:
	A[0] = 10    A[1] = 50    A[2] = 5
	A[3] = 1
함수는 0을 리턴해야 한다.

가정:
- N은 [0..100,000] 범위의 정수;
- 배열 A의 각 요소는 [−2,147,483,648..2,147,483,647] 범위의 정수

복잡도:
- 최악의 시간 복잡도는 O(N*log(N)).
- 최악의 공간 복잡도는 O(N), (입력 공간 제외)

배열의 요소는 수정할 수 있다.

 */
public class Triangle {
	public static int solution(int[] A) {
		int N = A.length;

		Arrays.sort(A);
		System.out.println(Arrays.toString(A));

		for (int i = 0; i < N - 2; i++) {
			if (A[i + 1] > A[i + 2] - A[i]&&
					A[i + 2] > A[i] - A[i + 1]&&
					A[i] > A[i + 1] - A[i + 2]) {
				return 1;
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		//int[] A = {10,2,5,1,8,20};
		//int[] A = {10,50,5,1};
		int max = Integer.MAX_VALUE;
		int[] A = {max, max, max};
		System.out.println(solution(A));
	}

}
