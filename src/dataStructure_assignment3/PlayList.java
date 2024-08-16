package dataStructure_assignment3;

import java.util.Scanner;

public class PlayList {

	

	public static void main(String[] args) {
		
		 DoublyLinkedList list = new DoublyLinkedList();

		Scanner scanner = new Scanner(System.in);
		int choice = 0;

		do {
			System.out.println("\nWELCOME TO MUSIC PLAYLIST MANAGEMENT SYSTEM");
			System.out.println("Please enter your choice: ");
			System.out.println("1. Add Song");
			System.out.println("2. Remove Song");
			System.out.println("3. Play Next");
			System.out.println("4. Play Previous");
			System.out.println("5. Display playlist");
			System.out.println("0. Exit");

			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter song title: ");
				String title = scanner.nextLine();
				System.out.print("Enter Artist: ");
				String artist = scanner.nextLine();

				Song song = new Song(title, artist);

				list.addSong(song);

				break;

			case 2:
				System.out.print("Enter title of the song to delete: ");
				title = scanner.nextLine();
				list.removeSong(title);
				break;

			case 3:
				System.out.print("Enter title of current song: ");
				title = scanner.nextLine();
				list.playNext(title);
				break;

			case 4:
				System.out.print("Enter title of current song: ");
				title = scanner.nextLine();
				list.playPrevious(title);
				break;

			case 5:
				list.playList();
				break;

			case 0:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice. Please enter again");
			}
		} while (choice != 0);
		scanner.close();

	}

}
