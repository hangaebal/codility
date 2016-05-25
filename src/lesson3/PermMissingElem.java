package lesson3;

/**
 A zero-indexed array A consisting of N different integers is given.
 The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
 Your goal is to find that missing element.

 Write a function:
 class Solution { public int solution(int[] A); }
 that, given a zero-indexed array A, returns the value of the missing element.

 For example, given array A such that:
 A[0] = 2
 A[1] = 3
 A[2] = 1
 A[3] = 5
 the function should return 4, as it is the missing element.

 Assume that:
 N is an integer within the range [0..100,000];
 the elements of A are all distinct;
 each element of array A is an integer within the range [1..(N + 1)].

 Complexity:
 expected worst-case time complexity is O(N);
 expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input
 arguments).
 Elements of input arrays can be modified.

 ======================================================================================================

 배열 A는 N개의 각기 다른 정수로 구성된다.
 배열은 [1..(N + 1)] 범위의 정수를 포함하며, 단 하나의 요소만 빠져있다. 목표는 빠진 요소를 찾는 것이다.

 함수 작성 :
 class Solution { public int solution(int[] A); }
 배열 A를 받아서, 빠진 요소를 리턴한다.

 예를 들어 배열 A 가 다음과 같다면:
 A[0] = 2
 A[1] = 3
 A[2] = 1
 A[3] = 5
 함수는 빠진 요소인 4를 리턴 할 것이다.

 가정 :
 N은 [0..100,000] 범위의 정수;
 A의 요소는 모두 다르다.
 A의 각 요소는 [1..(N + 1)] 범위의 정수이다.

 복잡도:
 최악의 경우 시간복잡도는 O(N);
 최악의 경우 공간복잡도는 O(1), 입력 받을 공간 제외
 입력받은 배열의 요소는 수정될 수 있다.
 */
public class PermMissingElem {
	//public static int[] A = {2,3,1,5,6,9,8,7};
	public static int[] A = {3,2,1};

	public static int solution(int[] A) {
		int N = A.length + 1;
		long total = (long) N * (N + 1) / 2;

		for (int i : A) {
			total -= i;
		}

		return (int) total;
	}

	public static void main(String[] args) {
		int result = solution(A);
		System.out.println("result : " + result);
	}
}
