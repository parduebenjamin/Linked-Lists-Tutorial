
public class Node{
		private String data;
		private Node next;
		
		public Node (String data, Node next) {
			this.data = data;
			this.next = next;
		}
		
		public String getData() { return data;}
		public Node getNext() {return next;}
		public void setData(String d) {data = d;}
		public void setNext(Node n) {next = n;}
	}