package dataStructure_assignment3;



public class Node {
	
	Song song;
	Node pre;
	Node next;
	
	Node(Song song) {
		this.song = song;
		this.pre = null;
		this.next = null;
	}

}
