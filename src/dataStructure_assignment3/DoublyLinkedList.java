package dataStructure_assignment3;

public class DoublyLinkedList {

	Node head;
	Node end;

	public void addSong(Song song) {

		Node newNode = new Node(song);
		if (head == null) {
			head = newNode;
			end = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			newNode.pre = current;
			end = newNode;
		}
	}

	public void removeSong(String title) {

		Node current = head;

		if (current == null) {
			System.out.println("Play list is empty!");
			return;
		}

		while (!current.song.getTitle().equalsIgnoreCase(title)) {

			if (current.next == null) {
				System.out.println("Cannot find the song with this title!");
				return;
			}

			current = current.next;
		}

		if (current.pre == null) {
			if (current.next == null) {
				head = null;
			} else {
				head = current.next;
				current.next.pre = null;
			}

		} else if (current.next == null) {
			current.pre = null;
			current.pre.next = null;

		} else {

			current.pre.next = current.next;
			current.next.pre = current.pre;
		}

	}

	public void playList() {

		if (head == null) {
			System.out.println("Play list is empty!");
			return;
		}

		Node current = head;
		while (current != null) {
			System.out.println(current.song);
			current = current.next;
		}

	}

	public void playNext(String currenTitle) {

		if (head == null) {
			System.out.println("Play list is empty!");
			return;
		}

		Node current = head;

		while (!current.song.getTitle().equalsIgnoreCase(currenTitle)) {

			if (current.next == null) {
				System.out.println("Current title doesn't exist! Cannot play next with current title!");
				return;
			}

			current = current.next;
		}

		if (current.next == null) {
			System.out.println("Next song:" + head.song);
		} else {
			System.out.println("Next song:" + current.next.song);
		}

	}

	public void playPrevious(String currenTitle) {

		if (head == null) {
			System.out.println("Play list is empty!");
			return;
		}

		Node current = end;

		while (!current.song.getTitle().equalsIgnoreCase(currenTitle)) {

			if (current.pre == null) {
				System.out.println("Current title doesn't exist! Cannot play previous with current title!");
				return;
			}

			current = current.pre;
		}

		if (current.pre == null) {
			System.out.println("Previous song:" + end.song);
		} else {
			System.out.println("Previous song:" + current.pre.song);
		}

	}

}
