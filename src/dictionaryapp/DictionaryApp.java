package dictionaryapp;

import java.util.Scanner;

public class DictionaryApp {

	public static void main(String[] args) {
		RBTree dictionary = new RBTree();
		Scanner in = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("Enter a word: ");
			String response = in.nextLine().toLowerCase();
			
			if (response.charAt(0) == 'q') {
				break;
			}
			else {
				dictionary.insert(response);
				dictionary.breadthFirstSearch();
			}
		}
		
		in.close();
	}

}
