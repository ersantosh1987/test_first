
public class Maths {
	
	public int getFactorial(int num)
	{
		if(num==0)
		{
			return 1;
		}
		
		if(num<0)
		{
			throw new IllegalArgumentException();
		}
		if(num>0)
		{
			int i=0,fact=1;
			for(i=1;i<=num;i++)
			{
				fact=fact*i;
				System.out.println("i===" + i);
			}
			System.out.println("****" + num);
			System.out.println("****" + fact);
			return fact;
				
		}
		
		return 1;
	}

}
