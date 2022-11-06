package day1.examples;

public class SupervisorExampleWithThread {

	public static void main(String[] args) {
		ParallelWorker1 parallelWorker1 = new ParallelWorker1();
		ParallelWorker2 parallelWorker2 = new ParallelWorker2();
		
		parallelWorker1.start();
		parallelWorker2.start();
	}
}

class ParallelWorker1 extends Thread{
	
	@Override
	public void run() {
		for (int i=0;i<10;i++) {
			System.out.println ("ParallerWorker1 is executing task: " + i);
		}
	}
	
}

class ParallelWorker2 extends Thread{
	@Override
	public void run() {
		for (int i=0;i<10;i++) {
			System.out.println("ParallerWorker2 is executing task: " + i);
		}
	}
}