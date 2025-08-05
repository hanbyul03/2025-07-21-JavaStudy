import java.util.Arrays;

public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] com=new int[5];
        // 초기값
        for(int i=0;i<com.length;i++) 
        {
        	com[i]=(int)(Math.random()*100)+1;
        }
        System.out.println("===== 정렬 전:");
        for(int i:com)
        {
        	System.out.print(i+" ");
        	
        }
        System.out.println("\n===== 정렬 후:");
//        for(int i=0;i<com.length-1;i++)
//        {
//        	for(int j=0;j<com.length-i;j++)
//        		
//        	{
//        		if(com[i]<com[j]) // desc , asc
//        			{
//        			int temp=com[i];
//        			com[i]=com[j];
//            		com[j]=temp;
//        			}
//        	
//        	}
//        }
        Arrays.sort(com);
        for(int i=com.length-1;i>=0;i--)
        {
        	System.out.print(com[i]+" ");
        }
	}

}
