package lesson4;

/**
A small frog wants to get to the other side of a river. 
The frog is initially located on one bank of the river (position 0) 
and wants to get to the opposite bank (position X+1). 
Leaves fall from a tree onto the surface of the river.

You are given a zero-indexed array A consisting of N integers 
representing the falling leaves. A[K] represents the position 
where one leaf falls at time K, measured in seconds.

The goal is to find the earliest time when the frog can jump 
to the other side of the river. 
The frog can cross only when leaves appear at every position across the river from 1 to X 
(that is, we want to find the earliest moment when all the positions from 1 to X 
are covered by leaves). 
You may assume that the speed of the current in the river is negligibly small, 
i.e. the leaves do not change their positions once they fall in the river.

For example, you are given integer X = 5 and array A such that:
A[0] = 1
A[1] = 3
A[2] = 1
A[3] = 4
A[4] = 2
A[5] = 3
A[6] = 5
A[7] = 4
In second 6, a leaf falls into position 5. 
This is the earliest time when leaves appear in every position across the river.

Write a function:
class Solution { public int solution(int X, int[] A); }

that, given a non-empty zero-indexed array A consisting of N integers and integer X, 
returns the earliest time when the frog can jump to the other side of the river.

If the frog is never able to jump to the other side of the river, 
the function should return −1.

For example, given X = 5 and array A such that:
A[0] = 1
A[1] = 3
A[2] = 1
A[3] = 4
A[4] = 2
A[5] = 3
A[6] = 5
A[7] = 4
the function should return 6, as explained above.

Assume that:
N and X are integers within the range [1..100,000];
each element of array A is an integer within the range [1..X].

Complexity:
expected worst-case time complexity is O(N);
expected worst-case space complexity is O(X), beyond input storage 
(not counting the storage required for input arguments).
Elements of input arrays can be modified.

===================================================================================================

작은 개구리는 강의 반대편으로 가고 싶어 한다.
개구리는 처음에 강 둑 한 곳(위치 0)에 위치해 있고 반대쪽 둑(위치 X+1)으로 가고 싶어 한다.
잎들은 나무에서 강 표면으로 떨어진다.

떨어진 잎을 표현하는 N 개의 정수로 이루어진 배열 A가 주어진다.
A[K]는 K초에 떨어지는 잎의 위치를 표시한다.

목표는 개구리가 강의 반대편으로 점프할 수 있는 가장 빠른 시간을 찾는것이다.
개구리는 1부터 X 위치 까지 강을 건너는 동안 잎이 나타날 때만 이동할 수 있다.
(우리는 잎이 있는 위치만으로 1부터 X까지 이동하는 가장 빠른 시간을 찾기 원한다는 것이다.)
강에 있는 동안의 속도는 무시할 만큼 작다고 가정할 것이다. 
즉 잎은 강에 떨어진 후에 위치가 변하지 않는다.

예를 들어 정수 X = 5 이고 배열 A가 다음과 같다면
A[0] = 1
A[1] = 3
A[2] = 1
A[3] = 4
A[4] = 2
A[5] = 3
A[6] = 5
A[7] = 4
6초에 잎이 위치 5에 떨어진다.
이것이 잎이 강을 가로 지르는 모든 위치에 나타나는 가장 빠른 시간이다.

함수 작성:
class Solution { public int solution(int X, int[] A); }
N개의 정수로 구성된 비어있지 않은 배열 A와 정수X가 주어지면
개구리가 강의 반대편으로 점프할 수 있는 가장 작은 시간을 리턴한다.

만약 개구리가 강의 반대편으로 점프할 수 없다면, 함수는 -1을 리턴해야 한다.

예를들어 정수 X = 5 이고 배열 A가 다음과 같다면
A[0] = 1
A[1] = 3
A[2] = 1
A[3] = 4
A[4] = 2
A[5] = 3
A[6] = 5
A[7] = 4
위에서 설명한 것처럼 함수는 6을 리턴해야한다.

가정 :
N 과 X는 [1..100,000] 범위의 정수;
A의 모든 요소는 [1..X] 범위의 정수이다.

복잡도 :
최악의 시간복잡도는 O(N);
최악의 공간복잡도는 O(X) (입력 공간 제외)
배열의 모든 요소는 수정 가능하다.
 */
public class FrogRiverOne {
	public static int[] A = {3,1,1,4,2,3,5,4};
	public static int X = 5;
	
	public static int solution(int X, int[] A) {
		boolean[] check = new boolean[X];
		int count = 0;
		
		for (int i = 0; i < A.length; i++) {
			int element = A[i] -1;
			if (!check[element]) {
				check[element] = true;
				count++;
				if (count == X) {
					return i;
				}
			}
			
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int result = solution(X, A);
		System.out.println(result);
	}

}
