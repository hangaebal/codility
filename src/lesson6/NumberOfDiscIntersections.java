package lesson6;

/**
We draw N discs on a plane. The discs are numbered from 0 to N − 1.
A zero-indexed array A of N non-negative integers, specifying the radiuses of the discs, is given.
The J-th disc is drawn with its center at (J, 0) and radius A[J].

We say that the J-th disc and K-th disc intersect if J ≠ K and the J-th and K-th discs
have at least one common point (assuming that the discs contain their borders).

The figure below shows discs drawn for N = 6 and A as follows:
	A[0] = 1
	A[1] = 5
	A[2] = 2
	A[3] = 1
	A[4] = 4
	A[5] = 0

There are eleven (unordered) pairs of discs that intersect, namely:
	- discs 1 and 4 intersect, and both intersect with all the other discs;
	- disc 2 also intersects with discs 0 and 3.

Write a function:
	class Solution { public int solution(int[] A); }

that, given an array A describing N discs as explained above,
returns the number of (unordered) pairs of intersecting discs.
The function should return −1 if the number of intersecting pairs exceeds 10,000,000.

Given array A shown above, the function should return 11, as explained above.

Assume that:
	- N is an integer within the range [0..100,000];
	- each element of array A is an integer within the range [0..2,147,483,647].

Complexity:
	- expected worst-case time complexity is O(N*log(N));
	- expected worst-case space complexity is O(N),
beyond input storage (not counting the storage required for input arguments).

Elements of input arrays can be modified.

=======================================================================

우리는 평면에 N개의 디스크를 그린다. 디스크 들은 0 부터 N - 1로 번호가 매겨진다.
디스크의 반지름으로 구분되는 N개의 음수가 아닌 정수 배열 A가 주어진다.

J번째 디스크는 중앙이 (J, 0)이고 반지름 A[J] 으로 그려진다.

J ≠ K이고 J번째 디스크와 K번째 디스크가 적어도 하나의 공통 지점이 있다면(디스크에 경계선도 포함한다고 가정한다.)
J번째 디스크와 K번째 디스크가 '교차'(intersect)한다고 말한다.

N = 6이고 A가 다음과 같다면 디스크들이 그려진 도형은 아래처럼 보여진다:
A[0] = 1
A[1] = 5
A[2] = 2
A[3] = 1
A[4] = 4
A[5] = 0

11개의 디스크가 교차하는 쌍이 11개(정렬되지 않은) 있다:
디스크 1과 디스크 4는 서로 교차하고, 다른 모든 디스크들과 교체한다;
디스크 2도 디스크 0, 디스크 3과 교차한다.

함수 작성:
class Solution { public int solution(int[] A); }
위에 설명한 것 같은 N개의 디스크로 표현되는 배열 A가 주어지고, 교차되는 디스크 쌍의 갯수(정렬되지 않은)를 리턴한다.
교차 쌍이 10,000,000를 초과하면 함수는 -1을 리턴해야 한다.

위에서 본 배열 A가 주어지면, 위에서 설명한 것 처럼 함수는 11을 리턴해야한다.

가정:
- N은 [0..100,000] 범위의 정수;
- A의 각 요소는 [0..2,147,483,647] 범위의 정수.

복잡도:
- 최악의 시간 복잡도는 O(N*log(N));
- 최악의 공간 복잡도는 O(N), 입력 공간 제외.

입력된 배열의 요소는 수정할 수 있다.
 */
public class NumberOfDiscIntersections {

}
