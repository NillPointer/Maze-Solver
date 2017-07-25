package models;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> implements Agenda<T> {

	List<T> list;
	
	public Queue(){
		list = new ArrayList<T>();
	}
	
	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public void add(T t) {
		list.add(t);
	}

	@Override
	public T remove() {
		if(isEmpty()) return null;
		T obj = list.get(0);
		list.remove(0);
		return obj;
	}

	@Override
	public T peek() {
		if(isEmpty()) return null;
		return list.get(0);
	}
}
