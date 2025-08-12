/*
 * 형변환
 *  =자동형변환
 *    큰데이터형 = 작은데이터형
 *       |           |
 *       ------------
 *          자동형변환
 *  int a='A'; ==> 'A' 자동으로 65로 변경해서 저장
 *  ---   ---
 *   4     2
 *   
 * long a=100; => 100(int)을 long(100L)로 변경후에 저장
 * ---   ---
 *  8     4(int) ==> 100L
 *  
 * double d='A' ==> 'A'를 double로 변경후에 저장
 *                  ---
 *                  65.0
 *------------------------------------------
 * 데이터형 = 같은데이터형
 * ----------------------
 * int a=100
 * char c='A' => 왼쪽이 크거나 같아야 된다
 *               작은 데이터가 들어오면 자동으로 데이터형이 변경
 * 작은 데이터형 = 큰데이터형값
 * int a=10.5
 *       ---- double => error 발생
 *       ---- 자동으로 변경이 안된다
 *       ---- 강제로 변경 (데이터형)
 *            (int), (double), (char)...
 *     => int a=(int)10.5; => a=10
 *     => char c=(char)65.0; => c='A'
 *     => 예외
 *          char c=65 => 가능
 *                 -- 'A'를 변환후에 저장
 *     =>byte b=(byte)350;
 *     
 *     =>int a=10
 *       int b=3
 *       --------
 *       double d=a/(double)b => 3.0
 *               ---- 정수 => 3 => 3.0
 *               정수/정수=정수
 *               정수/실수=실수
 *       
 *     
 *                  
 *  =강제형변환
 *    =upcasting
 *    =downcasting
 * 1. 데이터형의 크기
 * byte<char<int<long<double
 * 2. 연산자 : 같은 데이터형만 연산이 가능
 *     double+int (x)
 *     int+int
 *     double+double
 * 10.5+10 => 20.5
 *2. 형변환
 *    int => double : 평균 / 나누기
 *    double => int : 저장용도
 *    char => int
 *    int => char
 *    long => int : 파일크기(long) => int
 * 3. 변수선언
 *  데이터형 변수명
 *  *** 지역변수 => 반드시 초기값을 설정
 *        | 메소드안에서 선언 => 스택 => 메소드 종료시에 자동으로 삭제
 *  = 초기값
 *    명시적 => 직접 값 대입 
 *    입력값 => Scanner / BufferedReader
 *         scanf() / input()
 *    난수값 => 임의값 추출
 *  => 같은 데이터형
 *  int a,b,c,d,e;
 *  a=0;
 *  b=0;
 *  ...
 *  a=b=c=d=e=0;
 *  int a=0.b=0,,, ;
 *  
 *    
 */
public class 데이터형변환_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 byte b=(byte)350;
		 System.out.println(b);

	}

}
