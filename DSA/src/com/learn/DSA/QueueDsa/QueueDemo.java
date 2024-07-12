package com.learn.DSA.QueueDsa;

import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		QueueImpl q = new QueueImpl();
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(5);
		q.enqueue(99);
		
		//removes first inserted value
		System.out.println(q.dequeue());
		
		q.enqueue(12);
		q.enqueue(32);
		

		
		
		q.show();
	}

}
