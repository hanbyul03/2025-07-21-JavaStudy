//81p
/*
 * 증감연산자 => 제어문(반복문)
 *                    |
 *                   게임 => 총알 발사
 *                   비행기 => 자동이동
 * ++ 1증가
 * -- 1감소
 * 1)전치 연산자 (++a)
 *   - 먼저 증가하고 다른 연산 수행
 * 2)후치 연산자 (a++)
 *   - 다른 연산 수행 나중에 증가
 *   
 *  예) int a=10;
 *     int b=++a;     
 *     a=11, b=11
 *     int a=10;     
 *     
 *     int b=++a + ++a
 *     a=12
 *     b=23
 *    1010109    10 9  7  6                                                   
 */
public class 증감연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a=10;
  int b=++a;
  // 전치 => 증가하고 증가된 값을 대입
  System.out.println("a"+a+",b="+b);
  
  a=10;
  b=a++;
  // b=a ==> b=10
  // a=a+1 => a=10+1
  //후치 => 대입을 하고 나중에 증가
  System.out.println("a="+a+",b="+b);
  
  // char는 연산이 수행되는 자동으로 int로 변경
  char c='A'; // 65+1=>66 ('B')
  char c1=c++;
  System.out.println(c);
  System.out.println(c1);
  
	}
/*
 * ++ , -- => 무조건 1개 증가/ 1개 감소
 *  int a = 10;   
 *  int b = a++; b에 a값 대입 -> a에 1을 증가 
 *  int a = 10;   
 *  int b = ++a; b에 증가된 a값을 대입 -> a에 1을 증가
 *      
 */
}
