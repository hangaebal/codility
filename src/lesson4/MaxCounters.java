package lesson4;

import java.util.Arrays;

/**
You are given N counters, initially set to 0, and you have two possible operations on them:
- increase(X) − counter X is increased by 1,
- max counter − all counters are set to the maximum value of any counter.

A non-empty zero-indexed array A of M integers is given. This array represents consecutive operations:
- if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
- if A[K] = N + 1 then operation K is max counter.

For example, given integer N = 5 and array A such that:
    A[0] = 3
    A[1] = 4
    A[2] = 4
    A[3] = 6
    A[4] = 1
    A[5] = 4
    A[6] = 4
the values of the counters after each consecutive operation will be:
    (0, 0, 1, 0, 0)
    (0, 0, 1, 1, 0)
    (0, 0, 1, 2, 0)
    (2, 2, 2, 2, 2)
    (3, 2, 2, 2, 2)
    (3, 2, 2, 3, 2)
    (3, 2, 2, 4, 2)
The goal is to calculate the value of every counter after all operations.

Write a function:
class Solution { public int[] solution(int N, int[] A); }
that, given an integer N and a non-empty zero-indexed array A consisting of M integers, 
returns a sequence of integers representing the values of the counters.

The sequence should be returned as:
- a structure Results (in C), or
- a vector of integers (in C++), or
- a record Results (in Pascal), or
- an array of integers (in any other programming language).

For example, given:
    A[0] = 3
    A[1] = 4
    A[2] = 4
    A[3] = 6
    A[4] = 1
    A[5] = 4
    A[6] = 4
the function should return [3, 2, 2, 4, 2], as explained above.

Assume that:
N and M are integers within the range [1..100,000];
each element of array A is an integer within the range [1..N + 1].

Complexity:
expected worst-case time complexity is O(N+M);
expected worst-case space complexity is O(N), 
beyond input storage (not counting the storage required for input arguments).

Elements of input arrays can be modified.

=============================================================================

0으로 초기화 되어있는 N개의 카운터가 주어지고, 두 가지 연산이 있다.
- increase(X) − 카운터 X 를 1 증가시킨다.
- max counter − 모든 카운터를 카운터 최대값으로 설정한다.

M개의 정수로 구성된 비어있지 않은 배열 A가 주어진다. 이 배열은 다음의 연속적인 연산을 나타낸다.
- 만약 A[K] = X 가 1 ≤ X ≤ N 면 연산 K는 increase(X)이고,
- 만약 A[K] = N + 1 이면 연산 K 는 max counter 이다.

예를 들어, N = 5 이고 배열 A가 다음과 같이 주어진다면
	A[0] = 3
	A[1] = 4
	A[2] = 4
	A[3] = 6
	A[4] = 1
	A[5] = 4
	A[6] = 4

연속되는 각각의 연산 후에 카운터들의 값은 다음과 같을 것이다.
	(0, 0, 1, 0, 0)
	(0, 0, 1, 1, 0)
	(0, 0, 1, 2, 0)
	(2, 2, 2, 2, 2)
	(3, 2, 2, 2, 2)
	(3, 2, 2, 3, 2)
	(3, 2, 2, 4, 2)

목표는 모든 연산 후에 모든 카운터의 값을 산출하는 것이다.

함수 작성:
class Solution { public int[] solution(int N, int[] A); }
정수 N과 M개의 정수로 구성된 비어있지 않은 배열 A가 주어지고
카운터들의 값을 나타낸 연속된 정수를 리턴한다.

수열은 다음과 같아야 한다:
- 구조체 (C),
- 정수 벡터 (C++),
- 레코드 (Pascal),
- 정수 배열 (그 밖의 다른 프로그래밍 언어).

예를들어 다음과 같이 주어진다면
	A[0] = 3
	A[1] = 4
	A[2] = 4
	A[3] = 6
	A[4] = 1
	A[5] = 4
	A[6] = 4
위에서 설명한대로 함수는 [3, 2, 2, 4, 2]를 리턴해야 한다.

가정:
- N 과 M은 [1..100,000] 범위의 정수이다.
- 배열 A의 각 요소는 [1..N + 1] 범위의 정수이다.

복잡도:
- 최악의 시간복잡도는 O(N+M);
- 최악의 공간복잡도는 O(N), 입력 공간 제외.

입력된 배열의 요소는 수정 될 수 있다.

 */

public class MaxCounters {
	public static int N = 5;
	public static int[] A = {3,4,4,6,1,4,4};
	
    public static int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int maxCounter = 0;
        int minCounter = 0;
        
        for (int K = 0; K < A.length; K++) {
        	int X = A[K];
        	if (X == N + 1) {
        		minCounter = maxCounter;
        	} else {
        		int index = X - 1;
        		if (counters[index] < minCounter) {
        			counters[index] = minCounter + 1;
        		} else {
        			counters[index]++;
        		}
        
        		if (counters[index] > maxCounter) {
        			maxCounter = counters[index];
        		}
        	}
        }
        
        for (int i = 0; i < N; i++) {
        	if (counters[i] < minCounter) {
        		counters[i] = minCounter;
        	}
        
        }
        
        return counters;
    }
    
    public static void main(String[] args) {
    	int[] result = solution(N, A);
    	System.out.println(Arrays.toString(result));
    }
}
