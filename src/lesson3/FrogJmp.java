package lesson3;

/**
 A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to
 get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.

 Count the minimal number of jumps that the small frog must perform to reach its target.

 Write a function:

 class Solution { public int solution(int X, int Y, int D); }

 that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or
 greater than Y.

 For example, given:

 X = 10
 Y = 85
 D = 30
 the function should return 3, because the frog will be positioned as follows:

 after the first jump, at position 10 + 30 = 40
 after the second jump, at position 10 + 30 + 30 = 70
 after the third jump, at position 10 + 30 + 30 + 30 = 100

 Assume that:

 X, Y and D are integers within the range [1..1,000,000,000];
 X ≤ Y.

 Complexity:

 expected worst-case time complexity is O(1);
 expected worst-case space complexity is O(1).
 ================================================

 작은 개구리는 길을 건너고 싶어한다. 개구리는 현재 X 위치에 있고 Y 보다 같거나 큰 위치로 이동하길 원한다. 개구리는 항상 고정된 D 거리 만큼을 점프한다.

 작은 개구리가 목적을 달성할 수 있는 가장 작은 점프 횟수를 구해라.

 함수는 X, Y, D 세 개의 int 파라미터가 주어지고, X에서 Y보다 같거나 큰 위치로 이동시 가장 작은 점프 횟수를 리턴하도록 작성

 예를 들어
 X = 10
 Y = 85
 D = 30
 가 주어진다면 개구리가 아래처럼 이동하기 때문에 리턴은 3이다

 첫 점프 후 위치는     10 + 30 = 40
 두 번째 점프 후 위치는   10 + 30 + 30 = 70
 세 번째 점프 후 위치는  10 + 30 + 30 + 30 = 100

 가정 :
 X, Y, D 는 [1..1,000,000,000] 범위의 정수;
 X ≤ Y.

 복잡성 :
 최악의 시간 복잡도는 O(1).
 최악의 공간 복잡도는 O(1).
 */
public class FrogJmp {
	public static int X = 10;
	public static int Y = 85;
	public static int D = 30;

	public static int solution(int X, int Y, int D) {
		int jump = 0;
		int distance = Y - X;
		if (distance == 0) {
			return jump;
		}

		jump = distance / D;
		if (distance % D != 0) {
			jump++;
		}

		return jump;
	}

	public static void main(String[] args) {
		int result = solution(X, Y, D);
		System.out.println("result : " + result);
	}

}
