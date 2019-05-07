package Demo;

public class lock implements Runnable {
	public int flag = 1;
	private static Object o1 = new Object(),
						  o2 = new Object();
	@Override
	public void run() {
		System.out.println(flag);
		if(flag == 1) {
			synchronized(o1) {
				try {
					System.out.println("td1对象");
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			synchronized(o2) {
				System.out.println("111");
			}
			}
		}
		if(flag == 0) {
			synchronized(o2) {
				try {
					System.out.println("td2对象");
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			synchronized(o1) {
				System.out.println("000");
			}
			}
		}
	}
	public static void main(String[] args) {
		lock td1 = new lock();
		lock td2 = new lock();
		td1.flag=1;
		td2.flag=0;
		new Thread(td1).start();
		new Thread(td2).start();
	}
}
