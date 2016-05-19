import java.util.*;

/**
 A non-empty zero-indexed array A consisting of N integers is given. The array contains an odd number of elements,
 and each element of the array can be paired with another element that has the same value, except for one element
 that is left unpaired.

 For example, in array A such that:

 A[0] = 9 A[1] = 3 A[2] = 9
 A[3] = 3 A[4] = 9 A[5] = 7
 A[6] = 9
 the elements at indexes 0 and 2 have value 9,
 the elements at indexes 1 and 3 have value 3,
 the elements at indexes 4 and 6 have value 9,
 the element at index 5 has value 7 and is unpaired.
 Write a function:

 class Solution { public int solution(int[] A); }

 that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired
 element.

 For example, given array A such that:

 A[0] = 9 A[1] = 3 A[2] = 9
 A[3] = 3 A[4] = 9 A[5] = 7
 A[6] = 9
 the function should return 7, as explained in the example above.

 Assume that:

 N is an odd integer within the range [1..1,000,000];
 each element of array A is an integer within the range [1..1,000,000,000];
 all but one of the values in A occur an even number of times.
 Complexity:

 expected worst-case time complexity is O(N);
 expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input
 arguments).
 Elements of input arrays can be modified.

----------------------------------------------
 비어있지 않은 0부터 시작하는 배열 A는 숫자 N개를 포함한다.
 배열의 요소 갯수는 홀수고, 같은 값이 없는 한 요소를 제외한 각 요소는 다른 요소와 같은 값으로 짝을 이루게 된다.

 상기 요구사항을 만족하는 요소 수 N개의 배열 A가 주어지면 짝이 없는 요로를 리턴해라.

 N 은 [1..1,000,000] 범위의 홀수
 A의 각 요소의 범위는 [1..1,000,000,000]
 하나를 제외한 모든 값은 짝수번 반복된다.

 최악의 시간 복잡도는 O(N)
 최악의 공간 복잡도는 O(1)  (입력 변수에 필요한 공간은 계산하지 않음)
 입력받은 배열의 요소는 수정될 수 있다.

 */
public class OddOccurrencesInArray {
	public static int[] A = {9,3,9,3,9,7,9};

	public static int solution(int[] A){
		int N = A.length;
		HashSet<Integer> hashSet = new HashSet();
		for (int i = 0; i < N; i++) {
			int value = A[i];
			if ( !hashSet.remove(value)) {
				hashSet.add(value);
			}
		}

		int result = hashSet.iterator().next();
		return result;
	}

	public static void main(String[] args) {
		int result = solution(A);
		System.out.println("result : " + result);
	}

}
