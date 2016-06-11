package lesson6;

import java.util.Arrays;

/**
 https://codility.com/media/train/4-Sorting.pdf
 Python으로 작성된 예제를 Java로 옮김
 */
public class Sorting {
	/**
	 The idea: Find the minimal element and swap it with the first element of an array. Next,
	 just sort the rest of the array, without the first element, in the same way.
	 Notice that after k iterations (repetition of everything inside the loop) the first k elements
	 will be sorted in the right order (this type of a property is called the loop invariant)
	 * @param A
	 * @return
	 */
	public static int[] selectionSort(int[] A) {
		int N = A.length;

		for (int i = 0; i < N; i++) {
			int minimal = i;
			for (int j = i + 1; j < N; j ++) {
				if (A[j] < A[0]) {
					minimal = j;
				}
			}
			int temp = A[i];
			A[i] = A[minimal];
			A[minimal] = temp;
		}

		return A;
	}

	/**
	 The idea: First, count the elements in the array of counters (see chapter 2). Next, just iterate
	 through the array of counters in increasing order.
	 Notice that we have to know the range of the sorted values. If all the elements are in the
	 set {0, 1, . . . , k}, then the array used for counting should be of size k + 1. The limitation here
	 may be available memory.
	 * @return
	 */
	public static int[] countingSort(int[] A) {
		int N = A.length;
		int k = N + 1;
		int[] count = new int[k + 1];

		for (int i = 0; i < N; i++) {
			count[A[i]] += 1;
		}
		int p = 0;

		for (int i = 0; i < k + 1; i++) {
			for (int j = 0; j < count[i]; j++) {
				A[p] = i;
				p += 1;
			}
		}

		return A;
	}

	public static void main(String[] args) {
		int[] A = {5,2,8,14,1,16};
		int[] result = selectionSort(A);
		System.out.println(Arrays.toString(result));

		A = new int[]{4, 3, 2, 5, 0, 1};
		result = countingSort(A);
		System.out.println(Arrays.toString(result));
	}


}
