package Threads;

public class Thread1 extends Thread 
{
	int sum;
	public void run()
	{
		System.out.println("Begining of run of Thread1 ");
		for(int i=0;i<30;i++)
		{
			sum=sum+i;
			System.out.println(" Run of Thread1 :"+i);
			System.out.println(" Sum is : :"+sum);
		}
		System.out.println(" Total Sum is : :"+sum);
		
	}

}
