//2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용)
//for(int i=2;i<=100;i+=2)
//    시작값      끝점    증가값
public class 제어문문제_1 {

	public static void main(String[] args) {
	
		
	        int sum=0; //누적변수
	        
	        for(int i=2;i<=100;i+=2)
	        {
	        	sum+=i; 
	        	
	        }
	       
	  
	        System.out.println("2+4+6+....100까지의 정수의 합:"+sum);
		}
	}


 