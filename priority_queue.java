package priority_queue;

import java.util.ArrayList;

public class priority_queue <T extends Comparable<T>>{

	ArrayList<T> arr = new ArrayList<>();
	int pirSize=0;
	
	private void initHeap(int i) {
		int max = i; 
        int l = 2*i+1; 
        int r = 2*i+2; 
        int n = pirSize-1;
        T t;
  
        if (l <= n && ((arr.get(l)).compareTo(arr.get(max))>0)) {
        	max = l;
        }
  
        if (r <= n && ((arr.get(r)).compareTo(arr.get(max))>0)) {
        	max = r; 
        }
        
        if (max != i) { 
            t = arr.get(max); 
            arr.set(max,arr.get(i));
            arr.set(i,t);
            
            initHeap(max); 
        } 
	}
	
	public void insert(T element) {
		arr.add(element);
		pirSize++;
		T t;
		//нужны индекс последнего и его родителя
		int index_elem = pirSize-1;
		int index_par = (index_elem-1)/2;
		//сравниваем, если потомок больше родителя, то меняем местами
		while(arr.get(index_elem).compareTo(arr.get(index_par)) > 0 && index_elem > 0) {
			//меняем значения
			t = arr.get(index_elem);
            arr.set(index_elem,arr.get(index_par));
            arr.set(index_par,t);
            //меняем индексы
            index_elem=index_par;
            index_par=(index_elem-1)/2;
		}
	}
	
	public void removeMax() {
		//меняем максимальный с последним
		T max = arr.get(0);
		arr.set(0,arr.get(pirSize-1));
		arr.set(pirSize-1,max);
		//удаляем максимальный(он уже последний)
		arr.remove(pirSize-1);
		pirSize--;
		
		initHeap(0);
	}
	
	public void printEveryElem() {
		for(int i=0;i<pirSize;i++) {
			System.out.println(arr.get(i));
		}
		System.out.println("Number of elements "+(getSize()));
	}
	
	public T getMax(){
		System.out.print("Max is: ");
		return arr.get(0);
	}
	
	public int getSize() {
		return pirSize;
	}
	
	public boolean isEmpty() {
		if(pirSize==0) return true;
		else return false;
	}
	
}
