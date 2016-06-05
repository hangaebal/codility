package lesson5;

/**
A DNA sequence can be represented as a string consisting of the letters A, C, G and T,
which correspond to the types of successive nucleotides in the sequence.
Each nucleotide has an impact factor, which is an integer.
Nucleotides of types A, C, G and T have impact factors of 1, 2, 3 and 4, respectively.
You are going to answer several queries of the form:
What is the minimal impact factor of nucleotides contained in a particular part of the given DNA sequence?

The DNA sequence is given as a non-empty string S = S[0]S[1]...S[N-1] consisting of N characters.
There are M queries, which are given in non-empty arrays P and Q, each consisting of M integers.
The K-th query (0 ≤ K < M) requires you to find the minimal impact factor of nucleotides
contained in the DNA sequence between positions P[K] and Q[K] (inclusive).

For example, consider string S = CAGCCTA and arrays P, Q such that:
	P[0] = 2    Q[0] = 4
	P[1] = 5    Q[1] = 5
	P[2] = 0    Q[2] = 6

The answers to these M = 3 queries are as follows:
- The part of the DNA between positions 2 and 4 contains nucleotides G and C (twice),
whose impact factors are 3 and 2 respectively, so the answer is 2.
- The part between positions 5 and 5 contains a single nucleotide T,
whose impact factor is 4, so the answer is 4.
- The part between positions 0 and 6 (the whole string) contains all nucleotides,
in particular nucleotide A whose impact factor is 1, so the answer is 1.

Write a function:
class Solution { public int[] solution(String S, int[] P, int[] Q); }

that, given a non-empty zero-indexed string S consisting of N characters
and two non-empty zero-indexed arrays P and Q consisting of M integers,
returns an array consisting of M integers specifying the consecutive answers to all queries.

The sequence should be returned as:
- a Results structure (in C), or
- a vector of integers (in C++), or
- a Results record (in Pascal), or
- an array of integers (in any other programming language).

For example, given the string S = CAGCCTA and arrays P, Q such that:
	P[0] = 2    Q[0] = 4
	P[1] = 5    Q[1] = 5
	P[2] = 0    Q[2] = 6
the function should return the values [2, 4, 1], as explained above.

Assume that:
- N is an integer within the range [1..100,000];
- M is an integer within the range [1..50,000];
- each element of arrays P, Q is an integer within the range [0..N − 1];
- P[K] ≤ Q[K], where 0 ≤ K < M;
- string S consists only of upper-case English letters A, C, G, T.

Complexity:
- expected worst-case time complexity is O(N+M);
- expected worst-case space complexity is O(N), beyond input storage
(not counting the storage required for input arguments).

Elements of input arrays can be modified.


==============================================================================


DNA 서열은 연속적인 뉴클레오티드의 종류에 대응하여 문자 A ,C, G, T로 구성된 문자열로 나타낼 수 있다.
각 뉴클레오티드는 정수인 'impact factor'를 가지고 있다.
뉴클레오티드 종류 A, C, G, T는 각각 1, 2, 3, 4의 'impact factor'를 가지고 있다.
당신은 다음 몇 가지 쿼리에 답 할 것이다:
주어진 DNA 서열의 특정 부분에 포함 되어있는 뉴클레오티드의 가장 작은 'impact factor'는 무엇인가?

DNA 서열은 N개의 문자로 구성 된 비어있지 않은 문자열 S = S[0]S[1]...S[N-1] 로 주어진다.
각 M개의 정수로 구성된 비어있지 않은 배열 P, Q 안에 M개의 쿼리가 있다.
K번째 쿼리(0 ≤ K < M)는
P[K]와 Q[K] 사이의 DNA 서열이 포함된 뉴클레오티드의 가장 작은 'impact factor'를 찾기를 요구한다.

예를 들어 문자열 S = CAGCTA 이고 array P, Q 가 다음과 같다면:
	P[0] = 2    Q[0] = 4
	P[1] = 5    Q[1] = 5
	P[2] = 0    Q[2] = 6

M = 3 쿼리들의 답변들은 다음과 같을 것이다:
- 2와 4 사이의 DNA는 뉴클레오티드 G 와 C(두 번)를 포함하고 있다.
'impact factor'는 각각 3, 2이므로 답변은 2이다.
- 5와 5 사이에는 단일 뉴클레오티드 T를 포함하고, 'impact factor'는 4 이므로 답변은 4 이다.
- 0과 6 사이(전체 문자열)에는 모든 뉴클레오티드를 포함하고,
뉴클레오티드 A의 'impact factor'는 1 이므로 답변은 1 이다.

함수 작성:
class Solution { public int[] solution(String S, int[] P, int[] Q); }

N개의 문자로 구성된 비어있지 않은 문자열 S와 M개의 정수로 구성 된 비어있지 않은 배열 P, Q 두 개가 주어지면
모든 쿼리에 대한 연속적인 답변을 나타내는 M개의 정수로 구성된 배열을 리턴한다.

숫자열은 다음과 같아야 한다:
- 구조체 (C),
- 정수 벡터 (C++),
- 레코드 (Pascal),
- 정수 배열 (그 밖의 다른 프로그래밍 언어).

예를 들어 문자열 S = CAGCTA 이고 array P, Q 가 다음과 같다면:
	P[0] = 2    Q[0] = 4
	P[1] = 5    Q[1] = 5
	P[2] = 0    Q[2] = 6
함수는 위에서 설명한 대로 [2, 4, 1]를 리턴해야 한다.

가정 :
- N 은 [1..100,000] 범위의 정수;
- M 은 [1..50,000] 범위의 정수;
- 배열 P, Q의 각 요소는 [0..N − 1] 범위의 정수;
- 0 ≤ K < M라면 P[K] ≤ Q[K];
- 문자열 S는 알파벳 대문자 A, C, G, T로만 구성된다.

복잡도 :
최악의 시간복잡도는 O(N+M);
최악의 공간복잡도는 O(N) (입력 공간 제외)

배열의 요소는 수정할 수 있다.
 */
public class GenomicRangeQuery {

}
