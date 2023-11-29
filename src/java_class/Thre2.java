package java_class;
// Thread operation method 2
public class Thre2 implements Runnable {
	static int i = 0;
	public void run() {
		i++;
	}
	public static void main(String[] args) {
		Thre2 obj = new Thre2();
		Thread obj2 = new Thread(obj);
		obj2.start();
		// TODO Auto-generated method stub
		System.out.println("Thread isAlive status = "+obj2.isAlive());
		System.out.println(i);
		System.out.println("Thread isAlive status = "+obj2.isAlive());
		
	}

}
