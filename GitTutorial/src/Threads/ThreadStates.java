package Threads;

public class ThreadStates 
{
	public static void main(String[] args){
		  Thread t = new Thread();
		  Thread t2=new Thread();
		  try
		  {
			
			 
			  t2.yield();
			  
		  }
		  catch(Exception e)
		  {
			  System.out.println("Hi");
		  }
		  
		  System.out.println(t2.isAlive());
		  Thread.State e = t.getState(); 
		  Thread.State e1=t2.getState();
		  System.out.println(" The Thread State is :"+e);
		  System.out.println(" The Thread State is :"+e1);
		  Thread.State[] ts = e.values(); 
		  for(int i = 0; i < ts.length; i++){
		   System.out.println(ts[i]); 
		  }   
		 }


}
