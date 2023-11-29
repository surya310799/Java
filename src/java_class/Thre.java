package java_class;
//Thread operation method 1
public class Thre extends Thread {
	static int i = 0;
	public void run() {
		i++;
	}
	public static void main(String[] args) {
		Thre obj = new Thre();
		obj.start();
		// TODO Auto-generated method stub
		System.out.println("Thread isAlive status = "+obj.isAlive());
		System.out.println(i);
		System.out.println("Thread isAlive status = "+obj.isAlive());
	}

}
