package lesson1;
/**
	A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at
	both ends in the binary representation of N.
	For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has
	binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20
	has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation
	1111 and has no binary gaps.
	
	Write a function:
	class Solution { public int solution(int N); }
	that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N
	doesn't contain a binary gap.
	For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its
	longest binary gap is of length 5.
	
	Assume that:
	N is an integer within the range [1..2,147,483,647].
	
	Complexity:
	expected worst-case time complexity is O(log(N));
	expected worst-case space complexity is O(1).
	
	===================================================================
	
	양의 정수 N가 가지고 있는 binary gap은 N을 2진수로 표현했을때 1로 둘러쌓인 연속적인 0의 갯수이다.
	
	예를들어, 숫자 9는 2진수로 1001이고 길이 2의 binary gap을 가지고 있다.
	숫자 529는 2진수로 1000010001이고 각각 길이 4, 3인 2개의 binary gap을 가지고 있다.
	숫자 20은 2진수로 10100이고 길이 1의 binary gap을 하나 가지고 있다.
	숫자 15는 2진수로 1111이고 binary gap이 없다.
	
	함수 작성:
	class Solution { public int solution(int N); }
	양의 정수 N이 주어지고, 제일 긴 binary gap 을 리턴한다. binary gap이 없다면 0을 리턴한다.
	
	예를 들어 N = 1041 이면 함수는 5를 리턴한다. 왜냐하면 N은 2진수로 10000010001 이고 가장 긴 binary gap은 5이기 때문이다.
	
	가정 :
	N은 [1..2,147,483,647] 범위의 정수
	
	복잡도 :
	최악의 시간복잡도는 O(log(N))
	최악의 공간복잡도는 O(1)
 */

class BinaryGap {
	public static int N = 2087654321;
	public static int maxGap = 0;

	public static int gapCheck(String binaryStr, int fromIndex) {
		int nextIndex = binaryStr.indexOf("1", fromIndex + 1);
		
		if (nextIndex == -1) {
			return nextIndex;
		}

		int gap = nextIndex - fromIndex - 1;
			if (gap > maxGap) {
			maxGap = gap;
		}

		return nextIndex;
	}


	public static int solution(int N) {
		System.out.println("INPUT : " + N);

		String binaryText = Integer.toString(N, 2);
		System.out.println("binaryText : " + binaryText);

		int nextIndex = 0;
		while (nextIndex > -1) {
			nextIndex = gapCheck(binaryText, nextIndex);
		}
		
		return maxGap;
	}

	public static void main(String[] args) {
		int result = solution(N);
		System.out.printf("MAX_GAP : %s\n", result);
	}
}
