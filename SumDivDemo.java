

public class SumDivDemo {

	
	public int sumDemo(){
		int sum=0,count=0;
		for(int i=100;i<=200;i++)
		{
			if(i%7==0)
			{
				System.out.println(i);
				sum=sum+i;
				count++;
			}
			
		}
		System.out.println(count);
		System.out.println("sum is=" +sum);
		
		
		return sum;
	}
}
