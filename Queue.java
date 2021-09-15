package labdsa;

import java.util.Scanner;

class Listnode {
	int data;
	Listnode next;
	
	Listnode(int data) {
		this.data = data;
		this.next = null;
	}
}


public class Queue {
	
	Listnode front;
	Listnode rear;
	int length; 
	
	public Queue() {
		this.front = null;
		this.rear = null;
		this.length = 0;
	}
	
	public int length() {
		return(length);
	}
	
	public boolean isEmpty() {
		return(length == 0);
	}
	
	public void enqueue(int data) {
		Listnode temp = new Listnode(data);
		if(isEmpty()) {
			front = temp;
		}
		else {
			rear.next = temp;
		}
		rear = temp;
		length++;
	}
	
	public int dequeue() {
		int result = front.data;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		length--;
		return result;
	}
	
	
	
	public int first() {
		if(isEmpty()) {
			System.out.println(-1);
		}
		return(front.data);
	}
	public int last() {
		if(isEmpty()) {
			System.out.print(-1);
		}
		return(rear.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		Queue qmin = new Queue();
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- != 0) {
        	int query = in.nextInt();
        	if(query==1) {
        		int a = in.nextInt();
        		q.enqueue(a);
        		if (qmin.isEmpty()) {
        			qmin.enqueue(a);
        		} else {
        			if(a < qmin.last()) {
        				qmin.enqueue(a);
        			}
        		}
        	}
        	else if(query==2) {
        		if(!q.isEmpty()) {
        			int del = q.dequeue();
            		System.out.println(del);
            		if(!qmin.isEmpty() && del == qmin.first()) {
            			qmin.dequeue();
            		}
        		} else {
        			System.out.println(-1);
        		}
        		
        	}
        	else if(query==3) {
        		System.out.println(q.first());	
        	}
        	else if(query==4) {
        		System.out.println(qmin.last());
        		
        	}
        }

		/*q.enqueue(15);
		q.enqueue(18);
		q.enqueue(108);
		q.enqueue(91);
		q.enqueue(-63);
		q.dequeue();
		System.out.println(q.first());
		System.out.println(q.last());*/

	}

}
