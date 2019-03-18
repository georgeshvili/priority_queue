package priority_queue;

public class test {
	
	public static void main(String[] args) {
		
		priority_queue <Integer> priority_queue  = new priority_queue <>();
		
		System.out.println(priority_queue.isEmpty());
		System.out.println(priority_queue.getSize());
		
		priority_queue.printEveryElem();
		
		priority_queue.insert(6);
		priority_queue.printEveryElem();
		priority_queue.getMax();

		priority_queue.insert(18);
		priority_queue.printEveryElem();

		priority_queue.insert(9);
		priority_queue.printEveryElem();

		priority_queue.insert(11);
		priority_queue.printEveryElem();

		priority_queue.insert(13);
		priority_queue.printEveryElem();

		priority_queue.insert(5);
		priority_queue.printEveryElem();
		
		priority_queue.insert(2);
		priority_queue.printEveryElem();
		
		priority_queue.removeMax();
		priority_queue.printEveryElem();

		System.out.println(priority_queue.isEmpty());
		System.out.println(priority_queue.getSize());
		
	
	}

}
