package variable;

public class Type1 {
	public static void main(String[] args) {
		// 개발자의 의도를 명확히 하거나 컴파일러(Eclipse)가 오류를 검출하기 위해 '자료형' 이라는 것을 사용
		
		// int : 숫자 (정수)
		// double : 소수점 있는 숫자 (실수)
		// String : 글자 (문자열)
		// char : 한글자 (문자)
		// boolean : 참거짓 (불린)
		
		// 변수를 만들 때 글자를 저장하는 공간을 만들고 싶다
		String 변수1;
		
		// 숫자를 저장하는 변수를 만들고 싶다
		int 변수2;
		
		// 소수점이 있는 숫자를 저장하는 변수(공간)를 만들고 싶다
		double 변수3;
		
		// 명제를 구분하는 변수를 만들고 싶다
		boolean 변수4;
		
		// 변수 선언(생성) : 자료형 변수명;
		
		// 변수에 데이터값을 대입하고자(넣고자) 하면 =
		변수1 = "문자열은 큰따옴표";
		변수2 = 314;
		변수3 = 3.14;
		변수4 = false;
		
		// 만약에 자료형에 맞지않는 값을 넣어주려고 하면 오류가 발생
		// 변수2 = "숫자형 공간을 만들었는데 문자열을 넣으려한다? 요류검출 == 자료형의 목적";
		
		// 변수의 선언과 대입을 한번에
		// 변수 초기화 ( 선언과 대입을 같이 )
		char 변수5 = 'a';
		String 변수6 = "자료형 적고 변수명 적은 다음에 값을 대입하면 초기화";
		
		// 변수 선언은 반드시 자료형이 들어가야함 
		// 변수 대입 또는 사용을 하려면 자료형을 적지 않음
		String 변수7;							// 변수 선언(생성)
		변수7 = "";							// 기존에 만들어진 공간에 값을 대입
		System.out.println(변수7);			// 기존에 만들어진 공간을 사용
		
		// 변수는 중복생성이 불가능 (변수명 중복 불가능)
		String 변수8;
		// String 변수8 = "변수 중복 생성";		// 오류 검출
	}
}
