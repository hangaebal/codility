package lesson7;

import java.util.Stack;

import com.sun.security.auth.SolarisNumericUserPrincipal;

/**
A string S consisting of N characters is considered to be properly nested 
if any of the following conditions is true:
	- S is empty;
	- S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
	- S has the form "VW" where V and W are properly nested strings.

For example, the string "{[()()]}" is properly nested but "([)()]" is not.

Write a function:
	class Solution { public int solution(String S); }
that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.

For example, given S = "{[()()]}", the function should return 1 
and given S = "([)()]", the function should return 0, as explained above.

Assume that:
	- N is an integer within the range [0..200,000];
	- string S consists only of the following characters: "(", "{", "[", "]", "}" and/or ")".

Complexity:
	- expected worst-case time complexity is O(N);
	- expected worst-case space complexity is O(N) (not counting the storage required for input arguments).
	
===============================================================================
N개의 문자로 구성된 문자열 S는 다음 조건 중 하나라도 true일 경우 제대로 중첩된다고 간주된다.
	- S는 공백이다;
	- S가 "(U)" 또는 "[U]" 또는 "{U}" 형태를 가지고 U는 제대로 중첩된 문자열이다.;
	- S가 "VW" 형태를 가지고 V와 W는 제대로 중첩된 문자열이다.

예를 들어, 문자열 "{[()()]}"는 제대로 중첩되었지만 "([)()]" 는 그렇지 않다.

함수 작성:
	class Solution { public int solution(String S); }
N개의 문자로 구성된 문자열 S가 주어지고, S가 제대로 중첩된 경우 1을 리턴하고 그렇지 않으면 0을 리턴한다.

예를 들어, S = "{[()()]}" 가 주어지면 함수는 1을 리턴해야 하고,
S = "([)()]" 가 주어지면 위에서 설명한 것처럼 함수는 0을 리턴해야 한다.

가정:
	- N은 [0..200,000] 범위의 정수
	- 문자열 S는 다음 문자로만 구성된다: "(", "{", "[", "]", "}", ")".

복잡도:
	- 최악의 시간 복잡도는 O(N);
	- 최악의 공간 복잡도는 O(N) (입력 공간 제외). 
 */
public class Brackets {
	public static int solution(String S) {
		int result = 1;
		int N = S.length();
		
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < N; i++) {
			char c = S.charAt(i);
			
			if (c == '(' || c == '{' || c == '[' ) {
				stack.push(c);
			} else {
				if (stack.empty()) {
					return 0;
				}
				
				if (c == ']') {
					if (stack.pop() != '[') {
						return 0;
					}
				} else if (c == '}') {
					if (stack.pop() != '{') {
						return 0;
					}
				} else if (c == ')') {
					if (stack.pop() != '(') {
						return 0;
					}
				}
			}
			System.out.println(stack);
		}
		
		if ( !stack.isEmpty()) {
			return 0;
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		//String S = "{[()()]}";
		//String S = "([)()]";
		String S = "{[())}";
		System.out.println(solution(S));
	}
	

}
