package lesson4;

/**
A non-empty zero-indexed array A consisting of N integers is given.
A permutation is a sequence containing each element from 1 to N once, and only once.

For example, array A such that:
A[0] = 4
A[1] = 1
A[2] = 3
A[3] = 2
is a permutation, but array A such that:
A[0] = 4
A[1] = 1
A[2] = 3
is not a permutation, because value 2 is missing.

The goal is to check whether array A is a permutation.

Write a function:
class Solution { public int solution(int[] A); }
that, given a zero-indexed array A, 
returns 1 if array A is a permutation and 0 if it is not.

For example, given array A such that:
A[0] = 4
A[1] = 1
A[2] = 3
A[3] = 2
the function should return 1.

Given array A such that:
A[0] = 4
A[1] = 1
A[2] = 3
the function should return 0.

Assume that:
N is an integer within the range [1..100,000];
each element of array A is an integer within the range [1..1,000,000,000].

Complexity:
expected worst-case time complexity is O(N);
expected worst-case space complexity is O(N), beyond input storage 
(not counting the storage required for input arguments).
Elements of input arrays can be modified.

============================================================================

정수 N개로 구성된 비어있지 않은 배열 A가 주어진다.
permutation이란 1부터 N까지 각 요소를 단 한 번만 포함하는 숫자들이다.

예를들어 배열 A가 다음과 같다면:
A[0] = 4
A[1] = 1
A[2] = 3
A[3] = 2
permutation이다. 하지만 배열 A가 다음과 같다면:
A[0] = 4
A[1] = 1
A[2] = 3
permutation이 아니다. 왜냐하면 2가 빠졌기 때문이다.

목표는 배열 A가 permutation인지 아닌지 확인하는 것이다.

함수 작성:
class Solution { public int solution(int[] A); }
배열 A가 주어지고, 배열 A가 permutation이라면 1을 리턴 아니면 0을 리턴한다.

예를들어 배열 A가 다음과 같다면
A[0] = 4
A[1] = 1
A[2] = 3
A[3] = 2
함수는 1을 리턴해야한다.

배열 A가 다음과 같다면:
A[0] = 4
A[1] = 1
A[2] = 3
함수는 0을 리턴해야한다.

가정:
N은 [1..100,000] 범위의 정수이다.
배열 A의 각 요소는 [1..1,000,000,000] 범위의 정수이다.

복잡도:
최악의 시간복잡도는 O(N);
최악의 공간복잡도는 O(N) (입력공간 제외)
입력 배열의 요소는 수정할 수 있다.
 */
public class PermCheck {
	public static int[] A = {4,1,2,3};
	public static int solution(int[] A) {
		int N = A.length;
		int[] check = new int[N + 1];
		
		for (int i = 0; i < N; i++) {
			int element = A[i];
			// 요소가 N보다 크거나, 배열에 중복된 수가 있다면 0
			if (element > N || check[element] > 0) {
				return 0;
			}
			check[element] = 1;
		}
		
		// 배열 전체 확인 후 문제 없다면 1
		return 1;
	}
	public static void main(String[] args) {
		int result = solution(A);
		System.out.println(result);
	}
}
