package lesson7;

import java.util.Stack;

/**
You are given two non-empty zero-indexed arrays A and B consisting of N integers. 
Arrays A and B represent N voracious fish in a river,
ordered downstream along the flow of the river.

The fish are numbered from 0 to N − 1. If P and Q are two fish and P < Q, 
then fish P is initially upstream of fish Q. Initially, each fish has a unique position.

Fish number P is represented by A[P] and B[P]. 
Array A contains the sizes of the fish. All its elements are unique. 
Array B contains the directions of the fish. It contains only 0s and/or 1s, where:
	- 0 represents a fish flowing upstream,
	- 1 represents a fish flowing downstream.

If two fish move in opposite directions and there are no other (living) fish between them, 
they will eventually meet each other. Then only one fish can stay alive − the larger fish eats the smaller one. 
More precisely, we say that two fish P and Q meet each other when P < Q, B[P] = 1 and B[Q] = 0, 
and there are no living fish between them. After they meet:
	- If A[P] > A[Q] then P eats Q, and P will still be flowing downstream,
	- If A[Q] > A[P] then Q eats P, and Q will still be flowing upstream.
We assume that all the fish are flowing at the same speed. 
That is, fish moving in the same direction never meet.
 The goal is to calculate the number of fish that will stay alive.

For example, consider arrays A and B such that:
	- A[0] = 4    B[0] = 0
	- A[1] = 3    B[1] = 1
	- A[2] = 2    B[2] = 0
	- A[3] = 1    B[3] = 0
	- A[4] = 5    B[4] = 0
Initially all the fish are alive and all except fish number 1 are moving upstream. 
Fish number 1 meets fish number 2 and eats it, then it meets fish number 3 and eats it too. 
Finally, it meets fish number 4 and is eaten by it. The remaining two fish, 
number 0 and 4, never meet and therefore stay alive.

Write a function:
	class Solution { public int solution(int[] A, int[] B); }
that, given two non-empty zero-indexed arrays A and B consisting of N integers, 
returns the number of fish that will stay alive.

For example, given the arrays shown above, the function should return 2, as explained above.

Assume that:
	- N is an integer within the range [1..100,000];
	- each element of array A is an integer within the range [0..1,000,000,000];
	- each element of array B is an integer that can have one of the following values: 0, 1;
	- the elements of A are all distinct.
Complexity:
	- expected worst-case time complexity is O(N);
	- expected worst-case space complexity is O(N), beyond input storage 
	(not counting the storage required for input arguments).
	
Elements of input arrays can be modified.

==============================================================================

N개의 정수로 구성된 배열 A와 B가 주어진다. 배열 A와 B는 강의 흐름에 따라 순서가 매겨진, 
강 안의 게걸스러운 물고기 N마리를 나타낸다.

물고기는 0부터 N-1 까지로 숫자가 매겨져 있다. 만약 P < Q인 두 물고기가 있다면, 
물고기 P는 물고기 Q보다 초기에 상류에 있다. 초기에 각 물고기는 유일한 위치를 가진다.

물고기 P는 A[P]와 B[P]로 표현된다. 배열 A는 물고기의 크기를 포함한다. 모든 요소는 유일하다.
배열 B는 물고기의 방향을 포함한다. 오직 0 또는 1만 포함한다.
	- 0은 물고기가 상류로 흐르고 있음을 나타내고,
	- 1은 물고기가 하류로 흐르고 있음을 나타낸다.

만약 두 물고기가 반대되는 방향으로 움직이고 그 사이에 (살아있는) 다른 물고기가 없다면,
그들은 결국 서로 만나게 된다. 그렇게 되면 오직 한 물고기만 살아남을 수 있다 
- 더 큰 물고기가 작은 물고기를 먹는다. 더 정확하게는 P < Q,  B[P] = 1, B[Q] = 0 이고 
그사이에 살아있는 물고기가 없는 물고기 P와 Q가 서로 만나게 되면 그들이 만난 이후에는
	- 만약 A[P] > A[Q]이면 P가 Q를 먹고 P는 계속 하류로 흐르고,
	- 만약 A[P] < A[Q]이면 Q가 P를 먹고 Q는 계속 상류로 흐른다.

모든 물고기는 같은 속도로 흐른다고 가정한다. 물고기가 같은 방향으로 움직인다면
절대 만나지 않는다는 것이다. 목표는 살아남은 물고기의 숫자를 구하는 것이다.

예를 들어, 배열 A와 B가 다음과 같다고 생각하면:
	A[0] = 4    B[0] = 0
	A[1] = 3    B[1] = 1
	A[2] = 2    B[2] = 0
	A[3] = 1    B[3] = 0
	A[4] = 5    B[4] = 0
초기에는 모든 물고기가 살아있고, 물고기 1을 제외한 모든 물고기가 상류로 움직인다. 
물고기 1은 물고기 2를 만나고 먹는다. 그리고 물고기 3을 만나서 역시 먹는다. 
마지막으로 물고기 4를 만나서 먹힌다. 남은 두 물고기 0과 4는 절대 만나지 않고 영원히 살아남는다.

함수 작성
	class Solution { public int solution(int[] A, int[] B); }
N개의 정수로 구성된 배열 A와 B가 주어지고, 살아남은 물고기의 숫자를 리턴한다.

예를 들어, 위에 본 배열들이 주어진다면, 위에서 설명한 것처럼 함수는 2를 리턴해야한다.

가정:
	- N은 [1..100,000] 범위의 정수;
	- 배열 A의 요소는 [0..1,000,000,000] 범위의 정수;
	- 배열 B의 요소는 다음 값 중 하나를 가질 수 있다: 0, 1;
	- 배열 A의 요소는 모두 다르다.
	
복잡도:
	- 최악의 시간복잡도는 O(N);
	- 최악의 공간복잡도는 O(N), 입력 공간 제외

배열의 요소는 수정될 수 있다.
 */
public class Fish {
	public static int solution(int[] A, int[] B) {
		int N = A.length;
		int alive = N;
		Stack<Integer> downFishStack = new Stack<>();
		
		for (int i = 0; i < N; i++) {
			if (B[i] == 0) {	// up
				if ( !downFishStack.empty()) {
					while ( !downFishStack.empty()) {
						alive--;
						if (downFishStack.peek() > A[i]) {
							break;
						} else {
							downFishStack.pop();
						}
					}
				}
			} else {			// down
				downFishStack.push(A[i]);
			}
		}
		
		
		return alive;
	}
	
	public static void main(String[] args) {
		/*int[] A = {4,3,2,1,5};
		int[] B = {0,1,0,0,0};*/
		int[] A = {4,3,2,6,7,1,10,9,5,8};
		int[] B = {0,1,1,1,1,0,0,0,0,1};
		System.out.println(solution(A, B));
	}
	
	
}
