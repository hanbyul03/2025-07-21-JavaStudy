// 9. 0~12까지 2의 배수, 3의 배수의 합을 구하여라.

public class 반복문문제_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a2=0;
		 int a3=0;
		 for(int i=0;i<12;i++) 
		 {
			 if(i%2==0) //if(i%2==0 && i!=0)- 갯수를 치라고 할 때 0을 제외하고 입력해야 함.
				 a2+=i; //a2++;
			 if(i%3==0)
				 a3+=i;
		 }
	       System.out.println("2의 배수 합:"+a2);
	       System.out.println("3의 배수 합:"+a3);
	      
	       }
	}


