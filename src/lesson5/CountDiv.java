package lesson5;

/**
 Write a function:
 class Solution { public int solution(int A, int B, int K); }
 that, given three integers A, B and K,
 returns the number of integers within the range [A..B] that are divisible by K, i.e.:
 { i : A ≤ i ≤ B, i mod K = 0 }

 For example, for A = 6, B = 11 and K = 2, your function should return 3,
 because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.

 Assume that:
 A and B are integers within the range [0..2,000,000,000];
 K is an integer within the range [1..2,000,000,000];
 A ≤ B.

 Complexity:
 expected worst-case time complexity is O(1);
 expected worst-case space complexity is O(1).

 ============================================================================

 함수 작성:
 class Solution { public int solution(int A, int B, int K); }
 정수 A, B, K가 주어지고, 범위 [A..B] 안에서 K로 나누어 떨어지는 정수의 값을 리턴
 즉 : { i : A ≤ i ≤ B, i mod K = 0 }

 예를 들어 A = 6, B = 11, K = 2 면, 함수는 3을 리턴해야 한다.
 왜냐하면 범위 [6..11] 안에 2로 나누어 떨어지는 숫자가 6, 8, 10 3개 있기 때문이다.

 가정:
 A,B는 [0..2,000,000,000] 범위의 정수;
 K는 [1..2,000,000,000] 범위의 정수;
 A ≤ B.

 복잡도:
 최악의 시간복잡도는 O(1);
 최악의 공간복잡도는 O(1);

 */
public class CountDiv {
	public static int A = 10;
	public static int B = 10;
	public static int K = 5;

	public static int solution(int A, int B, int K) {
		int count = 0;
		// A == B 인 경우
		if (A == B) {
			if (A == 0 || A % K == 0) {
				count = 1;
			}
		} else {
			// A != B 인 경우
			// B 범위의 나누어 떨어지는 숫자에서
			count = B / K;
			// A 범위의 나누어 떨어지는 숫자를 뺀다
			count -= A / K;

			// A가 나누어 떨어질 경우 +1
			if (A % K == 0) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int result = solution(A, B, K);
		System.out.println(result);
	}

}
