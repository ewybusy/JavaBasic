package day01;
// 자바의 명명규칙
// 자바는 문법이 매우 엄격한 언어로써,
// 똑같은 철자이더라도 대소문자가 다르면, 다른 존재가 된다.
// 자바에서는 각종의 개념마다 이름짓는 규칙이 별도로 존재하는데
// 그 규칙은 다음과 같다.

// 1. 공통규칙
// 1-1. 자바의 모든 것의 이름은 숫자로 시작할 수 없다.
// 1-2. 자바의 모든 것의 이름에는 _를 제외한 특수 문자는 사용할 수 없다.
// 1-3. 단, 이름의 중간이나 맨 마지막에는 숫자가 올 수 있다.
// 1-4. 한글 이름을 지어줄 수는 있지만 절대로 절대로 한글 이름을 사용하지 말자.
// 1-5. 자바에서는 내부적으로 사용하는 50가지의 키워드가 존재한다.
//		우리는 해당 키워드들로는 이름을 지어줄 수 없기 때문에
//		외워야 한다.(내일 10시 시험 예정) -> 옛날 얘기
//		이클립스에서는 키워드를 자주색으로 표시해준다.
// 		여러분들이 어떤 이름을 지었는데 자주색으로 표시된다면,
//		동의어를 사용하거나 혹은 변형을 해서 이름을 지어주면된다!!

// 2. 낙타등 표기법(Camel back notation)
//	  낙타등 표기법이란 이름이 여러 단어로 이루어져 있을 경우, 두번째 단어부터는
//	  매 단어의 첫글자를 대문자로 적어서, 단어간의 구분을 쉽게 하는 표기법이다.
//    siriServiceNetwork

// 3. 뱀 표기법(Snake natation)
//    뱀 표기법이란, 모든 철자를 대문자로 적어주어야 하는 경우에
//	  단어간의 구분을 위해서 각 던어 사이에 _를 넣어주는 표기법이다.
//    TARGET_LOCATION_PATH

// 4. 각종 개념의 명명규칙
// 4-1. 클래스의 이름은 대문자로 시작하고 낙타등 표기법을 사용하는 명사를 사용한다.
// 4-2. 패키지의 이름은 소문자로 시작하고 낙타등 표기법을 사용하되,
//      가능하다면 해당 패키지 안에 모여있는 클래스들의 성격을 한 단어로 표시하는 방법을 사용한다.
// 4-3. 메소드의 이름은 소문자로 시작하고 낙타등 표기법을 사용하는 동사를 사용한다.
//      메소드란? 자바 프로그램의 재사용 가능한 기능을 뜻한다.
//		단, 메소드의 경우 프로그래밍의 문법상 반드시 이름 뒤에 () 가 붙어야 된다.
// 4-4. 변수의 이름은 소문자로 시작하고 낙타등 표기법을 사용하는 명사를 사용한다.
// 4-5. 상수의 이름은 뱀 표기법을 사용하는 명사를 사용한다.

public class Ex03Naming {
	// MEMBER_EXPLORER -> 상수
	// explorerMember() -> 메소드
	// memberExplorer -> 변수
	// MemberExplorer -> 클래스

	// 4. 보면서 비교해보기
}
