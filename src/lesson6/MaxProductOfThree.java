package lesson6;

/**
A non-empty zero-indexed array A consisting of N integers is given.
The product of triplet (P, Q, R) equates to A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N).

For example, array A such that:
	A[0] = -3
	A[1] = 1
	A[2] = 2
	A[3] = -2
	A[4] = 5
	A[5] = 6

contains the following example triplets:
	- (0, 1, 2), product is −3 * 1 * 2 = −6
	- (1, 2, 4), product is 1 * 2 * 5 = 10
	- (2, 4, 5), product is 2 * 5 * 6 = 60

Your goal is to find the maximal product of any triplet.

Write a function:
	class Solution { public int solution(int[] A); }
that, given a non-empty zero-indexed array A, returns the value of the maximal product of any triplet.

For example, given array A such that:
	A[0] = -3
	A[1] = 1
	A[2] = 2
	A[3] = -2
	A[4] = 5
	A[5] = 6
the function should return 60, as the product of triplet (2, 4, 5) is maximal.

Assume that:
	- N is an integer within the range [3..100,000];
	- each element of array A is an integer within the range [−1,000..1,000].

Complexity:
	- expected worst-case time complexity is O(N*log(N));
	- expected worst-case space complexity is O(1),
	beyond input storage (not counting the storage required for input arguments).

Elements of input arrays can be modified.


==================================================================


N개의 정수로 구성된 비어 있지 않은 배열 A가 주어진다.
세 요소 (P, Q, R)의 'product'(곱)는 A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N)와 같다.

예를 들어 배열 A가 다음과 같다면:
	A[0] = -3
	A[1] = 1
	A[2] = 2
	A[3] = -2
	A[4] = 5
	A[5] = 6

아래의 예시 세 요소를 포함하고:
- (0, 1, 2), product 는 −3 * 1 * 2 = −6 이다.
- (1, 2, 4), product 는 1 * 2 * 5 = 10 이다.
- (2, 4, 5), product 는 2 * 5 * 6 = 60 이다.

목표는 세 요소의 product 중 가장 큰 것을 찾는 것이다.

함수 작성:
	class Solution { public int solution(int[] A); }
N개의 정수로 구성된 비어 있지 않은 배열 A가 주어지고, 세 요소의 product 중 최대 값을 리턴한다.

예를 들어, 배열 A가 다음과 같다면:
	A[0] = -3
	A[1] = 1
	A[2] = 2
	A[3] = -2
	A[4] = 5
	A[5] = 6
세 요소 (2, 4, 5)의 product 가 최대 값 이므로 함수는 60을 리턴해야 한다.

가정:
	- N은 [3..100,000] 범위의 정수이다.
	- 배열 A의 각 요소는 [−1,000..1,000] 범위의 정수이다.

복잡도:
	- 최악의 시간 복잡도는 O(N*log(N));
	- 최악의 공간 복잡도는 O(1), 입력 공간 제외

배열의 요소는 수정할 수 있다.

 */
public class MaxProductOfThree {

}
