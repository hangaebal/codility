package lesson1;
/**
 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at
 * both ends in the binary representation of N.
 * <p>
 * For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has
 * binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20
 * has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation
 * 1111 and has no binary gaps.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int N); }
 * <p>
 * that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N
 * doesn't contain a binary gap.
 * <p>
 * For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its
 * longest binary gap is of length 5.
 * <p>
 * Assume that:
 * <p>
 * N is an integer within the range [1..2,147,483,647].
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(log(N));
 * expected worst-case space complexity is O(1).
 */
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
class BinaryGap {
	public static int MAX_GAP = 0;

	public int gapCheck(String binaryStr, int fromIndex) {
		int nextIndex = binaryStr.indexOf("1", fromIndex + 1);
		System.out.printf("nextIndex : %s\n", nextIndex);
		if (nextIndex == -1) {
			return nextIndex;
		}

		int gap = nextIndex - fromIndex - 1;
		System.out.printf("gap : %s\n", gap);
		if (gap > MAX_GAP) {
			MAX_GAP = gap;
		}

		return nextIndex;
	}


	public int solution(int N) {
		// write your code in Java SE 8
		System.out.println("INPUT : " + N);

		String binaryText = Integer.toString(N, 2);
		System.out.println("binaryText : " + binaryText);


		int nextIndex = 0;
		while (nextIndex > -1) {
			nextIndex = gapCheck(binaryText, nextIndex);
		}

		System.out.printf("MAX_GAP : %s\n", MAX_GAP);
		return MAX_GAP;
	}

	public static void main(String[] args) {
		BinaryGap solution = new BinaryGap();
		solution.solution(2087654321);
	}
}
