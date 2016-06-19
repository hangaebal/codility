package lesson6;

import java.util.Arrays;

/**
Write a function
	class Solution { public int solution(int[] A); }

that, given a zero-indexed array A consisting of N integers,
returns the number of distinct values in array A.

Assume that:
	- N is an integer within the range [0..100,000];
	- each element of array A is an integer within the range [−1,000,000..1,000,000].

For example, given array A consisting of six elements such that:
	A[0] = 2    A[1] = 1    A[2] = 1
	A[3] = 2    A[4] = 3    A[5] = 1
the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.

Complexity:
	- expected worst-case time complexity is O(N*log(N));
	- expected worst-case space complexity is O(N),
	beyond input storage (not counting the storage required for input arguments).

Elements of input arrays can be modified.

==============================================================

함수 작성:
	class Solution { public int solution(int[] A); }

N개의 정수로 구성된 배열 A가 주어지고, 배열 A의 값의 수를 리턴한다.

가정:
	- N은 [0..100,000] 범위의 정수;
	- 배열의 각 요소는 [−1,000,000..1,000,000] 범위의 정수

예를 들어 다음과 같은 여섯 요소로 구성된 배열 A가 주어진다면:
	A[0] = 2    A[1] = 1    A[2] = 1
	A[3] = 2    A[4] = 3    A[5] = 1
함수는 3을 리턴 해야한다, 왜냐하면 배열 A에 별개의 값이 '1, 2, 3' 3개 있기 때문이다.

복잡도:
	- 최악의 시간 복잡도는 O(N*log(N));
	- 최악의 공간 복잡도는 O(N), 입력 공간 제외

배열의 요소는 수정할 수 있다.
 */
public class Distinct {
	public static int solution(int[] A){
		int N = A.length;
		if (N == 0) {
			return 0;
		} else if (N == 1){
			return 1;
		}

		int count = 1;
		Arrays.sort(A);

		for (int i = 0; i < N - 1; i++) {
			if (A[i] != A[i + 1]) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int[] A = {2,1,1,2,3,1};
		System.out.println(solution(A));
	}



}
