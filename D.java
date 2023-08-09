package DiffrentStagesOfThread;
//diffrent phases of thread are   Thread,start,Runnable,Running,Terminated in between Runnable and running sleep and wait state in wait state notify and notifyAll method comes into existance
public class D extends Thread{
	public static void main(String[] args) {
		D d1=new D();
		System.out.println(d1.getState());
		d1.start();
		
		try {
			d1.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(d1.getState());
	}

}
