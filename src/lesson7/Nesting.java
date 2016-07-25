package lesson7;

import java.util.Stack;

/**

A string S consisting of N characters is called properly nested if:
	- S is empty;
	- S has the form "(U)" where U is a properly nested string;
	- S has the form "VW" where V and W are properly nested strings.

For example, string "(()(())())" is properly nested but string "())" isn't.

Write a function:
	class Solution { public int solution(String S); }
that, given a string S consisting of N characters, 
returns 1 if string S is properly nested and 0 otherwise.

For example, given S = "(()(())())", the function should return 1 
and given S = "())", the function should return 0, as explained above.

Assume that:
	- N is an integer within the range [0..1,000,000];
	- string S consists only of the characters "(" and/or ")".

Complexity:
	- expected worst-case time complexity is O(N);
	- expected worst-case space complexity is O(1) 
	(not counting the storage required for input arguments).

==============================================================================

N개의 문자로 구성된 문자열 S가 만약 다음과 같다면 제대로 중첩되었다고 간주한다:
	- S는 공백이다;
	- U가 제대로 중첩된 문자열일 때 S가 "(U)"의 형태이다;
	- V와 W가 제대로 중첩된 문자열일 때 S가 "VW"의 형태이다.

예를 들어, 문자열 "(()(())())"는 제대로 중첩되었지만, "())" 는 그렇지 않다.

함수 작성:
	class Solution { public int solution(String S); }
N개의 문자로 구성된 문자열 S가 주어지고, 만약 문자열 S가 제대로 중첩되었다면 1을, 
그렇지 않다면 0을 리턴한다.
			
예를 들어, S = "(()(())())" 가 주어지면 함수는 1을 리턴해야 하고,
S = "())"가 주어지면 위에서 설명한 것처럼 함수는 0을 리턴해야 한.

가정:
	- N은 [0..1,000,000] 범위의 정수;
	- 문자열 S는 오직 문자 "(", ")" 로만 구성된다.

복잡도:
	- 최악의 시간 복잡도는 O(N);
	- 최악의 공간 복잡도는 O(1) (입력공간 제외)
 */
public class Nesting {
	public static int solution(String S) {
		int N = S.length();
		
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < N; i++) {
			char c = S.charAt(i);
			
			if (c == '(') {
				stack.push(c);
			} else if (c == ')') {
				if (stack.isEmpty()) {
					return 0;
				}
				
				if (stack.pop() != '(') {
					return 0;
				}
			}
		}
		
		if ( !stack.isEmpty()) {
			return 0;
		}
		
		return 1;
	}

	public static void main(String[] args) {
		String S = "(()(())())";
		System.out.println(solution(S));
	}
}
