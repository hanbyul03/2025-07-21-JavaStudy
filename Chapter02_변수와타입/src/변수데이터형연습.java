import java.util.*; // 라이브러리 읽기
public class 변수데이터형연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scan=new Scanner(System.in);
   //new => 메모리에 저장 / System.in 키보드 입력값
   
   System.out.print("국어입력:");
   int kor=scan.nextInt();
   
   System.out.print("영어입력:");
   int eng=scan.nextInt();
   
   System.out.print("수학입력:");
   int math=scan.nextInt();
   
    System.out.println("국어 점수:"+kor);
    System.out.println("국어 점수:"+eng);
    System.out.println("국어 점수:"+math);
    //총점
    int total=kor+eng+math;
    System.out.println("총점:"+total);
    //평균
    double avg=total/3.0;
    System.out.printf("평균:"+avg);
   
		   }

}
