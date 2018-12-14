import java.util.*;
import java.lang.*;

	

public class App {

	Boolean temp = true;
	
	public static void main(String[] args) {
		
		//Node cNode = new Node("C", null);
		//Node bNode = new Node("B", cNode);
		//Node aNode = new Node("A", bNode);
		//the real goal here is to make a LIST
		
		//This line does everything commented out above in just one line
		Node list = new Node("A", new Node("B", new Node("C", null)));
		Node emptyList = null; //null signifies "the empty list"
		//System.out.println(getThird(list));
		/*Node x = new Node("a", new Node("b", new Node("c", null)));
		x = x.getNext();
		x.getNext().setNext(x.getNext());
				System.out.println(x.getNext().getData());
		System.out.println(x.getNext().getNext().getData());*/
		
		Node outside = new Node("A", new Node("B", new Node("C", null)));
		addLast(outside, "D");
		System.out.println(outside.getNext().getNext().getNext().getData());		
		
	}
	
	
	//precondition: list contains at least three data values
	public static String getThird(Node list) {
		return list.getNext().getNext().getData();
	}

	//precondition: list is not empty (i.e. list != null)
	public static void insertSecond(Node list, String s) {
		list.setNext(new Node(s, list.getNext()));
	}
	
	public static int size(Node list) {
		int count = 0;
	
		while(list != null) {
			count++;
			list = list.getNext();
		}
		return count;
	}
	
	public static void f(Node list) {
		list.getNext().setData("something else");
		//this changes the data value in the node
		list.getNext().setNext(new Node("something different", list.getNext()));
	}
	
	public static Node addLast(Node list, String s) {
		if (list == null) {
			return new Node(s, null);
		}
		
		Node temp = list;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(new Node(s, null));;
		
		return list;
	}

	
}
