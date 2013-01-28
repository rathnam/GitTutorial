package Threads;

public class Thread3 extends Thread
{
	Thread1 t1;
	Thread3(Thread1 t1)
	{
		this.t1=t1;
	}
	
	public void run()
	{
		for(int i=200;i<230;i++)
		{
			System.out.println(" Run of Thread3 :"+i);
			if(i==222)
			{
				try
				{
					t1.join();
				} catch(Exception e)
				{
					System.out.println(e);
				}
				
				System.out.println(" t1.sum value :"+t1.sum);
				System.out.println(" I Value :"+i);
				int x=t1.sum-i;
				System.out.println(" Sum :"+t1.sum);
				System.out.println(" Diference :"+x);
			}
		}
		
	}

}
