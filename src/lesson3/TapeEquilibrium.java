package lesson3;

import java.util.ArrayList;

/**
 A non-empty zero-indexed array A consisting of N integers is given. Array A represents numbers on a tape.

 Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P],
 A[P + 1], ..., A[N − 1].

 The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N
 − 1])|

 In other words, it is the absolute difference between the sum of the first part and the sum of the second part.

 For example, consider array A such that:

 A[0] = 3
 A[1] = 1
 A[2] = 2
 A[3] = 4
 A[4] = 3
 We can split this tape in four places:

 P = 1, difference = |3 − 10| = 7
 P = 2, difference = |4 − 9| = 5
 P = 3, difference = |6 − 7| = 1
 P = 4, difference = |10 − 3| = 7
 Write a function:

 int solution(int A[], int N);

 that, given a non-empty zero-indexed array A of N integers, returns the minimal difference that can be achieved.

 For example, given:

 A[0] = 3
 A[1] = 1
 A[2] = 2
 A[3] = 4
 A[4] = 3
 the function should return 1, as explained above.

 Assume that:

 N is an integer within the range [2..100,000];
 each element of array A is an integer within the range [−1,000..1,000].
 Complexity:

 expected worst-case time complexity is O(N);
 expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input
 arguments).
 Elements of input arrays can be modified.

 ======================================================================================================

 비어있지 않은 배열 A는 N개의 정수로 구성되어 있다. 배열 A는 테잎의 숫자들을 나타낸다.

 0 < P < N 인 정수 P는 테잎을 비어있지 않은 두 파트로 나눈다:
 A[0], A[1], ..., A[P − 1], A[P], A[P + 1], ..., A[N − 1].

 두 파트간의 차이 값을 구하는 식은 :
 |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|

 다시 말하면, 첫 파트의 합계와 두번째 파트의 합계 차이값의 절대값이다.

 예를 들어 다음과 같은 배열 A가 있다면:
 A[0] = 3
 A[1] = 1
 A[2] = 2
 A[3] = 4
 A[4] = 3

 4가지 방법으로 나눌 수 있다.:
 P = 1, 차이 = |3 − 10| = 7
 P = 2, 차이 = |4 − 9| = 5
 P = 3, 차이 = |6 − 7| = 1
 P = 4, 차이 = |10 − 3| = 7

 함수 작성:
 int solution(int A[], int N);

 N 개의 정수로 구성된 비어있지 않은 배열 A, 차이값의 최소값을 리턴한다.

 예를 들어
 A[0] = 3
 A[1] = 1
 A[2] = 2
 A[3] = 4
 A[4] = 3
 가 주어진다면, 상술 한 바와 같이 함수는 1을 리턴하게 된다.

 가정:
 N 은 [2..100,000] 범위의 정수
 배열의 각 요소는 [−1,000..1,000] 범위의 정수

 복잡도 :
 최악의 시간복잡도는 O(N)
 최악의 공간복잡도는 O(N) (입력값을 위한 공간 제외)
 배열의 요소는 수정 가능하다.
  */
public class TapeEquilibrium {
	public static int[] A = {3,1,2,4,3};
	//public static int[] A = {1000, -1000};

	public static int solution(int A[]) {
		int N = A.length;

		int firstPartSum = 0;
		int secondPartSum = 0;
		int minSum = 0;

		for (int i = 1; i < N; i++) {
			secondPartSum += A[i];
		}
		firstPartSum = A[0];
		minSum = Math.abs(firstPartSum - secondPartSum);

		for (int i = 1; i < N - 1; i++) {
			firstPartSum += A[i];
			secondPartSum -= A[i];
			int sum = Math.abs(firstPartSum - secondPartSum);
			if (sum < minSum) {
				minSum = sum;
			}
		}

		return minSum;
	}



	public static void main(String[] args) {
		int result = solution(A);
		System.out.println("result : " + result);
	}

}
